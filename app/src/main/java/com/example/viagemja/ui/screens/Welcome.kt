package com.example.viagemja.ui.screens

import com.example.viagemja.R
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.graphics.toColorInt
import com.example.viagemja.ui.components.ButtonComponent
import com.example.viagemja.ui.components.DynamicText
import com.example.viagemja.ui.components.InputComponent
import com.example.viagemja.ui.theme.BlueV

@Preview(showBackground = true)
@Composable
fun WelcomePreview(){
    Welcome()
}


@Composable
fun Welcome(){
    Scaffold(
        bottomBar = {
            BottomAppBar(
                modifier = Modifier
                    .padding(0.dp,5.dp)
            ) {

                ButtonComponent(
                    "Continuar",
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
                //.background(Color.Green)
            ) {
                DynamicText(
                    "Olá!! \n" +
                            "Seja muito bem vindo(a)..\n" +
                            "Lu.. Vi..   Desculpe-me, mas..\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "Qual é o seu nome??",
                    10L,
                    Modifier
                        .padding(40.dp)
                        .fillMaxSize(),
                    androidx.compose.ui.graphics.Color.Green

                )
            }
            InputComponent("Seu Nome") {

            }
        }
    }
}
