plugins {
    // Setting plugin versions here so we don't have to do it somewhere else. "apply false" does not apply the plugin
    kotlin("multiplatform") version "1.8.22" apply false //Kotlin multiplatform plugin
    id("com.android.application") version "8.0.0" apply false
    id("com.android.library") version "8.0.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false
}