package com.example.viagemja.data.remote.model

import com.google.gson.annotations.SerializedName

data class TravelsModel(
    @SerializedName("customer_id") val customerId: String,
    val drivers : List<DriverModel>
)