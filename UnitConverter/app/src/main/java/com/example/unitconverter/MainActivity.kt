package com.example.unitconverter

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.unitconverter.ui.theme.UnitConverterTheme

class MainActivity : ComponentActivity() {
    @ExperimentalMaterial3Api
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitConverterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    UnitConverter()
                }
            }
        }
    }
}

@Composable
@ExperimentalMaterial3Api
fun UnitConverter() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Unit Converter")
        Spacer(Modifier.height(16.dp))
        OutlinedTextField(value = "", onValueChange = {

        })
        Spacer(Modifier.height(16.dp))
        Row {
//           val context = LocalContext.current
//            Button(onClick = { Toast
//                .makeText(context,
//                    "Thanks for clicking!",
//                    Toast.LENGTH_LONG).show() }) {
//                    Text("Click me!")
//            }
            Box {
                Button(onClick = { /*TODO*/ }) {
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down")
                }
            }
            DropdownMenu(expanded = false, onDismissRequest = { /*TODO*/ }) {
                DropdownMenuItem(text = { Text("Centimeters") },
                    onClick = { /*TODO*/ }
                )
                DropdownMenuItem(text = { Text("Meters") },
                    onClick = { /*TODO*/ }
                )
                DropdownMenuItem(text = { Text("Feet") },
                    onClick = { /*TODO*/ }
                )
                DropdownMenuItem(text = { Text("Millimeters") },
                    onClick = { /*TODO*/ }
                )
            }
            Spacer(Modifier.width(16.dp))

            Box {
                Button(onClick = { /*TODO*/ }) {
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down")
                }
            }
            DropdownMenu(expanded = false, onDismissRequest = { /*TODO*/ }) {
                DropdownMenuItem(text = { Text("Centimeters") },
                    onClick = { /*TODO*/ }
                )
                DropdownMenuItem(text = { Text("Meters") },
                    onClick = { /*TODO*/ }
                )
                DropdownMenuItem(text = { Text("Feet") },
                    onClick = { /*TODO*/ }
                )
                DropdownMenuItem(text = { Text("Millimeters") },
                    onClick = { /*TODO*/ }
                )
            }
        }
        Spacer(Modifier.height(16.dp))
        Text("Result:")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


@Preview(showBackground = true)
@Composable
@ExperimentalMaterial3Api
fun UnitConverterPreview() {
    Column {
        UnitConverter()
        Text(
            text = "Hello!"
        )
    }
}