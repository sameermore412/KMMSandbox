plugins {
    // Setting plugin versions here so we don't have to do it somewhere else. "apply false" does not apply the plugin
    kotlin("multiplatform") version kotlinVersion apply false // Kotlin multiplatform plugin
    kotlin("native.cocoapods") version kotlinVersion apply false
    id("com.android.application") version androidGradlePluginVersion apply false
    id("com.android.library") version androidGradlePluginVersion apply false
    id("org.jetbrains.compose") version composeVersion apply false // Compose multiplatform plugin
}