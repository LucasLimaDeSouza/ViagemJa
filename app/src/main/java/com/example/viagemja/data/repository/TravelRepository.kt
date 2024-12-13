package com.example.viagemja.data.repository

import com.example.viagemja.data.remote.api.RetrofitInstance
import com.example.viagemja.data.remote.model.ApiResponse
import com.example.viagemja.data.remote.model.ConfirmeTravelModel
import com.example.viagemja.data.remote.model.DriverRequest
import com.example.viagemja.data.remote.model.EstimateModel
import com.example.viagemja.data.remote.model.TravelsRequestModel

class TravelRepository {
    suspend fun estimateTravel(estimate: EstimateModel): DriverRequest? {
        return try {
            val response = RetrofitInstance.api.estimateTravel(estimate)
            response
        } catch (e: Exception) {
            print("Erro na requisação:" + e.message)
            null
        }
    }

    suspend fun confirmTravel(travel: ConfirmeTravelModel): ApiResponse? {
        return try {
            val response = RetrofitInstance.api.confirmTravel(travel)
            response
        } catch (e: Exception) {
            print("Erro na requisação:" + e.message)
            null
        }
    }

    suspend fun getTravels(customerId: String, driverId: Int): TravelsRequestModel? {
        return try {
            val response = RetrofitInstance.api.getTravels(customerId, driverId)
            response
        } catch (e: Exception) {
            print("Erro na requisação:" + e.message)
            null
        }
    }
}