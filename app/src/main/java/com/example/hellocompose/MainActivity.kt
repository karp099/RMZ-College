package com.example.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloComposeApp()
        }
    }
}

@Composable
fun HelloComposeApp() {
    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            var name by remember { mutableStateOf("Єгор Карпенко K-41") }
            Column {
                Text(
                    text = "Привіт, $name!",
                    style = MaterialTheme.typography.headlineMedium
                )
                Button(onClick = { name = "Світ" }) {
                    Text("Натисни мене")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHello() {
    HelloComposeApp()
}