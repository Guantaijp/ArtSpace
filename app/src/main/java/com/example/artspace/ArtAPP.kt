package com.example.artspace

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun ArtApp(){

    val context = LocalContext.current

    var currentStep by remember { mutableStateOf(1) }
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        when(currentStep){

            //1st step
            1-> {
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

                    Spacer(modifier = Modifier.height(15.dp))

                    Card(modifier = Modifier.padding(28.dp),elevation = 6.dp
                    ) { Column() {
                        Text(text = "Monty", modifier = Modifier.width(300.dp), fontSize = 24.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold)
                        Text(text = "Monty enjoys chicken treats and cuddling while watching Seinfeld", modifier = Modifier.padding(4.dp))
                    }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp)
                    ) {
                        Button(onClick = {
                            Toast.makeText(context, "There is not next image:Click Next Button !!", Toast.LENGTH_SHORT).show()
                        }, ) {
                            Text(text = " Previous ")
                        }
                        Button(onClick = { currentStep = 2 }) {
                            Text(text = "  Next  " )
                        }
                    }
                }
            }

            //2nd step

            2 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Card(modifier = Modifier.padding(10.dp), elevation = 6.dp) {
                        Image(
                            painter = painterResource(R.drawable.p2),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(20.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(15.dp))

                    Card(modifier = Modifier.padding(28.dp),elevation = 6.dp
                    ) { Column() {
                        Text(text = "Jubilee", modifier = Modifier.width(300.dp), fontSize = 24.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold)
                        Text(text = "Jubilee enjoys thoughtful discussions by the campfire.", modifier = Modifier.padding(4.dp))
                    }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp)
                    ) {

                        Button(onClick = { currentStep = 1 }, ) {
                            Text(text = " Previous ")
                        }
                        Button(onClick = { currentStep = 3 }) {
                            Text(text = "  Next  " )
                        }
                    }
                }
            }

            3 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Card(modifier = Modifier.padding(10.dp), elevation = 6.dp) {
                        Image(
                            painter = painterResource(R.drawable.p3),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(20.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(15.dp))

                    Card(modifier = Modifier.padding(28.dp),elevation = 6.dp
                    ) { Column() {
                        Text(text = "Beezy's", modifier = Modifier.width(300.dp), fontSize = 24.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold)
                        Text(text = "Beezy's favorite past-time is helping you choose your brand color.", modifier = Modifier.padding(4.dp))
                    }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp)
                    ) {

                        Button(onClick = { currentStep = 2 }, ) {
                            Text(text = " Previous ")
                        }
                        Button(onClick = {currentStep = 4  }) {
                            Text(text = "  Next  " )
                        }
                    }
                }
            }
            4 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Card(modifier = Modifier.padding(10.dp), elevation = 6.dp) {
                        Image(
                            painter = painterResource(R.drawable.p4),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(20.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(15.dp))

                    Card(modifier = Modifier.padding(28.dp),elevation = 6.dp
                    ) { Column() {
                        Text(text = "Mochi", modifier = Modifier.width(300.dp), fontSize = 24.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold)
                        Text(text = "Mochi is the perfect \"rubbery ducky\" debugging pup, always listening.", modifier = Modifier.padding(4.dp))
                    }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp)
                    ) {

                        Button(onClick = { currentStep = 3 }, ) {
                            Text(text = " Previous ")
                        }
                        Button(onClick = { currentStep = 5 }) {
                            Text(text = "  Next  " )
                        }
                    }
                }
            }
            5 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Card(modifier = Modifier.padding(10.dp), elevation = 6.dp) {
                        Image(
                            painter = painterResource(R.drawable.p5),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(20.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(15.dp))

                    Card(modifier = Modifier.padding(28.dp),elevation = 6.dp
                    ) { Column() {
                        Text(text = "Brewery", modifier = Modifier.width(300.dp), fontSize = 24.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold)
                        Text(text = "Brewery loves fetching you your favorite homebrew.", modifier = Modifier.padding(4.dp))
                    }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp)
                    ) {

                        Button(onClick = { currentStep = 4 }, ) {
                            Text(text = " Previous ")
                        }
                        Button(onClick = { currentStep = 6 }) {
                            Text(text = "  Next  " )
                        }
                    }
                }
            }
            6 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Card(modifier = Modifier.padding(10.dp), elevation = 6.dp) {
                        Image(
                            painter = painterResource(R.drawable.p6),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(20.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(15.dp))

                    Card(modifier = Modifier.padding(28.dp),elevation = 6.dp
                    ) { Column() {
                        Text(text = "Lucy", modifier = Modifier.width(300.dp), fontSize = 24.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold)
                        Text(text = "Picture yourself in a boat on a river, Lucy is a pup with kaleidoscope eyes.", modifier = Modifier.padding(4.dp))
                    }
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp)
                    ) {

                        Button(onClick = { currentStep = 5 }, ) {
                            Text(text = " Previous ")
                        }
                        Button(onClick = { currentStep = 7 }) {
                            Text(text = "  Next  " )
                        }
                    }
                }
            }
            7 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Card(modifier = Modifier.padding(10.dp), elevation = 6.dp) {
                        Image(
                            painter = painterResource(R.drawable.p7),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(20.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(15.dp))

                    Card(modifier = Modifier.padding(28.dp),elevation = 6.dp
                    ) { Column() {
                        Text(text = "Astro", modifier = Modifier.width(300.dp), fontSize = 24.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold)
                        Text(text = "Is it a bird? A plane? No, it's Astro blasting off into your heart!", modifier = Modifier.padding(4.dp))
                    }
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp)
                    ) {

                        Button(onClick = { currentStep = 6 }, ) {
                            Text(text = " Previous ")
                        }
                        Button(onClick = { currentStep= 8 }) {
                            Text(text = "  Next  " )
                        }
                    }
                }
            }
            8 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Card(modifier = Modifier.padding(10.dp), elevation = 6.dp) {
                        Image(
                            painter = painterResource(R.drawable.p8),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(20.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(15.dp))

                    Card(modifier = Modifier.padding(28.dp),elevation = 6.dp
                    ) { Column() {
                        Text(text = "Boo", modifier = Modifier.width(300.dp), fontSize = 24.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold)
                        Text(text = "Boo is just a teddy bear in disguise. What he lacks in grace, he makes up in charm.", modifier = Modifier.padding(4.dp))
                    }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp)
                    ) {

                        Button(onClick = { currentStep = 7 }, ) {
                            Text(text = " Previous ")
                        }
                        Button(onClick = { currentStep = 9 }) {
                            Text(text = "  Next  " )
                        }
                    }
                }
            }
            9 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Card(modifier = Modifier.padding(10.dp), elevation = 6.dp) {
                        Image(
                            painter = painterResource(R.drawable.p9),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(20.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(18.dp))

                    Card(modifier = Modifier.padding(28.dp),elevation = 6.dp
                    ) { Column() {
                        Text(text = "Pippa", modifier = Modifier.width(300.dp), fontSize = 24.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold)
                        Text(text = "Pippa likes to look out the window and write pup-poetry.", modifier = Modifier.padding(4.dp))
                    }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp)
                    ) {

                        Button(onClick = { currentStep = 8 }, ) {
                            Text(text = " Previous ")
                        }
                        Button(onClick = { currentStep = 10 }) {
                            Text(text = "  Next  " )
                        }
                    }
                }
            }
            10 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Card(modifier = Modifier.padding(10.dp), elevation = 6.dp) {
                        Image(
                            painter = painterResource(R.drawable.p10),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(20.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(15.dp))

                    Card(modifier = Modifier.padding(28.dp),elevation = 6.dp
                    ) { Column() {
                        Text(text = "Coco", modifier = Modifier.width(300.dp), fontSize = 24.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold)
                        Text(text = "Coco enjoys getting pampered at the local puppy spa.", modifier = Modifier.padding(4.dp))
                    }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp)
                    ) {

                        Button(onClick = { currentStep = 9 }, ) {
                            Text(text = " Previous ")
                        }
                        Button(onClick = {  currentStep = 11}) {
                            Text(text = "  Next  " )
                        }
                    }
                }
            }
            11 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Card(modifier = Modifier.padding(10.dp), elevation = 6.dp) {
                        Image(
                            painter = painterResource(R.drawable.p11),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(20.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(15.dp))

                    Card(modifier = Modifier.padding(28.dp),elevation = 6.dp
                    ) { Column() {
                        Text(text = "brody", modifier = Modifier.width(300.dp), fontSize = 24.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold)
                        Text(text = "Brody is a good boy, waiting for your next command.", modifier = Modifier.padding(4.dp))
                    }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp)
                    ) {
                        Button(onClick = { currentStep = 10 }, ) {
                            Text(text = " Previous ")
                        }
                        Button(onClick = { currentStep = 12  }) {
                            Text(text = "  Next  " )
                        }
                    }
                }
            }
            12 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {

                    Card(modifier = Modifier.padding(10.dp), elevation = 6.dp) {
                        Image(
                            painter = painterResource(R.drawable.p12),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(20.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(15.dp))

                    Card(modifier = Modifier.padding(28.dp),elevation = 6.dp
                    ) { Column() {
                        Text(text = "Stella", modifier = Modifier.width(300.dp), fontSize = 24.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold)
                        Text(text = "Stella! Calm and always up for a challenge, she's the perfect companion.", modifier = Modifier.padding(4.dp))
                    }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp)
                    ) {

                        Button(onClick = { currentStep = 11 }, ) {
                            Text(text = " Previous ")
                        }
                        Button(
                            onClick = {
                                Toast.makeText(context, "This is the last image: End!!", Toast.LENGTH_SHORT).show()
                        }) {
                            Text(text = "  Next  " )
                        }
                    }
                }
            }

          //end
        }

    }
}