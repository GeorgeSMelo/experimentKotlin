package com.example.experimentkotlin.domain.usecase

class Login {
    operator fun invoke(user: String, password: String){
        if(user.contains("@Outlook.com")){
            return
        }
        //repository.doLogin(user, password)
    }
    fun example(){

    }
}