package com.example.viagemja.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.viagemja.ui.components.ButtonBackScreen
import com.example.viagemja.ui.components.ButtonComponent
import com.example.viagemja.ui.components.CardDriver
import com.example.viagemja.ui.components.DynamicText
import com.example.viagemja.ui.theme.BlueV
import com.example.viagemja.ui.theme.GreenV


@Preview
@Composable
fun DriversPreview(){
    Drivers()
}
@Composable
fun Drivers(){
    Scaffold(
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(36.dp)
            ) {
                ButtonBackScreen(onClick = {})
            }
        }
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                DynamicText(
                    "Motoristas",
                    10L,
                    Modifier
                        .padding(40.dp)
                        .fillMaxSize(),
                    GreenV

                )

                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(padding),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    items(3) {
                        CardDriver(
                            name = "Homer Simpson",
                            car = "Plymouth Valiant 1973 rosa e enferrujado",
                            description = "Olá! Sou o Homer, seu motorista camarada! Relaxe e aproveite o passeio," +
                                    " com direito a rosquinhas e boas risadas (e talvez alguns desvios).",
                            stars = 3,
                            price = 50.05,
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                    }
                }
            }
        }
    }
}