package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ArtApp()
                }
            }
        }
    }
}


@Composable
fun HoneScreen() {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Card(modifier = Modifier.padding(10.dp), elevation = 6.dp) {
                Image(
                    painter = painterResource(R.drawable.p1),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(20.dp)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Card(modifier = Modifier.padding(28.dp),elevation = 6.dp
            ) { Column() {
                Text(text = "Monty", modifier = Modifier.width(300.dp), fontSize = 24.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold)
                Text(text = "Monty enjoys chicken treats and cuddling while watching Seinfeld", modifier = Modifier.padding(4.dp))
            }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
            ) {

                Button(onClick = { /*TODO*/ }, ) {
                    Text(text = " Previous ")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "  Next  " )
                }
            }
        }
    }

/*@Composable
fun ArtWorkWall() {
        Card(modifier = Modifier.padding(10.dp), elevation = 6.dp) {
            Image(
                painter = painterResource(R.drawable.p1),
                contentDescription = null,
                modifier = Modifier
                    .padding(20.dp)
            )
        }
    }


@Composable
fun ArtworDescriptor() {

    Card(modifier = Modifier.padding(28.dp),elevation = 6.dp
    ) { Column() {
            Text(text = "Monty", modifier = Modifier.width(300.dp), fontSize = 24.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold)
            Text(text = "Monty enjoys chicken treats and cuddling while watching Seinfeld", modifier = Modifier.padding(4.dp))
        }
    }
}
*/
