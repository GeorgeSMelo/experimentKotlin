package com.example.experimentkotlin.domain.repository

import com.example.experimentkotlin.domain.entity.UserEntity


interface AuthRepository {
    suspend fun doLogin(user: String, password: String) : List<UserEntity>
}