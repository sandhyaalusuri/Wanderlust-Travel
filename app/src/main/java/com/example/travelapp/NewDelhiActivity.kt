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

class NewDelhiActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting5()
                }
            }
        }
    }
}

@Composable
fun Greeting5() {

    Column(
        modifier = Modifier.background(color = Color.White)
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            fontSize = 40.sp,
            color = Color(android.graphics.Color.rgb(120, 40, 251)),
            fontFamily = FontFamily.Cursive,
            text = stringResource(id = R.string.place_5),
        )
        Image(
            painterResource(id = R.drawable.tajmahal), contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(200.dp)
                .scale(scaleX = 1.2F, scaleY = 1F)
        )
        Text(
            color=Color.Black,
            text =  "Day 1: \n" +
                    "Morning: Red Fort\n" +
                    "The Red Fort of Delhi is located in the old city in the northeast of Delhi. It was a palace during the Mughal Empire. It was named after the entire building was built with reddish-brown sandstone.\n" +
                    "Afternoon: Humayun's Tomb\n" +
                    "Humayun's Tomb, located in New Delhi, India, was built in 1570 and is the mausoleum of the Mughal emperor Humayun and his concubines. Humayun's Tomb is a typical combination of Islamic and Hindu architectural styles\n" +
                    "Evening: \n" +
                    "Rec, Spa, Premium Amenities\n" +
                    "Pamper yourself with a visit to the spa, which offers massages and facials.\n" +
                    "Dining\n" +
                    "Enjoy a meal at one of the hotel's dining establishments, which include 3 restaurants and a coffee shop/café.\n" +

                    "\n" +

                    "Day 2: \n" +
                    "Morning: Qutub Minar\n" +
                    "Qutub Minar is located in the village of Meteuri on the outskirts of Delhi. It is one of the most beautiful stone towers in the world and is listed on the World Cultural Heritage List.\n" +
                    "Afternoon: Rashtrapati Bhavan\n" +
                    "The Presidential Palace of India was built in 1929, formerly known as Victoria Palace. The palace-style building is majestic, including the audience hall, banquet hall, library and other gorgeous halls, as well as countless fountains and pools, pavilions and corridors.\n" +
                    "Evening: The Leela Palace New Delhi\n" +
                    "A majestic palace designed in the architectural style of lutyens’ delhi, the leela palace, chanakyapuri, new delhi, is located in the heart of the prestigious diplomatic enclave area.\n" +

                    "\n" +

                    "Day 3: \n" +
                    "Morning: National Museum New Delhi\n" +
                    "The National Museum of India is located on King's Road. It houses more than 200,000 precious local historical relics from the third century BC to the present, as well as many foreign cultural relics, including more than 200 original Chinese Dunhuang frescoes.\n" +
                    "Afternoon: Jantar Mantar\n" +
                    "Jantar Mantar Observatory is located near Connaught Place.\n" +
                    "Evening: The LaLiT New Delhi\n" +
                    "A stay at The LaLiT New Delhi places you in the heart of New Delhi, within a 10-minute drive of Jantar Mantar and Humayun's Tomb.\n" +

                    "\n" +

                    "Day 4: \n" +
                    "Morning: Purana Qila\n" +
                    "The ancient castle is the residence of the second-generation Mughal king Humayun. There is a moat around the castle, which has become a good place for tourists to go boating.\n" +
                    "Afternoon: National Gallery of Modern Art\n" +
                    "The National Museum of Modern Art was built on the original site of the Maharaja's residence in Jaipur. \n" +
                    "Evening: Taj Palace, New Delhi\n" +
                    "Taj Palace Hotel, New Delhi, is the perfect embodiment of world-class service and hospitality.\n" +

                    "\n" +

                    "Day 5: \n" +
                    "Morning: Safdarjung's Tomb\n" +
                    "The Safdarjan Mausoleum is located in the south of New Delhi and was built by Nawab of the Awad Kingdom for his father Safdarjan in 1754.\n" +
                    "Afternoon: Crafts Museum\n" +
                    "The Handicraft Museum was built in 1956. This museum is located on the north side of the old fort.\n" +
                    "Evening: Maidens Hotel New Delhi\n" +
                    "After visiting the glorious Crafts Museum, Maidens Hotel New Delhi nearby is the best place to stay.\n" +

                    "\n" +

                    "Day 6: \n" +
                    "Morning: Madame Tussauds Delhi\n" +
                    "The world-famous Madame Tussauds has opened a branch in Delhi! More than 50 wax figures with vivid expressions and indistinguishable from real people, celebrities from different fields from all over the world are here waiting to meet you.\n" +
                    "Afternoon: Firoz Shah Kotla\n" +
                    "Having the chance to enjoy the charming Madame Tussauds Delhi, Firoz Shah Kotla next to it is another great place that you will never want to miss!\n" +
                    "Evening: The Manor\n" +
                    "Manor is a stylish boutique hotel located a 30-minute drive from Indira Gandhi Airport.\n" +

                    "\n" +

                    "Day 7: \n" +
                    "Morning: India Gate\n" +
                    "The India Gate is located in the city of Delhi. It commemorates the Indian soldiers who died in the First World War and the Third Anglo-Afghan War, and is also the dividing line between the old and the new Delhi.\n" +
                    "Afternoon: Lotus Temple\n" +
                    "Located in the southeast of Delhi, the Lotus Temple was built in 1986 and named after its shape resembling a blooming lotus flower. Although it is a Ha'i chapel, people of any race and religion can pray here, showing great inclusiveness. The temple is built with white marble, which looks like three layers of white petals from a distance, and the lotus is supported by nine clear water pools.\n" +
                    "Evening: Taj Mahal\n" +
                    "An immense mausoleum of white marble, built in Agra between 1631 and 1648 by order of the Mughal emperor Shah Jahan in memory of his favourite wife, the Taj Mahal is the jewel of Muslim art in India and one of the universally admired masterpieces of the world's heritage.\n" +

                    "\n"
        )
    }
}



