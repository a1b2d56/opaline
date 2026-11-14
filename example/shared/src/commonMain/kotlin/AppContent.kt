// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.EaseInOut
import androidx.compose.animation.core.animate
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.MutatePriority
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.captionBarPadding
import androidx.compose.foundation.layout.displayCutout
import androidx.compose.foundation.layout.exclude
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.union
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberDecoratedNavEntries
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.runtime.rememberSaveableStateHolderNavEntryDecorator
import androidx.navigation3.ui.NavDisplay
import androidx.navigation3.ui.NavDisplayTransitionEffects
import androidx.navigationevent.NavigationEventInfo
import androidx.navigationevent.compose.NavigationBackHandler
import androidx.navigationevent.compose.rememberNavigationEventState
import androidx.savedstate.serialization.SavedStateConfiguration
import component.liquid.IosLiquidGlassNavigationBar
import io.github.a1b2d56.opaline.basic.FabPosition
import io.github.a1b2d56.opaline.basic.FloatingActionButton
import io.github.a1b2d56.opaline.basic.FloatingNavigationBar
import io.github.a1b2d56.opaline.basic.FloatingNavigationBarItem
import io.github.a1b2d56.opaline.basic.FloatingToolbar
import io.github.a1b2d56.opaline.basic.Icon
import io.github.a1b2d56.opaline.basic.IconButton
import io.github.a1b2d56.opaline.basic.NavigationBar
import io.github.a1b2d56.opaline.basic.NavigationBarDisplayMode
import io.github.a1b2d56.opaline.basic.NavigationBarItem
import io.github.a1b2d56.opaline.basic.NavigationItem
import io.github.a1b2d56.opaline.basic.NavigationRail
import io.github.a1b2d56.opaline.basic.NavigationRailDisplayMode
import io.github.a1b2d56.opaline.basic.NavigationRailItem
import io.github.a1b2d56.opaline.basic.Scaffold
import io.github.a1b2d56.opaline.basic.SnackbarHost
import io.github.a1b2d56.opaline.basic.SnackbarHostState
import io.github.a1b2d56.opaline.basic.ToolbarPosition
import io.github.a1b2d56.opaline.blur.LayerBackdrop
import io.github.a1b2d56.opaline.blur.MaterialBackdropSource
import io.github.a1b2d56.opaline.blur.ProvideMaterialBackdrop
import io.github.a1b2d56.opaline.blur.layerBackdrop
import io.github.a1b2d56.opaline.blur.rememberLayerBackdrop
import io.github.a1b2d56.opaline.icon.OpalineIcons
import io.github.a1b2d56.opaline.icon.system.Album
import io.github.a1b2d56.opaline.icon.system.Brush
import io.github.a1b2d56.opaline.icon.system.Delete
import io.github.a1b2d56.opaline.icon.system.Edit
import io.github.a1b2d56.opaline.icon.system.GridView
import io.github.a1b2d56.opaline.icon.system.Link
import io.github.a1b2d56.opaline.icon.system.MoreHorizontal
import io.github.a1b2d56.opaline.icon.system.Settings
import io.github.a1b2d56.opaline.icon.system.TextBox
import io.github.a1b2d56.opaline.theme.OpalineTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.job
import kotlinx.coroutines.launch
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass
import navigation3.Navigator
import navigation3.Route
import utils.BlurredBar
import utils.FPSMonitor
import utils.rememberBlurBackdrop
import utils.shouldShowSplitPane
import kotlin.math.abs

private object UIConstants {
    const val MAIN_PAGE_INDEX = 0
    const val ICON_PAGE_INDEX = 1
    const val COLOR_PAGE_INDEX = 2
    const val TEXT_STYLE_PAGE_INDEX = 3
    const val PAGE_COUNT = 5
    const val GITHUB_URL = "https://github.com/a1b2d56/opaline"

    val PAGE_TITLES = listOf("Home", "Icon", "Color", "TextStyle", "Settings")
}

enum class FloatingNavigationBarAlignment(val value: Int) {
    Center(0),
    Start(1),
    End(2),
    ;

    companion object {
        fun fromInt(value: Int) = entries.find { it.value == value } ?: Center
    }
}

val LocalNavigator = staticCompositionLocalOf<Navigator> { error("No navigator found!") }
val LocalIsWideScreen = staticCompositionLocalOf { false }
val LocalMainPagerState = staticCompositionLocalOf<MainPagerState> { error("LocalMainPagerState not provided") }

