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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
        Row {
            Text(
                text = "Enviar",
                modifier = modifier
                    .fillMaxWidth()
                    .padding(end = 2.dp),
                textAlign = TextAlign.End,
                style = TextStyle(
                    fontSize = 32.sp)
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(onClick = { },
                modifier = Modifier.weight(1f)
            ) {
                Text("9")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { },
                modifier = Modifier.weight(1f)) {
                Text("8")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { },
                modifier = Modifier.weight(1f)) {
                Text("7")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { },
                modifier = Modifier.weight(1f)) {
                Text("*")
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(onClick = { },
                modifier = Modifier.weight(1f)
            ) {
                Text("6")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { },
                modifier = Modifier.weight(1f)) {
                Text("5")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { },
                modifier = Modifier.weight(1f)) {
                Text("4")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { },
                modifier = Modifier.weight(1f)) {
                Text("/")
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(onClick = { },
                modifier = Modifier.weight(1f)) {
                Text("3")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { },
                modifier = Modifier.weight(1f)) {
                Text("2")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { },
                modifier = Modifier.weight(1f)) {
                Text("1")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { },
             modifier = Modifier.weight(1f)
            ) {
                Text("-")
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(onClick = { },
                modifier = Modifier.weight(1f)
            ) {
                Text(",")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { },
                modifier = Modifier.weight(1f)) {
                Text("0")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { },
                modifier = Modifier.weight(1f)) {
                Text("=")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { },
                modifier = Modifier.weight(1f)) {
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