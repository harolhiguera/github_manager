package com.me.githubmanager.core.network.di

import com.me.githubmanager.core.network.AppDispatchers
import com.me.githubmanager.core.network.Dispatcher
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

@Module
@InstallIn(SingletonComponent::class)
internal object DispatchersModule {

    @Provides
    @Dispatcher(AppDispatchers.IO)
    fun providesIODispatcher(): CoroutineDispatcher = Dispatchers.IO
}