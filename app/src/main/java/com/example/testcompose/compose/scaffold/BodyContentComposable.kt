package com.example.testcompose.compose.scaffold

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun BodyContentComposable(
    modifier: Modifier
) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = "Hi There! From Scaffold",
        )

        Text(
            text = "Thanks for going through the layouts",
        )

    }
}