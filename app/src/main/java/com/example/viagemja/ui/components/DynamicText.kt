package com.example.viagemja.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.delay
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Preview
@Composable
fun DynamicTextPreview(){
    DynamicText(fullText = "Texto dinamico", renderTime = 100L, modifier = Modifier)
}


@Composable
fun DynamicText(fullText: String, renderTime: Long, modifier: Modifier ) {
    var dynamicText by remember { mutableStateOf("") }

    LaunchedEffect(fullText) {
        for (i in fullText.indices) {
            dynamicText = fullText.substring(0, i + 1)
            delay(renderTime)
        }
    }

    Text(
        text = dynamicText,
        modifier = modifier
    )

}