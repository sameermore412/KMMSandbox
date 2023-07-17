package com.more.common.ui.widgets

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.more.common.ui.getPlatform

@Composable
fun SimpleTextWidget() {
    Text("Welcome ${getPlatform()}")
}

@Composable
fun SharedGreeting() {
    Text("Welcome ${getPlatform().name}", color = Color.Red)
}
