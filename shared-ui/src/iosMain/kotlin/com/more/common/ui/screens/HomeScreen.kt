package com.more.common.ui.screens

import androidx.compose.ui.window.ComposeUIViewController
import cafe.adriel.voyager.navigator.Navigator

fun HomeScreenViewController() = ComposeUIViewController {
    Navigator(HomeScreen)
}