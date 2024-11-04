package com.me.githubmanager.core.network.di

import com.me.githubmanager.core.network.service.ApiClient
import com.me.githubmanager.core.network.service.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
internal object NetworkModule {

    @Provides
    @Singleton
    @Named("okHttpClient_instance")
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .connectTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .build()
    }

    @Provides
    @Singleton
    @Named("retrofit_instance")
    fun provideRetrofit(
        @Named("okHttpClient_instance") okHttpClient: OkHttpClient
    ): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl("https://api.github.com")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    @Named("service_instance")
    fun provideService(
        @Named("retrofit_instance") retrofit: Retrofit
    ): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideApiClient(
        @Named("service_instance") service: ApiService
    ): ApiClient {
        return ApiClient(service)
    }
}