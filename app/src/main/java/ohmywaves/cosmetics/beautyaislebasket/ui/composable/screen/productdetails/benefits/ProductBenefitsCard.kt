package ohmywaves.cosmetics.beautyaislebasket.ui.composable.screen.productdetails.benefits

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import ohmywaves.cosmetics.beautyaislebasket.data.model.Benefit
import ohmywaves.cosmetics.beautyaislebasket.ui.theme.LocalDimens
import ohmywaves.cosmetics.beautyaislebasket.ui.theme.cardBorderStroke

private val BenefitIconSize = 22.dp

@Composable
fun ProductBenefitsCard(benefits: List<Benefit>, modifier: Modifier = Modifier) {
    val dimens = LocalDimens.current

    Card(
        modifier = modifier,
        shape = RoundedCornerShape(dimens.cardCornerRadius),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.tertiaryContainer,
            contentColor = MaterialTheme.colorScheme.onTertiaryContainer,
        ),
        border = cardBorderStroke(color = MaterialTheme.colorScheme.onTertiaryContainer),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimens.cardPadding),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            benefits.forEach { benefit ->
                ProductBenefitItem(
                    benefit = benefit,
                    modifier = Modifier.weight(1f),
                )
            }
        }
    }
}

@Composable
private fun ProductBenefitItem(
    benefit: Benefit,
    modifier: Modifier = Modifier,
) {
    val dimens = LocalDimens.current

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Icon(
            imageVector = benefit.icon,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.tertiary,
            modifier = Modifier.size(BenefitIconSize),
        )

        Spacer(modifier = Modifier.height(dimens.tightSpacing))

        Text(
            text = benefit.text,
            color = MaterialTheme.colorScheme.onTertiaryContainer,
            style = MaterialTheme.typography.labelSmall,
            textAlign = TextAlign.Center,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
        )
    }
}
