package app.dito.sadhar_bio.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.dito.sadhar_bio.R
import app.dito.sadhar_bio.components.image_drawable.CustomImages

class CollegeHistoryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface {
                HistoryContentPreview()
            }
        }
    }
}

@Composable
fun RedirectToMainMenu(appComponent: ComponentActivity) {
    Column {
        CollegeHistoryContent(modifier = Modifier)
        Button(onClick = {
            Intent(appComponent.applicationContext, MainMenuActivity::class.java).apply {
                appComponent.startActivity(this)
            }
        }) {
            Text(text = "Back to Menus")
        }
    }
}

@Composable
fun CollegeHistoryContent(modifier: Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = modifier.size(50.dp))
        Text(text = "PTPG Sanata Dharma (1955 - 1995)")
        Spacer(modifier = Modifier.size(100.dp))
        CustomImages(
            imageId = R.drawable.usd,
            imageDescription = "usd",
            modifier = modifier
        )

    }
}

@Preview(showBackground = true)
@Composable
fun HistoryContentPreview() {
    CollegeHistoryContent(modifier = Modifier)
}