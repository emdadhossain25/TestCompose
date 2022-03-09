package com.example.testcompose.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.testcompose.ui.theme.TestComposeTheme

@Composable
fun MyApp(

) {
    var shouldShowOnBoarding by remember { mutableStateOf(true) }

    if (shouldShowOnBoarding) {
        OnBoardingScreen(OnContinueClicked = { shouldShowOnBoarding = false })
    } else {
        Greetings()

    }


}

@Composable
fun Greetings(
    names: List<String> = listOf("World", "Compose")
) {
    Column(
        modifier = Modifier
            .padding(vertical = 4.dp)
    ) {
        for (name in names) {
            Greeting(name = name)
        }
    }
}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun DefaultPreview() {
    TestComposeTheme() {
        Greetings()
    }
}