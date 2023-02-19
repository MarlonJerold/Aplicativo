package com.example.myapplication.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment.TopLeft
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.TopStart
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.unit.dp
import com.example.myapplication.R

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
            modifier = Modifier.fillMaxWidth()
                        .fillMaxHeight(0.68f)
                        .padding(10.dp)

        ) {
            
        }
    }
}