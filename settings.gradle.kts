pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev") //Multiplatform compose repository
        maven("https://maven.pkg.jetbrains.space/kotlin/p/wasm/experimental") //WASM experimental compose repo
    }
}

plugins {
    // Setting plugin versions here so we don't have to do it somewhere else. "apply false" does not apply the plugin
    kotlin("multiplatform") version "1.9.0" apply false // Kotlin multiplatform plugin
    kotlin("native.cocoapods") version "1.9.0" apply false
    kotlin("jvm") version "1.9.0" apply false
    id("com.android.application") version "8.0.0" apply false
    id("com.android.library") version "8.0.0" apply false
    id("org.jetbrains.compose") version "1.4.0-dev-wasm09" apply false // Compose multiplatform plugin
}

rootProject.name = "KMMSandbox"
include(":shared-ui")
include(":sample-app-android")
include(":shared-data")
include(":sample-app-desktop")
include(":sample-app-web")