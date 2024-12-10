package com.example.viagemja.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.viagemja.R

@Preview
@Composable
fun ButtonBackScreenPreview(){
    ButtonBackScreen(onClick = {})
}


@Composable
fun ButtonBackScreen(onClick: () -> Unit) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
        )
    ) {
        Icon(
            painter = painterResource(R.drawable.arrow_circle_left),
            contentDescription = "Voltar",
            tint = Color.Unspecified
        )
    }
}