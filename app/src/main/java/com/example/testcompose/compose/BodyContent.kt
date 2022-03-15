package com.example.testcompose.compose

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BodyContent(
    modifier: Modifier
) {
    MyOwnColumn(modifier = modifier.padding(8.dp)) {
        Text(text = "MyOwnColumn")
        Text(text = "places items")
        Text(text = "vertically")
        Text(text = "We have done it by hand!")
    }
}