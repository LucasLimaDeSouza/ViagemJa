package com.example.viagemja.data.remote.api

import com.example.viagemja.data.remote.model.ApiResponse
import com.example.viagemja.data.remote.model.TravelsRequestModel
import com.example.viagemja.data.remote.model.ConfirmeTravelModel
import com.example.viagemja.data.remote.model.DriverRequest
import com.example.viagemja.data.remote.model.EstimateModel
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface MyApiService {

    @POST("/ride/estimate")
    suspend fun estimateTravel(
        @Body estimate: EstimateModel
    ): DriverRequest

    @PATCH("/ride/confirm")
    suspend fun confirmTravel(
        @Body travel: ConfirmeTravelModel
    ): ApiResponse

    @GET("/ride/{customer_id}")
    suspend fun getTravels(
        @Path("customer_id") customerId: String,
        @Query("driver_id") driverId: Int
    ): TravelsRequestModel
}