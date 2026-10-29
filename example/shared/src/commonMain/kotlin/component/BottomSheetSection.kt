// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.captionBar
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.basic.Card
import io.github.a1b2d56.opaline.basic.CardDefaults
import io.github.a1b2d56.opaline.basic.HorizontalDivider
import io.github.a1b2d56.opaline.basic.Icon
import io.github.a1b2d56.opaline.basic.IconButton
import io.github.a1b2d56.opaline.basic.SmallTitle
import io.github.a1b2d56.opaline.basic.TextField
import io.github.a1b2d56.opaline.icon.OpalineIcons
import io.github.a1b2d56.opaline.icon.extended.Close
import io.github.a1b2d56.opaline.icon.extended.Ok
import io.github.a1b2d56.opaline.overlay.OverlayBottomSheet
import io.github.a1b2d56.opaline.preference.ArrowPreference
import io.github.a1b2d56.opaline.preference.OverlayDropdownPreference
import io.github.a1b2d56.opaline.preference.SliderPreference
import io.github.a1b2d56.opaline.preference.SwitchPreference
import io.github.a1b2d56.opaline.preference.WindowDropdownPreference
import io.github.a1b2d56.opaline.theme.LocalDismissState
import io.github.a1b2d56.opaline.theme.OpalineTheme
import io.github.a1b2d56.opaline.utils.overScrollVertical
import io.github.a1b2d56.opaline.utils.scrollEndHaptic
import io.github.a1b2d56.opaline.window.WindowBottomSheet

private val BottomSheetDropdownOptions = listOf("Option 1", "Option 2")

fun LazyListScope.bottomSheetSection() {
    item(key = "bottomSheet") {
        var showSuperBottomSheet by remember { mutableStateOf(false) }
        var showWindowBottomSheet by remember { mutableStateOf(false) }
        var superBottomSheetHoldDown by remember { mutableStateOf(false) }
        var windowBottomSheetHoldDown by remember { mutableStateOf(false) }
        var bottomSheetDropdownSelectedOption by remember { mutableIntStateOf(0) }
        var bottomSheetSuperSwitchState by remember { mutableStateOf(true) }

        SmallTitle(text = "BottomSheet")
        Card(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .padding(bottom = 16.dp),
        ) {
            ArrowPreference(
                title = "BottomSheet (O)",
                summary = "Click to show an OverlayBottomSheet",
                onClick = {
                    showSuperBottomSheet = true
                    superBottomSheetHoldDown = true
                },
                holdDownState = superBottomSheetHoldDown,
            )
            HorizontalDivider(Modifier.padding(horizontal = 16.dp))
            ArrowPreference(
                title = "BottomSheet (W)",
                summary = "Click to show a WindowBottomSheet",
                onClick = {
                    showWindowBottomSheet = true
                    windowBottomSheetHoldDown = true
                },
                holdDownState = windowBottomSheetHoldDown,
            )
        }

        SuperBottomSheetDemo(
            show = showSuperBottomSheet,
            onDismissRequest = { showSuperBottomSheet = false },
            dropdownSelectedIndex = bottomSheetDropdownSelectedOption,
            onDropdownSelectedIndexChange = { bottomSheetDropdownSelectedOption = it },
            switchChecked = bottomSheetSuperSwitchState,
            onSwitchCheckedChange = { bottomSheetSuperSwitchState = it },
            onDismissFinished = { superBottomSheetHoldDown = false },
        )
        WindowBottomSheetDemo(
            show = showWindowBottomSheet,
            onDismissRequest = { showWindowBottomSheet = false },
            dropdownSelectedIndex = bottomSheetDropdownSelectedOption,
            onDropdownSelectedIndexChange = { bottomSheetDropdownSelectedOption = it },
            switchChecked = bottomSheetSuperSwitchState,
            onSwitchCheckedChange = { bottomSheetSuperSwitchState = it },
            onDismissFinished = { windowBottomSheetHoldDown = false },
        )
    }
}

