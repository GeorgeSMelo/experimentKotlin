package com.example.experimentkotlin.domain.repository

interface AuthRepository {
    fun doLogin(user: String, password: String) : Boolean
}