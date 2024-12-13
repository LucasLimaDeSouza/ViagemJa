package com.example.viagemja.data.remote.model

import com.example.viagemja.data.remote.model.driverrequestmodel.TravelModel
import com.google.gson.annotations.SerializedName

data class TravelsRequestModel(
    @SerializedName("customer_id") val customerId: String,
    @SerializedName("rides")val travels : List<TravelModel>
)