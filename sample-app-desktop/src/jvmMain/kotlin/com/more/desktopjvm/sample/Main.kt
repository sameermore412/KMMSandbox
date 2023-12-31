package com.more.desktopjvm.sample


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import cafe.adriel.voyager.navigator.Navigator
import com.more.common.ui.screens.HomeScreen

fun main() = application {
    Window(
        title = "Sample App",
        onCloseRequest = ::exitApplication,
    ) {
        Box(modifier = Modifier.fillMaxSize().background(Color.Blue)) {
            Navigator(HomeScreen)
        }
    }
}