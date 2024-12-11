package com.example.viagemja.data.remote.model

import com.google.gson.annotations.SerializedName

data class ConfirmeTravelModel(
    @SerializedName("customer_id") val customerId: String,
    val date: String,
    val origin: String,
    val destination: String,
    val distance: Double,
    val duration: String,
    val driver: DriverModel,
    val value: Double
)

