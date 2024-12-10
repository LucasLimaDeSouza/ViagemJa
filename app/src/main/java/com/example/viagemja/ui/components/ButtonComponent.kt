package com.example.viagemja.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.viagemja.ui.theme.BlueV

@Preview
@Composable
fun ButtonComponentPreview() {
    ButtonComponent(label = "Texto", modifier = Modifier,containerColor = BlueV, onClick = {})
}


@Composable
fun ButtonComponent(label: String, modifier: Modifier, containerColor: Color, onClick: () -> Unit) {
    Button(
        modifier = modifier,
        onClick = onClick,
        shape = Shapes().small,
        colors = ButtonDefaults.buttonColors(
            containerColor = containerColor
        )
    ) {
        Text(
            text = label,
            fontSize = 24.sp,
            fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold
        )
    }
}