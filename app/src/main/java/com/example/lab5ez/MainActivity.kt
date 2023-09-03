package com.example.lab5ez

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab5ez.ui.theme.Lab5EZTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab5EZTheme() {
                principal()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun principal() {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(75.dp)
                    .background(Color.LightGray)
            ) {
                Row() {
                    Text(
                        text = "TodoEventos",
                        modifier = Modifier
                            .padding(12.dp),
                        fontSize = 32.sp
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    IconButton(onClick = { /*TODO*/ }, modifier = Modifier.size(75.dp)) {
                        Icon(
                            modifier = Modifier
                                .size(30.dp),
                            painter = painterResource(id = R.drawable.boton),
                            contentDescription = null
                        )
                    }

                }
            }
        }
    }
}