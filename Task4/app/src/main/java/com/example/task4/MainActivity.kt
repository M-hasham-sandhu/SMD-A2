package com.example.task4

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task4.ui.theme.Task4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Task4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    WeatherApp()
                }
            }
        }
    }
}

@Composable
fun WeatherApp() {
    Column {
        Row {
            Box(
                modifier = Modifier.fillMaxSize(.6f)
            ) {
                Column {
                    Row {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Go back")
                        Text(
                            text = "Cities",
                            modifier = Modifier.padding(18.dp),
                            fontSize = 18.sp
                        )
                        Icon(
                            imageVector = Icons.Default.MoreVert,
                            modifier = Modifier.padding(start = 45.dp),
                            contentDescription = "..."

                        )
                    }

                    Text(
                        text = "Cities that You have chosen",
                        modifier = Modifier.padding(18.dp)
                    )

                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Button(
                            onClick = { },
                            modifier = Modifier.alpha(0.5f)
                        ) {
                            Text(text = "Choose City")
                        }
                    }
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.LightGray)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add New City",
                        modifier = Modifier.padding(bottom = 4.dp)
                    )
                    Text(text = "ADD City")
                }



                Column {
                    City(name = "Lahore", temp = 12, weather = "Foggy", humidity = "10")
                    City(name = "Karachi", temp = 22, weather = "Clear", humidity = "20")
                    City(name = "Islamabad", temp = 18, weather = "Cloudy", humidity = "22")
                }
            }
        }
    }
}




@Composable
fun City(name: String, temp: Int, weather: String, humidity: String) {
    Box(
        modifier = Modifier
            .size(height = 120.dp, width = 600.dp)
            .background(Color(0xFFB69DF8))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Row {
                Text(
                    text = name,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic,
                    color = Color.Black
                )

                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.BottomEnd
                ) {
                    Text(
                        text = "$temp, $weather",
                        color = Color(0xFFD14B4B),
                        fontSize = 15.sp,
                        modifier = Modifier.padding(end = 8.dp, top = 4.dp)
                    )
                }
            }
            Text(text = "Humidity: $humidity%", fontSize = 15.sp, modifier = Modifier.alpha(0.5f))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Task4Theme {
        WeatherApp()
    }
}