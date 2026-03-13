package com.example.experimentkotlin.data.di

import com.example.experimentkotlin.data.datasource.api.ApiServices
import com.example.experimentkotlin.data.repository.AuthRepositoryImpl
import com.example.experimentkotlin.domain.repository.AuthRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    fun provideAuthRepository(api: ApiServices): AuthRepository {
        return AuthRepositoryImpl(api)
    }

    @Provides
    fun provideApiService(retrofit: Retrofit): ApiServices{
        return retrofit.create(ApiServices::class.java)
    }

    @Provides
    fun provideRetrofit(): Retrofit{
        Retrofit
            .Builder()
            .baseUrl()
    }
}