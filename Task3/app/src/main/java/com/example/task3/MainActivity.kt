package com.example.task3


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task3.ui.theme.Task3Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Task3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeBasics()
                }
            }
        }
    }
}

@Composable
fun ComposeBasics() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .weight(1f) // First row takes 50% of the height
                .fillMaxWidth()
        ) {
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                .weight(1f) // Second column in the first row takes 50% of the width
                .fillMaxHeight()
                .background(Color(0xFFEADDFF))



            ){
                Text(
                    text = "Text composable",
                    fontSize = 15.sp,
                    style = TextStyle(fontWeight = FontWeight.Bold),
                    modifier = Modifier
                        .padding(16.dp)

                )
                Text(
                    text = "Displays text and follows the recommended Material Design guidelines.",
                    textAlign = TextAlign.Center
                )
            }
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(1f) // Second column in the first row takes 50% of the width
                    .fillMaxHeight()
                    .background(Color(0xFFD0BCFF))

            ){
                Text(
                    text = "Image composable",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(16.dp),
                    style = TextStyle(fontWeight = FontWeight.Bold)
                )
                Text(
                    text = "Creates a composable that lays out and draws a given Painter class object.",
                    textAlign = TextAlign.Center
                )
            }
        }
        Row(
            modifier = Modifier
                .weight(1f) // First row takes 50% of the height
                .fillMaxWidth()
        ){
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(1f) // Second column in the first row takes 50% of the width
                    .fillMaxHeight()
                    .background(Color(0xFFB69DF8))


            ){
                Text(
                    text = "Row composable",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(16.dp),
                    style = TextStyle(fontWeight = FontWeight.Bold)
                )
                Text(
                    text = "A layout composable that places its children in a horizontal sequence.",
                    textAlign = TextAlign.Center
                )
            }
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(1f) // Second column in the first row takes 50% of the width
                    .fillMaxHeight()
                    .background( Color(0xFFF6EDFF))


            ){
                Text(
                    text = "Column composable",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(16.dp),
                    style = TextStyle(fontWeight = FontWeight.Bold)
                )
                Text(
                    text = "A layout composable that places its children in a vertical sequence.",
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Task3Theme {
        ComposeBasics()
    }
}