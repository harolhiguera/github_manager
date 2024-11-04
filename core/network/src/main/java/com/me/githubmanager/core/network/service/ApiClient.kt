package com.me.githubmanager.core.network.service

import com.me.githubmanager.core.model.api.GetUsersResponse
import javax.inject.Inject

class ApiClient @Inject constructor(
    private val apiService: ApiService
) {
    suspend fun getUsers(): Result<GetUsersResponse> = apiService.getUsers()
}