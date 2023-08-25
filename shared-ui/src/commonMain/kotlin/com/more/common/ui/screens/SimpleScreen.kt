package com.more.common.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.more.common.ui.widgets.MagicLoadingIndicator
import com.more.common.ui.widgets.SharedGreeting

data class SimpleScreen(val name: String): Screen {
    @Composable
    override fun Content() {
        SimpleScreenContent(name)
    }

}

@Composable
fun SimpleScreenContent(name: String) {
    val navigator = LocalNavigator.currentOrThrow
    Column(modifier = Modifier.background(Color.LightGray)) {
        SharedGreeting()
        MagicLoadingIndicator()
        Button(onClick = {navigator.pop()}) {
            Text(name)
        }
    }
}

@Composable
fun SimpleScreen() {
    MaterialTheme {
        Column(modifier = Modifier.background(Color.LightGray)) {
            SharedGreeting()
            MagicLoadingIndicator()
            Button(onClick = {}) {
                Text("Hello")
            }
        }
    }
}