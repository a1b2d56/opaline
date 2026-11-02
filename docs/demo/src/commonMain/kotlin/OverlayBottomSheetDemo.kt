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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.basic.Card
import io.github.a1b2d56.opaline.basic.Icon
import io.github.a1b2d56.opaline.basic.IconButton
import io.github.a1b2d56.opaline.basic.Scaffold
import io.github.a1b2d56.opaline.basic.TextButton
import io.github.a1b2d56.opaline.icon.OpalineIcons
import io.github.a1b2d56.opaline.icon.extended.Close
import io.github.a1b2d56.opaline.icon.extended.Ok
import io.github.a1b2d56.opaline.overlay.OverlayBottomSheet
import io.github.a1b2d56.opaline.preference.SwitchPreference
import io.github.a1b2d56.opaline.theme.OpalineTheme

@Composable
fun OverlayBottomSheetDemo() {
    Scaffold {
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
                var showBottomSheet by remember { mutableStateOf(false) }
                var notificationsEnabled by remember { mutableStateOf(true) }
                var soundEnabled by remember { mutableStateOf(false) }

                Card {
                    TextButton(
                        text = "Show a BottomSheet",
                        onClick = { showBottomSheet = true },
                    )
                    OverlayBottomSheet(
                        title = "BottomSheet Title",
                        show = showBottomSheet,
                        startAction = {
                            IconButton(onClick = { showBottomSheet = false }) {
                                Icon(
                                    imageVector = OpalineIcons.Close,
                                    contentDescription = "Cancel",
                                    tint = OpalineTheme.colorScheme.onBackground,
                                )
                            }
                        },
                        endAction = {
                            IconButton(onClick = { showBottomSheet = false }) {
                                Icon(
                                    imageVector = OpalineIcons.Ok,
                                    contentDescription = "Confirm",
                                    tint = OpalineTheme.colorScheme.onBackground,
                                )
                            }
                        },
                        onDismissRequest = { showBottomSheet = false },
                    ) {
                        Card(modifier = Modifier.padding(bottom = 16.dp)) {
                            SwitchPreference(
                                title = "Notifications",
                                summary = "Receive push notifications",
                                checked = notificationsEnabled,
                                onCheckedChange = { notificationsEnabled = it },
                            )
                            SwitchPreference(
                                title = "Sound",
                                summary = "Play sound on notification",
                                checked = soundEnabled,
                                onCheckedChange = { soundEnabled = it },
                            )
                        }
                    }
                }
            }
        }
    }
}
