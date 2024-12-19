package com.example.viagemja.data.remote.model

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class ConfirmeTravelModel(
    @SerializedName("customer_id") val customerId: String,
    val origin: String,
    val destination: String,
    val distance: Int,
    val duration: Int,
    val driver: DriverModel,
    val value: Double
)

