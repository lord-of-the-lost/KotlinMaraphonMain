package com.example.capitangame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.capitangame.ui.theme.CapitanGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CapitanGameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CapitanGame()
                }
            }
        }
    }
}

@Composable
fun CapitanGame() {
    var treasuresFound by remember { mutableIntStateOf(0) }
    var direction by remember { mutableStateOf("North") }
    var stormOrTreasure by remember { mutableStateOf("")}

    fun checker() {
        stormOrTreasure = if (Random.nextBoolean()) {
            treasuresFound++
            "Found a Treasure!"
        } else {
            "Storm Ahead!"
        }
    }
    
    Column {
        Text(text = "Treasures Found: $treasuresFound")
        Text(text = "Current Direction: $direction")
        Text(text = stormOrTreasure)

        Button(onClick = {
            direction = "East"
            checker()
        }) {
            Text(text = "Sail East")
        }

        Button(onClick = {
            direction = "South"
            checker()
        }) {
            Text(text = "Sail South")
        }

        Button(onClick = {
            direction = "West"
            checker()
        }) {
            Text(text = "Sail West")
        }

        Button(onClick = {
            direction = "North"
            checker()
        }) {
            Text(text = "Sail North")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CapitanGameTheme {
        CapitanGame()
    }
}