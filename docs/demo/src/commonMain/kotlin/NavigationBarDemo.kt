// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.basic.Card
import io.github.a1b2d56.opaline.basic.FloatingNavigationBar
import io.github.a1b2d56.opaline.basic.FloatingNavigationBarItem
import io.github.a1b2d56.opaline.basic.NavigationBar
import io.github.a1b2d56.opaline.basic.NavigationBarItem
import io.github.a1b2d56.opaline.basic.NavigationItem
import io.github.a1b2d56.opaline.basic.Scaffold
import io.github.a1b2d56.opaline.basic.Text
import io.github.a1b2d56.opaline.icon.OpalineIcons
import io.github.a1b2d56.opaline.icon.system.Contacts
import io.github.a1b2d56.opaline.icon.system.Settings
import io.github.a1b2d56.opaline.icon.system.SplitVertical
import io.github.a1b2d56.opaline.theme.OpalineTheme

@Composable
fun NavigationBarDemo() {
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
                val pages = listOf("Home", "Profile", "Settings")
                val items = listOf(
                    NavigationItem("Home", OpalineIcons.System.SplitVertical),
                    NavigationItem("Profile", OpalineIcons.System.Contacts),
                    NavigationItem("Settings", OpalineIcons.System.Settings),
                )
                var selectedIndex1 by remember { mutableIntStateOf(0) }
                var selectedIndex2 by remember { mutableIntStateOf(0) }
                Card(
                    modifier = Modifier.weight(0.5f),
                ) {
                    Scaffold(
                        bottomBar = {
                            NavigationBar {
                                items.forEachIndexed { index, item ->
                                    NavigationBarItem(
                                        selected = selectedIndex1 == index,
                                        onClick = { selectedIndex1 = index },
                                        icon = item.icon,
                                        label = item.label,
                                    )
                                }
                            }
                        },
                    ) { paddingValues ->
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(paddingValues),
                            contentAlignment = Alignment.Center,
                        ) {
                            Text(
                                text = "Current: ${pages[selectedIndex1]}",
                                style = OpalineTheme.textStyles.title1,
                            )
                        }
                    }
                }
                Card(
                    modifier = Modifier.weight(0.5f),
                ) {
                    Scaffold(
                        bottomBar = {
                            FloatingNavigationBar {
                                items.forEachIndexed { index, item ->
                                    FloatingNavigationBarItem(
                                        selected = selectedIndex2 == index,
                                        onClick = { selectedIndex2 = index },
                                        icon = item.icon,
                                        label = item.label,
                                    )
                                }
                            }
                        },
                    ) { paddingValues ->
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(paddingValues),
                            contentAlignment = Alignment.Center,
                        ) {
                            Text(
                                text = "Current: ${pages[selectedIndex2]}",
                                style = OpalineTheme.textStyles.title1,
                            )
                        }
                    }
                }
            }
        }
    }
}
