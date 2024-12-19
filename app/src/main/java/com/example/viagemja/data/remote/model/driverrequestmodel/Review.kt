package com.example.viagemja.data.remote.model.driverrequestmodel

import kotlinx.serialization.Serializable

@Serializable
data class Review(
    val rating: Int,
    val comment: String
)
