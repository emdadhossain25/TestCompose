package com.example.testcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.codelab.layouts.ui.TestComposeTheme
import com.example.testcompose.compose.scaffold.ScaffoldCodeLab

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }

    @Preview
    @Composable
    fun ScaffoldCodeLabPreview() {
        TestComposeTheme {
            ScaffoldCodeLab()
        }
    }
}

