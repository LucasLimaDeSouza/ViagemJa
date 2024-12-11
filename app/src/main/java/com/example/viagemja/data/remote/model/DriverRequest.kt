package com.example.viagemja.data.remote.model

import com.example.viagemja.data.remote.model.driverrequestmodel.Coordinate
import com.example.viagemja.data.remote.model.driverrequestmodel.RideOption

data class DriverRequest(
    val origin: Coordinate,
    val destination: Coordinate,
    val distance: Int,
    val duration: Int,
    val options: List<RideOption>
)