package com.mirrox.spacemir.infoScreen

import com.mirrox.spacemir.R

data class InfoPlanets(
    val title: String = "",
    val coverImage: Int = 1,
    val infoImage: Int = 1, // Изображение на экране информации
    val characteristics: String = "",
    val description: String = ""
)

// Список планет
val planetsList = listOf(
    InfoPlanets(
        infoImage = R.drawable.mercury_image,
        title = "Mercury",
        coverImage = R.drawable.mercury_1,
        characteristics = "- Distance from Sun: ~57.9 million km.\n" +
                "- Size: Diameter of 4,880 km.\n" +
                "- Orbital Period: 88 Earth days.",
        description = "- The closest planet to the Sun, Mercury has a rocky surface and extreme temperature fluctuations due to its thin atmosphere. It’s the smallest planet and completes an orbit around the Sun in just 88 Earth days."
    ),
    InfoPlanets(
        infoImage = R.drawable.venera_image,
        title = "Venus",
        coverImage = R.drawable.venus_1,
        characteristics = "- Distance from Sun: ~108.2 million km.\n" +
                "- Size: Diameter of 12,104 km.\n" +
                "- Orbital Period: 225 Earth days.",
        description = "- Venus is known for its thick, toxic atmosphere, which traps heat and makes it the hottest planet in the solar system. It has a rocky surface and is similar in size to Earth."
    ),
    InfoPlanets(
        infoImage = R.drawable.earth_image,
        title = "Earth",
        coverImage = R.drawable.earth_1,
        characteristics = "- Distance from Sun: ~149.6 million km (1 Astronomical Unit).\n" +
                "- Size: Diameter of 12,742 km.\n" +
                "- Orbital Period: 365.25 Earth days.",
        description = " - Earth is the only planet known to support life, with a stable climate, abundant water, and an atmosphere rich in oxygen and nitrogen. It has a single moon and a diverse range of ecosystems."
    ),
    InfoPlanets(
        infoImage = R.drawable.mars_image,
        title = "Mars",
        coverImage = R.drawable.mars_1,
        characteristics = "- Distance from Sun: ~227.9 million km.\n" +
                "- Size: Diameter of 6,779 km.\n" +
                "- Orbital Period: 687 Earth days.",
        description = "- Known as the Red Planet due to its iron-rich surface, Mars has the largest volcano and canyon in the solar system. Scientists believe it may have once had liquid water, and it’s a primary target for future human exploration."
    ),
    InfoPlanets(
        infoImage = R.drawable.jupiter_image,
        title = "Jupiter",
        coverImage = R.drawable.jupiter_1,
        description = "- The largest planet in the solar system, Jupiter is a gas giant primarily composed of hydrogen and helium. Its iconic Great Red Spot is a massive storm, and it has more than 75 moons, including Europa, which may harbor an ocean beneath its icy crust.",
        characteristics = "- Distance from Sun: ~778.5 million km.\n" +
                "- Size: Diameter of 139,820 km.\n" +
                "- Orbital Period: 11.86 Earth years."
    ),
    InfoPlanets(
        infoImage =R.drawable.saturn_image ,
        title = "Saturn",
        coverImage = R.drawable.saturn_1,
        characteristics = "- Distance from Sun: ~1.4 billion km.\n" +
                "- Size: Diameter of 116,460 km.\n" +
                "- Orbital Period: 29.46 Earth years.",
        description = "- Saturn is famous for its stunning ring system, made of ice and rock particles. This gas giant is the second-largest planet, and it has numerous moons, including Titan, which has a dense atmosphere and liquid methane lakes."
    ),
    InfoPlanets(
        infoImage = R.drawable.uran_image,
        title = "Uranus",
        coverImage = R.drawable.uranus_1,
        characteristics = "- Distance from Sun: ~2.87 billion km.\n" +
                "- Size: Diameter of 50,724 km.\n" +
                "- Orbital Period: 84 Earth years.",
        description = "- Uranus is an ice giant with a bluish-green color due to methane in its atmosphere. It has a unique tilt, rotating on its side, and has faint rings and 27 known moons."
    ),
    InfoPlanets(
        infoImage = R.drawable.neptun_image,
        title = "Neptune",
        coverImage = R.drawable.neptune_1,
        characteristics = "- Distance from Sun: ~4.5 billion km.\n" +
                "- Size: Diameter of 49,244 km.\n" +
                "- Orbital Period: 164.8 Earth years.",
        description = "- Neptune, the farthest planet from the Sun, is another ice giant known for its intense winds and storms. It has a deep blue color and 14 known moons, with Triton being the largest."

    )
)
