// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.basic.Card
import io.github.a1b2d56.opaline.basic.Icon
import io.github.a1b2d56.opaline.basic.IconButton
import io.github.a1b2d56.opaline.basic.OpalineScrollBehavior
import io.github.a1b2d56.opaline.basic.Scaffold
import io.github.a1b2d56.opaline.basic.SmallTopAppBar
import io.github.a1b2d56.opaline.basic.TopAppBar
import io.github.a1b2d56.opaline.icon.OpalineIcons
import io.github.a1b2d56.opaline.icon.extended.Back
import io.github.a1b2d56.opaline.icon.extended.More
import io.github.a1b2d56.opaline.preference.ArrowPreference

@Composable
fun TopAppBarDemo() {
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
                    val scrollBehavior = OpalineScrollBehavior()
                    Scaffold(
                        topBar = {
                            TopAppBar(
                                title = "Title",
                                largeTitle = "Large Title", // If not specified, title value will be used
                                scrollBehavior = scrollBehavior,
                                navigationIcon = {
                                    IconButton(
                                        onClick = { /* Handle click event */ },
                                    ) {
                                        Icon(
                                            OpalineIcons.Back,
                                            contentDescription = "Back",
                                        )
                                    }
                                },
                                actions = {
                                    IconButton(
                                        onClick = { /* Handle click event */ },
                                    ) {
                                        Icon(
                                            OpalineIcons.More,
                                            contentDescription = "More",
                                        )
                                    }
                                },
                            )
                        },
                    ) { paddingValues ->
                        LazyColumn(
                            modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
                            contentPadding = PaddingValues(top = paddingValues.calculateTopPadding()),
                        ) {
                            item {
                                Spacer(Modifier.height(8.dp))
                            }
                            items(100) {
                                Card(
                                    modifier = Modifier
                                        .padding(horizontal = 16.dp)
                                        .padding(bottom = 8.dp),
                                ) {
                                    ArrowPreference(
                                        title = "Something",
                                    )
                                }
                            }
                        }
                    }
                }
                Card(
                    modifier = Modifier.weight(0.5f),
                ) {
                    Scaffold(
                        topBar = {
                            SmallTopAppBar(
                                title = "Title",
                                navigationIcon = {
                                    IconButton(
                                        onClick = { /* Handle click event */ },
                                    ) {
                                        Icon(
                                            OpalineIcons.Back,
                                            contentDescription = "Back",
                                        )
                                    }
                                },
                                actions = {
                                    IconButton(
                                        onClick = { /* Handle click event */ },
                                    ) {
                                        Icon(
                                            OpalineIcons.More,
                                            contentDescription = "More",
                                        )
                                    }
                                },
                            )
                        },
                    ) { paddingValues ->
                        LazyColumn(
                            contentPadding = PaddingValues(top = paddingValues.calculateTopPadding()),
                        ) {
                            item {
                                Spacer(Modifier.height(8.dp))
                            }
                            items(100) {
                                Card(
                                    modifier = Modifier
                                        .padding(horizontal = 16.dp)
                                        .padding(bottom = 8.dp),
                                ) {
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
}
