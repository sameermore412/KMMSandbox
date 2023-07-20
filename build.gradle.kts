plugins {
    // Setting plugin versions here so we don't have to do it somewhere else. "apply false" does not apply the plugin
    kotlin("multiplatform") version "1.8.20" apply false // Kotlin multiplatform plugin
    kotlin("native.cocoapods") version "1.8.20" apply false
    id("com.android.application") version "8.0.0" apply false
    id("com.android.library") version "8.0.0" apply false
    id("org.jetbrains.compose") version "1.4.1" apply false // Compose multiplatform plugin
}