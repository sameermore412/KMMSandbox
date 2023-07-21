plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

kotlin {
    js(IR) {
        moduleName = "SampleWeb"
        browser()
        binaries.executable()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":shared-ui"))
                api(compose.runtime)
                api(compose.foundation)
                api(compose.material)
                api(compose.ui)
            }
        }

        val jsMain by getting {
            dependsOn(commonMain)
        }
    }
}

compose.experimental {
    web.application {}
}

compose {
    val composeVersion = project.property("compose.wasm.version") as String
    kotlinCompilerPlugin.set(composeVersion)
    val kotlinVersion = project.property("kotlin.version") as String
    kotlinCompilerPluginArgs.add("suppressKotlinVersionCompatibilityCheck=$kotlinVersion")
}