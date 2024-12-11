package com.example.viagemja.data.remote.model.driverrequestmodel

data class RideOption(
    val id: Int,
    val name: String,
    val description: String,
    val vehicle: String,
    val review: Review,
    val value: Double
)
