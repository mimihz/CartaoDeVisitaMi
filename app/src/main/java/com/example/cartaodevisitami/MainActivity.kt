package com.example.cartaodevisitami

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartaodevisitami.ui.theme.CartaoDeVisitaMiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeuUniversoTheme{
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PlanoDeFundo()
                }
            }
        }
    }
}

@Composable
fun PlanoDeFundo(){
    Image(
        painter = painterResource(id = R.drawable.roxooo ),
        contentDescription = null,
        contentScale = ContentScale.Crop
    )
    Cabecalho()
    Rodape()

}

@Composable
fun Rodape() {
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(bottom = 40.dp)

    ) {
        Contato()
        Contato()
        Contato()

    }
}

@Composable
fun Contato() {
    Row() {


        Image(
            painter = painterResource(id = R.drawable.gmaillilas),
            contentDescription = null,
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
        )

        Text(
            text = "(11) 933975551"
        )

    }
}




@Composable
fun Cabecalho() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ceu),
            contentDescription =null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(180.dp)
                .clip(CircleShape)
        )
        Text(
            text = "Michelle Luiza",
            fontSize = 30.sp,
            color = Color.White,
            fontWeight = FontWeight.Medium
        )
        Text(
            text = "Game",
            fontSize = 20.sp,
            color = Color.Blue,
            fontWeight = FontWeight.Medium
        )

    }

}