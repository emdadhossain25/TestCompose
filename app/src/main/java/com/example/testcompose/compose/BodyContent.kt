package com.example.testcompose.compose

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BodyContent(
    modifier: Modifier
) {
    MyOwnColumn(
        modifier = modifier.padding(8.dp),
    ) {
        Text(
            text = "MyOwnColumn",
            color = Color.White
        )
        Text(
            text = "places items",
            color = Color.Yellow
        )
        Text(
            text = "vertically",
            color = Color.Green
        )
        Text(
            text = "We have done it by hand!",
            color = Color.Cyan
        )
    }
}