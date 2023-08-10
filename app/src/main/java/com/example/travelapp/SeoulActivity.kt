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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelapp.ui.theme.TravelAppTheme

class SeoulActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting3()
                }
            }
        }
    }
}

@Composable
fun Greeting3() {

    Column(
        modifier = Modifier.background(color = Color.White)
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            fontSize = 40.sp,
            color = Color(android.graphics.Color.rgb(120, 40, 251)),
            fontFamily = FontFamily.Cursive,
            text = stringResource(id = R.string.place_4),
        )
        Image(
            painterResource(id = R.drawable.seoul), contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(200.dp)
                .scale(scaleX = 1.2F, scaleY = 1F)
        )
        Text(
            color=Color.Black,
            text =      "Day 1: Arrive in Seoul\n" +

                        "Arrive at the Incheon Airport and check into your hotel\n" +
                        "Have dinner and see a show at Korea House or dinner with a view at Top Cloud restaurant.\n" +


                        "\n" +
                        "Day 2: Explore Seoul\n" +

                        "Morning: Tour Changdeokgung Palace -- guided tours in English are held Tuesday to Sunday at 11:30am, 1:30pm, and 3:30pm. Then take a walk around the city's cultural street, Insadong\n" +"\n"+
                        "Evening: Enjoy a quiet dinner or, if you want a livelier night out, take a dinner cruise on the Han River\n" +

                        "\n" +
                        "Day 3: Take a Tour of the DMZ\n" +

                        "Allow a whole day to take an organized tour to Panmunjeom, also known as the Demilitarized Zone\n" +

                        "\n" +
                        "Day 4: Suwon Fortress & Korean Folk Villag\n" +

                        "Morning: Take a subway to Suwon and get a ticket to the Korean Folk Village at the tourist information booth. Free shuttles run every hour on the half-hour. \n\n" +
                        "Afternoon: Linger over a lunch of traditional food like janchi gooksu ,nokdu buchingae , naengmyeon , and makgeolli , served as you sit at outdoor tables.\n" +
                        "\n" +

                        "Day 5: Transit to Gyeongju\n" +

                        "Allow half a day to travel to Gyeongju (going by either train or bus takes 4 1/2 hr.). Explore some of downtown's historic sites, such as Tumuli Park, where the Shilla kings are buried, and Cheomseongdae Observatory\n" +

                        "\n" +

                        "Day 6:Explore Gyeongju\n" +

                        "Explore the downtown area the previous evening, pick up something for lunch and take the Gyeongju City Tour Bus to explore points farther out (which are difficult to see individually), including Seokguram Grotto and Bulguksa Temple.\n"+
                        " Take an evening train or bus to Busan.\n" +
                        "\n" +
                        "Day 7: A Brief Visit of Busan\n" +

                        "Finish your whirlwind trip with a morning walk on one of Busan's sandy beaches and an exploration of Jagalchi Market and a lunch of hwae (raw fish).\n"+" Catch a high-speed KTX train back to Seoul for your flight back home.\n" +
                        "\n"
            )
        }
}

