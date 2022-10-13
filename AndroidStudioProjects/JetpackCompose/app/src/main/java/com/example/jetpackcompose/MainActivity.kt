package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background

                            main()
            }

        }
    }
}

@Composable
fun main() {
    val img = painterResource(id = R.drawable.js2)
    Box {
        Image(
            painter = img, contentDescription = "compose logo", modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 350.dp)
        )
        Text(
            text = 'Komal Kumari',
            fontSize = 40 sp,
            color = Color(56, 112, 179, 255),
            modifier = Modifier.padding(top = 365.sp, start = 65.sp)
        )
        Text(
            text = "❤",
            fontSize = 65.sp,
            color = Color(8, 48, 66, 255),
            modifier = Modifier.padding(top = 420.dp, start = 140.dp)
        )

        Text(
            text = "Jetpack Compose",
            fontSize = 45.sp,
            modifier = Modifier.padding(top = 510.dp, start = 20.dp)
        )

    }

}

@Preview(showBackground = true)
@Composable
fun defaultPreview() {
    JetpackComposeTheme {
        main()
    }

}
'}'