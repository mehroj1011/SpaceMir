package com.mirrox.spacemir.screens

import android.net.Uri
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import com.mirrox.spacemir.game.GameCard
import com.mirrox.spacemir.game.gameList

@Composable
fun MiniGameScreen(navController: NavController) {
    LazyColumn(
        modifier = Modifier.fillMaxSize().background(Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        item {
            Spacer(modifier = Modifier.size(50.dp))
            Text(
                text = "Learn more",
                modifier = Modifier.padding(bottom = 16.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                color = Color.White
            )
        }
        items(gameList) { game ->
            GameCard(game = game) {
                // Кодируем URL перед навигацией
                val encodedUrl = Uri.encode(game.url)
                navController.navigate("webview/$encodedUrl")
            }
        }
        item { Spacer(modifier = Modifier.size(120.dp)) }
    }
}

