package app.dito.sadhar_bio.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.dito.sadhar_bio.model.Chancellor
import app.dito.sadhar_bio.data.ChancelListDatas

class ChancellorListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface {
                RedirectToMenus(appComponent = this, modifier = Modifier)
            }
        }
    }
}

@Composable
fun RectorList(rectors: List<Chancellor>, modifier: Modifier) {
    LazyColumn(
        modifier = modifier
    ) {
        items(rectors) { rectors ->
            RectorsColumn(rector = rectors, modifier = modifier.padding(4.dp))
        }
    }
}


@Composable
fun RectorsColumn(rector: Chancellor, modifier: Modifier) {
    Column(
        modifier = modifier
    ) {
        Text(text = rector.name)
        Spacer(modifier = modifier.size(4.5.dp))
        Text(text = rector.description)
    }
}


@Composable
fun RedirectToMenus(appComponent: ComponentActivity, modifier: Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        RectorList(rectors = ChancelListDatas().callis, modifier = modifier)
        Spacer(modifier = modifier.size(4.5.dp))
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