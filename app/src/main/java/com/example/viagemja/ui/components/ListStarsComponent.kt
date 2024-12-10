package com.example.viagemja.ui.components
import com.example.viagemja.R

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun ListStarsComponentPreview() {
    ListStarsComponent(numberOfStars = 3)
}

@Composable
fun ListStarsComponent(numberOfStars: Int) {
    Box {
        LazyRow {
            items(numberOfStars) {
                Icon(
                    painter = painterResource(id = R.drawable.stars),
                    tint = Color.Yellow,
                    contentDescription = "Estrela"
                )
            }
        }
    }
}