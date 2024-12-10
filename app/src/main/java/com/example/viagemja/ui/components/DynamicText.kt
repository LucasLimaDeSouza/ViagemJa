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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun DynamicTextPreview(){
    DynamicText(fullText = "Texto dinamico", renderTime = 100L, modifier = Modifier, color = Color.Green)
}


@Composable
fun DynamicText(fullText: String, renderTime: Long, modifier: Modifier, color: Color) {
    var dynamicText by remember { mutableStateOf("") }

    LaunchedEffect(fullText) {
        for (i in fullText.indices) {
            dynamicText = fullText.substring(0, i + 1)
            delay(renderTime)
        }
    }

    Text(
        text = dynamicText,
        modifier = modifier,
        fontSize = 24.sp,
        fontFamily = androidx.compose.ui.text.font.FontFamily.SansSerif,
        fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold,
        color = color
    )

}