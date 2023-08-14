package io.github.droidkaigi.confsched2023.about.component

import android.content.res.Configuration
import androidx.annotation.DrawableRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.droidkaigi.confsched2023.about.AboutStrings
import io.github.droidkaigi.confsched2023.designsystem.theme.KaigiTheme
import io.github.droidkaigi.confsched2023.feature.about.R

@Composable
fun AboutContentColumn(
    @DrawableRes leadingIconRes: Int,
    label: String,
    testTag: String,
    onClickAction: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .height(73.dp)
            .testTag(testTag)
            .clickable { onClickAction() },
    ) {
        Row(
            modifier = Modifier
                .height(72.dp)
                .align(
                    alignment = Alignment.Start,
                ),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                painter = painterResource(id = leadingIconRes),
                contentDescription = null,
                modifier = Modifier
                    .padding(
                        horizontal = 12.dp,
                    ),
            )
            Text(
                text = label,
                style = MaterialTheme.typography.labelLarge,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        end = 16.dp,
                    ),
            )
        }
        Divider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.outlineVariant,
        )
    }
}

@Preview(locale = "en", uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(locale = "ja", uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun AboutContentColumnPreview() {
    KaigiTheme {
        Surface {
            AboutContentColumn(
                leadingIconRes = R.drawable.ic_sentiment_very_satisfied,
                label = AboutStrings.Staff.asString(),
                testTag = "",
                onClickAction = {},
            )
        }
    }
}

@Preview(locale = "en", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview(locale = "ja", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun AboutContentColumnDarkModePreview() {
    KaigiTheme {
        Surface {
            AboutContentColumn(
                leadingIconRes = R.drawable.ic_sentiment_very_satisfied,
                label = AboutStrings.Staff.asString(),
                testTag = "",
                onClickAction = {},
            )
        }
    }
}
