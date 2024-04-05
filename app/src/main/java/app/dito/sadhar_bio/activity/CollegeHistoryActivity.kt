package app.dito.sadhar_bio.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.dito.sadhar_bio.R
import app.dito.sadhar_bio.components.image_drawable.CustomImages

class CollegeHistoryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface {
                RedirectToMainMenu(appComponent = this, modifier = Modifier)
            }
        }
    }
}

@Composable
fun RedirectToMainMenu(appComponent: ComponentActivity, modifier: Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CollegeHistoryContent(modifier = modifier)
        Text(
            text = "Ide untuk mendirikan Perguruan Tinggi Pendidikan Guru (PTPG) oleh Prof. Moh. Yamin, S.H. (Menteri Pendidikan, Pengajaran, dan Kebudayaan RI) pada tahun 1950-an disambut baik oleh para imam Katolik, terutama Ordo Societas Jesus (Serikat Yesus yang lazim disingkat S.J.). \nWaktu itu Ordo ini telah membuka kursus-kursus B1, \nantara lain B1 Mendidik (Yayasan De Britto) di Yogyakarta yang dikelola oleh Pater H. Loeff, S.J.\n dan B1 Bahasa Inggris (Yayasan Loyola) di Semarang yang dikelola oleh pater W.J. Van der Meulen, S.J. dan Pater H. Bastiaanse, S.J. ",
            fontSize = 20.sp,
            fontWeight = FontWeight(400),
            color = Color(0xFF000000)
        )
        Spacer(modifier = modifier.size(20.dp))
        Button(
            onClick = {
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
        Spacer(modifier = modifier.size(30.dp))
        Text(
            text = "PTPG Sanata Dharma (1955 - 1995)",
        )
        Spacer(modifier = modifier.size(70.dp))
        CustomImages(
            imageId = R.drawable.usd,
            imageDescription = "usd",
            modifier = modifier
                .fillMaxWidth()
                .size(150.dp)
                .width(200.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HistoryContentPreview() {
    CollegeHistoryContent(modifier = Modifier)
}