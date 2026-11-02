// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.basic.Card
import io.github.a1b2d56.opaline.basic.FloatingActionButton
import io.github.a1b2d56.opaline.basic.Icon
import io.github.a1b2d56.opaline.basic.NavigationBar
import io.github.a1b2d56.opaline.basic.NavigationBarItem
import io.github.a1b2d56.opaline.basic.NavigationItem
import io.github.a1b2d56.opaline.basic.Scaffold
import io.github.a1b2d56.opaline.basic.SmallTopAppBar
import io.github.a1b2d56.opaline.basic.Text
import io.github.a1b2d56.opaline.icon.OpalineIcons
import io.github.a1b2d56.opaline.icon.extended.Contacts
import io.github.a1b2d56.opaline.icon.extended.Settings
import io.github.a1b2d56.opaline.icon.extended.VerticalSplit
import io.github.a1b2d56.opaline.theme.OpalineTheme

@Composable
fun ScaffoldDemo() {
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
            val pages = listOf("Home", "Profile", "Settings")
            val items = listOf(
                NavigationItem("Home", OpalineIcons.VerticalSplit),
                NavigationItem("Profile", OpalineIcons.Contacts),
                NavigationItem("Settings", OpalineIcons.Settings),
            )
            var selectedIndex by remember { mutableIntStateOf(0) }
            Card {
                Scaffold(
                    topBar = {
                        SmallTopAppBar(
                            title = "SmallTopAppBar",
                        )
                    },
                    bottomBar = {
                        NavigationBar {
                            items.forEachIndexed { index, item ->
                                NavigationBarItem(
                                    selected = selectedIndex == index,
                                    onClick = { selectedIndex = index },
                                    icon = item.icon,
                                    label = item.label,
                                )
                            }
                        }
                    },
                    floatingActionButton = {
                        FloatingActionButton(
                            onClick = {
                                // Handle FAB click
                            },
                        ) {
                            Icon(
                                imageVector = OpalineIcons.Contacts,
                                contentDescription = "Personal",
                                tint = Color.White,
                            )
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
                            text = "Current: ${pages[selectedIndex]}",
                            style = OpalineTheme.textStyles.title1,
                        )
                    }
                }
            }
        }
    }
}
