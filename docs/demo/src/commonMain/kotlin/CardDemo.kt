// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.a1b2d56.opaline.basic.Card
import io.github.a1b2d56.opaline.basic.CardDefaults
import io.github.a1b2d56.opaline.basic.Text
import io.github.a1b2d56.opaline.theme.OpalineTheme
import io.github.a1b2d56.opaline.utils.PressFeedbackType

@Composable
fun CardDemo() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(demoBackground()),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            Modifier
                .padding(16.dp)
                .widthIn(max = 600.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp),
                colors = CardDefaults.defaultColors(
                    color = OpalineTheme.colorScheme.primaryVariant,
                ),
                insideMargin = PaddingValues(16.dp),
            ) {
                Text(
                    color = OpalineTheme.colorScheme.onPrimary,
                    text = "Card",
                    fontSize = 19.sp,
                    fontWeight = FontWeight.SemiBold,
                )
                Text(
                    color = OpalineTheme.colorScheme.onPrimaryVariant,
                    text = "This is a Card",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Normal,
                )
            }
            Row(
                modifier = Modifier
                    .padding(horizontal = 12.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                Card(
                    modifier = Modifier.weight(1f),
                    insideMargin = PaddingValues(16.dp),
                    pressFeedbackType = PressFeedbackType.Sink,
                    showIndication = true,
                    onClick = { },
                    content = {
                        Text(
                            color = OpalineTheme.colorScheme.onSurface,
                            text = "Card",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Medium,
                        )
                        Text(
                            color = OpalineTheme.colorScheme.onSurfaceVariantSummary,
                            text = "PressFeedback: Sink\nShowIndication: true",
                            style = OpalineTheme.textStyles.paragraph,
                        )
                    },
                )
                Card(
                    modifier = Modifier.weight(1f),
                    insideMargin = PaddingValues(16.dp),
                    pressFeedbackType = PressFeedbackType.Tilt,
                    content = {
                        Text(
                            color = OpalineTheme.colorScheme.onSurface,
                            text = "Card",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Medium,
                        )
                        Text(
                            color = OpalineTheme.colorScheme.onSurfaceVariantSummary,
                            text = "PressFeedback: Tilt\nShowIndication: false",
                            style = OpalineTheme.textStyles.paragraph,
                        )
                    },
                )
            }
        }
    }
}
