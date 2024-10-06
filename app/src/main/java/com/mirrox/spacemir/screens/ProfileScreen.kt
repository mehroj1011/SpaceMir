package com.mirrox.spacemir.screens


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.mirrox.spacemir.R

@Composable
fun ProfileScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.size(50.dp))
        Text(
            text = "Learn more",
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            color = Color.White
        )
        Image(
            painter = painterResource(id = R.drawable.ava),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
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
        Text(
            text = "Yuri Gagatin",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.padding(top = 10.dp)
        )
        Button(
            onClick = {

            },
            modifier = Modifier
                .padding(top = 16.dp)
        ) {
            Row {
                Text(text = "Edit Profile")
                Spacer(modifier = Modifier.size(10.dp))
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = "",
                    Modifier.size(20.dp)
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp, end = 16.dp)
                .clip(RoundedCornerShape(30.dp))
                .background(Color.Black)
        ) {
            Text(
                text = "My Achievements",
                fontSize = 30.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier =Modifier.align(Alignment.Center).padding(20.dp)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp, end = 16.dp)
                .clip(RoundedCornerShape(30.dp))
                .background(Color.Black)
        ) {
            Text(
                text = "Daily Challenge",
                fontSize = 30.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier =Modifier.align(Alignment.Center).padding(20.dp)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, end = 16.dp, start = 16.dp)
                .clip(RoundedCornerShape(30.dp))
                .background(Color.Black)
        ) {
            Text(
                text = "Motivational quotes",
                fontSize = 30.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier =Modifier.align(Alignment.Center).padding(20.dp)
            )
        }

    }
}
