package com.example.testcompose.compose.scaffold

import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ScaffoldCodeLab(

) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "TestComposeCodelab")
                },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Filled.Favorite, contentDescription = null)
                    }
                }
            )
        }
    ) { innerPadding ->
        BodyContentComposable(
            modifier = Modifier
                .padding(innerPadding)
                .padding(8.dp)
        )

    }
}