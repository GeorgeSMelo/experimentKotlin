package com.example.experimentkotlin.domain.repository

import com.example.experimentkotlin.domain.entity.UserEntity


interface AuthRepository {
    fun doLogin(user: String, password: String) : UserEntity
}