package com.mirrox.spacemir.navigation

sealed class ScreensSealed (val route: String){
    data object Home : ScreensSealed(route = "home")
    data object Learning : ScreensSealed(route = "learning")
    data object SolarSystem : ScreensSealed(route = "solarSystem")
    data object MiniGames : ScreensSealed(route = "miniGames")
    data object Profile : ScreensSealed(route = "profile")
    object Info : ScreensSealed(route = "info/{objectType}/{objectName}") {
        fun createRoute(objectType: String, objectName: String) = "info/$objectType/$objectName"
    }
}