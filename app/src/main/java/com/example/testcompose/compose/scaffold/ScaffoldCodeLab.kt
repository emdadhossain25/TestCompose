package com.example.testcompose.compose.scaffold

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ScaffoldCodeLab() {
    var result by remember { mutableStateOf("") }
    var selectedItem by remember { mutableStateOf("upload") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "TestComposeCodelab")
                },
                actions = {
                    IconButton(onClick = {
                        result="favorite top app bar is clicked"
                        selectedItem = "favorite"
                    }) {
                        Icon(Icons.Filled.Favorite, contentDescription = null)
                    }
                }
            )
        },
        content = {
            Box(
                Modifier
                    .background(Color(0XFFE3DAC9))
                    .padding(16.dp)
                    .fillMaxSize()
            ) {
                Text(
                    text = result,
                    fontSize = 22.sp,
                    fontFamily = FontFamily.Serif,
                    modifier = Modifier.align(
                        Alignment.Center
                    )
                )
            }
        },
        bottomBar = {
            BottomAppBar(
                content = {
                    BottomNavigationItem(
                        icon = {
                            Icon(Icons.Filled.Favorite, "")
                        },
                        selected = selectedItem == "favorite",
                        onClick = {
                            result = "favorite icon is clicked"
                            selectedItem = "favorite"
                        },
                        label = { Text(text = "Favorite") },
                        alwaysShowLabel = true
                    )
                }
            )
        }
    )
}