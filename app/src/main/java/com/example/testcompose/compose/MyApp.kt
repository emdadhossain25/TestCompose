package com.example.testcompose.compose

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testcompose.ui.theme.TestComposeTheme

@Composable
fun MyApp(

) {
    var shouldShowOnBoarding by rememberSaveable { mutableStateOf(true) }

    if (shouldShowOnBoarding) {
        OnBoardingScreen(OnContinueClicked = { shouldShowOnBoarding = false })
    } else {
        Greetings()

    }


}

@Composable
fun Greetings(
    names: List<String> = List(1000)
    {
        "$it"
    }
) {
    LazyColumn(
        modifier = Modifier
            .padding(vertical = 4.dp)

    ) {
        items(items = names) { name ->
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