package com.example.contatosjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.contatosjetpack.ui.theme.ContatosJetPackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ContatosJetPackTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Spacer(modifier = Modifier.weight(1f))
        Row {
            Text(
                text = "Enviar",
                modifier = modifier
                    .fillMaxWidth()
                    .padding(end = 2.dp),
                textAlign = TextAlign.End,
                style = TextStyle(
                    fontSize = 32.sp
                )
            )
        }
        Spacer(modifier = Modifier.height(6.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                    contentColor = Color.White
                ),
                modifier = Modifier
                        .weight(1f)
                        .height(100.dp)
            ) {
                Text("9")
            }
            Spacer(modifier = Modifier.width(6.dp))
            Button(onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .weight(1f)
                    .height(100.dp)
            ) {
                Text("8")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                    contentColor = Color.White
                ),
                modifier = Modifier.weight(1f)
                    .height(100.dp)
            ) {
                Text("7")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Yellow,
                    contentColor = Color.Black
                ),
                modifier = Modifier
                    .weight(1f)
                    .height(100.dp)
            ) {
                Text("*")
            }
        }
        Spacer(modifier = Modifier.height(6.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .weight(1f)
                    .height(100.dp)
            ) {
                Text("6")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .weight(1f)
                    .height(100.dp)
            ) {
                Text("5")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .weight(1f)
                    .height(100.dp)
            ) {
                Text("4")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Yellow,
                    contentColor = Color.Black
                ),
                modifier = Modifier
                    .weight(1f)
                    .height(100.dp)
            ) {
                Text("/")
            }
        }
        Spacer(modifier = Modifier.height(6.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .weight(1f)
                    .height(100.dp)
            ) {
                Text("3")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .weight(1f)
                    .height(100.dp)
            ) {
                Text("2")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .weight(1f)
                    .height(100.dp)
            ) {
                Text("1")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Yellow,
                    contentColor = Color.Black
                ),
             modifier = Modifier
                 .weight(1f)
                 .height(100.dp)
            ) {
                Text("-")
            }
        }
        Spacer(modifier = Modifier.height(6.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Yellow,
                    contentColor = Color.Black
                ),
                modifier = Modifier
                    .weight(1f)
                    .height(100.dp)
            ) {
                Text(",")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .weight(1f)
                    .height(100.dp)
            ) {
                Text("0")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Yellow,
                    contentColor = Color.Black
                ),
                modifier = Modifier
                    .weight(1f)
                    .height(100.dp)
            ) {
                Text("=")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Yellow,
                    contentColor = Color.Black
                ),
                modifier = Modifier
                    .weight(1f)
                    .height(100.dp)
            ) {
                Text("+")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ContatosJetPackTheme {
        Greeting("Android")
    }
}