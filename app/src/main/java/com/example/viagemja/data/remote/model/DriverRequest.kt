package com.example.viagemja.data.remote.model

import com.example.viagemja.data.remote.model.driverrequestmodel.Coordinate
import com.example.viagemja.data.remote.model.driverrequestmodel.RideOption
import kotlinx.serialization.Serializable

@Serializable
data class DriverRequest(
    val origin: Coordinate,
    val destination: Coordinate,
    val distance: Int,
    val duration: Int,
    val options: List<RideOption>
)