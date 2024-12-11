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
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.viagemja.ui.components.ButtonBackScreen
import com.example.viagemja.ui.components.ButtonComponent
import com.example.viagemja.ui.components.CardTravelHistory
import com.example.viagemja.ui.theme.BlueV

@Preview
@Composable
fun TravelConfirmPreview(){
    TravelConfirm(navController = null)
}

@Composable
fun TravelConfirm(navController: NavHostController?) {
    val navController = navController
    Scaffold(
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(36.dp)
            ) {
                ButtonBackScreen(onClick = {
                    navController?.navigate("drivers")
                })
            }
        },
        bottomBar = {
            BottomAppBar(
                modifier = Modifier
                    .padding(0.dp,5.dp)
            ) {
                ButtonComponent(
                    "Confirmar Viagem",
                    modifier = Modifier
                        .height(91.dp)
                        .fillMaxWidth(),
                    BlueV,
                    onClick = {
                        navController?.navigate("travelHistory")
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
            Spacer(modifier = Modifier.height(80.dp))
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                CardTravelHistory()
            }

        }
    }
}