package com.mirrox.spacemir.infoScreen

import com.mirrox.spacemir.R

data class Astronaut(
    val name: String,
    val imageCover: Int,
    val imageInfo: Int,
    val description: String,
    val infoAstronaut: String,
    val characteristics: String
)

val astronautList = listOf(
    Astronaut(
        name = "Yuri Gagarin",
        imageCover = R.drawable.yuri_gagarin_image,
        imageInfo = R.drawable.yuri_gagarin,
        description = "First human in space.",
        infoAstronaut = "Soviet cosmonaut and the first human to journey into outer space on April 12, 1961, aboard *Vostok 1*. His groundbreaking mission proved that humans could survive and work in the harsh environment of space, inspiring generations to dream of the stars.",
        characteristics = "   - Flight: *Vostok 1*  \n" +
                "   - Date: April 12, 1961  \n" +
                "   - Age: 27 years  \n" +
                "   - Achievement: First human in space; completed one orbit around Earth in 108 minutes."
    ),
    Astronaut(
        name = "Neil Armstrong",
        imageCover =R.drawable.neil_armstrong_image,
        imageInfo =R.drawable.neil_armstrong,
        description ="Neil Armstrong – the first person to set foot on the Moon on July 20",
        infoAstronaut = "Neil Armstrong – the first person to set foot on the Moon on July 20, 1969, during the *Apollo 11* mission. As he took that historic step, his words, \"That's one small step for man, one giant leap for mankind,\" echoed across the globe, uniting humanity in a shared moment of awe.",
        characteristics = "   - Flight: *Vostok 1*  \n" +
                "   - Date: April 12, 1961  \n" +
                "   - Age: 27 years  \n" +
                "   - Achievement: First human in space; completed one orbit around Earth in 108 minutes."
    ),
    Astronaut(
        name = "Buzz Aldrin",
        imageCover =R.drawable.buzz_aldrin,
        imageInfo =R.drawable.buzz_aldrin,
        description = "Buzz Aldrin – following Armstrong on the lunar surface during *Apollo 11*",
        infoAstronaut = "Buzz Aldrin – following Armstrong on the lunar surface during *Apollo 11*, Aldrin became the second human to walk on the Moon. His role in testing the technology and methods that would pave the way for future exploration was crucial to the success of the mission.",
        characteristics = "  - Flight: *Gemini 12* (1966) & *Apollo 11*  \n" +
                "   - Date: July 16-24, 1969  \n" +
                "   - Age: 39 years (during *Apollo 11*)  \n" +
                "   - Achievement: Second person to walk on the Moon after Armstrong."
    ),
    Astronaut(
        name = "John Glenn",
        imageCover =R.drawable.jonh_glenn_image,
        imageInfo =R.drawable.jonh_glehn,
        description = "the first American to orbit Earth in 1962 on *Friendship 7*",
        infoAstronaut = "John Glenn – the first American to orbit Earth in 1962 on *Friendship 7*. His daring journey during the Cold War marked a major victory for American space efforts, and later, at the age of 77, he returned to space, proving that exploration knows no age limits.",
        characteristics = "   - Flight: *Friendship 7* (Mercury-Atlas 6)  \n" +
                "   - Date: February 20, 1962  \n" +
                "   - Age: 40 years  \n" +
                "   - Achievement: First American to orbit Earth; completed 3 orbits in about 5 hours.  \n" +
                "   - Second Flight: *Space Shuttle Discovery (STS-95)*  \n" +
                "   - Date: October 29 - November 7, 1998  \n" +
                "   - Age: 77 years  \n" +
                "   - Achievement: Oldest person in space."
    ),
    Astronaut(
        name = "Michael Collins",
        imageCover =R.drawable.michael_collins_image,
        imageInfo =R.drawable.michael_collins,
        description = "often referred to as the forgotten astronaut of *Apollo 11*",
        infoAstronaut = "Michael Collins – often referred to as the \"forgotten astronaut\" of *Apollo 11*, Collins orbited the Moon alone while Armstrong and Aldrin made history on the lunar surface. His vital task of piloting the command module ensured their safe return, making him an unsung hero of the mission.",
        characteristics = "   - Flight: *Gemini 10* (1966) & *Apollo 11*  \n" +
                "   - Date: July 16-24, 1969  \n" +
                "   - Age: 38 years (during *Apollo 11*)  \n" +
                "   - Achievement: Piloted the command module *Columbia* in lunar orbit during the Moon landing."
    ),
    Astronaut(
        name = "Sally Ride",
        imageCover =R.drawable.salli_rayd_image,
        imageInfo =R.drawable.saily_ride,
        description = "the first American woman in space",
        infoAstronaut = "Sally Ride – the first American woman in space, Ride soared into the heavens aboard *Space Shuttle Challenger* in 1983. She broke barriers for women in science and exploration, becoming a role model for future generations of female scientists and astronauts.",
        characteristics = "   - Flight: *STS-7 (Space Shuttle Challenger)*  \n" +
                "   - Date: June 18-24, 1983  \n" +
                "   - Age: 32 years  \n" +
                "   - Achievement: First American woman in space.  \n" +
                "   - Second Flight: *STS-41-G*  \n" +
                "   - Date: October 5-13, 1984  \n" +
                "   - Age: 33 years."
    ),
    Astronaut(
        name = "Alan Shepard",
        imageCover =R.drawable.alan_shepard_image,
        imageInfo =R.drawable.alan_shepard,
        description = "the first American in space (1961) aboard *Freedom 7*",
        infoAstronaut = "Alan Shepard – the first American in space (1961) aboard *Freedom 7* and later the fifth person to walk on the Moon during *Apollo 14*. He famously hit two golf balls on the lunar surface, bringing a touch of humanity and humor to the vast, desolate Moon.",
        characteristics = "   - Flight: *Freedom 7 (Mercury-Redstone 3)*  \n" +
                "   - Date: May 5, 1961  \n" +
                "   - Age: 37 years  \n" +
                "   - Achievement: First American in space; suborbital flight.  \n" +
                "   - Second Flight: *Apollo 14*  \n" +
                "   - Date: January 31 - February 9, 1971  \n" +
                "   - Age: 47 years  \n" +
                "   - Achievement: Fifth person to walk on the Moon; hit golf balls on the lunar surface."
    ),
    Astronaut(
        name = "Eugene Cernan",
        imageCover =R.drawable.eugene_cerman,
        imageInfo =R.drawable.eugene_cerman,
        description = "the commander of *Apollo 17* and the last person to walk on the Moon in December 1972",
        infoAstronaut = "Eugene Cernan – the commander of *Apollo 17* and the last person to walk on the Moon in December 1972. His poignant words as he left the lunar surface—\"We leave as we came, and, God willing, we shall return\"—serve as a lasting reminder of humanity's desire to explore and return to the Moon.",
        characteristics = "   - Flight: *Gemini 9A* (1966), *Apollo 10* (1969), *Apollo 17*  \n" +
                "   - Date: December 7-19, 1972  \n" +
                "   - Age: 38 years  \n" +
                "   - Achievement: Last person to walk on the Moon during the final *Apollo* mission."
    ),
    Astronaut(
        name = "Edward White",
        imageCover =R.drawable.edward_white_image,
        imageInfo =R.drawable.edward_white,
        description = "in 1965, White became the first American to perform a spacewalk during the *Gemini 4* mission.",
        infoAstronaut = "Edward White – in 1965, White became the first American to perform a spacewalk during the *Gemini 4* mission. Floating in the vacuum of space, tethered only by a thin line, White experienced freedom unlike any other, giving the world its first glimpse of a human untethered by Earth's gravity.",
        characteristics = "   - Flight: *Gemini 4*  \n" +
                "   - Date: June 3-7, 1965  \n" +
                "   - Age: 34 years  \n" +
                "   - Achievement: First American to perform a spacewalk (23 minutes).  \n" +
                "   - Second Flight: Scheduled for *Apollo 1*, but died in a tragic cabin fire during a pre-launch test on January 27, 1967, at age 36."
    ),


    )