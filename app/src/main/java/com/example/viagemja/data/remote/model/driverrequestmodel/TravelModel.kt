package com.example.viagemja.data.remote.model.driverrequestmodel

import com.example.viagemja.data.remote.model.DriverRequest
import kotlinx.serialization.Serializable


@Serializable
data class TravelModel(
    val id: Int,
    val date: String,
    val origin: String,
    val destination: String,
    val distance: Double,
    val duration: String,
    val driver: DriverRequest,
    val value: Double
)