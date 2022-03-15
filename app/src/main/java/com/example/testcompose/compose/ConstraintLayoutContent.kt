package com.example.testcompose.compose

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.codelab.layouts.ui.TestComposeTheme

@Composable
fun ConstraintLayoutContent() {
    ConstraintLayout {
        val (button1, button2, text) = createRefs()

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.constrainAs(button1)
            {
                top.linkTo(parent.top, margin = 16.dp)
            }
        ) {
            Text(text = "Button1")

        }

        Text(text = "Text",
            Modifier.constrainAs(text) {
                top.linkTo(button1.bottom, margin = 16.dp)
                centerAround(button1.end)
            })

        val barrier = createEndBarrier(button1, text)
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.constrainAs(button2) {
                top.linkTo(parent.top, margin = 16.dp)
                start.linkTo(barrier)
            }
        ) {
            Text(text = "Button2")

        }
    }
}

@Preview
@Composable
fun ConstraintLayoutContentPreview() {
    TestComposeTheme {
        ConstraintLayoutContent()
    }
}