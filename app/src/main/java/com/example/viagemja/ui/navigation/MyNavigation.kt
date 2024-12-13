package com.example.viagemja.ui.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.viagemja.ui.screens.AcceptedTravel
import com.example.viagemja.ui.screens.Drivers
import com.example.viagemja.ui.screens.OriginDestination
import com.example.viagemja.ui.screens.TravelConfirm
import com.example.viagemja.ui.screens.TravelHistory
import com.example.viagemja.ui.screens.Welcome
import com.example.viagemja.viewmodel.TravelViewModel


@Composable
fun MyNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "welcome") {
        composable("welcome") {
            Welcome(TravelViewModel() ,navController)
        }
        composable("originDestination/{name}") { backStackEntry ->
            val name = backStackEntry.arguments?.getString("name")
            OriginDestination(name = name.toString(),navController)
        }
        composable("acceptedTravel") {
            AcceptedTravel(navController)
        }
        composable("drivers") {
            Drivers(navController)
        }
        composable("travelConfirm") {
            TravelConfirm(navController)
        }
        composable("travelHistory") {
            TravelHistory(navController)
        }
    }
}