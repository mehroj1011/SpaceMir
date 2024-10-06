package com.mirrox.spacemir.screens

import androidx.compose.foundation.background
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
import androidx.navigation.NavController
import com.mirrox.spacemir.learingData.categories
import com.mirrox.spacemir.objects.CategoryCard

@Composable
fun LearningScreen(navController: NavController) {
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
        items(categories) { category ->
            CategoryCard(
                image = category.image,
                title = category.title,
                clickToScreen = { navController.navigate(category.route) }
            )
        }
        item { 
            Spacer(modifier = Modifier.size(100.dp))
        }
    }
}