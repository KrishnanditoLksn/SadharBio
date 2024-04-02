package app.dito.sadhar_bio.components.image_drawable

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun CustomImages(
    @DrawableRes imageId: Int,
    imageDescription: String,
    modifier: Modifier
) {
    Image(
        painter = painterResource(id = imageId),
        contentDescription = imageDescription,
        modifier = modifier
    )
}