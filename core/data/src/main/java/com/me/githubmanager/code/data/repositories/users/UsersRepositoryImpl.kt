package com.me.githubmanager.code.data.repositories.users

import com.me.githubmanager.core.model.api.User
import com.me.githubmanager.core.network.service.ApiClient
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class UsersRepositoryImpl @Inject constructor(
    private val apiClient: ApiClient,
) : UsersRepository {

    override fun getUserList(
        page: Int,
        onStart: () -> Unit,
        onComplete: () -> Unit,
        onError: (String?) -> Unit,
    ): Flow<List<User>> {
        return flow {
            onStart()
            val result = apiClient.getUsers()
            result.onSuccess {
                emit(it)
            }.onFailure {
                onError(it.message)
            }
            onComplete()
        }.catch { e ->
            onError(e.message)
        }
    }
}