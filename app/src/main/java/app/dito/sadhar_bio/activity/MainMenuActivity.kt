package app.dito.sadhar_bio.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import app.dito.sadhar_bio.MainActivity
import app.dito.sadhar_bio.ui.theme.Sadhar_bioTheme

class MainMenuActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Sadhar_bioTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    RedirectToHome(appComponent = this)
                }
            }
        }
    }
}


@Composable
fun RedirectToHome(appComponent: ComponentActivity) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            Intent(appComponent.applicationContext, MainActivity::class.java).apply {
                appComponent.startActivity(this)
            }
        }) {
            Text(text = "Home")
        }
    }
}