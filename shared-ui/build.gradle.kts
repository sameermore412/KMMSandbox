plugins {
    kotlin("multiplatform") // Multiplatform plugin
    kotlin("native.cocoapods") // Cocoapods plugin
    id("com.android.library") // Needed for android source set
    id("org.jetbrains.compose") version composeVersion // Compose multiplatform plugin
}

// kotlin dsl comes from multiplatform plugin
kotlin {
    //iOS Targets
    ios()
    iosSimulatorArm64()

    //Desktop JVM Target
    jvm("desktop")

    //Android Target
    androidTarget() {
        compilations.all {
            kotlinOptions {
                jvmTarget = JavaVersion.VERSION_17.toString()
            }
        }
    }

    //Cocoapods configuration
    cocoapods {
        version = "1.0"
        summary = "Shared Compose UI Components"
        name = "sharedui" //Pod spec name
        ios.deploymentTarget = "15.2"
        homepage = "Link to the Shared Module homepage"

        framework {
            baseName = "SharedComposeUI" //This is the name of the package that will be referenced in swift code
            isStatic = true
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                //Adds compose dependencies to common source set
                api(compose.runtime)
                api(compose.foundation)
                api(compose.material)
                api(compose.ui)
                @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
                implementation(compose.components.resources)
                implementation(project(":shared-data"))
                implementation("cafe.adriel.voyager:voyager-navigator:$voyagerVersion")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }

        val androidMain by getting {
            dependencies {
                implementation(compose.uiTooling)
                implementation(compose.ui)
            }
        }

        val iosSimulatorArm64Main by getting

        //Defines a source set called iOSMain that all iOS targets can depend on.
        val iosMain by getting {
            iosSimulatorArm64Main.dependsOn(this)
        }

        val desktopMain by getting {
            dependencies {
                implementation(compose.desktop.common)
            }
        }

    }
}

android {
    namespace = "com.more.common.ui"
    compileSdk = 33
    defaultConfig {
        minSdk = 24
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    buildFeatures {
        compose = true //This is enabled to show preview in android source set
    }

    composeOptions {
        kotlinCompilerExtensionVersion = composeCompilerVersion
    }
}