@Composable
fun AppContent(
    padding: PaddingValues,
) {
    val appState = LocalAppState.current

    val pagerState = rememberPagerState(pageCount = { UIConstants.PAGE_COUNT })
    val mainPagerState = rememberMainPagerState(pagerState)
    LaunchedEffect(mainPagerState.pagerState.currentPage) {
        mainPagerState.syncPage()
    }

    val serializersModule = remember {
        SerializersModule {
            polymorphic(NavKey::class) {
                subclass(Route.Main::class)
                subclass(Route.PullToRefresh::class)
                subclass(Route.About::class)
                subclass(Route.License::class)
                subclass(Route.Navigation::class)
                subclass(Route.MultiScaffold::class)
            }
        }
    }

    val savedStateConfig = remember(serializersModule) {
        SavedStateConfiguration {
            this.serializersModule = serializersModule
        }
    }

    val backStack = rememberNavBackStack(
        configuration = savedStateConfig,
        Route.Main,
    )
    val navigator = remember { Navigator(backStack) }

    val navigationItems = remember {
        listOf(
            NavigationItem(UIConstants.PAGE_TITLES[0], OpalineIcons.System.Album),
            NavigationItem(UIConstants.PAGE_TITLES[1], OpalineIcons.System.GridView),
            NavigationItem(UIConstants.PAGE_TITLES[2], OpalineIcons.System.Brush),
            NavigationItem(UIConstants.PAGE_TITLES[3], OpalineIcons.System.TextBox),
            NavigationItem(UIConstants.PAGE_TITLES[4], OpalineIcons.System.Settings),
        )
    }

    MainScreenBackHandler(mainPagerState, navigator)

    val isWideScreen = shouldShowSplitPane()

    CompositionLocalProvider(
        LocalNavigator provides navigator,
        LocalMainPagerState provides mainPagerState,
        LocalIsWideScreen provides isWideScreen,
    ) {
        val entryProvider = remember(backStack) {
            entryProvider<NavKey> {
                entry<Route.Main> {
                    Home(
                        padding = padding,
                        navigationItems = navigationItems,
                        mainPagerState = mainPagerState,
                    )
                }
                entry<Route.PullToRefresh> {
                    PullToRefreshPage(padding = padding)
                }
                entry<Route.About> {
                    AboutPage(padding = padding)
                }
                entry<Route.License> {
                    LicensePage(padding = padding)
                }
                entry<Route.Navigation> { route ->
                    val index = backStack.filterIsInstance<Route.Navigation>().indexOf(route) + 1
                    NavTestPage(
                        index = index,
                        padding = padding,
                    )
                }
                entry<Route.MultiScaffold> {
                    MultiScaffoldTestPage(padding = padding)
                }
            }
        }

        val entries = rememberDecoratedNavEntries(
            backStack = backStack,
            entryDecorators = listOf(rememberSaveableStateHolderNavEntryDecorator()),
            entryProvider = entryProvider,
        )

        val transitionEffects = remember(
            appState.enableCornerClip,
            appState.enableDim,
            appState.blockInputDuringTransition,
            appState.popDirectionFollowsSwipeEdge,
        ) {
            NavDisplayTransitionEffects(
                enableCornerClip = appState.enableCornerClip,
                dimAmount = if (appState.enableDim) 0.5f else 0f,
                blockInputDuringTransition = appState.blockInputDuringTransition,
                popDirectionFollowsSwipeEdge = appState.popDirectionFollowsSwipeEdge,
            )
        }

        NavDisplay(
            entries = entries,
            onBack = { navigator.pop() },
            transitionEffects = transitionEffects,
        )
    }

    AnimatedVisibility(
        visible = appState.showFPSMonitor,
        enter = fadeIn(),
        exit = fadeOut(),
    ) {
        FPSMonitor(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .captionBarPadding(),
        )
    }
}

@Composable
private fun Home(
    padding: PaddingValues,
    navigationItems: List<NavigationItem>,
    mainPagerState: MainPagerState,
) {
    val isWideScreen = LocalIsWideScreen.current
    val layoutDirection = LocalLayoutDirection.current
    val snackbarHostState = remember { SnackbarHostState() }
    val appState = LocalAppState.current
    val surfaceColor = OpalineTheme.colorScheme.surface
    // Owned here so the root Scaffold's popup host (dialogs, bottom sheets) can blur the page too.
    val backdrop = rememberLayerBackdrop {
        drawRect(surfaceColor)
        drawContent()
    }
    MaybeProvideMaterial(backdrop, appState.enableBlur && !isWideScreen) {
        Scaffold(
            snackbarHost = {
                if (isWideScreen) {
                    SnackbarHost(state = snackbarHostState)
                }
            },
        ) {
            if (isWideScreen) {
                WideScreenContent(
                    navigationItems = navigationItems,
                    snackbarHostState = snackbarHostState,
                    layoutDirection = layoutDirection,
                    mainPagerState = mainPagerState,
                )
            } else {
                CompactScreenLayout(
                    navigationItems = navigationItems,
                    snackbarHostState = snackbarHostState,
                    padding = padding,
                    mainPagerState = mainPagerState,
                    backdrop = backdrop,
                )
            }
        }
    }
}

