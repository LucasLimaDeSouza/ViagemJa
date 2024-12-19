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
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.viagemja.ui.components.ButtonBackScreen
import com.example.viagemja.ui.components.CardDriver
import com.example.viagemja.ui.components.DynamicText
import com.example.viagemja.ui.theme.GreenV
import com.example.viagemja.viewmodel.TravelViewModel



@Preview
@Composable
fun DriversPreview(){
    Drivers(navController = null)
}
@Composable
fun Drivers(navController: NavHostController?, viewModel: TravelViewModel = viewModel()) {
    val navController = navController
    val viewModel by remember { mutableStateOf(viewModel) }

    Scaffold(
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(36.dp)
            ) {
                ButtonBackScreen(onClick = {
                    navController?.navigate("originDestination")
                })
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
                            navController,
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