package com.more.common.ui.widgets

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.more.common.ui.getPlatform

@Composable
fun SimpleTextWidget() {
    Text("Welcome ${getPlatform()}")
}

@Composable
fun SharedGreeting() {
    Text("Welcome ${getPlatform().name}", color = Color.Red)
}

@Preview
@Composable
expect fun PreviewSharedGreeting()
