package com.example.viagemja.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.viagemja.data.remote.model.EstimateModel
import com.example.viagemja.ui.components.ButtonBackScreen
import com.example.viagemja.ui.components.ButtonComponent
import com.example.viagemja.ui.components.DynamicText
import com.example.viagemja.ui.components.InputComponent
import com.example.viagemja.ui.theme.BlueV
import com.example.viagemja.ui.theme.GreenV
import com.example.viagemja.viewmodel.TravelViewModel

@Preview(showBackground = true)
@Composable
fun OriginDestinationPreview() {
    OriginDestination(name = "alguem", navController = null)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OriginDestination(
    name: String,
    navController: NavHostController?,
    viewModel: TravelViewModel = viewModel()
) {
    val navController = navController

    val estimateFlow by viewModel.estimate.collectAsState()
    var origin by remember { mutableStateOf("") }
    var destiny by remember { mutableStateOf("") }


    val firstValueRiderGet = estimateFlow?.options[0]?.value.toString()
    val lastValueRiderGet = estimateFlow?.options?.lastOrNull()?.value.toString()


    fun estimateFun() {
        viewModel.estimateTravel(
            EstimateModel(
                "CT01",
                "Av. Pres. Kenedy, 2385 - Remédios, Osasco - SP, 02675-031",
                "Av. Paulista, 1538 - Bela Vista, São Paulo - SP, 01310-200"
            )
        )
    }

    Scaffold(
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(36.dp)
            ) {
                ButtonBackScreen(onClick = {
                    navController?.navigate("welcome")
                })
            }
        },
        bottomBar = {
            BottomAppBar(
                modifier = Modifier
                    .padding(0.dp, 5.dp)
            ) {
                ButtonComponent(
                    "Continuar",
                    modifier = Modifier
                        .height(91.dp)
                        .fillMaxWidth(),
                    BlueV,
                    onClick = {
                        estimateFun()
                        //navController?.navigate("acceptedTravel")
                    }
                )
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
                    .height(319.dp)
            ) {
                DynamicText(
                    "Seja muito bem vindo(a) $name \n" +
                            "Para começar, \n" +
                            "diga a origem e destino de sua viagem " +
                            "abaixo.",
                    10L,
                    Modifier
                        .padding(40.dp)
                        .fillMaxSize(),
                    GreenV
                )
            }
            InputComponent(
                value = origin,
                onValueChange = {
                    origin = it
                }, label = "Origem"
            )
            Spacer(modifier = Modifier.height(20.dp))
            InputComponent(
                value = destiny, onValueChange = {
                    destiny = it
                },
                label = "Destino"
            )
            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Valor Estimado:",
                fontSize = 24.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.SemiBold,
                color = BlueV
            )

            Text(
                text = "$firstValueRiderGet - $lastValueRiderGet",
                fontSize = 16.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.SemiBold,
                color = GreenV
            )


        }
    }
}