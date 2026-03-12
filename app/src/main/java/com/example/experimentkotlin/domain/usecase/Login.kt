package com.example.experimentkotlin.domain.usecase

import com.example.experimentkotlin.domain.repository.AuthRepository

class Login(private val authRepository: AuthRepository) {
    operator fun invoke(user: String, password: String){
        if(user.contains("@Outlook.com")){
            return
        }
        val response = authRepository.doLogin(user, password)
        
    }
}