package com.example.viagemja.ui.components

import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun InputComponentPreview() {
    InputComponent(label = "Texto", onValueChange = {})
}


@Composable
fun InputComponent(label: String, onValueChange: (String) -> Unit) {
    TextField(
        value = "",
        onValueChange = onValueChange,
        label = { Text(label) },
        shape = Shapes().large,
        singleLine = true

    )
}