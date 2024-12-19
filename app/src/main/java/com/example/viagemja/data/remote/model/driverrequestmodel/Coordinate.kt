package com.example.viagemja.data.remote.model.driverrequestmodel

import kotlinx.serialization.Serializable

@Serializable
data class Coordinate(
    val latitude: Double,
    val longitude: Double
)
