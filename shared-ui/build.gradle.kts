plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.compose") // Compose multiplatform plugin
}

// kotlin dsl comes from multiplatform plugin
kotlin {
    //targetHierarchy.default()

    //Android Target
    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = JavaVersion.VERSION_17.toString()
            }
        }
        dependencies {

        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                //Adds compose dependencies to common source set
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material)
                @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
                implementation(compose.components.resources)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
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
        sourceCompatibility = org.gradle.api.JavaVersion.VERSION_17
        targetCompatibility = org.gradle.api.JavaVersion.VERSION_17
    }
}