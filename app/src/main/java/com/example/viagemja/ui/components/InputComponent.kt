package com.example.viagemja.ui.components

import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun InputComponentPreview() {
    InputComponent(value = "Texto", label = "Texto", onValueChange = {})
}


@Composable
fun InputComponent(value : String, label: String, onValueChange: (String) -> Unit) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(label) },
        shape = Shapes().large,
        singleLine = true

    )
}