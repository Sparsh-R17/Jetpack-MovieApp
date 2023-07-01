package com.example.movieapp.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.movieapp.screens.detail.DetailScreen
import com.example.movieapp.screens.home.HomeScreen

@Composable
fun MovieNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = MovieScreens.HomeScreen.name
    ) {
        composable(MovieScreens.HomeScreen.name) {
            //here we pass where this should lead us to
            HomeScreen(navController = navController)
        }
        composable(
            MovieScreens.DetailScreen.name + "/{movieName}",
            arguments = listOf(navArgument(name = "movieName") { type = NavType.StringType })
        ) {
            backStackEntry ->
            DetailScreen(navController = navController,backStackEntry.arguments?.getString("movieName"))
        }
    }
}