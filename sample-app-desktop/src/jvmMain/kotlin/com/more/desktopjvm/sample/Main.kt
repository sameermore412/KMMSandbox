package com.more.desktopjvm.sample


import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.more.common.ui.screens.SimpleScreen

fun main() = application {
    Window(
        title = "Sample App",
        onCloseRequest = ::exitApplication
    ) {
       SimpleScreen()
    }
}