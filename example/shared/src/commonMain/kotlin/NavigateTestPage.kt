// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
@file:OptIn(ExperimentalScrollBarApi::class)

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.displayCutout
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import component.BackNavigationIcon
import io.github.a1b2d56.opaline.basic.Card
import io.github.a1b2d56.opaline.basic.DropdownImpl
import io.github.a1b2d56.opaline.basic.HorizontalDivider
import io.github.a1b2d56.opaline.basic.Icon
import io.github.a1b2d56.opaline.basic.IconButton
import io.github.a1b2d56.opaline.basic.ListPopupColumn
import io.github.a1b2d56.opaline.basic.ListPopupDefaults
import io.github.a1b2d56.opaline.basic.OpalineScrollBehavior
import io.github.a1b2d56.opaline.basic.PopupPositionProvider
import io.github.a1b2d56.opaline.basic.Scaffold
import io.github.a1b2d56.opaline.basic.Text
import io.github.a1b2d56.opaline.basic.VerticalScrollBar
import io.github.a1b2d56.opaline.basic.rememberScrollBarAdapter
import io.github.a1b2d56.opaline.blur.isRuntimeShaderSupported
import io.github.a1b2d56.opaline.blur.layerBackdrop
import io.github.a1b2d56.opaline.blur.rememberLayerBackdrop
import io.github.a1b2d56.opaline.icon.OpalineIcons
import io.github.a1b2d56.opaline.icon.extended.Edit
import io.github.a1b2d56.opaline.interfaces.ExperimentalScrollBarApi
import io.github.a1b2d56.opaline.preference.ArrowPreference
import io.github.a1b2d56.opaline.theme.LocalDismissState
import io.github.a1b2d56.opaline.theme.OpalineTheme
import io.github.a1b2d56.opaline.window.WindowListPopup
import navigation3.Route
import utils.AdaptiveTopAppBar
import utils.BlurredBar
import utils.pageContentPadding
import utils.pageScrollModifiers
import kotlin.random.Random

private val TopBarPopupItems = listOf("Window 1", "Window 2", "Window 3")

