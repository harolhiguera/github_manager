package com.me.githubmanager.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.me.githubmanager.feature.userlist.UserListScreen

@Composable
fun AppNavHost(navHostController: NavHostController) {
     NavHost(
         navController = navHostController,
         startDestination = AppScreens.UserList.route
     ) {
         composable(AppScreens.UserList.route) {
             UserListScreen(navController = navHostController)
         }

         composable(AppScreens.UserDetails.route) {

         }
     }
}