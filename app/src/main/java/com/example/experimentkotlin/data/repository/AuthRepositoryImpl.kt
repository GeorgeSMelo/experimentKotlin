package com.example.experimentkotlin.data.repository

import android.util.Log
import com.example.experimentkotlin.data.datasource.api.ApiServices
import com.example.experimentkotlin.data.response.UserResponse
import com.example.experimentkotlin.data.response.toDomain
import com.example.experimentkotlin.domain.entity.UserEntity
import com.example.experimentkotlin.domain.repository.AuthRepository
import javax.inject.Inject
import kotlin.collections.listOf

class AuthRepositoryImpl @Inject constructor(val api: ApiServices) : AuthRepository {

    override suspend fun doLogin(user: String, password: String): List<UserEntity> {
        val response =
            try {
                api.doLogin()
            } catch (e: Exception) {
                Log.i("DOLOGIN ERROR", "$e")
                listOf()
            }
        return response.map { it.toDomain() }
    }
}