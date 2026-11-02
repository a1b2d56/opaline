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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.basic.Card
import io.github.a1b2d56.opaline.basic.FabPosition
import io.github.a1b2d56.opaline.basic.FloatingActionButton
import io.github.a1b2d56.opaline.basic.Icon
import io.github.a1b2d56.opaline.basic.Scaffold
import io.github.a1b2d56.opaline.icon.OpalineIcons
import io.github.a1b2d56.opaline.icon.extended.SelectAll
import io.github.a1b2d56.opaline.preference.ArrowPreference

@Composable
fun FloatingActionButtonDemo() {
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
                        floatingActionButton = {
                            FloatingActionButton(
                                onClick = {
                                    // Handle FAB click
                                },
                            ) {
                                Icon(
                                    imageVector = OpalineIcons.SelectAll,
                                    contentDescription = "SelectAll",
                                    tint = Color.White,
                                )
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
                        floatingActionButton = {
                            FloatingActionButton(
                                onClick = {
                                    // Handle FAB click
                                },
                            ) {
                                Icon(
                                    imageVector = OpalineIcons.SelectAll,
                                    contentDescription = "SelectAll",
                                    tint = Color.White,
                                )
                            }
                        },
                        floatingActionButtonPosition = FabPosition.Center,
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
