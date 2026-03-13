package com.example.experimentkotlin.data.datasource.api

import com.example.experimentkotlin.data.response.UserResponse
import retrofit2.http.GET

interface ApiServices {
    @GET("doLogin/.json")
    suspend fun doLogin(): List<UserResponse>
}