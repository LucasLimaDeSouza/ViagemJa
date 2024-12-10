package com.example.viagemja.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.viagemja.utils.NameDriverUtils


@Preview(showBackground = true)
@Composable
fun CardDriverPreview() {
    CardDriver(
        name = "Homer Simpson",
        car = "Plymouth Valiant 1973 rosa e enferrujado",
        description = "Olá! Sou o Homer, seu motorista camarada! Relaxe e aproveite o passeio," +
                " com direito a rosquinhas e boas risadas (e talvez alguns desvios).",
        stars = 3,
        price = 50.05,
    )
}

@Composable
fun CardDriver(
    name: String,
    car: String,
    description: String,
    stars: Int,
    price: Double,
) {

    val photoDriver = NameDriverUtils(name)
    //val numberOfStars = NumberOfStarsUtils(stars)

    Card(
        modifier = Modifier
            .size(332.dp, 332.dp),
        shape = RectangleShape,
        colors = CardDefaults.cardColors(
            contentColor = Color.Black,
        ),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()

        ) {
            Card(
                modifier = Modifier
                    .height(241.dp)
                    .fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize(),
                ) {

                    Column(
                        modifier = Modifier
                            .weight(2.5f)
                            .fillMaxHeight()
                            .padding(12.dp),
                        verticalArrangement = Arrangement
                            .SpaceEvenly
                    ) {
                        Text(
                            text = name,
                            fontSize = 16.sp,
                            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
                        )
                        Text(
                            text = "Carro: $car",
                            fontSize = 12.sp,
                            fontWeight = androidx.compose.ui.text.font.FontWeight.Normal
                        )
                        Text(
                            text = description,
                            color = Color.White,
                            fontSize = 12.sp,
                            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
                        )
                        ListStarsComponent(stars)
                    }

                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .padding(10.dp),
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Image(
                            painter = painterResource(id = photoDriver),
                            modifier = Modifier
                                .size(80.dp),
                            contentDescription = "Foto do motorista"
                        )
                        Text(
                            text = "R$ $price",
                            fontSize = 16.sp,
                            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
                        )
                    }
                }
            }
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .background(Color.Red)
                    .fillMaxSize(),
                shape = RectangleShape

            ) {
                Text(
                    text = "Escolher",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    fontSize = 24.sp,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold

                    )
            }
        }
    }
}