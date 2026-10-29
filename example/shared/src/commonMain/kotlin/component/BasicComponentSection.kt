// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package component

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.basic.BasicComponent
import io.github.a1b2d56.opaline.basic.Card
import io.github.a1b2d56.opaline.basic.HorizontalDivider
import io.github.a1b2d56.opaline.basic.SmallTitle
import io.github.a1b2d56.opaline.basic.Text
import io.github.a1b2d56.opaline.theme.OpalineTheme

fun LazyListScope.basicComponentSection() {
    item(key = "basicComponent") {
        SmallTitle(text = "Basic Component")
        Card(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .padding(bottom = 16.dp),
        ) {
            BasicComponent(
                title = "Title",
                summary = "Summary",
                startAction = {
                    Text(
                        text = "Start",
                    )
                },
                endActions = {
                    Text(
                        text = "End1",
                        fontSize = OpalineTheme.textStyles.body2.fontSize,
                        color = OpalineTheme.colorScheme.onSurfaceVariantActions,
                    )
                    Spacer(Modifier.width(8.dp))
                    Text(
                        text = "End2",
                        fontSize = OpalineTheme.textStyles.body2.fontSize,
                        color = OpalineTheme.colorScheme.onSurfaceVariantActions,
                    )
                },
                enabled = true,
            )
            HorizontalDivider(Modifier.padding(horizontal = 16.dp))
            BasicComponent(
                title = "Title",
                summary = "Summary",
                startAction = {
                    Text(
                        text = "Start",
                        color = OpalineTheme.colorScheme.disabledOnSecondaryVariant,
                    )
                },
                endActions = {
                    Text(
                        text = "End1",
                        fontSize = OpalineTheme.textStyles.body2.fontSize,
                        color = OpalineTheme.colorScheme.disabledOnSecondaryVariant,
                    )
                    Spacer(Modifier.width(8.dp))
                    Text(
                        text = "End2",
                        fontSize = OpalineTheme.textStyles.body2.fontSize,
                        color = OpalineTheme.colorScheme.disabledOnSecondaryVariant,
                    )
                },
                enabled = false,
            )
        }
    }
}
