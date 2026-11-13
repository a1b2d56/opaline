// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
@file:OptIn(ExperimentalScrollBarApi::class)

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInWindow
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import component.SearchBarFake
import component.SearchPager
import io.github.a1b2d56.opaline.basic.BasicComponent
import io.github.a1b2d56.opaline.basic.Card
import io.github.a1b2d56.opaline.basic.Icon
import io.github.a1b2d56.opaline.basic.OpalineScrollBehavior
import io.github.a1b2d56.opaline.basic.Scaffold
import io.github.a1b2d56.opaline.basic.SmallTitle
import io.github.a1b2d56.opaline.basic.Text
import io.github.a1b2d56.opaline.basic.VerticalScrollBar
import io.github.a1b2d56.opaline.basic.rememberScrollBarAdapter
import io.github.a1b2d56.opaline.blur.layerBackdrop
import io.github.a1b2d56.opaline.icon.OpalineIcons
import io.github.a1b2d56.opaline.interfaces.ExperimentalScrollBarApi
import io.github.a1b2d56.opaline.theme.OpalineTheme
import io.github.a1b2d56.opaline.theme.OpalineTheme.colorScheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import utils.AdaptiveTopAppBar
import utils.All
import utils.BlurredBar
import utils.SearchStatus
import utils.pageContentPadding
import utils.pageScrollModifiers
import utils.rememberBlurBackdrop
import kotlin.time.Duration.Companion.milliseconds

private val IconListTopShape = RoundedCornerShape(topStart = 12.dp, topEnd = 12.dp)
private val IconListBottomShape = RoundedCornerShape(bottomStart = 12.dp, bottomEnd = 12.dp)

