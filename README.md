# KMMSandbox
A sandbox project for KMM

# Project
* shared-ui - KMM Module that provides shared widgets
* shared-data - KMM Module that provides shared data interfaces
* sample-app-android - Sample Android App
* sample-app-desktop - Sample JVM desktop app
* sample-app-ios - Sample iOS app
* sample-app-web - Sample JS and WASM web apps.
  * These projects do not depend on shared-ui due to a build issue. Might be fixed when WASM leaves experimental

# Kotlin Gradle Plugin
The plugin `kotlin("multiplatform")` applies the kotlin multiplatform gradle plugin. This plugin applies the kotlin 
plugin on it's own. We are using version "1.8.22" to use a compatible version of compose.

# Kdoctor
[KDoctor](https://github.com/Kotlin/kdoctor) is a tool to validate your environment setup for kotlin multiplatform (Java Version, Android Studio, Xcode, Cocoapods). Use
`brew install kdoctor` to install kdoctor

# Kotlin Multiplatform Android Studio Plugin
[Kotlin Multiplatform Studio Plugin](https://plugins.jetbrains.com/plugin/14936-kotlin-multiplatform-mobile) is a plugin for android studio that let's you
run ios App from android studio. Also includes templates for creating multiplatform modules.


# Compose multiplatform compatibility
[Compose Multiplatform Compatibility](https://github.com/JetBrains/compose-multiplatform/blob/master/VERSIONING.md#kotlin-compatibility)
[Jetpack Compose Compatibility](https://developer.android.com/jetpack/androidx/releases/compose-kotlin)
Compose multiplatform version is 1.4.1 and requires kotlin 1.8.20
Jetpack Compose version is set to 1.4.6 and requires kotlin 1.8.20

Jetpack compose has newer versions over compose multiplatform.

# Dependencies
[Compose Multiplatform 1.4.1](https://github.com/JetBrains/compose-multiplatform/releases/tag/v1.4.1)

# Extra Notes
* To add previews for diffferent platforms you can use @Preview annotated expect/actual functions
* Skiko - Kotlin bindings to Skia which is written in C++. For Desktop, iOS, and Web.
* To build desktopJvm application you need to make sure gradle is using a jdk and not a jbr.
* Desktop composables need to be in a Window composable


# Links
https://github.com/androidx/androidx/tree/androidx-main/compose/ui/ui/src
https://github.com/JetBrains/compose-multiplatform-core
https://www.youtube.com/watch?v=FWVi4aV36d8 (Compose on iOS)
https://www.speedscope.app/ (Profiler info to flamegraphs)
https://github.com/JetBrains/compose-multiplatform/blob/master/tutorials/Native_distributions_and_local_execution/README.md (Packaging for desktop JVM)

