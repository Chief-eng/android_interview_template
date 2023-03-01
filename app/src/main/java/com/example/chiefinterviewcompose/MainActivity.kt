package com.example.chiefinterviewcompose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.chiefinterviewcompose.ui.theme.ChiefInterviewComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChiefInterviewComposeTheme {
                // A surface container using the 'background' color from the theme
                ChiefApp()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ChiefInterviewComposeTheme {
        Greeting("Android")
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ChiefApp() {
    Scaffold(
        content = {
            ChiefHomeContent()
        }
    )
}