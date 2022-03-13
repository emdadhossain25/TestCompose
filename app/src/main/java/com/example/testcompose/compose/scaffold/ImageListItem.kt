package com.example.testcompose.compose.scaffold

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter

@Composable
fun ImageListItem(
    index: Int
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {

        Image(
            painter = rememberImagePainter(
                "https://findicons.com/files/icons/2166/oxygen/48/format_indent_less.png"),
            contentDescription = "Android Logo",
            modifier = Modifier.size(50.dp)
        )
        Spacer(Modifier.width(10.dp))
        Text(
            text = "Item #$index",
            style = MaterialTheme.typography.subtitle1
        )
    }
}