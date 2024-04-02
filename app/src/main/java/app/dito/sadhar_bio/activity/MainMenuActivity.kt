package app.dito.sadhar_bio.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.dito.sadhar_bio.MainActivity

class MainMenuActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                RedirectToHome(appComponent = this, modifier = Modifier)
            }
        }
    }
}

@Composable
fun RedirectToHome(appComponent: ComponentActivity, modifier: Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = modifier.size(550.dp))
        Button(
            onClick = {

            },
            modifier = modifier
                .size(width = 335.dp, height = 40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFC27B46),
            )
        ) {
            Text(
                text = "Sejarah Universitas Sanata Dharma",
                fontSize = 16.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFFFFFFFF),
            )
        }
        Spacer(modifier = modifier.size(10.dp))
        Button(
            onClick = {

            },
            modifier = modifier
                .size(width = 335.dp, height = 40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFEC6400),
            )
        ) {
            Text(text = "Daftar rektor Universitas Sanata Dharma")
        }
        Spacer(modifier = modifier.size(10.dp))
        Button(
            onClick = {
                Intent(appComponent.applicationContext, MainActivity::class.java).apply {
                    appComponent.startActivity(this)
                }
            },
            modifier = modifier
                .size(width = 335.dp, height = 40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF874412),
            )
        ) {
            Text(text = "Home")
        }
    }
}