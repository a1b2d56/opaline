// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.a1b2d56.opaline.basic.ButtonDefaults
import io.github.a1b2d56.opaline.basic.Card
import io.github.a1b2d56.opaline.basic.SmallTitle
import io.github.a1b2d56.opaline.basic.Text
import io.github.a1b2d56.opaline.basic.TextButton
import io.github.a1b2d56.opaline.overlay.OverlayDialog
import io.github.a1b2d56.opaline.theme.OpalineTheme
import io.github.a1b2d56.opaline.utils.PressFeedbackType

fun LazyListScope.cardSection() {
    item(key = "card") {
        SmallTitle(text = "Card")
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .padding(bottom = 16.dp),
            insideMargin = PaddingValues(16.dp),
            onClick = { println("Card click") },
        ) {
            Text(
                color = OpalineTheme.colorScheme.onSurface,
                text = "Card",
                fontSize = 19.sp,
                fontWeight = FontWeight.SemiBold,
            )
            Text(
                color = OpalineTheme.colorScheme.onSurfaceVariantSummary,
                text = "PressFeedbackType: Tint (default)",
                fontSize = 17.sp,
                fontWeight = FontWeight.Normal,
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            Card(
                modifier = Modifier.weight(1f),
                insideMargin = PaddingValues(16.dp),
                pressFeedbackType = PressFeedbackType.Sink,
                onClick = { println("Card click") },
                content = {
                    Text(
                        color = OpalineTheme.colorScheme.onSurface,
                        text = "Card",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                    )
                    Text(
                        color = OpalineTheme.colorScheme.onSurfaceVariantSummary,
                        text = "PressFeedback\nType: Sink",
                        style = OpalineTheme.textStyles.paragraph,
                    )
                },
            )
            Card(
                modifier = Modifier.weight(1f),
                insideMargin = PaddingValues(16.dp),
                pressFeedbackType = PressFeedbackType.Tilt,
                onLongPress = { println("Card long press") },
                content = {
                    Text(
                        color = OpalineTheme.colorScheme.onSurface,
                        text = "Card",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                    )
                    Text(
                        color = OpalineTheme.colorScheme.onSurfaceVariantSummary,
                        text = "PressFeedback\nType: Tilt",
                        style = OpalineTheme.textStyles.paragraph,
                    )
                },
            )
        }
        LongPressHoldDownCardDemo()
    }
}

@Composable
private fun LongPressHoldDownCardDemo() {
    var showDialog by rememberSaveable { mutableStateOf(false) }
    var holdDown by rememberSaveable { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .padding(bottom = 16.dp),
        insideMargin = PaddingValues(16.dp),
        holdDownState = holdDown,
        onLongPress = {
            showDialog = true
            holdDown = true
        },
        content = {
            Text(
                color = OpalineTheme.colorScheme.onSurface,
                text = "Card",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
            )
            Text(
                color = OpalineTheme.colorScheme.onSurfaceVariantSummary,
                text = "Long press to show dialog",
                style = OpalineTheme.textStyles.paragraph,
            )
        },
    )

    OverlayDialog(
        show = showDialog,
        title = "Long Press Action",
        summary = "Triggered by long pressing the card.",
        onDismissRequest = { showDialog = false },
        onDismissFinished = { holdDown = false },
        content = {
            Row(
                // The dialog content slot is unpadded (COUI button bars span the panel), so
                // COUI assignment-style pill buttons keep 24dp side and bottom margins.
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
                    .padding(bottom = 24.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                TextButton(
                    text = "Cancel",
                    onClick = { showDialog = false },
                    modifier = Modifier.weight(1f),
                )
                Spacer(Modifier.width(20.dp))
                TextButton(
                    text = "Confirm",
                    onClick = { showDialog = false },
                    modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.textButtonColorsPrimary(),
                )
            }
        },
    )
}
