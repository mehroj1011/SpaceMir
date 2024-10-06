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
import com.mirrox.spacemir.infoScreen.cometsList
import com.mirrox.spacemir.infoScreen.planetsList
import com.mirrox.spacemir.navigation.ScreensSealed
import com.mirrox.spacemir.objects.AstronautCard


@Composable
fun CometScreen(navController: NavController) {
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
        items(cometsList) { infoComets ->
            Spacer(modifier = Modifier.padding(top = 20.dp))
            AstronautCard(
                image = infoComets.imageCover,
                title = infoComets.name,
                description = infoComets.description,
                clickToScreen = {
                    // Навигация на экран информации об астронавте
                    navController.navigate(
                        ScreensSealed.Info.createRoute("comet", infoComets.name)
                    )
                }
            )
        }
        item {
            Spacer(modifier = Modifier.size(120.dp))
        }
    }
}