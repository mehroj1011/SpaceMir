package com.mirrox.spacemir

import android.annotation.SuppressLint
import android.app.ActivityManager.AppTask
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

import com.mirrox.spacemir.ui.theme.SpaceMirTheme
import kotlinx.coroutines.delay

class SplashActivity : androidx.activity.ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SpaceMirTheme {
                SplachScreen()
            }
        }
    }

    @Preview
    @Composable
    private fun SplachScreen() {
        LaunchedEffect(key1 = true, block = {
            delay(timeMillis = 2100)
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
        })
        Image(
            painter = painterResource(id = R.drawable.splash_1_image),
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }
}