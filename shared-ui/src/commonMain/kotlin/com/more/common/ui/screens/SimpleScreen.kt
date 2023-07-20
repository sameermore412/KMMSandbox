package com.more.common.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.more.common.ui.widgets.MagicLoadingIndicator
import com.more.common.ui.widgets.SharedGreeting

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