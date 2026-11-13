// Copyright 2026, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.basic.Card
import io.github.a1b2d56.opaline.basic.DropdownEntry
import io.github.a1b2d56.opaline.basic.DropdownItem
import io.github.a1b2d56.opaline.basic.Icon
import io.github.a1b2d56.opaline.basic.Scaffold
import io.github.a1b2d56.opaline.basic.SmallTopAppBar
import io.github.a1b2d56.opaline.basic.Text
import io.github.a1b2d56.opaline.icon.OpalineIcons
import io.github.a1b2d56.opaline.icon.system.Edit
import io.github.a1b2d56.opaline.icon.system.MoreVertical
import io.github.a1b2d56.opaline.icon.system.SelectAll
import io.github.a1b2d56.opaline.icon.system.Sort
import io.github.a1b2d56.opaline.menu.OverlayIconDropdownMenu
import io.github.a1b2d56.opaline.theme.OpalineTheme

@Composable
fun OverlayIconDropdownMenuDemo() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(demoBackground()),
        contentAlignment = Alignment.Center,
    ) {
        var lastAction by remember { mutableStateOf("None") }
        var sortIndex by remember { mutableIntStateOf(0) }
        val sortLabels = listOf("Name", "Date", "Size")
        var multiSelected by remember { mutableStateOf(setOf("Photos")) }

        val actionEntry = DropdownEntry(
            items = listOf("Edit", "Duplicate", "Share", "Delete").map { text ->
                DropdownItem(text = text, onClick = { lastAction = text })
            },
        )
        val sortEntry = DropdownEntry(
            items = sortLabels.mapIndexed { index, text ->
                DropdownItem(
                    text = text,
                    selected = sortIndex == index,
                    onClick = { sortIndex = index },
                )
            },
        )
        val multiSelectEntry = DropdownEntry(
            items = listOf("Photos", "Videos", "Files").map { text ->
                DropdownItem(
                    text = text,
                    selected = text in multiSelected,
                    onClick = {
                        multiSelected = if (text in multiSelected) {
                            multiSelected - text
                        } else {
                            multiSelected + text
                        }
                    },
                )
            },
        )
        val emptyEntry = DropdownEntry(items = listOf(DropdownItem(text = "Option 1")))

        Card(modifier = Modifier.padding(16.dp).widthIn(max = 600.dp).fillMaxWidth()) {
            Scaffold(
                topBar = {
                    SmallTopAppBar(
                        title = "Inbox",
                        actions = {
                            OverlayIconDropdownMenu(entry = actionEntry) {
                                Icon(
                                    imageVector = OpalineIcons.System.Edit,
                                    tint = OpalineTheme.colorScheme.onBackground,
                                    contentDescription = "Action menu",
                                )
                            }
                            OverlayIconDropdownMenu(entry = sortEntry) {
                                Icon(
                                    imageVector = OpalineIcons.System.Sort,
                                    tint = OpalineTheme.colorScheme.onBackground,
                                    contentDescription = "Sort",
                                )
                            }
                            OverlayIconDropdownMenu(
                                entry = multiSelectEntry,
                                collapseOnSelection = false,
                            ) {
                                Icon(
                                    imageVector = OpalineIcons.System.SelectAll,
                                    tint = OpalineTheme.colorScheme.onBackground,
                                    contentDescription = "Multiple selection",
                                )
                            }
                            OverlayIconDropdownMenu(
                                entry = emptyEntry,
                                enabled = false,
                            ) {
                                Icon(
                                    imageVector = OpalineIcons.System.MoreVertical,
                                    tint = OpalineTheme.colorScheme.disabledOnSecondaryVariant,
                                    contentDescription = "More",
                                )
                            }
                        },
                    )
                },
            ) { padding ->
                LazyColumn(
                    contentPadding = PaddingValues(top = padding.calculateTopPadding()),
                ) {
                    item {
                        Spacer(Modifier.height(8.dp))
                        Column(
                            modifier = Modifier.padding(horizontal = 16.dp),
                            verticalArrangement = Arrangement.spacedBy(4.dp),
                        ) {
                            Text(text = "Last action: $lastAction")
                            Text(text = "Sort by: ${sortLabels[sortIndex]}")
                            Text(
                                text = "Selected: " +
                                    multiSelected.joinToString().ifEmpty { "None" },
                            )
                        }
                    }
                }
            }
        }
    }
}
