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
import io.github.a1b2d56.opaline.basic.TextButton
import io.github.a1b2d56.opaline.icon.OpalineIcons
import io.github.a1b2d56.opaline.icon.system.Cancel
import io.github.a1b2d56.opaline.icon.system.Done
import io.github.a1b2d56.opaline.preference.SwitchPreference
import io.github.a1b2d56.opaline.theme.LocalDismissState
import io.github.a1b2d56.opaline.theme.OpalineTheme
import io.github.a1b2d56.opaline.window.WindowBottomSheet

@Composable
fun WindowBottomSheetDemo() {
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
                    text = "Show a WindowBottomSheet",
                    onClick = { showBottomSheet = true },
                )
                WindowBottomSheet(
                    show = showBottomSheet,
                    title = "WindowBottomSheet Title",
                    startAction = {
                        val dismiss = LocalDismissState.current
                        IconButton(onClick = { dismiss?.invoke() }) {
                            Icon(
                                imageVector = OpalineIcons.System.Cancel,
                                contentDescription = "Cancel",
                                tint = OpalineTheme.colorScheme.onBackground,
                            )
                        }
                    },
                    endAction = {
                        val dismiss = LocalDismissState.current
                        IconButton(onClick = { dismiss?.invoke() }) {
                            Icon(
                                imageVector = OpalineIcons.System.Done,
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
