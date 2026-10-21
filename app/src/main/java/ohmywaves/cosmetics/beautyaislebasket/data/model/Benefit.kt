package ohmywaves.cosmetics.beautyaislebasket.data.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Shield
import androidx.compose.material.icons.rounded.Verified
import androidx.compose.ui.graphics.vector.ImageVector

data class Benefit(
    val icon: ImageVector,
    val text: String,
)

val productBenefits = listOf<Benefit>(
    Benefit(
        icon = Icons.Rounded.Verified,
        text = "Trusted beauty quality",
    ),
    Benefit(
        icon = Icons.Rounded.Shield,
        text = "30-day warranty",
    ),
    Benefit(
        icon = Icons.Rounded.Favorite,
        text = "Daily care essentials",
    ),
)
