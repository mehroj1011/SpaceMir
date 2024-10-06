package com.mirrox.spacemir.learingData

import com.mirrox.spacemir.R

data class Category(
    val title: String,
    val image: Int,
    val route: String // Новый параметр для маршрута навигации
)

val categories = listOf(
    Category(title = "Astronauts", image = R.drawable.astronaut_image, route = "astronauts"),
    Category(title = "Rockets", image = R.drawable.rocket_image, route = "rockets"),
    Category(title = "Comets & small bodies", image = R.drawable.comet_image, route = "comets"),
    Category(title = "Planets", image = R.drawable.earth_image, route = "planets"),
    Category(title = "Telescopes", image = R.drawable.telescope_image, route = "telescopes")
)
