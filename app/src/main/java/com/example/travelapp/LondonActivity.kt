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

class LondonActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting2()
                }
            }
        }
    }
}

@Composable
fun Greeting2() {

    Column(
        modifier = Modifier.background(color = Color.White)
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            fontSize = 40.sp,
            color = Color(android.graphics.Color.rgb(120, 40, 251)),
            fontFamily = FontFamily.Cursive,
            text = stringResource(id = R.string.place_3),
        )
        Image(
            painterResource(id = R.drawable.london), contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(200.dp)
                .scale(scaleX = 1.2F, scaleY = 1F)
        )
        Text(
            color = Color.Black,
            text = "Day 1 - Houses of Parliament, Westminster Abbey, Buckingham Palace, Covent Garden\n" +
                    "Morning: Start the day at Westminster, Head to the grand Houses of Parliament, where you’ll find one of the unmissable landmarks of London, the Big Ben\n" +
                    "Afternoon: Spend the rest of the afternoon and evening soaking up the lively vibe in and around Covent Garden.\n" +


                    "\n" +
                    "Day 2 - Kensington Palace, Hyde Park, museums\n" +
                    "Morning: Kensington Palace, the birthplace of Queen Victoria, walk towards the Princess Diana Memorial Fountain in Hyde Park\n" +
                    "Afternoon: Take a guided tour of the impressive Royal Albert Hall and then head down towards the V&A museum.\n" +

                    "\n" +
                    "Day 3 - Harry Potter London \n" +
                    "Morning: London isn’t London without experiencing the magic of the wizarding world. Start your day by visiting Platform 9¾ at King’s Cross Station.\n" +
                    "Afternoon: For the ultimate experience, book the Warners Bros. Studio Harry Potter Tour.\n" +

                    "\n" +
                    "Day 4 - Tower of London, Borough Market, Shakespeare’s Globe\n" +
                    "Morning: Start the day with a history lesson at the Tower of London and be dazzled by the world famous Crown Jewels\n" +
                    "Afternoon: For lunch, the Borough Market overflows with the best produce and street food.\n" +
                    "\n" +

                    "Day 5 - Museums\n" +
                    "Morning: London is home to dozens of museums, and one of the best is the British Museum , see all the highlights in about 3 hours.\n" +
                    "Afternoon: Head to one of London’s best places for afternoon tea to enjoy a quintessentially English experience.\n" +

                    "\n" +

                    "Day 6 - Camden, Regent’s Park\n" +
                    "Morning: Regent’s Park, one of London’s royal parks designed in 1811 to serve as one of the royal hunting grounds.\n" +
                    "Evening: Music lovers will love Camden Town for its connection to the city’s punk scene\n" +
                    "\n" +
                    "Day 7 - Sunday Roast\n" +
                    "To mark your final day, partake in one of the most popular British traditions–eating a Sunday roast." +
                    "\n"
        )
    }
}

