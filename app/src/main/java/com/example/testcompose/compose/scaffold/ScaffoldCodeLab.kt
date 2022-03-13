package com.example.testcompose.compose.scaffold

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.codelab.layouts.ui.TestComposeTheme

@Composable
fun ScaffoldCodeLab(

) {
    Scaffold { innerPadding ->
        Text(text = "Hi There! From Scaffold")
    }
}