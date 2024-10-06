package com.mirrox.spacemir.infoScreen

import com.mirrox.spacemir.R

data class InfoTelescopes(
    val name: String,
    val imageCover: Int,
    val imageInfo: Int,
    val description: String,
    val info: String,
    val characteristics: String
)

val telescopesList = listOf(
    InfoTelescopes(
        name = "James Webb Space Telescope (JWST)",
        imageCover = R.drawable.james__webb,
        imageInfo = R.drawable.james__webb,
        description = "(JWST) is the most powerful infrared telescope designed to replace the Hubble Telescope and explore deep space.",
        info = "The James Webb Space Telescope (JWST) is the most powerful infrared telescope designed to replace the Hubble Telescope and explore deep space. Its primary goal is to study the early stages of the development of the Universe, galaxies, stars, and exoplanets, including the potential search for signs of life on other planets.",
        characteristics = "   - Location: 1.5 million km from Earth (L2).\n" +
                "   - Size: 6.5-meter mirror.\n" +
                "   - Key Fact: Observes in infrared to study the early universe."
    ),
    InfoTelescopes(
        name = "Hubble Space Telescope",
        imageCover = R.drawable.hubble_space_telescope,
        imageInfo = R.drawable.hubble_space_telescope,
        description = "The Hubble Space Telescope is an optical telescope that provides high-quality images and spectra of celestial objects.",
        info = "The Hubble Space Telescope is an optical telescope that provides high-quality images and spectra of celestial objects. It has become a key tool for astronomers, allowing them to study galaxies, stars, planets, and other astronomical entities.",
        characteristics = "  - Location: Low Earth Orbit (569 km).\n" +
                "   - Size: 2.4-meter mirror.\n" +
                "   - Key Fact: Captured famous images like \"Pillars of Creation.\""
    ),

    InfoTelescopes(
        name = "Very Large Telescope",
        imageCover = R.drawable.very_large_telescope,
        imageInfo = R.drawable.very_large_telescope,
        description = "Very Large Telescope (VLT) - Located in Chile, VLT’s four 8.2-meter telescopes can work together for detailed imaging.",
        info = "Very Large Telescope (VLT) - Located in Chile, VLT’s four 8.2-meter telescopes can work together for detailed imaging. It has made key discoveries, such as directly imaging exoplanets and studying the Milky Way's black hole.",
        characteristics = "  - Location: Chile.\n" +
                "   - Size: Four 8.2-meter mirrors.\n" +
                "   - Key Fact: Helped image an exoplanet and study the Milky Way’s black hole."
    ),
    InfoTelescopes(
        name = "Arecibo Observatory (Decommissioned)",
        imageCover = R.drawable.arecibo_observatory,
        imageInfo = R.drawable.arecibo_observatory,
        description = "Arecibo Observatory (Decommissioned) - Arecibo's 305-meter radio dish was instrumental in discovering the first binary pulsar and studying gravitational waves.",
        info = "Arecibo Observatory (Decommissioned) - Arecibo's 305-meter radio dish was instrumental in discovering the first binary pulsar and studying gravitational waves. It collapsed in 2020 after 57 years of operation.",
        characteristics = "   - Location: Puerto Rico.\n" +
                "   - Size: 305-meter dish.\n" +
                "   - Key Fact: Discovered the first binary pulsar."
    ),
    InfoTelescopes(
        name = "Atacama Large Millimeter Array (ALMA)",
        imageCover = R.drawable.atacama_large_millimeter,
        imageInfo = R.drawable.atacama_large_millimeter,
        description = "Atacama Large Millimeter Array (ALMA) - ALMA’s 66 antennas in Chile study cold objects like planet-forming disks.",
        info = "Atacama Large Millimeter Array (ALMA) - ALMA’s 66 antennas in Chile study cold objects like planet-forming disks. It provides high-resolution images of the universe in millimeter wavelengths.\n",
        characteristics = "   - Location: Chile.\n" +
                "   - Size: 66 antennas (7m/12m).\n" +
                "   - Key Fact: First detailed images of protoplanetary disks."
    ),
    InfoTelescopes(
        name = "Keck Observatory",
        imageCover = R.drawable.keck_observatory,
        imageInfo = R.drawable.keck_observatory,
        description = "Keck Observatory - Keck’s twin 10-meter telescopes in Hawaii are key in studying exoplanets, distant galaxies, and black holes.",
        info = "Keck Observatory - Keck’s twin 10-meter telescopes in Hawaii are key in studying exoplanets, distant galaxies, and black holes. They are among the world’s most powerful optical telescopes.",
        characteristics = "   - Location: Hawaii.\n" +
                "   - Size: Two 10-meter mirrors.\n" +
                "   - Key Fact: Discovered many exoplanets and studies distant galaxies."
    ),
    InfoTelescopes(
        name = "Green Bank Telescope",
        imageCover = R.drawable.green_bank_telescope,
        imageInfo = R.drawable.green_bank_telescope,
        description = "Green Bank Telescope (GBT) - The GBT in West Virginia is the largest fully steerable radio telescope.",
        info = "Green Bank Telescope (GBT) - The GBT in West Virginia is the largest fully steerable radio telescope. It studies pulsars, molecular clouds, and plays a role in the search for extraterrestrial life.",
        characteristics = "   - Location: West Virginia, USA.\n" +
                "   - Size: 100-meter dish.\n" +
                "   - Key Fact: Largest fully steerable radio telescope."
    ),
    InfoTelescopes(
        name = "Gran Telescopio Canarias",
        imageCover = R.drawable.gran_telescopio_canarias,
        imageInfo = R.drawable.gran_telescopio_canarias,
        description = "Gran Telescopio Canarias (GTC) - The GTC, with a 10.4-meter mirror, is the largest optical telescope.",
        info = " Gran Telescopio Canarias (GTC) - The GTC, with a 10.4-meter mirror, is the largest optical telescope. Located in the Canary Islands, it observes distant galaxies, stars, and exoplanets.",
        characteristics = "   - Location: Canary Islands, Spain.\n" +
                "   - Size: 10.4-meter mirror.\n" +
                "   - Key Fact: Largest optical telescope in the world.2"
    ),
    InfoTelescopes(
        name = "Spitzer Space Telescope",
        imageCover = R.drawable.spitzer_space_telescope,
        imageInfo = R.drawable.spitzer_space_telescope,
        description = "Spitzer Space Telescope (Retired) - Spitzer’s 0.85-meter mirror observed in infrared from 2003 to 2020.",
        info = "Spitzer Space Telescope (Retired) - Spitzer’s 0.85-meter mirror observed in infrared from 2003 to 2020. It studied exoplanets, star formation, and distant galaxies, revealing parts of the universe invisible to optical telescopes.",
        characteristics = "   - Location: South Africa & Australia.\n" +
                "   - Size: 1 square kilometer array.\n" +
                "   - Key Fact: Will map the universe in extreme detail."
    ),
)

