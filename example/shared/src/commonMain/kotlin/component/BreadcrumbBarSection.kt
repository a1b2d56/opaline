// Copyright 2026, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.basic.BreadcrumbBar
import io.github.a1b2d56.opaline.basic.BreadcrumbItem
import io.github.a1b2d56.opaline.basic.Card
import io.github.a1b2d56.opaline.basic.SmallTitle
import io.github.a1b2d56.opaline.basic.Text
import io.github.a1b2d56.opaline.basic.joinToPath
import io.github.a1b2d56.opaline.theme.OpalineTheme

fun LazyListScope.breadcrumbBarSection() {
    item(key = "breadcrumbBar") {
        SmallTitle(text = "BreadcrumbBar")
        val items = remember {
            listOf(
                BreadcrumbItem(
                    path = "/storage/emulated/0",
                    text = "Internal storage",
                ),
                BreadcrumbItem(path = "DataBackup"),
                BreadcrumbItem(path = "apps"),
                BreadcrumbItem(path = "com.tencent.mobileqq"),
                BreadcrumbItem(path = "user_0"),
            )
        }
        var highlightIndex by remember { mutableIntStateOf(items.size - 1) }

        BreadcrumbBar(
            items = items,
            onItemClick = { index -> highlightIndex = index },
            highlightIndex = highlightIndex,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp)
                .padding(bottom = 12.dp),
        )
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp)
                .padding(bottom = 12.dp),
            insideMargin = PaddingValues(16.dp),
        ) {
            Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                BreadcrumbBar(
                    items = items,
                    onItemClick = { index -> highlightIndex = index },
                    highlightIndex = highlightIndex,
                    modifier = Modifier.fillMaxWidth(),
                )
                Text(
                    text = "Full path: ${items.joinToPath()}",
                    color = OpalineTheme.colorScheme.onSurfaceVariantSummary,
                )
                Text(
                    text = "Current: ${items.subList(0, highlightIndex + 1).joinToPath()}",
                    color = OpalineTheme.colorScheme.onSurfaceVariantSummary,
                )
                BreadcrumbBar(
                    items = items,
                    onItemClick = {},
                    modifier = Modifier.fillMaxWidth(),
                    enabled = false,
                )
            }
        }
    }
}
