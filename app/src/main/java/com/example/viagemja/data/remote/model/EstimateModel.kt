package com.example.viagemja.data.remote.model

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class EstimateModel(
    @SerializedName("customer_id") val name: String,
    val origin: String,
    val destination: String
)