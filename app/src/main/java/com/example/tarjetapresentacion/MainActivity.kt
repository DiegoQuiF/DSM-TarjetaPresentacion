package com.example.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Presentacion(
                        "Michael Quiñonez",
                        "+51 912345678",
                        "@MichaelQF",
                        "michael@gmail.com"
                    )
                }
            }
        }
    }
}

@Composable
fun Presentacion(nombre: String, numero: String, contacto: String, correo: String) {
    Column (
        modifier = Modifier
            .background(Color(0xFFD0F4DE))
            .fillMaxSize()
    ) {
        BloqueSup(nombre)
        BloqueInf(numero, contacto, correo)
    }
}

@Composable
fun BloqueSup(nombre: String) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxHeight(0.75F)
            .fillMaxWidth()
    )
    {
        Box (
            modifier = Modifier
                .background(Color(0xCC000033))
                .width(140.dp)
                .height(140.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null,
                modifier = Modifier.align(Alignment.Center)
            )
        }
        Text (
            text = nombre,
            fontSize = 40.sp,
            fontWeight = FontWeight.Light,
            color = Color(0xFF000000),
            modifier = Modifier
                .padding(5.dp)
        )
        Text (
            text = "Desarrollador en Android",
            fontWeight = FontWeight.Bold,
            color = Color(0xCC005500),
            modifier = Modifier
                .padding(5.dp)
        )
    }
}

@Composable
fun BloqueInf(numero: String, contacto: String, correo: String) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        Row (
            modifier = Modifier.padding(5.dp)
        ) {
            Box (
                modifier = Modifier.fillMaxWidth(0.12F)
            ) {
                Icon(
                    imageVector = Icons.Filled.Call,
                    contentDescription = null,
                    tint = Color(0xCC005500)
                )
            }
            Box (
                modifier = Modifier.fillMaxWidth(0.5F)
            ) {
                Text(
                    text = numero,
                    color = Color(0xFF000000)
                )
            }
        }
        Row (
            modifier = Modifier.padding(5.dp)
        ) {
            Box (
                modifier = Modifier.fillMaxWidth(0.12F)
            ) {
                Icon(
                    imageVector = Icons.Filled.Share,
                    contentDescription = null,
                    tint = Color(0xCC005500)
                )
            }
            Box (
                modifier = Modifier.fillMaxWidth(0.5F)
            ) {
                Text(
                    text = contacto,
                    color = Color(0xFF000000)
                )
            }
        }
        Row (
            modifier = Modifier.padding(5.dp)
        ) {
            Box (
                modifier = Modifier.fillMaxWidth(0.12F)
            ) {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = null,
                    tint = Color(0xCC005500)
                )
            }
            Box (
                modifier = Modifier.fillMaxWidth(0.5F)
            ) {
                Text(
                    text = correo,
                    color = Color(0xFF000000)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetaPresentacionTheme {
        Presentacion(
            "Diego Quiñonez",
            "+51 987654321",
            "@DiegoQF",
            "diego@gmail.com"
        )
    }
}