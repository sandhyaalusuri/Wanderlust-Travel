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

class NewYorkActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PlaceOne()
                }
            }
        }
    }
}

@Composable
fun PlaceOne() {
    Column(modifier = Modifier.background(color = Color.White)
        .padding(20.dp)
        .verticalScroll(rememberScrollState())
    ) {
        Text(
            fontSize = 40.sp,
            color = Color(android.graphics.Color.rgb(120, 40, 251)),
            fontFamily = FontFamily.Cursive,
            text = stringResource(id = R.string.place_1),
        )
        Image(
            painterResource(id = R.drawable.newyork), contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(200.dp)
                .scale(scaleX = 1.2F, scaleY = 1F)
        )
        Text(
            color=Color.Black,
            text = "Day 1: Getting to know New York and Chinatown\n" +

                    "Morning: You will be able to visit the most iconic neighborhoods of New York in just one morning, accompanied by a local guide who will give you a very enjoyable introduction to the city,ts neighborhoods and its cultures. \n" +
                    "Afternoon: Visit to Chinatown as the end of the activity coincides with lunchtime, in the Asian neighborhood of New York you will have the opportunity to try authentic Chinese food.\n" +
                    "\n" +

                    "Day 2: Discover Brooklyn, Soho and the West Village\n" +

                    "Morning: You can not miss Brooklyn, the coolest alternative spirit area of the city. It is a borough with an industrial past and a strong cultural identity.\n" +
                    "Afternoon: Next go to SoHo where many movies have been filmed. This area of the city has almost no Midtown skyscrapers and some of the oldest buildings in the Big Apple.\n" +
                    "\n" +

                    "Day 3: Experience dizzying thrills at Hudson Yards \n" +

                    "Morning: Go to Chelsea Market, one of the most popular food markets in Manhattan. Next is to one of the most original and modern urban parks in New York: High Line Park.\n" +
                    "Afternoon: Watching a basketball game at Madison Square Garden is one of the most fascinating spectacles you can attend in the United States.\n" +
                    "\n" +

                    "Day 4: Gospel mass, the best museums and tour of Central Park\n" +

                    "Morning: When you finish your bike tour of Central Park you can go to The Great Lawn, the largest meadow in the park to rest for a while and have a picnic when the sun is shining.\n" +
                    "Afternoon: A sunset cruise on the waters of Manhattan seems to me a great plan to conclude a day full of emotions after endless walks around the city.\n"+
                    "\n" +

                    "Day 5: Financial District and Broadway\n" +

                    "Morning: The Upper and Lower Manhattan Tour lasts 3 and a half hours and ends at Battery Park. After this activity you can take the ferry to the Statue of Liberty.\n" +
                    "Afternoon: Ground Zero in New York City is a place of remembrance. The magic of Broadway, its musical numbers and its majestic stagings will leave you speechless.\n" +
                    "\n" +

                    "Day 6: Day Get out of New York and explore other iconic sites\n" +
                    "Morning: The Washington excursion from New York is one of the best one-day experiences you can do from the Big Apple.\n" +
                    "Afternoon: Take a Niagara Falls tour that brings you to and from downtown New York in one day.\n" +
            "\n" +
                    "Day 7: Good bye New York!\n" +
                    "Morning: You can spend the morning shopping in New York to buy some original and unique souvenirs of your trip. Treat yourself where you can eat very well without paying a fortune.\n" +
                    "Afternoon: To climb the Empire State Building and the Top of the Rock, both in the center of Manhattan.\n" +
                    "\n"
        )

    }
}

