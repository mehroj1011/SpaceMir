package com.mirrox.spacemir.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.mirrox.spacemir.game.GameWebViewScreen
import com.mirrox.spacemir.infoScreen.InfoObject
import com.mirrox.spacemir.infoScreen.astronautList
import com.mirrox.spacemir.infoScreen.cometsList
import com.mirrox.spacemir.infoScreen.infoRocketsList
import com.mirrox.spacemir.infoScreen.planetsList
import com.mirrox.spacemir.infoScreen.telescopesList
import com.mirrox.spacemir.learingData.AstronautsScreen
import com.mirrox.spacemir.learingData.CometScreen
import com.mirrox.spacemir.learingData.PLanetsScreen
import com.mirrox.spacemir.learingData.RocketsScreen
import com.mirrox.spacemir.learingData.TelescopeScreen
import com.mirrox.spacemir.screens.HomeScreen
import com.mirrox.spacemir.screens.LearningScreen
import com.mirrox.spacemir.screens.MiniGameScreen
import com.mirrox.spacemir.screens.ProfileScreen
import com.mirrox.spacemir.screens.SolarSystemScreen

@RequiresApi(Build.VERSION_CODES.S)
@Composable
fun NavHostController(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = ScreensSealed.Home.route
    ) {
        //LearningScreen
        composable(route = "astronauts") {
            AstronautsScreen(navController = navController)
        }
        composable(route = "planets") {
            PLanetsScreen(navController = navController)
        }
        composable(route = "telescopes") {
            TelescopeScreen(navController = navController)
        }
        composable(route = "rockets") {
            RocketsScreen(navController = navController)
        }
        composable(route = "comets") {
            CometScreen(navController = navController)
        }
        //LearningScreen
        composable(route = ScreensSealed.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(route = ScreensSealed.Learning.route) {
            LearningScreen(navController = navController)
        }
        composable(route = ScreensSealed.SolarSystem.route) {
            SolarSystemScreen(navController = navController)
        }
        composable(route = ScreensSealed.MiniGames.route) {
            MiniGameScreen(navController = navController)
        }
        composable(
            route = "webview/{url}",
            arguments = listOf(navArgument("url") { type = NavType.StringType })
        ) { backStackEntry ->
            val url = backStackEntry.arguments?.getString("url") ?: ""
            GameWebViewScreen(url = url)
        }
        composable(route = ScreensSealed.Profile.route) {
            ProfileScreen(navController = navController)
        }
        composable(
            route = "${ScreensSealed.Info.route}",
            arguments = listOf(
                navArgument("objectType") { type = NavType.StringType },
                navArgument("objectName") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val objectType = backStackEntry.arguments?.getString("objectType")
            val objectName = backStackEntry.arguments?.getString("objectName")

            when (objectType) {
                "astronaut" -> {
                    val astronaut = astronautList.find { it.name == objectName }
                    if (astronaut != null) {
                        InfoObject(
                            navController = navController,
                            title = astronaut.name,
                            image = astronaut.imageInfo,
                            characteristics = astronaut.characteristics,
                            description = astronaut.infoAstronaut
                        )
                    } else {
                        // Обработка случая, когда астронавт не найден
                        Text("Astronaut not found")
                    }
                }
                "planet" -> {
                    val planetInfo = planetsList.firstOrNull { it.title == objectName }
                    planetInfo?.let {
                        InfoObject(
                            title = it.title,
                            image = it.infoImage,
                            characteristics = it.characteristics,
                            description = it.description,
                            navController = navController,
                        )
                    } ?: run {
                        // Обработка случая, когда планета не найдена
                        Text("Planet not found")
                    }
                }
                "telescope" -> {
                    val planetInfo = telescopesList.firstOrNull { it.name == objectName }
                    planetInfo?.let {
                        InfoObject(
                            title = it.name,
                            image = it.imageCover,
                            characteristics = it.characteristics,
                            description = it.description,
                            navController = navController,
                        )
                    } ?: run {
                        // Обработка случая, когда планета не найдена
                        Text("Planet not found")
                    }
                }
                "rocket" -> {
                    val planetInfo = infoRocketsList.firstOrNull { it.name == objectName }
                    planetInfo?.let {
                        InfoObject(
                            title = it.name,
                            image = it.imageCover,
                            characteristics = it.characteristics,
                            description = it.description,
                            navController = navController,
                        )
                    } ?: run {
                        // Обработка случая, когда планета не найдена
                        Text("Rocket not found")
                    }
                }
                "comet" -> {
                    val cometInfo = cometsList.firstOrNull { it.name == objectName }
                    cometInfo?.let {
                        InfoObject(
                            title = it.name,
                            image = it.imageCover,
                            characteristics = it.characteristics,
                            description = it.description,
                            navController = navController,
                        )
                    } ?: run {
                        // Обработка случая, когда планета не найдена
                        Text("Rocket not found")
                    }
                }
                else -> {
                    Text("Unknown object type")
                }
            }
        }
    }
}