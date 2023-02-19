package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                LoginPage()
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun LoginPage() {

    val image = painterResource(id = R.drawable.imagemteste)

    Box(
        modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter) {
        Box(modifier = Modifier
            .fillMaxSize()
            .background(Color.White),contentAlignment = Alignment.TopCenter ){

            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .blur(
                        radiusX = 10.dp,
                        radiusY = 10.dp,
                        edgeTreatment = BlurredEdgeTreatment(RoundedCornerShape(8.dp))
                    ),
                contentScale = ContentScale.Crop
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.68f)
                .padding(10.dp)

        ) {
            Text("Email", fontSize = 35.sp,
            fontWeight = FontWeight.Light,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
                    .padding(start = 16.dp, top = 16.dp)
            )
            Text("Senha", fontSize = 35.sp,
                fontWeight = FontWeight.Light,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
                    .padding(start = 16.dp, top = 150.dp)

            )


        }
    }
}
