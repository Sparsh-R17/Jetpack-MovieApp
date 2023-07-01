package com.example.movieapp.navigations

import java.lang.IllegalArgumentException

enum class MovieScreens {
    HomeScreen,
    DetailScreen;
    companion object{   //similar to static keyword in other languages like java and dart
        fun fromRoute(route: String?) : MovieScreens
            = when(route?.substringBefore("/")) {
                HomeScreen.name -> HomeScreen
                DetailScreen.name -> DetailScreen
                null -> HomeScreen
                else -> throw  IllegalArgumentException("Route $route is not recognized")
            }
    }
}