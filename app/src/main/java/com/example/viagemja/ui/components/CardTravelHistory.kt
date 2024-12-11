package com.example.viagemja.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun CardTravelHistoryPreview() {
    CardTravelHistory()
}

@Composable
fun CardTravelHistory() {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(486.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
        )
        ) {
        Column(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Spacer(modifier = Modifier
                .height(2.dp)
                .fillMaxWidth()
                .background(Color.LightGray)
            )
            Column {
                Title("Motorista")
                Description()
            }
            Column {
                Title("Carro")
                Description()
            }
            Column {
                Title("Data")
                Description()
            }
            Column {
                Title("Hora")
                Description()
            }
            Column {
                Title("Origem")
                Description()
            }
            Column {
                Title("Destino")
                Description()
            }
            Column {
                Title("Valor")
                Description()
            }

            Spacer(modifier = Modifier
                .height(2.dp)
                .fillMaxWidth()
                .background(Color.LightGray)
            )
        }
    }
}

@Composable
fun Title(text: String) {
    Text(
        text = text,
        fontSize = 16.sp,
        fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
    )
}

@Composable
fun Description(text: String = "Descrição") {
    Text(
        text = text,
        fontSize = 16.sp,
        fontWeight = androidx.compose.ui.text.font.FontWeight.Normal
    )
}