@Composable
fun NavTestPage(
    index: Int,
    padding: PaddingValues,
) {
    val appState = LocalAppState.current
    val isWideScreen = LocalIsWideScreen.current
    val blurSupported = isRuntimeShaderSupported()
    val surfaceColor = OpalineTheme.colorScheme.surface
    val backdrop = if (blurSupported) {
        rememberLayerBackdrop {
            drawRect(surfaceColor)
            drawContent()
        }
    } else {
        null
    }
    val blurActive = appState.enableBlur && blurSupported
    val barColor = if (blurActive) Color.Transparent else OpalineTheme.colorScheme.surface
    val topAppBarScrollBehavior = OpalineScrollBehavior()
    val navigator = LocalNavigator.current

    Scaffold(
        topBar = {
            BlurredBar(backdrop, blurActive) {
                AdaptiveTopAppBar(
                    title = "Navigate Test $index",
                    showTopAppBar = appState.showTopAppBar,
                    isWideScreen = isWideScreen,
                    scrollBehavior = topAppBarScrollBehavior,
                    color = barColor,
                    navigationIcon = {
                        BackNavigationIcon(
                            onClick = { navigator.pop() },
                        )
                    },
                    actions = {
                        TopBarActions()
                    },
                )
            }
        },
    ) { innerPadding ->
        val lazyListState = rememberLazyListState()
        val contentPadding = pageContentPadding(
            innerPadding,
            padding,
            true,
            extraStart = WindowInsets.displayCutout.asPaddingValues().calculateLeftPadding(LayoutDirection.Ltr),
            extraEnd = WindowInsets.displayCutout.asPaddingValues().calculateRightPadding(LayoutDirection.Ltr),
            extraBottom = 12.dp,
        )
        Box(modifier = if (backdrop != null) Modifier.layerBackdrop(backdrop) else Modifier) {
            LazyColumn(
                state = lazyListState,
                modifier = Modifier.pageScrollModifiers(
                    appState.enableScrollEndHaptic,
                    appState.showTopAppBar,
                    topAppBarScrollBehavior,
                ),
                contentPadding = contentPadding,
            ) {
                item(key = "nav_push") {
                    Card(
                        modifier = Modifier
                            .padding(horizontal = 16.dp)
                            .padding(top = 12.dp, bottom = 16.dp),
                    ) {
                        val navigator = LocalNavigator.current
                        ArrowPreference(
                            title = "Push another Navigation Page",
                            onClick = { navigator.push(Route.Navigation(Random.nextLong().toString())) },
                        )
                    }
                }
                item(key = "nav_layout") {
                    Card(
                        modifier = Modifier
                            .padding(horizontal = 16.dp),
                    ) {
                        ArrowPreference(
                            title = "Long Long Long Long Long Title",
                            summary = "Summary",
                            startAction = {
                                Text(text = "Start")
                            },
                            endActions = {
                                Text(text = "End1", textAlign = TextAlign.End)
                                Spacer(Modifier.width(8.dp))
                                Text(text = "End2", textAlign = TextAlign.End)
                            },
                            enabled = true,
                        )
                        HorizontalDivider(Modifier.padding(horizontal = 16.dp))
                        ArrowPreference(
                            title = "Title",
                            summary = "Long Long Long Long Long Summary",
                            startAction = {
                                Text(text = "Start")
                            },
                            endActions = {
                                Text(text = "End1", textAlign = TextAlign.End)
                                Spacer(Modifier.width(8.dp))
                                Text(text = "End2", textAlign = TextAlign.End)
                            },
                            enabled = true,
                        )
                        HorizontalDivider(Modifier.padding(horizontal = 16.dp))
                        ArrowPreference(
                            title = "Title",
                            summary = "Summary",
                            startAction = {
                                Text(text = "Start")
                            },
                            endActions = {
                                Text(
                                    text = "Long Long Long Long Long End",
                                    textAlign = TextAlign.End,
                                )
                            },
                            enabled = true,
                        )
                        HorizontalDivider(Modifier.padding(horizontal = 16.dp))
                        ArrowPreference(
                            title = "Long Long Long Long Long Title",
                            summary = "Summary",
                            startAction = {
                                Text(text = "Start")
                            },
                            endActions = {
                                Text(
                                    text = "Long Long Long Long Long End",
                                    textAlign = TextAlign.End,
                                )
                            },
                            enabled = true,
                        )
                        HorizontalDivider(Modifier.padding(horizontal = 16.dp))
                        ArrowPreference(
                            title = "Title",
                            summary = "Long Long Long Long Long Summary",
                            endActions = {
                                Text(
                                    text = "Long Long Long Long Long End",
                                    textAlign = TextAlign.End,
                                )
                            },
                            enabled = true,
                        )
                        HorizontalDivider(Modifier.padding(horizontal = 16.dp))
                        ArrowPreference(
                            title = "Long Long Long Long Long Title",
                            summary = "Summary",
                            endActions = {
                                Text(text = "Long Long Long Long Long End", textAlign = TextAlign.End)
                            },
                            enabled = true,
                        )
                        HorizontalDivider(Modifier.padding(horizontal = 16.dp))
                        ArrowPreference(
                            title = "Title",
                            summary = "Long Long Long Long Long Summary",
                            endActions = {
                                Text(text = "Long Long Long Long Long End", textAlign = TextAlign.End)
                            },
                            enabled = true,
                        )
                    }
                }
            }
            VerticalScrollBar(
                adapter = rememberScrollBarAdapter(lazyListState),
                modifier = Modifier.align(Alignment.CenterEnd).fillMaxHeight(),
                trackPadding = contentPadding,
            )
        }
    }
}

@Composable
fun TopBarActions() {
    val showTopPopup = remember { mutableStateOf(false) }
    val topPopupHoldDown = remember { mutableStateOf(false) }
    var selectedIndex by remember { mutableIntStateOf(0) }
    val hapticFeedback = LocalHapticFeedback.current
    IconButton(
        onClick = {
            showTopPopup.value = true
            topPopupHoldDown.value = true
        },
        holdDownState = topPopupHoldDown.value,
    ) {
        Icon(
            imageVector = OpalineIcons.Edit,
            contentDescription = "WindowListPopup",
            tint = OpalineTheme.colorScheme.onBackground,
        )
    }
    WindowListPopup(
        show = showTopPopup.value,
        popupPositionProvider = ListPopupDefaults.ContextMenuPositionProvider,
        alignment = PopupPositionProvider.Align.TopEnd,
        onDismissRequest = {
            showTopPopup.value = false
        },
        onDismissFinished = {
            topPopupHoldDown.value = false
        },
        content = {
            val state = LocalDismissState.current
            ListPopupColumn {
                TopBarPopupItems.forEachIndexed { index, string ->
                    key(index) {
                        DropdownImpl(
                            text = string,
                            optionSize = TopBarPopupItems.size,
                            isSelected = selectedIndex == index,
                            index = index,
                            onSelectedIndexChange = { selectedIdx ->
                                hapticFeedback.performHapticFeedback(HapticFeedbackType.Confirm)
                                selectedIndex = selectedIdx
                                state?.invoke()
                            },
                        )
                    }
                }
            }
        },
    )
}
