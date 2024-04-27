package app.dito.sadhar_bio.activity

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

class ChancellorListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RedirectToMainMenu(appComponent = this)
        }
    }
}

@Composable
fun RedirectToMainMenu(appComponent: ComponentActivity) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            Intent(appComponent.applicationContext, MainMenuActivity::class.java).apply {
                appComponent.startActivity(this)
            }
        }) {
            Text(text = "Balik")
        }
    }
}

//@Composable
//fun ChancellorList() {
//    Column {
//
//    }
//}
//
