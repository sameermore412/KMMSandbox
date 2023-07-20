package com.more.common.ui.widgets

import androidx.compose.foundation.layout.size
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.ComposeUIViewController

fun MagicLoadingIndicatorViewController(size: Int) = ComposeUIViewController {
    MagicLoadingIndicator(modifier = Modifier.size(size.dp))
}