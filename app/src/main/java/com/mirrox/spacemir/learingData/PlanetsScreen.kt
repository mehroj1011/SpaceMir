package com.mirrox.spacemir.learingData

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.mirrox.spacemir.infoScreen.astronautList
import com.mirrox.spacemir.infoScreen.planetsList
import com.mirrox.spacemir.navigation.ScreensSealed
import com.mirrox.spacemir.objects.AstronautCard


@Composable
fun PLanetsScreen(navController: NavController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
            .padding(end = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        item {
            Spacer(modifier = Modifier.size(30.dp))
        }
        items(planetsList) { astronaut ->
            Spacer(modifier = Modifier.padding(top = 20.dp))
            AstronautCard(
                image = astronaut.coverImage,
                title = astronaut.title,
                description = astronaut.description,
                clickToScreen = {
                    // Навигация на экран информации об астронавте
                    navController.navigate(
                        ScreensSealed.Info.createRoute("planet", astronaut.title)
                    )
                }
            )
        }
        item {
            Spacer(modifier = Modifier.size(120.dp))
        }
    }
}