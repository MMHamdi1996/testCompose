package com.example.composeapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Device
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapplication.ui.theme.ComposeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShowUi()
        }
    }

    @Composable
    fun ShowUi() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "Mahdi", color = Color.Green, modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 32.dp)
                    .background(Color.DarkGray)
            )

            Button(
                onClick = {
                    Toast.makeText(
                        this@MainActivity,
                        "سلام خوبی ؟",
                        Toast.LENGTH_SHORT
                    ).show()
                },
                modifier = Modifier
                    .width(200.dp)
                    .align(Alignment.CenterHorizontally), shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(Color.Cyan)
            ) {
                Text(
                    text = "کلیک", modifier = Modifier
                        .padding(10.dp), color = Color.Black, fontSize = 24.sp
                )
            }

            Surface(shape = CircleShape) {
                Image(painter = painterResource(id = R.drawable.android), contentDescription =null ,
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp))
            }
            Surface(shape = CircleShape) {
                Image(painter = painterResource(id = R.drawable.android), contentDescription =null ,
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp))
            }
            Surface(shape = CircleShape) {
                Image(painter = painterResource(id = R.drawable.android), contentDescription =null ,
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp))
            }
            Surface(shape = CircleShape) {
                Image(painter = painterResource(id = R.drawable.android), contentDescription =null ,
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp))
            }
            Surface(shape = CircleShape) {
                Image(painter = painterResource(id = R.drawable.android), contentDescription =null ,
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp))
            }

        }
    }

    @Preview(
        showBackground = true,
        device = Devices.PIXEL_XL,
        showSystemUi = true
    )
    @Composable
    fun ShowTestText() {
        ShowUi()
    }
}
