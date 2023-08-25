plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose") version composeWasmVersion
}

kotlin {
    js(IR) {
        moduleName = "SampleWeb"
        browser()
        binaries.executable()
    }

    wasm {
        moduleName = "SampleWeb"
        browser {
            commonWebpackConfig {
                devServer = (devServer ?: org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig.DevServer()).copy(
                    static = (devServer?.static ?: mutableListOf()).apply {
                        // Serve sources to debug inside browser
                        add(project.rootDir.path)
                        add(project.rootDir.path + "/sample-app-web/")
                    },
                )
            }
        }
        binaries.executable()
    }


    sourceSets {
        val commonMain by getting {
            dependencies {
                api(compose.runtime)
                api(compose.foundation)
                api(compose.material)
                api(compose.ui)
                //DO NOT ADD shared-ui. Compose WASM does not work at the moment.
            }
        }

        val jsMain by getting {
            dependsOn(commonMain)
        }

        val wasmMain by getting {
            dependsOn(commonMain)
        }
    }
}

compose.experimental {
    web.application {}
}

compose {
    kotlinCompilerPlugin.set(composeWasmVersion)
    kotlinCompilerPluginArgs.add("suppressKotlinVersionCompatibilityCheck=$kotlinVersion")
}