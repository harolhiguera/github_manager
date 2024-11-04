package com.me.githubmanager.navigation

sealed class AppScreens(
    val route: String,
) {
    data object UserList : AppScreens("user_list")
    data object UserDetails : AppScreens("user_details")
}