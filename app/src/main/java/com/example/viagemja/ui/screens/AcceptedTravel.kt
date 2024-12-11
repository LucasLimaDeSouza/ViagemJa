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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.viagemja.ui.components.ButtonBackScreen
import com.example.viagemja.ui.components.ButtonComponent
import com.example.viagemja.ui.components.DynamicText
import com.example.viagemja.ui.components.InputComponent
import com.example.viagemja.ui.theme.BlueV
import com.example.viagemja.ui.theme.GreenV

@Preview
@Composable
fun AcceptedTravelPreview(){
    AcceptedTravel()
}

@Composable
fun AcceptedTravel(){
    Scaffold(
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(36.dp)
            ) {
                ButtonBackScreen(onClick = {})
            }
        },
        bottomBar = {
            BottomAppBar(

                modifier = Modifier
                    .padding(0.dp,5.dp)
            ) {

                ButtonComponent(
                    "Escolher um Motorista",
                    modifier = Modifier
                        .height(91.dp)
                        .fillMaxWidth(),
                    BlueV,
                    onClick = {}
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
                    .height(319.dp)
            ) {
                DynamicText(
                    "Temos motoristas \n" +
                            "Disponíveis!!",
                    10L,
                    Modifier
                        .padding(40.dp)
                        .fillMaxSize(),
                    GreenV

                )
            }

            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Escolha um deles para\n" +
                        "seguirmos viagem",
                fontSize = 24.sp,
                fontFamily = androidx.compose.ui.text.font.FontFamily.SansSerif,
                fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold,
                color = BlueV
            )


        }
    }
}