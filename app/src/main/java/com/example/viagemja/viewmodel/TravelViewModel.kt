package com.example.viagemja.viewmodel

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.viagemja.data.remote.model.ApiResponse
import com.example.viagemja.data.remote.model.ConfirmeTravelModel
import com.example.viagemja.data.remote.model.DriverRequest
import com.example.viagemja.data.remote.model.EstimateModel
import com.example.viagemja.data.remote.model.TravelsRequestModel
import com.example.viagemja.data.repository.TravelRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class TravelViewModel : ViewModel() {
    private val travelRepository = TravelRepository()

    private val _estimate = MutableStateFlow<DriverRequest?>(null)
    val estimate = _estimate.asStateFlow()

    private val _travels = mutableStateOf<TravelsRequestModel?>(null)
    val travels: State<TravelsRequestModel?> = _travels

    private val _confirmTravel = mutableStateOf<ApiResponse?>(null)
    val confirmTravel: State<ApiResponse?> = _confirmTravel




     fun estimateTravel(estimate: EstimateModel) {
            viewModelScope.launch {
                try {

                val result = travelRepository.estimateTravel(estimate)
                _estimate.value = result
                } catch (e: Exception) {
                    Log.d("Estimate Travel", "Error estimating travel", e)
                }
            }
    }

    fun confirmTravel(travel: ConfirmeTravelModel) {
        viewModelScope.launch {
            val result = travelRepository.confirmTravel(travel)
            _confirmTravel.value = result
        }
    }

    fun getTravels(customerId: String, driverId: Int) {
        viewModelScope.launch {
            val result = travelRepository.getTravels(customerId, driverId)
            _travels.value = result
        }
    }

}