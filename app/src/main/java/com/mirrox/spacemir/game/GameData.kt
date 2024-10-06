package com.mirrox.spacemir.game

import com.mirrox.spacemir.R

data class Game(val name: String, val imageRes: Int, val url: String)

val gameList = listOf(
    Game(name = "Rocket Game", imageRes = R.drawable.rocket_game1, url = "https://my.spline.design/rocket-48f6b07dbce0a632c83f5ea67d79c8b8/"),
    Game(name = "Solar System", imageRes = R.drawable.solar_sustem_2, url = "https://my.spline.design/space-d0656eec16e84f98993403c67c4d7732/"),
    Game(name = "Solar System v2", imageRes = R.drawable.solar_system_3, url = "https://my.spline.design/solarsystembasic-0a6620e4ceaf989e5c0ca6cad80b27ff/"),
    Game(name = "Rocket Game v2", imageRes = R.drawable.rocket_4, url = "https://my.spline.design/rocketmousecontrol-316082e7203ca3093c5752bab53368e4/"),
    Game(name = "Rocket Game v3", imageRes = R.drawable.rocket_5, url = "https://my.spline.design/3drocket-39e4eed0bf8fa97096fc9c8d2aafa014/"),
    Game(name = "Rocket Game v4", imageRes = R.drawable.rocket_6, url = "https://my.spline.design/rocketinspace-beead2cde4317ea098e8288967161dc8/"),
    Game(name = "Rocket Game v5", imageRes = R.drawable.rocket_7, url = "https://my.spline.design/launchartemisrocket-04ca56d426240efac8c18cfd511c4716/3"),
    Game(name = "Rocket Game v6", imageRes = R.drawable.rocket_8, url = "https://my.spline.design/toyrocket-6e81d7905dbd757e7c426be386c896e9/"),
    Game(name = "Machine Gun Game", imageRes = R.drawable.cars_9, url = "https://my.spline.design/catsmodelmachine-8232163f29a62a2bbffe542f26f0e11a/"),
    Game(name = "Ai World", imageRes = R.drawable.ai_game_10, url = "https://my.spline.design/aiworld-1a91669af53b922c567c1ad1b4e18b8f/"),
    Game(name = "Ball Game", imageRes = R.drawable.ball_game_11, url = "https://my.spline.design/ifinitefallminigame-203abe9237dd716760887cfba7f979cd/"),
    Game(name = "Saturn v1", imageRes = R.drawable.saturn_12, url = "https://my.spline.design/orbitalviewofarrakisfromtimqxyz-43199e33d21b4d8bc5642812c517ffa8/"),
    Game(name = "Micro Planet", imageRes = R.drawable.micro_planet_13, url = "https://my.spline.design/themicrogame-550b408b4b79d504c5ae540097a4fc84/"),
    Game(name = "Rocket Game v7", imageRes = R.drawable.rocket_14, url = "https://my.spline.design/particlesrocket-a1adfe3ea5955e9a23954f308f33c0c7/"),
    Game(name = "Rocket Game v8", imageRes = R.drawable.rocket_15, url = "https://my.spline.design/rocketship-ef7b4865c817f62002a03115f4d1d654/"),
)