@Composable
private fun SuperBottomSheetDemo(
    show: Boolean,
    onDismissRequest: () -> Unit,
    dropdownSelectedIndex: Int,
    onDropdownSelectedIndexChange: (Int) -> Unit,
    switchChecked: Boolean,
    onSwitchCheckedChange: (Boolean) -> Unit,
    onDismissFinished: () -> Unit,
) {
    var allowDismiss by remember { mutableStateOf(true) }
    var enableNestedScroll by remember { mutableStateOf(true) }

    OverlayBottomSheet(
        title = "BottomSheet (O)",
        show = show,
        allowDismiss = allowDismiss,
        enableNestedScroll = enableNestedScroll,
        onDismissRequest = onDismissRequest,
        onDismissFinished = onDismissFinished,
        startAction = {
            IconButton(
                onClick = onDismissRequest,
            ) {
                Icon(
                    imageVector = OpalineIcons.Close,
                    contentDescription = "Cancel",
                    tint = OpalineTheme.colorScheme.onBackground,
                )
            }
        },
        endAction = {
            IconButton(
                onClick = onDismissRequest,
            ) {
                Icon(
                    imageVector = OpalineIcons.Ok,
                    contentDescription = "Confirm",
                    tint = OpalineTheme.colorScheme.onBackground,
                )
            }
        },
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxWidth()
                .scrollEndHaptic()
                .overScrollVertical(),
        ) {
            item {
                SmallTitle(
                    text = "Behavior Settings",
                    insideMargin = PaddingValues(16.dp, 8.dp),
                )
                Card(
                    modifier = Modifier.padding(bottom = 12.dp),
                    colors = CardDefaults.defaultColors(
                        color = OpalineTheme.colorScheme.secondaryContainer,
                    ),
                ) {
                    SwitchPreference(
                        title = "Allow Dismiss",
                        summary = "Drag or Back to dismiss",
                        checked = allowDismiss,
                        onCheckedChange = { allowDismiss = it },
                    )
                    HorizontalDivider(Modifier.padding(horizontal = 16.dp))
                    SwitchPreference(
                        title = "Enable NestedScroll",
                        summary = "Scroll content vs Drag sheet",
                        checked = enableNestedScroll,
                        onCheckedChange = { enableNestedScroll = it },
                    )
                }
            }
            item {
                var sliderValue by remember { mutableFloatStateOf(0.5f) }
                SliderPreference(
                    title = "Slider",
                    value = sliderValue,
                    onValueChange = { sliderValue = it },
                    modifier = Modifier.padding(bottom = 12.dp),
                )
                var textFieldValue by remember { mutableStateOf("") }
                TextField(
                    value = textFieldValue,
                    onValueChange = { textFieldValue = it },
                    label = "TextField",
                    modifier = Modifier.padding(bottom = 12.dp),
                )
                Card(
                    modifier = Modifier.padding(bottom = 12.dp),
                    colors = CardDefaults.defaultColors(
                        color = OpalineTheme.colorScheme.secondaryContainer,
                    ),
                ) {
                    OverlayDropdownPreference(
                        title = "DropdownPref (O)",
                        items = BottomSheetDropdownOptions,
                        selectedIndex = dropdownSelectedIndex,
                        onSelectedIndexChange = onDropdownSelectedIndexChange,
                    )
                    HorizontalDivider(Modifier.padding(horizontal = 16.dp))
                    SwitchPreference(
                        title = "SwitchPref",
                        checked = switchChecked,
                        onCheckedChange = onSwitchCheckedChange,
                    )
                }
                Spacer(
                    Modifier.padding(
                        bottom = WindowInsets.navigationBars.asPaddingValues().calculateBottomPadding() +
                            WindowInsets.captionBar.asPaddingValues().calculateBottomPadding(),
                    ),
                )
            }
        }
    }
}