@Composable
private fun WideScreenContent(
    navigationItems: List<NavigationItem>,
    snackbarHostState: SnackbarHostState,
    layoutDirection: LayoutDirection,
    mainPagerState: MainPagerState,
) {
    val appState = LocalAppState.current
    val backdrop = rememberBlurBackdrop()
    val blurActive = backdrop != null
    val barColor = if (blurActive) Color.Transparent else OpalineTheme.colorScheme.surface
    val page = mainPagerState.selectedPage
    Row {
        if (appState.showNavigationBar) {
            BlurredBar(backdrop, blurActive) {
                NavigationRail(
                    modifier = Modifier.background(barColor),
                    color = barColor,
                    mode = NavigationRailDisplayMode.entries[appState.navigationRailMode],
                ) {
                    navigationItems.forEachIndexed { index, item ->
                        NavigationRailItem(
                            selected = page == index,
                            onClick = { mainPagerState.animateToPage(index) },
                            icon = item.icon,
                            label = item.label,
                        )
                    }
                }
            }
        }
        Scaffold(
            modifier = Modifier
                .fillMaxSize(),
            contentWindowInsets =
            WindowInsets.systemBars.union(
                WindowInsets.displayCutout.exclude(
                    WindowInsets.displayCutout.only(WindowInsetsSides.Start),
                ),
            ),
            floatingActionButton = {
                FloatingActionButton(show = appState.showFloatingActionButton)
            },
            floatingActionButtonPosition = appState.floatingActionButtonPosition.toFabPosition(),
            floatingToolbar = {
                FloatingToolbar(
                    showFloatingToolbar = appState.showFloatingToolbar,
                    floatingToolbarOrientation = appState.floatingToolbarOrientation,
                )
            },
            floatingToolbarPosition = appState.floatingToolbarPosition.toToolbarPosition(),
        ) { padding ->
            Box(modifier = if (backdrop != null) Modifier.layerBackdrop(backdrop) else Modifier) {
                AppPager(
                    snackbarHostState = snackbarHostState,
                    padding = PaddingValues(top = padding.calculateTopPadding()),
                    pagerState = mainPagerState.pagerState,
                    modifier = Modifier
                        .imePadding()
                        .padding(end = padding.calculateEndPadding(layoutDirection)),
                )
            }
        }
    }
}

@Composable
private fun CompactScreenLayout(
    navigationItems: List<NavigationItem>,
    snackbarHostState: SnackbarHostState,
    padding: PaddingValues,
    mainPagerState: MainPagerState,
    backdrop: LayerBackdrop,
) {
    val appState = LocalAppState.current
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar(
                navigationItems = navigationItems,
                mainPagerState = mainPagerState,
                backdrop = backdrop,
                modifier = Modifier.padding(bottom = padding.calculateBottomPadding()),
            )
        },
        floatingActionButton = {
            FloatingActionButton(show = appState.showFloatingActionButton)
        },
        floatingActionButtonPosition = appState.floatingActionButtonPosition.toFabPosition(),
        floatingToolbar = {
            FloatingToolbar(
                showFloatingToolbar = appState.showFloatingToolbar,
                floatingToolbarOrientation = appState.floatingToolbarOrientation,
            )
        },
        floatingToolbarPosition = appState.floatingToolbarPosition.toToolbarPosition(),
        snackbarHost = {
            SnackbarHost(state = snackbarHostState)
        },
    ) { innerPadding ->
        MaterialBackdropSource(backdrop, Modifier.fillMaxSize()) {
            AppPager(
                snackbarHostState = snackbarHostState,
                padding = innerPadding,
                pagerState = mainPagerState.pagerState,
                modifier = Modifier
                    .padding(
                        top = padding.calculateTopPadding(),
                        start = padding.calculateStartPadding(LocalLayoutDirection.current),
                        end = padding.calculateEndPadding(LocalLayoutDirection.current),
                    )
                    .imePadding(),
            )
        }
    }
}

/** Provides ColorOS 17 materials over [backdrop] while the demo's blur setting is on. */
@Composable
private fun MaybeProvideMaterial(backdrop: LayerBackdrop, enabled: Boolean, content: @Composable () -> Unit) {
    if (enabled) ProvideMaterialBackdrop(backdrop, content) else content()
}

