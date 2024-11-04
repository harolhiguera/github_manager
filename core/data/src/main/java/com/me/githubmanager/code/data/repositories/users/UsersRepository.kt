package com.me.githubmanager.code.data.repositories.users

import androidx.annotation.WorkerThread
import com.me.githubmanager.core.model.api.User
import kotlinx.coroutines.flow.Flow


interface UsersRepository {

    @WorkerThread
    fun getUserList(
        page: Int,
        onStart: () -> Unit,
        onComplete: () -> Unit,
        onError: (String?) -> Unit,
    ): Flow<List<User>>
}