@Composable
private fun WindowBottomSheetDemo(
    show: Boolean,
    onDismissRequest: () -> Unit,
    dropdownSelectedIndex: Int,
    onDropdownSelectedIndexChange: (Int) -> Unit,
    switchChecked: Boolean,
    onSwitchCheckedChange: (Boolean) -> Unit,
    onDismissFinished: () -> Unit,
) {
    var allowDismiss by remember { mutableStateOf(true) }
    var enableNestedScroll by remember { mutableStateOf(true) }

    WindowBottomSheet(
        title = "BottomSheet (W)",
        show = show,
        allowDismiss = allowDismiss,
        enableNestedScroll = enableNestedScroll,
        onDismissRequest = onDismissRequest,
        onDismissFinished = onDismissFinished,
        startAction = {
            val dismissState = LocalDismissState.current
            IconButton(
                onClick = { dismissState?.invoke() },
            ) {
                Icon(
                    imageVector = OpalineIcons.Close,
                    contentDescription = "Cancel",
                    tint = OpalineTheme.colorScheme.onBackground,
                )
            }
        },
        endAction = {
            val dismissState = LocalDismissState.current
            IconButton(
                onClick = { dismissState?.invoke() },
            ) {
                Icon(
                    imageVector = OpalineIcons.Ok,
                    contentDescription = "Confirm",
                    tint = OpalineTheme.colorScheme.onBackground,
                )
            }
        },
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxWidth()
                .scrollEndHaptic()
                .overScrollVertical(),
        ) {
            item {
                SmallTitle(
                    text = "Behavior Settings",
                    insideMargin = PaddingValues(16.dp, 8.dp),
                )
                Card(
                    modifier = Modifier.padding(bottom = 12.dp),
                    colors = CardDefaults.defaultColors(
                        color = OpalineTheme.colorScheme.secondaryContainer,
                    ),
                ) {
                    SwitchPreference(
                        title = "Allow Dismiss",
                        summary = "Drag or Back to dismiss",
                        checked = allowDismiss,
                        onCheckedChange = { allowDismiss = it },
                    )
                    HorizontalDivider(Modifier.padding(horizontal = 16.dp))
                    SwitchPreference(
                        title = "Enable NestedScroll",
                        summary = "Scroll content vs Drag sheet",
                        checked = enableNestedScroll,
                        onCheckedChange = { enableNestedScroll = it },
                    )
                }
            }
            item {
                var sliderValue by remember { mutableFloatStateOf(0.5f) }
                SliderPreference(
                    title = "Slider",
                    value = sliderValue,
                    onValueChange = { sliderValue = it },
                    modifier = Modifier.padding(bottom = 12.dp),
                )
                var textFieldValue by remember { mutableStateOf("") }
                TextField(
                    value = textFieldValue,
                    onValueChange = { textFieldValue = it },
                    label = "TextField",
                    modifier = Modifier.padding(bottom = 12.dp),
                )
                Card(
                    modifier = Modifier.padding(bottom = 12.dp),
                    colors = CardDefaults.defaultColors(
                        color = OpalineTheme.colorScheme.secondaryContainer,
                    ),
                ) {
                    WindowDropdownPreference(
                        title = "DropdownPref (W)",
                        items = BottomSheetDropdownOptions,
                        selectedIndex = dropdownSelectedIndex,
                        onSelectedIndexChange = onDropdownSelectedIndexChange,
                    )
                    HorizontalDivider(Modifier.padding(horizontal = 16.dp))
                    SwitchPreference(
                        title = "SwitchPref",
                        checked = switchChecked,
                        onCheckedChange = onSwitchCheckedChange,
                    )
                }
                Spacer(
                    Modifier.padding(
                        bottom = WindowInsets.navigationBars.asPaddingValues().calculateBottomPadding() +
                            WindowInsets.captionBar.asPaddingValues().calculateBottomPadding(),
                    ),
                )
            }
        }
    }
}
