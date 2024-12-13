package com.example.viagemja.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.viagemja.ui.components.ButtonBackScreen
import com.example.viagemja.ui.components.ButtonComponent
import com.example.viagemja.ui.components.CardTravelHistory
import com.example.viagemja.ui.components.InputComponent
import com.example.viagemja.ui.theme.BlueV
import com.example.viagemja.ui.theme.GreenV
import com.example.viagemja.ui.theme.RedV

@Preview
@Composable
fun TravelHistoryPreview() {
    TravelHistory(navController = null)
}


@Composable
fun TravelHistory(navController: NavHostController?) {
    val navController = navController
    Scaffold(
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(36.dp,40.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Histórico de viagens",
                    fontSize = 24.sp,
                    fontFamily = androidx.compose.ui.text.font.FontFamily.SansSerif,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold,
                    color = GreenV
                )
                Text(
                    text = "Sair",
                    fontSize = 24.sp,
                    fontFamily = androidx.compose.ui.text.font.FontFamily.SansSerif,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                    color = RedV,
                    modifier = Modifier.clickable {
                        navController?.navigate("welcome")
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
                    .size(290.dp, 240.dp)

            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    InputComponent(value = "", "Passageiro(a)", onValueChange = {})
                    Spacer(modifier = Modifier.height(29.dp))
                    InputComponent(value = "", "Motorista", onValueChange = {})
                    Spacer(modifier = Modifier.height(49.dp))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        ButtonComponent(
                            "Filtrar",
                            modifier = Modifier
                                .weight(1f)
                                .height(50.dp),
                            GreenV,
                            onClick = {}
                        )
                        Spacer(modifier = Modifier.width(9.dp))
                        ButtonComponent(
                            "Todas",
                            modifier = Modifier
                                .weight(1f)
                                .height(50.dp),
                            BlueV,
                            onClick = {}
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                LazyColumn {
                    items(3) {
                        CardTravelHistory()
                    }
                }
            }

        }
    }
}