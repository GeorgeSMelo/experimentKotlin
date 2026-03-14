package com.example.experimentkotlin.data.response

import android.provider.ContactsContract
import com.example.experimentkotlin.domain.entity.UserEntity
import com.example.experimentkotlin.domain.entity.UserMode
import com.example.experimentkotlin.domain.entity.UserMode.REGULAR_USER
import kotlinx.serialization.Serializable

@Serializable
data class UserResponse (
    val userId: String,
    val name: String,
    val nickname: String,
    val followers: Int = 0,
    val following: List<String> = emptyList(),
    val userType:Int
)

fun UserResponse.toDomain(): UserEntity{

    val userMode = when(userType){
        REGULAR_USER.userType -> REGULAR_USER
        UserMode.CONTENT_CREATOR_USER.userType -> UserMode.CONTENT_CREATOR_USER
        UserMode.COMPANY_USER.userType -> UserMode.COMPANY_USER
        else -> REGULAR_USER
    }

    return UserEntity(
        userId = userId,
        name = name,
        nickname = nickname,
        followers = followers,
        following = following,
        userMode = userMode
    )
}