package com.more.android.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.more.android.sample.ui.theme.KMMSandboxTheme
import com.more.common.ui.screens.SimpleScreen
import com.more.common.ui.widgets.MagicLoadingIndicator
import com.more.common.ui.widgets.SharedGreeting

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KMMSandboxTheme {
                Scaffold(topBar = customTopAppBar()) { paddingValues ->
                    Box(modifier = Modifier.padding(paddingValues)) {
                        SimpleScreen()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@OptIn(ExperimentalMaterial3Api::class)
fun customTopAppBar(): @Composable () -> Unit {
    return {
        TopAppBar(
            title = {
                Text("Sample App")
            },
            colors = TopAppBarDefaults.smallTopAppBarColors(
                containerColor = MaterialTheme.colorScheme.secondary
            )

        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KMMSandboxTheme {
        SharedGreeting()
    }
}

@Preview
@Composable
fun PreviewMagicLoadingIndicator() {
    KMMSandboxTheme {
        MagicLoadingIndicator()
    }
}
