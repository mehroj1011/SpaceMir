package com.mirrox.spacemir.navigation

import android.annotation.SuppressLint
import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.mirrox.spacemir.R


@RequiresApi(Build.VERSION_CODES.S)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NavigationScreen() {
    val navController = rememberNavController()
    val context = LocalContext.current.applicationContext
    Scaffold(
        bottomBar = {
            BottomAppBar(
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp, bottom =20.dp)
                    .clip(RoundedCornerShape(30.dp))
            ) {
                IconButton(
                    onClick = {
                        navController.navigate(ScreensSealed.Home.route) {
                            popUpTo(0)
                        }
                    }, modifier = Modifier.weight(1f)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.home_ic),
                        contentDescription = "",
                        modifier = Modifier.size(25.dp),
                    )
                }
                IconButton(
                    onClick = {
                        navController.navigate(ScreensSealed.Learning.route) {
                            popUpTo(0)
                        }
                    }, modifier = Modifier.weight(1f)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.book_ic),
                        contentDescription = "",
                        modifier = Modifier.size(25.dp),
                    )
                }
                Box(
                    modifier = Modifier
                        .weight(1f),
                    contentAlignment = Alignment.Center
                ) {
                    FloatingActionButton(onClick = {
                        navController.navigate(ScreensSealed.SolarSystem.route)
                    }) {
                        Icon(
                            painter = painterResource(id = R.drawable.galaxy_ic),
                            contentDescription = ""
                        )

                    }

                }
                IconButton(
                    onClick = {
                        navController.navigate(ScreensSealed.MiniGames.route) {
                            popUpTo(0)
                        }
                    }, modifier = Modifier.weight(1f)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.apps_ic),
                        contentDescription = "",
                        modifier = Modifier.size(25.dp),
                    )
                }
                IconButton(
                    onClick = {
                        navController.navigate(ScreensSealed.Profile.route) {
                            popUpTo(0)
                        }
                    }, modifier = Modifier.weight(1f)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.user_ic),
                        contentDescription = "",
                        modifier = Modifier.size(25.dp),
                    )
                }
            }
        }
    ) {
        NavHostController(navController =navController)
    }
}