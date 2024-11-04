package com.me.githubmanager.core.network.service

import com.me.githubmanager.core.model.api.GetUsersResponse
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): Result<GetUsersResponse>
}