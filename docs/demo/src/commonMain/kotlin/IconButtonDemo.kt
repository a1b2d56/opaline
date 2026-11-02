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
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.basic.Card
import io.github.a1b2d56.opaline.basic.Icon
import io.github.a1b2d56.opaline.basic.IconButton
import io.github.a1b2d56.opaline.icon.OpalineIcons
import io.github.a1b2d56.opaline.icon.extended.Favorites
import io.github.a1b2d56.opaline.icon.extended.More
import io.github.a1b2d56.opaline.theme.OpalineTheme

@Composable
fun IconButtonDemo() {
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
                insideMargin = PaddingValues(16.dp),
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(32.dp),
                ) {
                    IconButton(
                        modifier = Modifier,
                        onClick = {},
                    ) {
                        Icon(
                            imageVector = OpalineIcons.More,
                            tint = OpalineTheme.colorScheme.onBackground,
                            contentDescription = "More",
                        )
                    }
                    IconButton(
                        modifier = Modifier,
                        onClick = {},
                    ) {
                        Icon(
                            imageVector = OpalineIcons.Favorites,
                            contentDescription = "Favorites",
                        )
                    }
                    IconButton(
                        modifier = Modifier,
                        onClick = {},
                        enabled = false,
                    ) {
                        Icon(
                            imageVector = OpalineIcons.More,
                            tint = OpalineTheme.colorScheme.disabledOnSecondaryVariant,
                            contentDescription = "More",
                        )
                    }
                    IconButton(
                        modifier = Modifier,
                        onClick = {},
                        enabled = false,
                    ) {
                        Icon(
                            imageVector = OpalineIcons.Favorites,
                            tint = OpalineTheme.colorScheme.disabledOnSecondaryVariant,
                            contentDescription = "Favorites",
                        )
                    }
                }
            }
        }
    }
}
