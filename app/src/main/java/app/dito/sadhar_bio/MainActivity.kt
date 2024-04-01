package app.dito.sadhar_bio

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import app.dito.sadhar_bio.activity.MainMenuActivity
import app.dito.sadhar_bio.ui.theme.Sadhar_bioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Sadhar_bioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    SabioApp(appComponent = this)
                }
            }
        }
    }
}

@Composable
fun SabioApp(appComponent: ComponentActivity) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        ElevatedButton(
            onClick = {
                Intent(appComponent.applicationContext, MainMenuActivity::class.java).apply {
                    appComponent.startActivity(this)
                }
            }, colors = ButtonDefaults.buttonColors(
                containerColor = Color.Green
            )
        ) {
            Text(
                text = "Next",
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SabioAppPreview() {

}