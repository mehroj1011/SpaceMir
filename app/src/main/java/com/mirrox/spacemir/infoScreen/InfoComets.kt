package com.mirrox.spacemir.infoScreen

import com.mirrox.spacemir.R

data class InfoComets(
    val name: String,
    val imageCover: Int,
    val imageInfo: Int,
    val description: String,
    val info: String,
    val characteristics: String
)

// Список планет
val cometsList = listOf(
    InfoComets(
        name = "Halley's Comet",
        imageInfo = R.drawable.halley_comet_image ,
        imageCover = R.drawable.halley_comet_image ,
        description = "Halley's Comet (1P/Halley) is one of the most famous comets, known for its periodic appearances in the inner solar system.",
        info = "Halley's Comet (1P/Halley) is one of the most famous comets, known for its periodic appearances in the inner solar system. Named after the astronomer Edmond Halley, who calculated its orbit and predicted its return, Halley's Comet has been observed for over 2,000 years, with historical records dating back to ancient civilizations.",
        characteristics = "   -Orbital Period: Approximately 76 years.\n" +
                "   -Nucleus Size: About 15 km (9.3 miles) long and 8 km (5 miles) wide, composed of ice, dust, and rocky materials.\n" +
                "   -Tail Formation: As it approaches the Sun, the nucleus sublimates, forming a bright coma and two distinct tails: a dust tail and an ion tail.\n" +
                "   -Significant Appearances and Missions\n" +
                "   -Halley's Comet has made notable appearances throughout history, such as in 1066 and 1301. Its last visit was in 1986, during which several spacecraft were sent to study it:"
    ),
    InfoComets(
        name = "Comet NEAT",
        imageInfo = R.drawable.neat_image,
        imageCover = R.drawable.neat_image,
        description = "Comet NEAT (C/2001 Q4) is a periodic comet that was discovered in 2001 by the Near Earth.",
        info = "Comet NEAT (C/2001 Q4) is a periodic comet that was discovered in 2001 by the Near Earth Asteroid Tracking (NEAT) program, which is operated by NASA. This program primarily focuses on tracking near-Earth objects, but it also discovered several comets during its operations.",
        characteristics = "   -Discovery Date: NEAT was discovered on August 24, 2001, by astronomers using the Maui Space Surveillance System telescope in Hawaii.\n" +
                "   -Orbital Period: NEAT has an orbital period of approximately 6.5 years, classifying it as a short-period comet.\n" +
                "   -Nucleus Size: The nucleus of Comet NEAT is estimated to be about 5 kilometers (3.1 miles) in diameter, composed of ice, dust, and other volatile materials.\n" +
                "   -Appearance and Visibility"
    ),
    InfoComets(
        name = "Comet Lovejoy",
        imageInfo = R.drawable.lovejoy_image,
        imageCover =R.drawable.lovejoy_image,
        description = "Comet Lovejoy (C/2011 W3) is a notable comet that gained widespread recognition for its brightness.",
        info = "Comet Lovejoy (C/2011 W3) is a notable comet that gained widespread recognition for its brightness and beautiful appearance during its visibility in late 2011 and early 2012. Discovered by an amateur astronomer, it provided valuable insights into cometary behavior",
        characteristics = "Discovery: Comet Lovejoy was discovered by Terry Lovejoy, an amateur astronomer, on November 27, 2011. He used a small telescope to identify the comet in the constellation Centaurus.\n" +
                "   -Orbital Period: Lovejoy is classified as a long-period comet with an estimated orbital period of about 11,000 years. This means it takes an extremely long time to complete one orbit around the Sun.\n" +
                "   -Nucleus Size: The nucleus of Comet Lovejoy is estimated to be about 5 kilometers (3.1 miles) in diameter.\n" +
                "   -Visibility\n" +
                "   -Peak Brightness: Comet Lovejoy became particularly visible to the naked eye in December 2011 and reached peak brightness in early January 2012. It was observed to be around magnitude 4, making it easily visible in dark skies.\n" +
                "   -Appearance: The comet exhibited a bright green coma, which is characteristic of comets containing diatomic carbon (C₂), and it had a long tail that extended across the night sky. Its impressive appearance was well-documented by amateur and professional astronomers alike.\n" +
                "   -Observations and Public Interest\n" +
                "   -Astronomical Events: Comet Lovejoy was widely observed during its passage, leading to a surge of interest in astronomy and comet observation. Many skywatchers captured stunning photographs and shared their experiences on social media.\n" +
                "   -Scientific Studies: The comet's approach provided an opportunity for astronomers to study its physical properties, composition, and activity. Observations revealed significant outgassing and activity as it neared the Sun, providing insights into how comets behave as they approach solar radiation.\n" +
                "   -Reappearance: After its close approach to the Sun, Comet Lovejoy was expected to return as a periodic comet in the future. The next return is predicted around 2024, but its brightness may vary based on its activity and proximity to Earth.\n"
    ),
    InfoComets(
        name = "Comet 67P",
        imageInfo =R.drawable.comet67p,
        imageCover =R.drawable.comet67p,
        description = "Comet 67P/Churyumov-Gerasimenko is a significant periodic comet that gained prominence due to its explorationю.",
        info = "Comet 67P/Churyumov-Gerasimenko is a significant periodic comet that gained prominence due to its exploration by the European Space Agency's Rosetta mission. Its unique shape and behavior have provided valuable insights into cometary science.",
        characteristics = "   -Discovery: Comet 67P was discovered in 1969 by Klim Churyumov and Svetlana Gerasimenko while they were examining photographic plates taken at the Kyiv University in Ukraine.\n" +
                "   -Orbital Period: It has a relatively short orbital period of about 6.5 years, classifying it as a short-period comet. This allows for predictable returns, making it easier for scientists to plan observations.\n" +
                "   -Nucleus Size: The nucleus of 67P is approximately 4.1 kilometers (2.5 miles) long and 2.7 kilometers (1.7 miles) wide, giving it a distinctive \"duck\" or \"rubber duck\" shape. Its irregular form is unlike many other comets, leading to interest in its geological features.\n" +
                "   -Rosetta Mission\n" +
                "   -Launch and Arrival: The European Space Agency (ESA) launched the Rosetta spacecraft in 2004, with the goal of studying 67P. It arrived at the comet in August 2014 after a decade-long journey."
    ),
    InfoComets(
        name = "Apophis Comet",
        imageInfo = R.drawable.apophis_image,
        imageCover =R.drawable.apophis_image,
        description = "",
        info = "Apophis (officially known as 99942 Apophis) is a near-Earth asteroid that has garnered significant attention due to its size and its initially predicted potential for an impact with Earth. Here’s a comprehensive overview:",
        characteristics = "   -Discovery: Apophis was discovered on June 19, 2004, by astronomers Roy A. Tucker, David J. Tholen, and F. Polansky at the Kitt Peak National Observatory in Arizona.\n" +
                "   -Size: Apophis is approximately 370 meters (1,210 feet) in diameter, making it one of the larger near-Earth objects (NEOs) that has been identified.\n" +
                "   -Shape and Composition: The asteroid has an irregular shape and is believed to be composed mainly of nickel-iron and silicate rock, typical of many asteroids in its class.\n" +
                "   -Orbit: Apophis follows an orbit that brings it close to Earth. It completes an orbit around the Sun approximately every 323 days.\n" +
                "   -Initial Predictions: When first discovered, calculations suggested a potential impact with Earth in 2029. This raised concerns and led to extensive observations to refine its orbit and assess the risk. Early estimates indicated a 1 in 37 chance of a collision during its 2029 flyby."
    ),
    InfoComets(
        name = "Icarus Comet",
        imageInfo =R.drawable.icarus_image,
        imageCover =R.drawable.icarus_image,
        description = "Icarus (officially known as 1566 Icarus) is a well-known asteroid classified as a near-Earth object.",
        info = "Icarus (officially known as 1566 Icarus) is a well-known asteroid classified as a near-Earth object (NEO) and is particularly significant due to its close approaches to Earth and its relatively well-studied orbit. Here’s a detailed overview:",
        characteristics = "   -Discovery: Icarus was discovered on June 23, 1949, by the American astronomer Walter Baade at the Palomar Observatory in California.\n" +
                "   -Size: Icarus has an estimated diameter of approximately 1.1 kilometers (0.68 miles), making it a medium-sized asteroid within the asteroid belt.\n" +
                "   -Composition: It is classified as a S-type asteroid, which means it is primarily composed of silicate rock and metallic nickel-iron.\n" +
                "   -Orbit: Icarus has a highly elliptical orbit, which brings it closer to the Sun than most asteroids. It completes one orbit around the Sun approximately every 1.12 years.\n"
    ),
    InfoComets(
        name = "Haumea Comet",
        imageInfo = R.drawable.haumea_image,
        imageCover =R.drawable.haumea_image,
        description = "Haumea is a unique dwarf planet located in the Kuiper Belt.",
        info = "Haumea is a unique dwarf planet located in the Kuiper Belt, notable for its unusual shape, rapid rotation, and the presence of a ring system. Below is a detailed overview of Haumea:",
        characteristics = "   -Discovery: Haumea was discovered in 2004 by a team of astronomers led by Mike Brown at the Palomar Observatory in California. The discovery was officially recognized by the International Astronomical Union (IAU) in 2008.\n" +
                "   -Name Origin: It is named after Haumea, the Hawaiian goddess of fertility and childbirth, reflecting the culture of the Hawaiian people.\n" +
                "   -Size: Haumea has an average diameter of about 1,632 kilometers (1,016 miles), making it the fourth-largest known dwarf planet in the solar system.\n" +
                "   -Shape: Haumea has an elongated, oval shape due to its rapid rotation, which causes it to bulge at the equator. Its rotation period is approximately 3.9 hours, making it one of the fastest-spinning large objects in the solar system.\n"
    ),
    InfoComets(
        name = "Eris Comet",
        imageInfo = R.drawable.eris_image,
        imageCover =R.drawable.eris_image,
        description = "Eris is a notable dwarf planet located in the scattered disc region of the Kuiper Belt.",
        info = "Eris is a notable dwarf planet located in the scattered disc region of the Kuiper Belt. It is known for its size, distance from the Sun, and significant role in the discussion of planetary classification. Here’s a comprehensive overview of Eris:",
        characteristics = "   -Discovery: Eris was discovered on January 5, 2005, by a team of astronomers led by Mike Brown at the Palomar Observatory in California.\n" +
                "   -Naming: The name \"Eris\" was chosen due to its association with the Greek goddess of strife and discord, symbolizing the controversy surrounding its classification and the debate over what constitutes a planet.\n" +
                "   -Size: Eris has an estimated diameter of about 2,326 kilometers (1,445 miles), making it one of the largest known dwarf planets in the solar system. It is slightly smaller than Pluto but still significant in size compared to other objects in the Kuiper Belt.\n" +
                "   -Shape and Composition: Eris is thought to be composed mainly of ice and rock, similar to other Kuiper Belt objects. Its surface is characterized by a relatively high albedo (reflectivity), suggesting that it is covered in bright ice."
    ),
)