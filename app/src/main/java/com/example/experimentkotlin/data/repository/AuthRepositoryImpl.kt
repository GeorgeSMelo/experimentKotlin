package com.example.experimentkotlin.data.repository

import com.example.experimentkotlin.data.response.UserResponse
import com.example.experimentkotlin.data.response.toDomain
import com.example.experimentkotlin.domain.entity.UserEntity
import com.example.experimentkotlin.domain.repository.AuthRepository

class AuthRepositoryImpl(): AuthRepository {

    override fun doLogin(user: String, password: String): UserEntity {

        val userResponse: UserResponse = UserResponse("","","",10,listOf(""),0)

        return userResponse.toDomain()
    }
}