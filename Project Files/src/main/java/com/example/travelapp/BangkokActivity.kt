package com.example.travelapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelapp.ui.theme.TravelAppTheme

class BangkokActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    Column(
        modifier = Modifier.background(color = Color.White)
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            fontSize = 40.sp,
            color = Color(android.graphics.Color.rgb(120, 40, 251)),
            fontFamily = FontFamily.Cursive,
            text = stringResource(id = R.string.place_2),
        )
        Image(
            painterResource(id = R.drawable.bangkok), contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(200.dp)
                .scale(scaleX = 1.2F, scaleY = 1F)
        )
        Text(
            color=Color.Black,
            text = "Day 1\n" +

                    "Morning: Sea Life Bangkok Ocean World\n" +
                    "Sea Life Bangkok Ocean World is located on the second basement of the Siam Paragon Mall in Bangkok. As the premier metropolitan aquarium in Southeast Asia, it has 7 themed exhibition areas, including the amazing world exhibition area, the deep sea reef area, the marine life exhibition area, the tropical rain forest area, the rocky coast area and the fantasy sea area.\n" +
                    "Afternoon: Mahanakhon Sky Walk\n" +
                    "On top of Thailand's tallest building, King Power Mahanakhon, the SkyWalk promises unrivaled, sweeping views of the country's capital.\n" +
                    "Evening: The Knight House Bangkok\n" +
                    "If you want to explore other popular attractions later, The Knight House Bangkok is a suitable place for you to stay and refresh.\n" +

                    "\n" +
                    "Day 2: \n" +

                    "Morning: Wat Arun\n" +
                    "Wat Arun is a prominent Buddhist temple located along the banks of the Chao Phraya River in Bangkok Yai District\n" +
                    "Afternoon: Madame Tussauds Bangkok\n" +
                    "Madame Tussauds Wax Museum Bangkok is the first wax museum in Southeast Asia, located on the 6th floor of the Siam Discovery shopping mall.\n" +
                    "Evening: 137 Pillars Suites Bangkok\n" +
                    "The 5 star 137 Pillars Suites Bangkok is conveniently located in the central business district of Sukhumvit Soi 39, merely 15-minute walk from the Phrom Phong station.\n" +

                    "\n" +
                    "Day 3: \n" +

                    "Morning: Wat Phra Chetuphon (Wat Pho)\n" +
                    "Wat Pho, or the Temple of the Reclining Buddha, is a particularly ancient temple in Bangkok. The temple is located next to the south side of the Grand Palace.\n" +
                    "Afternoon: Safari World\n" +
                    "Safari World is located 9 km southeast of Bangkok on Ramintra Road. Safari World consist of Safari Park and Marine Park.\n" +
                    "Evening: Island Resort\n" +
                    "After visiting the glorious Safari World, Island Resort nearby is the best place to stay.\n" +

                    "\n" +
                    "Day 4: \n" +

                    "Morning: Siam Park City\n" +
                    "Siam Park is located on the eastern edge of Bangkok and is a great destination for family and children. This park has plenty of water rides.\n" +
                    "Afternoon: Golden Dome Cabaret Show\n" +
                    "Golden Dome Cabaret is a famous show in Bangkok, with performances of eastern folk songs and dances. The majority of audience members are from Asian countries.\n" +
                    "Evening: Centara Grand at Central Plaza Ladprao Bangkok\n" +
                    "Next to the Central Plaza Shopping Mall & Bangkok Convention Center, the award-winning Centara Grand at Central Plaza Ladprao Bangkok features 9 dining options, spa and a 200-meter (220-yard) pool.\n" +

                    "\n" +
                    "Day 5: \n" +

                    "Morning: Baiyoke Tower II\n" +
                    "The Rainbow Sky Baiyoke Sky Tower is one of the landmark buildings in Bangkok, especially the 84-storey observation deck is very popular.\n" +
                    "Afternoon: Asiatique Sky\n" +
                    "Asiatique Sky is Thailand's first large Ferris wheel. The wheel has been in operation since the end of 2012 and is located in the Asiatique promenade.\n" +
                    "Evening: Four Seasons Hotel Bangkok at Chao Phraya River (SHA Plus+)\n" +

                    "\n" +
                    "Day 6: \n" +

                    "Morning: Calypso Cabaret\n" +
                    "Calypso is a cabaret show that began in 1988, mainly performing Broadway showtunes, but has evolved into a contemporary spectacular.\n" +
                    "Afternoon: National Museum\n" +
                    "The forerunner to Bangkok National Museum was founded in 1874. The museum was formerly located in the Grand Palace and then moved to Thammasat University next to Sanam Luang.\n" +
                    "Evening: Siam Kempinski Hotel Bangkok\n" +
                    "Siam Kempinski Hotel Bangkok is located in the downtown area of the city with direct access to Siam Paragon, a popular shopping center.\n" +

                    "\n" +
                    "Day 7: \n" +

                    "Morning: Siam Niramit\n" +
                    "Located in downtown Bangkok, Siam Dream Theater is a themed Thai folk culture village. There is a large-scale, magnificent and gorgeous theater in Thailand, where you can watch beautiful and wonderful programs.\n" +
                    "Afternoon: Pororo Aquapark Bangkok\n" +
                    "This is a Pororo-themed water park with cute cartoon characters everywhere. There are 4 water slides, 9 paddling pools, and a super exciting lazy river in the park.\n" +
                    "\n"

        )
    }
}