@Composable
private fun NavigationBar(
    navigationItems: List<NavigationItem>,
    mainPagerState: MainPagerState,
    backdrop: LayerBackdrop?,
    modifier: Modifier = Modifier,
) {
    val appState = LocalAppState.current
    val blurActive = appState.enableBlur && backdrop != null
    // COUI tab navigation bar is slightly lighter than the page base; with blur on, the bar draws
    // the ColorOS 17 TYPE_FRAMEWORK_BOTTOM_BAR material itself.
    val barColor = OpalineTheme.colorScheme.background
    val page = mainPagerState.selectedPage

    AnimatedVisibility(
        visible = appState.showNavigationBar,
        enter = fadeIn() + expandVertically(),
        exit = fadeOut() + shrinkVertically(),
    ) {
        AnimatedVisibility(
            visible = !appState.useFloatingNavigationBar,
            enter = fadeIn() + expandVertically(expandFrom = Alignment.Top),
            exit = fadeOut() + shrinkVertically(shrinkTowards = Alignment.Top),
        ) {
            Box(
                modifier = Modifier
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = null,
                        onClick = {},
                    )
                    .then(modifier),
            ) {
                NavigationBar(
                    modifier = Modifier,
                    color = barColor,
                    mode = NavigationBarDisplayMode.entries[appState.navigationBarMode],
                ) {
                    navigationItems.forEachIndexed { index, item ->
                        NavigationBarItem(
                            selected = page == index,
                            onClick = { mainPagerState.animateToPage(index) },
                            icon = item.icon,
                            label = item.label,
                        )
                    }
                }
            }
        }
        if (appState.useFloatingNavigationBar) {
            val floatingBarColor = OpalineTheme.colorScheme.surfaceContainer
            Box(modifier = modifier) {
                if (appState.floatingNavigationBarStyle == 1) {
                    IosLiquidGlassNavigationBar(
                        items = navigationItems,
                        selectedIndex = page,
                        onItemClick = { mainPagerState.animateToPage(it) },
                        backdrop = backdrop,
                        isBlurActive = blurActive,
                    )
                } else {
                    FloatingNavigationBar(
                        color = floatingBarColor,
                        horizontalAlignment = FloatingNavigationBarAlignment.fromInt(appState.floatingNavigationBarPosition)
                            .toAlignment(),
                        // A phone leaves little room beside the bar; the default 36dp would land near the center.
                        horizontalOutSidePadding = 16.dp,
                    ) {
                        navigationItems.forEachIndexed { index, item ->
                            FloatingNavigationBarItem(
                                selected = page == index,
                                onClick = { mainPagerState.animateToPage(index) },
                                icon = item.icon,
                                label = item.label,
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun FloatingActionButton(
    show: Boolean,
) {
    if (show) {
        val uriHandler = LocalUriHandler.current
        FloatingActionButton(
            onClick = {
                uriHandler.openUri(UIConstants.GITHUB_URL)
            },
        ) {
            Icon(
                imageVector = OpalineIcons.System.Link,
                tint = OpalineTheme.colorScheme.onPrimary,
                contentDescription = "GitHub",
            )
        }
    }
}

@Composable
private fun FloatingToolbar(
    showFloatingToolbar: Boolean,
    floatingToolbarOrientation: Int,
) {
    AnimatedVisibility(
        visible = showFloatingToolbar,
        enter = fadeIn(),
        exit = fadeOut(),
    ) {
        FloatingToolbar(
            color = OpalineTheme.colorScheme.primary,
            cornerRadius = 20.dp,
        ) {
            AnimatedContent(
                targetState = floatingToolbarOrientation,
            ) { orientation ->
                val iconTint = OpalineTheme.colorScheme.onPrimary
                val content = @Composable {
                    IconButton(onClick = { /* Action 1 */ }) {
                        Icon(
                            OpalineIcons.System.Edit,
                            contentDescription = "Edit",
                            tint = iconTint,
                        )
                    }
                    IconButton(onClick = { /* Action 2 */ }) {
                        Icon(
                            OpalineIcons.System.Delete,
                            contentDescription = "Delete",
                            tint = iconTint,
                        )
                    }
                    IconButton(onClick = { /* Action 3 */ }) {
                        Icon(
                            OpalineIcons.System.MoreHorizontal,
                            contentDescription = "More",
                            tint = iconTint,
                        )
                    }
                }
                when (orientation) {
                    0 -> Row(
                        modifier = Modifier.padding(8.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                    ) { content() }

                    else -> Column(
                        modifier = Modifier.padding(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                    ) { content() }
                }
            }
        }
    }
}

private fun Int.toFabPosition(): FabPosition = when (this) {
    0 -> FabPosition.Start
    1 -> FabPosition.Center
    2 -> FabPosition.End
    else -> FabPosition.EndOverlay
}

private fun Int.toToolbarPosition(): ToolbarPosition = when (this) {
    0 -> ToolbarPosition.TopStart
    1 -> ToolbarPosition.CenterStart
    2 -> ToolbarPosition.BottomStart
    3 -> ToolbarPosition.TopEnd
    4 -> ToolbarPosition.CenterEnd
    5 -> ToolbarPosition.BottomEnd
    6 -> ToolbarPosition.TopCenter
    else -> ToolbarPosition.BottomCenter
}

private fun FloatingNavigationBarAlignment.toAlignment(): Alignment.Horizontal = when (this) {
    FloatingNavigationBarAlignment.Center -> CenterHorizontally
    FloatingNavigationBarAlignment.Start -> Alignment.Start
    FloatingNavigationBarAlignment.End -> Alignment.End
}

@Composable
fun AppPager(
    snackbarHostState: SnackbarHostState,
    padding: PaddingValues,
    pagerState: PagerState,
    modifier: Modifier = Modifier,
) {
    val appState = LocalAppState.current
    HorizontalPager(
        state = pagerState,
        modifier = modifier,
        userScrollEnabled = appState.enablePageUserScroll,
        verticalAlignment = Alignment.Top,
        pageContent = { page ->
            when (page) {
                UIConstants.MAIN_PAGE_INDEX -> MainPage(snackbarHostState = snackbarHostState, padding = padding)
                UIConstants.ICON_PAGE_INDEX -> IconsPage(padding = padding)
                UIConstants.COLOR_PAGE_INDEX -> ColorPage(padding = padding)
                UIConstants.TEXT_STYLE_PAGE_INDEX -> TextStylePage(padding = padding)
                else -> SettingsPage(padding = padding)
            }
        },
    )
}

@Composable
private fun MainScreenBackHandler(
    mainState: MainPagerState,
    navigator: Navigator,
) {
    val isPagerBackHandlerEnabled by remember {
        derivedStateOf {
            navigator.current() is Route.Main && navigator.backStackSize() == 1 && mainState.selectedPage != 0
        }
    }

    val navEventState = rememberNavigationEventState(NavigationEventInfo.None)

    NavigationBackHandler(
        state = navEventState,
        isBackEnabled = isPagerBackHandlerEnabled,
        onBackCompleted = {
            mainState.animateToPage(0)
        },
    )
}

@Stable
class MainPagerState(
    val pagerState: PagerState,
    private val coroutineScope: CoroutineScope,
) {
    var selectedPage by mutableIntStateOf(pagerState.currentPage)
        private set

    var isNavigating by mutableStateOf(false)
        private set

    private var navJob: Job? = null

    fun animateToPage(targetIndex: Int) {
        if (targetIndex == selectedPage) return

        navJob?.cancel()

        selectedPage = targetIndex
        isNavigating = true

        navJob = coroutineScope.launch {
            val myJob = coroutineContext.job
            try {
                pagerState.scroll(MutatePriority.UserInput) {
                    val distance = abs(targetIndex - pagerState.currentPage).coerceAtLeast(2)
                    val duration = 100 * distance + 100
                    val layoutInfo = pagerState.layoutInfo
                    val pageSize = layoutInfo.pageSize + layoutInfo.pageSpacing
                    val currentDistanceInPages = targetIndex - pagerState.currentPage - pagerState.currentPageOffsetFraction
                    val scrollPixels = currentDistanceInPages * pageSize

                    var previousValue = 0f
                    animate(
                        initialValue = 0f,
                        targetValue = scrollPixels,
                        animationSpec = tween(easing = EaseInOut, durationMillis = duration),
                    ) { currentValue, _ ->
                        previousValue += scrollBy(currentValue - previousValue)
                    }
                }

                if (pagerState.currentPage != targetIndex) {
                    pagerState.scrollToPage(targetIndex)
                }
            } finally {
                if (navJob == myJob) {
                    isNavigating = false
                    if (pagerState.currentPage != targetIndex) {
                        selectedPage = pagerState.currentPage
                    }
                }
            }
        }
    }

    fun syncPage() {
        if (!isNavigating && selectedPage != pagerState.currentPage) {
            selectedPage = pagerState.currentPage
        }
    }
}

@Composable
fun rememberMainPagerState(
    pagerState: PagerState,
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
): MainPagerState = remember(pagerState, coroutineScope) {
    MainPagerState(pagerState, coroutineScope)
}