@Composable
fun IconsPage(
    padding: PaddingValues,
) {
    val appState = LocalAppState.current
    val isWideScreen = LocalIsWideScreen.current
    val topAppBarScrollBehavior = OpalineScrollBehavior()
    val dynamicTopPadding by remember(topAppBarScrollBehavior) {
        derivedStateOf { 12.dp * (1f - topAppBarScrollBehavior.state.collapsedFraction) }
    }

    // Search state
    var searchStatus by remember { mutableStateOf(SearchStatus(label = "Search icons")) }
    val updateSearchStatus: (SearchStatus) -> Unit = { searchStatus = it }
    var searchOffsetY by remember { mutableStateOf(0.dp) }
    val density = LocalDensity.current

    // Icon data
    val icons = remember { OpalineIcons.All }
    val iconNames = remember(icons) { icons.map { it.name } }

    // Search filtering
    val filteredIndices = remember(searchStatus.searchText, iconNames) {
        if (searchStatus.searchText.isBlank()) {
            emptyList()
        } else {
            iconNames.indices.filter {
                iconNames[it].contains(searchStatus.searchText, ignoreCase = true)
            }
        }
    }
    val searchResultStatus = remember(searchStatus.searchText, filteredIndices) {
        when {
            searchStatus.searchText.isBlank() -> SearchStatus.ResultStatus.DEFAULT
            filteredIndices.isEmpty() -> SearchStatus.ResultStatus.EMPTY
            else -> SearchStatus.ResultStatus.SHOW
        }
    }
    LaunchedEffect(searchResultStatus) {
        if (searchStatus.resultStatus != searchResultStatus) {
            searchStatus = searchStatus.copy(resultStatus = searchResultStatus)
        }
    }

    // Blur state
    val backdrop = rememberBlurBackdrop()
    val blurActive = backdrop != null
    val barColor = if (blurActive) colorScheme.surface.copy(alpha = 0f) else colorScheme.surface

    // Scroll state
    val lazyListState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()

    Scaffold(
        topBar = {
            BlurredBar(backdrop, blurActive) {
                searchStatus.TopAppBarAnim(backgroundColor = barColor) {
                    AdaptiveTopAppBar(
                        title = "Icon",
                        showTopAppBar = appState.showTopAppBar,
                        isWideScreen = isWideScreen,
                        scrollBehavior = topAppBarScrollBehavior,
                        color = barColor,
                    ) {
                        Box(
                            modifier = Modifier
                                .alpha(if (searchStatus.isCollapsed()) 1f else 0f)
                                .onGloballyPositioned { coordinates ->
                                    with(density) {
                                        searchOffsetY = coordinates.positionInWindow().y.toDp()
                                    }
                                }
                                .then(
                                    if (searchStatus.isCollapsed()) {
                                        Modifier.pointerInput(Unit) {
                                            detectTapGestures {
                                                updateSearchStatus(searchStatus.copy(current = SearchStatus.Status.EXPANDING))
                                            }
                                        }
                                    } else {
                                        Modifier
                                    },
                                ),
                        ) {
                            SearchBarFake(searchStatus.label, dynamicTopPadding)
                        }
                    }
                }
            }
        },
        popupHost = {
            searchStatus.SearchPager(
                onSearchStatusChange = updateSearchStatus,
                offsetY = searchOffsetY,
                defaultResult = {},
            ) {
                items(
                    count = filteredIndices.size,
                    key = { filteredIndices[it] },
                ) { i ->
                    val index = filteredIndices[i]
                    Card(
                        modifier = Modifier.padding(horizontal = 16.dp, vertical = 6.dp),
                    ) {
                        BasicComponent(
                            title = iconNames[index],
                            startAction = {
                                Icon(
                                    imageVector = icons[index],
                                    contentDescription = iconNames[index],
                                    tint = colorScheme.onBackground,
                                    modifier = Modifier.size(24.dp),
                                )
                            },
                            onClick = {
                                searchStatus = searchStatus.copy(
                                    searchText = "",
                                    current = SearchStatus.Status.COLLAPSING,
                                )
                                coroutineScope.launch {
                                    delay(350.milliseconds)
                                    // item 0 = header, icon rows start at item 1
                                    lazyListState.animateScrollToItem(index + 1)
                                }
                            },
                        )
                    }
                }
                item {
                    Spacer(Modifier.height(padding.calculateBottomPadding()))
                }
            }
        },
    ) { innerPadding ->
        val contentPadding = pageContentPadding(
            innerPadding,
            padding,
            isWideScreen,
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
                item(key = "iconsHeader") {
                    Spacer(modifier = Modifier.height(12.dp))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp)
                            .clip(IconListTopShape)
                            .background(colorScheme.surfaceContainer)
                            .padding(horizontal = 16.dp)
                            .padding(top = 12.dp, bottom = 8.dp),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(
                            text = "Name",
                            modifier = Modifier.weight(1f),
                            style = OpalineTheme.textStyles.footnote1,
                            color = colorScheme.onSurfaceVariantActions,
                        )
                        Text(
                            text = "Icon",
                            style = OpalineTheme.textStyles.footnote2,
                            color = colorScheme.onSurfaceVariantActions,
                        )
                    }
                }
                items(
                    count = icons.size,
                    key = { "icon_$it" },
                ) { index ->
                    val isLast = index == icons.lastIndex
                    val shape = if (isLast) IconListBottomShape else RectangleShape
                    val bottomPadding = if (isLast) 6.dp else 0.dp
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp)
                            .clip(shape)
                            .background(colorScheme.surfaceContainer)
                            .padding(horizontal = 16.dp)
                            .padding(vertical = 6.dp)
                            .padding(bottom = bottomPadding),
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = iconNames[index],
                                modifier = Modifier.weight(1f),
                                style = OpalineTheme.textStyles.body2,
                                color = colorScheme.onSurface,
                            )
                            Icon(
                                imageVector = icons[index],
                                contentDescription = iconNames[index],
                                tint = colorScheme.onBackground,
                                modifier = Modifier.size(24.dp),
                            )
                        }
                    }
                }
                item { Spacer(modifier = Modifier.height(32.dp)) }
            }
            VerticalScrollBar(
                adapter = rememberScrollBarAdapter(lazyListState),
                modifier = Modifier.align(Alignment.CenterEnd).fillMaxHeight(),
                trackPadding = contentPadding,
            )
        }
    }
}
