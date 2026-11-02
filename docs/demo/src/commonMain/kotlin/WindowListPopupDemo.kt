// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.basic.DropdownImpl
import io.github.a1b2d56.opaline.basic.ListPopupColumn
import io.github.a1b2d56.opaline.basic.PopupPositionProvider
import io.github.a1b2d56.opaline.basic.TextButton
import io.github.a1b2d56.opaline.theme.LocalDismissState
import io.github.a1b2d56.opaline.window.WindowListPopup

@Composable
fun WindowListPopupDemo() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(demoBackground()),
        contentAlignment = Alignment.Center,
    ) {
        var showPopup by remember { mutableStateOf(false) }
        var selectedIndex by remember { mutableIntStateOf(0) }
        val items = listOf("Option 1", "Disabled option", "Option 3")
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.TopCenter,
        ) {
            Box {
                TextButton(
                    text = "Show WindowListPopup",
                    onClick = { showPopup = true },
                    modifier = Modifier.padding(top = 16.dp),
                )
                WindowListPopup(
                    show = showPopup,
                    alignment = PopupPositionProvider.Align.TopStart,
                    onDismissRequest = { showPopup = false },
                ) {
                    val dismissState = LocalDismissState.current
                    ListPopupColumn {
                        items.forEachIndexed { index, string ->
                            DropdownImpl(
                                text = string,
                                optionSize = items.size,
                                isSelected = selectedIndex == index,
                                index = index,
                                enabled = index != 1,
                                onSelectedIndexChange = { selectedIdx ->
                                    selectedIndex = selectedIdx
                                    dismissState?.invoke()
                                },
                            )
                        }
                    }
                }
            }
        }
    }
}
