package com.mirrox.spacemir.screens

import android.net.Uri
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.mirrox.spacemir.R
import com.mirrox.spacemir.game.GameCard
import com.mirrox.spacemir.game.gameList
import com.mirrox.spacemir.infoScreen.astronautList
import com.mirrox.spacemir.infoScreen.planetsList
import com.mirrox.spacemir.navigation.ScreensSealed
import com.mirrox.spacemir.objects.PlanetsCard
import com.mirrox.spacemir.objects.AstronautCard

@Composable
fun HomeScreen(navController: NavController) {
    val context = LocalContext.current.applicationContext
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray),
    ) {
        item {
            //Explore the universe
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 50.dp, bottom = 0.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier.padding(start = 20.dp, end = 40.dp),
                    text = "Explore the universe",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(fontSize = 30.sp)
                )
                Image(
                    painter = painterResource(id = R.drawable.ava),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                        .border(
                            BorderStroke(
                                4.dp,
                                Brush.sweepGradient(
                                    listOf(
                                        Color(0xFF9575CD),
                                        Color(0xFFBA68C8),
                                        Color(0xFFE57373),
                                        Color(0xFFFFB74D),
                                        Color(0xFF9575CD),
                                    )
                                )
                            ),
                            CircleShape,
                        )
                )
            }
            val state = rememberScrollState()
            LazyRow(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp)) {
                items(astronautList) { astronaut ->
                    AstronautCard(
                        image = astronaut.imageCover,
                        title = astronaut.name,
                        description = astronaut.description,
                        clickToScreen = {
                            navController.navigate(
                                ScreensSealed.Info.createRoute("astronaut", astronaut.name)
                            )
                        }
                    )
                }
            }
            // Карточки планет
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
            ) {
                items(planetsList) { planet ->
                    PlanetsCard(
                        coverImage = planet.coverImage,
                        title = planet.title,
                        clickToScreen = {
                            navController.navigate(
                                ScreensSealed.Info.createRoute(
                                    "planet",
                                    planet.title
                                )
                            )
                        }
                    )
                }
            }
        }
        items(gameList.take(3)) { game ->
            GameCard(game = game) {
                // Кодируем URL перед навигацией
                val encodedUrl = Uri.encode(game.url)
                navController.navigate("webview/$encodedUrl")
            }
        }
        item {
            Spacer(modifier = Modifier.size(120.dp))
        }
    }
}

