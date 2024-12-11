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
import com.example.viagemja.ui.components.ButtonComponent
import com.example.viagemja.ui.components.DynamicText
import com.example.viagemja.ui.components.InputComponent
import com.example.viagemja.ui.theme.BlueV
import com.example.viagemja.ui.theme.GreenV

@Preview(showBackground = true)
@Composable
fun WelcomePreview(){
    Welcome(navController = null)
}


@Composable
fun Welcome(navController: NavHostController?) {
    val navController = navController
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
                    onClick = {
                        navController?.navigate("originDestination")
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
                    GreenV

                )
            }
            InputComponent("Seu Nome") {

            }
        }
    }
}
