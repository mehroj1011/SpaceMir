package com.mirrox.spacemir.game

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mirrox.spacemir.R

@Composable
fun GameCard(
    game: Game,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .clip(RoundedCornerShape(30.dp))
    ) {
        Image(
            painter = painterResource(game.imageRes),
            contentDescription = "",
            modifier = Modifier
                .align(Alignment.TopCenter),
            contentScale = ContentScale.Crop
        )
        Column(modifier = Modifier.align(Alignment.BottomStart)) {
            Text(
                text = game.name,
                modifier = Modifier.padding(start = 20.dp, bottom = 10.dp),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Button(
                onClick = {
                    onClick()
                },
                modifier = Modifier
                    .padding(start = 20.dp, bottom = 20.dp)

            ) {
                Icon(
                    painter = painterResource(id = R.drawable.arrow_right_ic_big),
                    contentDescription = "",
                    Modifier.size(20.dp)
                )
            }
        }
    }
}