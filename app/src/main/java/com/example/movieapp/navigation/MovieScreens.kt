package com.example.movieapp.navigation

enum class MovieScreens{
    HomeScreen,
    DetailsScreen;
    companion object{
        fun fromRoute(route: String?): MovieScreens
        = when (route?.substringBefore("/")){ //working like www.google.com/sign_in
            HomeScreen.name -> HomeScreen
            DetailsScreen.name -> DetailsScreen
            null -> HomeScreen
            else -> throw IllegalArgumentException("Route $route is not recognized")
        }
    }
}