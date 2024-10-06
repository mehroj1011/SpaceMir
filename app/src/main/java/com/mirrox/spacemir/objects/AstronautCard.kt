package com.mirrox.spacemir.objects

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.mirrox.spacemir.infoScreen.Astronaut
import com.mirrox.spacemir.infoScreen.astronautList
import com.mirrox.spacemir.navigation.ScreensSealed


@Composable
fun AstronautCard(
    image: Int,
    title: String,
    description: String,
    clickToScreen: () -> Unit, // Параметр для навигации
    width: Dp = 395.dp,
    height: Dp = 100.dp,
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .size(width = width, height = height)
            .padding(start = 20.dp)
            .clip(RoundedCornerShape(30.dp))
            .background(Color.Black)
            .clickable {
                clickToScreen() // Вызов функции навигации
            },
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(20.dp)),
                contentScale = ContentScale.Crop
            )
            Column(modifier = Modifier.padding(10.dp)) {
                Text(text = title, color = Color.White, fontWeight = FontWeight.Bold, fontSize = 20.sp, modifier = Modifier.padding(top = 5.dp))
                Text(text = description, color = Color.White, maxLines = 2, overflow = TextOverflow.Ellipsis , modifier = Modifier.padding(top = 20.dp))
            }
        }
    }
}