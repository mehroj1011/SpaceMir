package com.mirrox.spacemir.infoScreen

import com.mirrox.spacemir.R

data class InfoRockets(
    val name: String,
    val imageCover: Int,
    val imageInfo: Int,
    val description: String,
    val info: String,
    val characteristics: String
)

val infoRocketsList = listOf(
    InfoRockets(
        name = "Saturn V",
        imageCover =R.drawable.saturnv_rocket,
        imageInfo =R.drawable.saturnv_rocket,
        description = "Saturn V is the most powerful rocket ever built, designed to send humans to the Moon as part of the Apollo program.",
        info = "Saturn V is the most powerful rocket ever built, designed to send humans to the Moon as part of the Apollo program. This three-stage rocket was developed by the American space agency NASA under the leadership of engineer Wernher von Braun and his team. It became not only a symbol of success in the space race but also one of the greatest technological achievements of the 20th century.",
        characteristics = "   -Main Characteristics of the Saturn V Rocket:\n" +
                "   -Length: 111 meters (363 feet) — taller than the Statue of Liberty.\n" +
                "   -Diameter: 10 meters (33 feet).\n" +
                "   -Maximum Launch Mass: 2.8 million kilograms (6.2 million pounds).\n" +
                "   -Propulsion System: The first stage is powered by five F-1 engines, which are the most powerful single-chamber liquid-fueled rocket engines ever built.\n" +
                "   -First Stage Thrust: About 34 MN (meganewtons), 15 times more powerful than the most advanced jet engines.\n" +
                "   -Payload Capacity: 140 tons to low Earth orbit (LEO), 48.6 tons to lunar trajectory.\n" +
                "   -Launches: 13 launches from 1967 to 1973, including the Apollo program missions."
    ),

    InfoRockets(
        name = "Space Shuttle",
        imageCover = R.drawable.space_shuttule,
        imageInfo =R.drawable.space_shuttule,
        description = "The Space Shuttle program was initiated to develop a cost-effective and reusable spacecraft for transporting",
        info = "The Space Shuttle program was initiated to develop a cost-effective and reusable spacecraft for transporting cargo and astronauts to and from space. Its first flight, STS-1, occurred in 1981, and the system became essential for launching scientific missions, deploying satellites, servicing the Hubble Space Telescope, and assembling the ISS. The Shuttle consisted of three primary components: the Orbiter, where the crew and payload were housed; the External Fuel Tank, which supplied fuel to the engines; and the Solid Rocket Boosters, providing the initial thrust during launch.",
        characteristics = "   -Main Characteristics of the Space Shuttle:\n" +
                "   -Length: 56 meters (including the rocket boosters).\n" +
                "   -Diameter: 8.4 meters (external fuel tank).\n" +
                "   -Launch System: 2 Solid Rocket Boosters (SRBs) and 3 RS-25 liquid engines.\n" +
                "   -Maximum Launch Mass: 2.03 million kilograms (4.5 million pounds).\n" +
                "   -Payload Capacity: 24.4 tons to low Earth orbit (LEO).\n" +
                "   -Launches: 135 launches from 1981 to 2011, including missions for ISS construction and satellite deployment."
    ),

    InfoRockets(
        name = "Delta II",
        imageCover = R.drawable.delta2_rocket,
        imageInfo = R.drawable.delta2_rocket,
        description = "Delta II is a highly reliable launch vehicle that has been instrumental in deploying a wide range of satellites",
        info = "Delta II is a highly reliable launch vehicle that has been instrumental in deploying a wide range of satellites and spacecraft, including Mars rovers and various scientific missions. Developed by NASA and built by United Launch Alliance (ULA), Delta II is known for its versatility and long service life, becoming a workhorse for numerous satellite launches.",
        characteristics = "   -Main Characteristics of the Delta II Rocket:\n" +
                "   -Length: 38 meters (124 feet).\n" +
                "   -Diameter: 2.4 meters (7.9 feet).\n" +
                "   -Launch System: One or more RS-27 rocket engines, with additional solid rocket boosters for enhanced thrust.\n" +
                "   -Maximum Launch Mass: 300,000 kilograms (660,000 pounds).\n" +
                "   -Payload Capacity: 1.25 tons (1,134 kilograms) to geostationary orbit (GTO).\n" +
                "   -Launches: 155 launches from 1989 to 2018, making it one of the most frequently flown rockets in history."
    ),

    InfoRockets(
        name = "Atlas V",
        imageCover =R.drawable.atlasv_rocket,
        imageInfo = R.drawable.atlasv_rocket,
        description = "Atlas V is a modern and versatile launch vehicle used for a wide range of missions",
        info = "Atlas V is a modern and versatile launch vehicle used for a wide range of missions, including deploying satellites, supporting interplanetary missions, and resupplying the International Space Station (ISS). Developed by United Launch Alliance (ULA), Atlas V combines advanced technology with a proven design, making it one of the most reliable rockets in use today.",
        characteristics = "   -Main Characteristics of the Delta II Rocket:\n" +
                "   -Length: 38 meters (124 feet).\n" +
                "   -Diameter: 2.4 meters (7.9 feet).\n" +
                "   -Launch System: One or more RS-27 rocket engines, with additional solid rocket boosters for enhanced thrust.\n" +
                "   -Maximum Launch Mass: 300,000 kilograms (660,000 pounds).\n" +
                "   -Payload Capacity: 1.25 tons (1,134 kilograms) to geostationary orbit (GTO).\n" +
                "   -Launches: 155 launches from 1989 to 2018, making it one of the most frequently flown rockets in history."
    ),

    InfoRockets(
        name = "Space Launch System (SLS)",
        imageCover =R.drawable.sls_rockets,
        imageInfo = R.drawable.sls_rockets,
        description = "SLS (Space Launch System) is a powerful rocket being developed by NASA",
        info = "SLS (Space Launch System) is a powerful rocket being developed by NASA for deep space exploration, specifically targeting missions to the Moon and Mars as part of the Artemis program. Designed to carry astronauts and cargo beyond low Earth orbit (LEO), SLS aims to pave the way for future human exploration of the solar system.",
        characteristics = "   -Main Characteristics of the SLS Rocket:\n" +
                "   -Length: 98 meters (322 feet), depending on the configuration.\n" +
                "   -Diameter: 8.4 meters (27.6 feet).\n" +
                "   -Launch System: Four RS-25 rocket engines in the core stage, augmented by two solid rocket boosters for additional thrust during launch.\n" +
                "   -Maximum Launch Mass: 2.8 million kilograms (6.2 million pounds) in the Block 1 configuration.\n" +
                "   -Payload Capacity: Up to 95 tons (86,200 kilograms) to low Earth orbit (LEO).\n" +
                "   -Launches: The first launch is scheduled for 2024."
    ),

    InfoRockets(
        name = "Falcon 9",
        imageCover = R.drawable.falcon9_rockets,
        imageInfo = R.drawable.falcon9_rockets,
        description = "Falcon 9 is a partially reusable rocket developed by SpaceX, a private aerospace manufacturer",
        info = "Falcon 9 is a partially reusable rocket developed by SpaceX, a private aerospace manufacturer and space transportation company founded by Elon Musk. Although Falcon 9 is not a NASA rocket, it has been extensively used in collaboration with NASA for various missions, including delivering cargo to the International Space Station (ISS) and launching satellites.",
        characteristics = "   -Main Characteristics of the Falcon 9 Rocket:\n" +
                "   -Length: 70 meters (229.6 feet).\n" +
                "   -Diameter: 3.7 meters (12.1 feet).\n" +
                "   -Launch System: Nine Merlin rocket engines in the first stage and one Merlin vacuum engine in the second stage.\n" +
                "   -Maximum Launch Mass: 549,000 kilograms (1.2 million pounds).\n" +
                "   -Payload Capacity: Up to 22.8 tons (20,720 kilograms) to low Earth orbit (LEO) and up to 8.3 tons (7,600 kilograms) to geostationary orbit (GTO).\n" +
                "   -Launches: Over 200 launches since its inaugural flight in 2010."
    ),

    InfoRockets(
        name = "Titan IV",
        imageCover = R.drawable.titan4_rockets,
        imageInfo = R.drawable.titan4_rockets,
        description = "Titan IV is a heavy-lift launch vehicle that was used primarily during the 1990s and early 2000s",
        info = "Titan IV is a heavy-lift launch vehicle that was used primarily during the 1990s and early 2000s for launching satellites and spacecraft. Developed by Lockheed Martin for the United States Air Force, the Titan IV was designed to meet the demanding requirements for national security and intelligence missions.",
        characteristics = "   -Main Characteristics of the Titan IV Rocket:\n" +
                "   -Length: 47 meters (154 feet).\n" +
                "   -Diameter: 4 meters (13.1 feet).\n" +
                "   -Launch System: Two RS-68 rocket engines on the first stage, with one additional RS-68 engine on the second stage.\n" +
                "   -Maximum Launch Mass: 600,000 kilograms (1.3 million pounds).\n" +
                "   -Payload Capacity: Up to 26.5 tons (24,000 kilograms) to low Earth orbit (LEO).\n" +
                "   -Launches: 14 launches from 1989 to 2005."
    ),
)