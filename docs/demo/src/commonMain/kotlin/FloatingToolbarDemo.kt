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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.basic.Card
import io.github.a1b2d56.opaline.basic.FloatingToolbar
import io.github.a1b2d56.opaline.basic.Icon
import io.github.a1b2d56.opaline.basic.IconButton
import io.github.a1b2d56.opaline.basic.Scaffold
import io.github.a1b2d56.opaline.basic.ToolbarPosition
import io.github.a1b2d56.opaline.icon.OpalineIcons
import io.github.a1b2d56.opaline.icon.system.Delete
import io.github.a1b2d56.opaline.icon.system.Edit
import io.github.a1b2d56.opaline.preference.ArrowPreference
import io.github.a1b2d56.opaline.theme.OpalineTheme

@Composable
fun FloatingToolbarDemo() {
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
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                Card(
                    modifier = Modifier.weight(0.5f),
                ) {
                    Scaffold(
                        floatingToolbar = {
                            FloatingToolbar {
                                Row(
                                    modifier = Modifier.padding(8.dp),
                                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                                ) {
                                    // or Column
                                    IconButton(onClick = { /* Action 1 */ }) {
                                        Icon(
                                            imageVector = OpalineIcons.System.Edit,
                                            contentDescription = "Edit",
                                            tint = OpalineTheme.colorScheme.onBackground,
                                        )
                                    }
                                    IconButton(onClick = { /* Action 2 */ }) {
                                        Icon(
                                            imageVector = OpalineIcons.System.Delete,
                                            contentDescription = "Delete",
                                            tint = OpalineTheme.colorScheme.onBackground,
                                        )
                                    }
                                }
                            }
                        },
                    ) { paddingValues ->
                        LazyColumn(
                            contentPadding = PaddingValues(top = paddingValues.calculateTopPadding()),
                        ) {
                            items(100) {
                                ArrowPreference(
                                    title = "Something",
                                )
                            }
                        }
                    }
                }
                Card(
                    modifier = Modifier.weight(0.5f),
                ) {
                    Scaffold(
                        floatingToolbar = {
                            FloatingToolbar {
                                Row(
                                    modifier = Modifier.padding(8.dp),
                                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                                ) {
                                    // or Column
                                    IconButton(onClick = { /* Action 1 */ }) {
                                        Icon(
                                            imageVector = OpalineIcons.System.Edit,
                                            contentDescription = "Edit",
                                            tint = OpalineTheme.colorScheme.onBackground,
                                        )
                                    }
                                    IconButton(onClick = { /* Action 2 */ }) {
                                        Icon(
                                            imageVector = OpalineIcons.System.Delete,
                                            contentDescription = "Delete",
                                            tint = OpalineTheme.colorScheme.onBackground,
                                        )
                                    }
                                }
                            }
                        },
                        floatingToolbarPosition = ToolbarPosition.BottomEnd,
                    ) { paddingValues ->
                        LazyColumn(
                            contentPadding = PaddingValues(top = paddingValues.calculateTopPadding()),
                        ) {
                            items(100) {
                                ArrowPreference(
                                    title = "Something",
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
