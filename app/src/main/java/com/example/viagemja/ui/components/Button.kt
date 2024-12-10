package com.example.viagemja.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun ButtonPreview() {
    Button(label = "Texto", modifier = Modifier, onClick = {})
}


@Composable
fun Button(label: String, modifier: Modifier, onClick: () -> Unit) {
    Button(
        modifier = modifier,
        onClick = onClick,
        shape = Shapes().small
    ) {
        Text(
            text = label
        )
    }
}