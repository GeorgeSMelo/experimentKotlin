package com.example.experimentkotlin.domain.usecase

import com.example.experimentkotlin.domain.entity.UserEntity
import com.example.experimentkotlin.domain.repository.AuthRepository
import javax.inject.Inject

class Login @Inject constructor (private val authRepository: AuthRepository) {
    suspend operator fun invoke(user: String, password: String): UserEntity?{
        if(user.contains("@Outlook.com")){
            return null
        }
        val response = authRepository.doLogin(user, password)
        return response.random()
    }
}