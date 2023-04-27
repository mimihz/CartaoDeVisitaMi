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
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartaodevisitami.ui.theme.CartaoDeVisitaMiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaoDeVisitaMiTheme{
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ){
                    PlanoDeFundo()
                }
            }
        }
    }
}
@Preview
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
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(bottom = 40.dp)

    ) {
        Contato(
            painter = painterResource(id = R.drawable.gmaillilas),
            text = "michelleluiza0902@gmail.com"
        )

        Contato(
            painter = painterResource(id = R.drawable.icone_de_telefone),
            text = "(11) 93397-5551"
        )

        Contato(
            painter = painterResource(id = R.drawable.instagram),
            text = "chelle_17_"
        )

    }
}

@Composable
fun Contato(painter: Painter, text:String) {
    Row() {
        Image(
            painter =painter,
            contentDescription = null,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )

        Text(
            text = text,
            fontSize = 22.sp,
            color = Color.White,
            textAlign = TextAlign.Left,
            fontFamily = FontFamily.Monospace,
            modifier = Modifier
                .padding(start = 9.dp)

        )

    }
}

@Composable
fun Cabecalho() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
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