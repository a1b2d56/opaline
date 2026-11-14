// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package io.github.a1b2d56.opaline.basic

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.captionBar
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.shadow.Shadow
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.layout
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.a1b2d56.opaline.material.MaterialType
import io.github.a1b2d56.opaline.material.isMaterialActive
import io.github.a1b2d56.opaline.material.material
import io.github.a1b2d56.opaline.squircle.squircleBackground
import io.github.a1b2d56.opaline.theme.OpalineTheme
import io.github.a1b2d56.opaline.utils.Platform
import io.github.a1b2d56.opaline.utils.isMaterialDark
import io.github.a1b2d56.opaline.utils.materialOrSquircle
import io.github.a1b2d56.opaline.utils.platform

/**
 * A [NavigationBar] that with 2 to 5 items.
 *
 * @param modifier The modifier to be applied to the [NavigationBar].
 * @param color The color of the [NavigationBar]. COUI `coui_tab_navigation_view_bg`.
 * @param showDivider Whether to show the divider line between the [NavigationBar] and the content.
 * @param defaultWindowInsetsPadding whether to apply default window insets padding to the [NavigationBar].
 * @param mode The mode for displaying items in the [NavigationBar]. It can show icons, text or both.
 * @param content The content of the [NavigationBar], usually [NavigationBarItem]s.
 */
@Composable
fun NavigationBar(
    modifier: Modifier = Modifier,
    color: Color = OpalineTheme.colorScheme.background,
    showDivider: Boolean = true,
    defaultWindowInsetsPadding: Boolean = true,
    mode: NavigationBarDisplayMode = NavigationBarDisplayMode.IconAndText,
    content: @Composable RowScope.() -> Unit,
) {
    val captionBarPaddings = WindowInsets.captionBar.only(WindowInsetsSides.Bottom).asPaddingValues()
    val captionBarBottomPaddingValue = captionBarPaddings.calculateBottomPadding()

    val animatedCaptionBarHeight by animateDpAsState(
        targetValue = if (captionBarBottomPaddingValue > 0.dp) captionBarBottomPaddingValue else 0.dp,
        animationSpec = tween(durationMillis = 300),
    )

    // ColorOS 17 draws the bar with TYPE_FRAMEWORK_BOTTOM_BAR when a material renderer is in scope.
    val barMaterial = isMaterialActive(MaterialType.BottomBar)
    Column(
        modifier = modifier
            .fillMaxWidth()
            .then(
                if (barMaterial) {
                    Modifier.material(MaterialType.BottomBar, RectangleShape, isMaterialDark())
                } else {
                    Modifier.background(color)
                },
            ),
    ) {
        if (showDivider) {
            // COUINavigationView.addCompatibilityTopDivider; HorizontalDivider defaults already match.
            HorizontalDivider()
        }
        Row(
            // COUINavigationMenuView.onMeasure: 12dp edge padding, items divide the rest equally.
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = NavigationBarDefaults.HorizontalPadding),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            CompositionLocalProvider(LocalNavigationBarDisplayMode provides mode) {
                content()
            }
        }
        if (defaultWindowInsetsPadding) {
            val navigationBarsPadding = if (platform() != Platform.IOS) {
                WindowInsets.navigationBars.asPaddingValues().calculateBottomPadding()
            } else {
                20.dp
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .layout { measurable, constraints ->
                        val totalHeight = (navigationBarsPadding + animatedCaptionBarHeight).roundToPx()
                        val fixedConstraints = constraints.copy(minHeight = totalHeight, maxHeight = totalHeight)
                        val placeable = measurable.measure(fixedConstraints)
                        layout(placeable.width, totalHeight) {
                            placeable.placeRelative(0, 0)
                        }
                    }
                    .pointerInput(Unit) { detectTapGestures { /* Do nothing to consume the click */ } },
            )
        }
    }
}

/**
 * A [NavigationBarItem] that is suitable for [NavigationBar].
 *
 * @param selected Whether the item is selected.
 * @param onClick The callback when the item is clicked.
 * @param icon The icon of the item.
 * @param label The label of the item.
 * @param modifier The modifier to be applied to the [NavigationBarItem].
 * @param enabled Whether the item is enabled.
 * @param colors The icon and label colors (COUI coui_navigation_tab_color and the tab icon selector).
 */
@Composable
fun RowScope.NavigationBarItem(
    selected: Boolean,
    onClick: () -> Unit,
    icon: ImageVector,
    label: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: NavigationBarItemColors = NavigationBarDefaults.navigationBarItemColors(),
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    // COUI coui_navigation_tab_color selector: no pressed entry, switches instantly (not animated).
    val labelColor = colors.labelColor(enabled, selected)
    // COUI tab icon selector: selected variant shown for state_selected OR state_pressed,
    // cross-faded over 180ms.
    val iconTint by animateColorAsState(
        targetValue = colors.iconColor(enabled, selected, isPressed),
        animationSpec = tween(durationMillis = NavigationBarDefaults.IconFadeDurationMillis, easing = LinearEasing),
        label = "navigationItemIconTint",
    )
    // COUI labels use sans-serif-medium in all states (coui_navigation_item_layout.xml); tab items
    // have no press mask, ripple or selection motion.
    val fontWeight = FontWeight.Medium
    val mode = LocalNavigationBarDisplayMode.current

    Box(
        modifier = modifier
            .height(NavigationBarDefaults.ItemHeight)
            .weight(1f)
            .selectable(
                selected = selected,
                onClick = onClick,
                enabled = enabled,
                role = Role.Tab,
                interactionSource = interactionSource,
                indication = null,
            )
            .padding(horizontal = NavigationBarDefaults.ItemHorizontalPadding),
    ) {
        when (mode) {
            NavigationBarDisplayMode.IconAndText -> {
                // COUINavigationItemView.topToBottom(): icon pinned to the top, label to the bottom.
                Image(
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                        .padding(top = NavigationBarDefaults.IconTopPadding)
                        .size(NavigationBarDefaults.IconSize),
                    imageVector = icon,
                    contentDescription = label,
                    colorFilter = ColorFilter.tint(iconTint),
                )
                Text(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = NavigationBarDefaults.LabelBottomPadding),
                    text = label,
                    color = labelColor,
                    textAlign = TextAlign.Center,
                    fontSize = NavigationBarDefaults.LabelFontSize,
                    fontWeight = fontWeight,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }

            NavigationBarDisplayMode.IconWithSelectedLabel -> {
                // Extension mode: the icon slides towards the cell center while the label fades.
                val centeredIconPadding = (NavigationBarDefaults.ItemHeight - NavigationBarDefaults.IconSize) / 2
                val iconTopPadding by animateDpAsState(
                    targetValue = if (selected) NavigationBarDefaults.IconTopPadding else centeredIconPadding,
                    animationSpec = tween(durationMillis = 300),
                    label = "iconTopPadding",
                )
                val textAlpha by animateFloatAsState(
                    targetValue = if (selected) 1f else 0f,
                    animationSpec = tween(durationMillis = 300),
                    label = "textAlpha",
                )

                Image(
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                        .padding(top = iconTopPadding)
                        .size(NavigationBarDefaults.IconSize),
                    imageVector = icon,
                    contentDescription = label,
                    colorFilter = ColorFilter.tint(iconTint),
                )
                Text(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = NavigationBarDefaults.LabelBottomPadding)
                        .graphicsLayer { alpha = textAlpha },
                    text = label,
                    color = labelColor,
                    textAlign = TextAlign.Center,
                    fontSize = NavigationBarDefaults.LabelFontSize,
                    fontWeight = fontWeight,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }

            NavigationBarDisplayMode.TextOnly -> {
                // COUI horizontal (large-screen) items center the label vertically.
                Text(
                    modifier = Modifier.align(Alignment.Center),
                    text = label,
                    color = labelColor,
                    textAlign = TextAlign.Center,
                    fontSize = NavigationBarDefaults.TextFontSize,
                    fontWeight = fontWeight,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }

            NavigationBarDisplayMode.IconOnly -> {
                // labelVisibilityMode UNLABELED centers the icon container (gravity CENTER).
                Image(
                    modifier = Modifier
                        .align(Alignment.Center)
                        .size(NavigationBarDefaults.IconSize),
                    imageVector = icon,
                    contentDescription = label,
                    colorFilter = ColorFilter.tint(iconTint),
                )
            }
        }
    }
}

/**
 * A floating navigation bar that supports 2 to 5 items.
 *
 * @param modifier A [Modifier] to be applied to the [FloatingNavigationBar] for additional customization.
 * @param color The background color of the [FloatingNavigationBar].
 * @param cornerRadius The corner radius of the [FloatingNavigationBar], used for rounded corners.
 * @param horizontalAlignment The alignment of the [FloatingNavigationBar] within its parent, typically used to center it horizontally.
 * @param horizontalOutSidePadding The gap between the [FloatingNavigationBar] and the edge it is aligned to, at most half
 *   of the room the bar leaves free.
 * @param shadowElevation The shadow elevation of the [FloatingNavigationBar].
 * @param showDivider Whether to show the divider line around the [FloatingNavigationBar].
 * @param defaultWindowInsetsPadding whether to apply default window insets padding to the [FloatingNavigationBar].
 * @param content The content of the [FloatingNavigationBar], usually [FloatingNavigationBarItem]s.
 */
@Suppress("ktlint:compose:modifier-not-used-at-root")
@Composable
fun FloatingNavigationBar(
    modifier: Modifier = Modifier,
    color: Color = OpalineTheme.colorScheme.surfaceContainer,
    cornerRadius: Dp = FloatingToolbarDefaults.CornerRadius,
    horizontalAlignment: Alignment.Horizontal = CenterHorizontally,
    horizontalOutSidePadding: Dp = FloatingNavigationBarDefaults.HorizontalOutSidePadding,
    shadowElevation: Dp = FloatingNavigationBarDefaults.ShadowElevation,
    showDivider: Boolean = false,
    defaultWindowInsetsPadding: Boolean = true,
    content: @Composable () -> Unit,
) {
    val shape = RoundedCornerShape(cornerRadius)

    val navBarBottomPadding = WindowInsets.navigationBars.only(WindowInsetsSides.Bottom).asPaddingValues().calculateBottomPadding()
    val bottomPaddingValue = when (platform()) {
        Platform.IOS -> 36.dp

        else -> {
            if (navBarBottomPadding != 0.dp) 16.dp + navBarBottomPadding else 32.dp
        }
    }

    Row(
        modifier = Modifier
            // The bar keeps its own width. The outside padding is the gap to the edge it is aligned
            // to, and never more than half the room the bar leaves free, so a bar that nearly fills a narrow
            // screen is not pushed past the center towards the opposite edge.
            .layout { measurable, constraints ->
                val placeable = measurable.measure(constraints.copy(minWidth = 0))
                val width = if (constraints.hasBoundedWidth) constraints.maxWidth else placeable.width
                val free = (width - placeable.width).coerceAtLeast(0)
                val edge = horizontalOutSidePadding.roundToPx().coerceAtMost(free / 2)
                val x = when (horizontalAlignment) {
                    Alignment.Start -> edge
                    Alignment.End -> free - edge
                    else -> horizontalAlignment.align(placeable.width, width, LayoutDirection.Ltr)
                }
                layout(width, placeable.height) { placeable.placeRelative(x, 0) }
            }
            .padding(bottom = bottomPaddingValue)
            .defaultMinSize(minHeight = 52.dp)
            .then(
                if (defaultWindowInsetsPadding) {
                    Modifier
                        .then(
                            if (platform() != Platform.IOS) {
                                Modifier
                                    .windowInsetsPadding(WindowInsets.statusBars.only(WindowInsetsSides.Bottom))
                            } else {
                                Modifier
                            },
                        )
                        .windowInsetsPadding(WindowInsets.captionBar.only(WindowInsetsSides.Bottom))
                } else {
                    Modifier
                },
            )
            .then(
                if (showDivider) {
                    Modifier
                        .squircleBackground(
                            color = OpalineTheme.colorScheme.dividerLine,
                            cornerRadius = cornerRadius,
                        )
                        .padding(0.75.dp)
                } else {
                    Modifier
                },
            )
            .then(
                if (shadowElevation > 0.dp) {
                    Modifier.dropShadow(
                        shape = shape,
                        shadow = Shadow(
                            radius = 10.dp,
                            color = Color.Black,
                            alpha = 0.2f,
                        ),
                    )
                } else {
                    Modifier
                },
            )
            .materialOrSquircle(MaterialType.FloatingBar, shape, color, cornerRadius)
            .then(modifier)
            .padding(horizontal = FloatingNavigationBarDefaults.HorizontalPadding)
            .pointerInput(Unit) {
                detectTapGestures { /* Consume click */ }
            },
        horizontalArrangement = Arrangement.spacedBy(FloatingNavigationBarDefaults.ItemSpacing),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        content()
    }
}

/**
 * A [FloatingNavigationBarItem] that is suitable for [FloatingNavigationBar].
 *
 * @param selected Whether the item is selected.
 * @param onClick The callback when the item is clicked.
 * @param icon The icon of the item.
 * @param label The label of the item.
 * @param modifier The modifier to be applied to the [FloatingNavigationBarItem].
 * @param enabled Whether the item is enabled.
 * @param colors The icon and label colors (COUI coui_navigation_tab_color and the tab icon selector).
 */
@Composable
fun FloatingNavigationBarItem(
    selected: Boolean,
    onClick: () -> Unit,
    icon: ImageVector,
    label: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: NavigationBarItemColors = NavigationBarDefaults.navigationBarItemColors(),
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    val tint = colors.iconColor(enabled, selected, isPressed)

    Column(
        modifier = modifier
            .selectable(
                selected = selected,
                onClick = onClick,
                enabled = enabled,
                role = Role.Tab,
                interactionSource = interactionSource,
                indication = null,
            ),
        horizontalAlignment = CenterHorizontally,
    ) {
        Image(
            modifier = Modifier
                .padding(
                    vertical = FloatingNavigationBarDefaults.IconPadding,
                    horizontal = FloatingNavigationBarDefaults.IconPadding,
                )
                .size(FloatingNavigationBarDefaults.IconSize),
            imageVector = icon,
            contentDescription = label,
            colorFilter = ColorFilter.tint(tint),
        )
    }
}

/** Contains default values used by [NavigationBar] and [NavigationBarItem]. */
object NavigationBarDefaults {
    /** The item cell height (COUI coui_tool_navigation_item_height). */
    val ItemHeight = 56.dp

    /** The horizontal padding of the item row (COUI coui_tool_navigation_edge_item_padding). */
    val HorizontalPadding = 12.dp

    /** The horizontal padding inside each item cell (COUI coui_navigation_item_half_gap). */
    val ItemHorizontalPadding = 2.dp

    /** The icon size (COUI coui_navigation_icon_size). */
    val IconSize = 24.dp

    /** The top padding of the icon (COUI coui_navigation_icon_margin_top). */
    val IconTopPadding = 9.dp

    /** The bottom padding of the label (COUINavigationItemView.topToBottom(): 9dp - 2dp). */
    val LabelBottomPadding = 7.dp

    /** The label font size (COUI coui_navigation_item_text_size). */
    val LabelFontSize = 10.sp

    /** The text-only font size (COUI coui_navigation_item_large_text_size). */
    val TextFontSize = 14.sp

    /** The icon cross-fade duration (COUI tab icon selector enter/exitFadeDuration, 180ms). */
    val IconFadeDurationMillis = 180

    /**
     * The default colors for [NavigationBarItem] and [FloatingNavigationBarItem], following COUI
     * coui_navigation_tab_color: selected couiColorPrimaryNeutral, unselected couiColorSecondNeutral.
     *
     * @param selectedContentColor The color of selected (and pressed) items.
     * @param unselectedContentColor The color of unselected items.
     * @param disabledContentColor The color of disabled items.
     */
    @Composable
    fun navigationBarItemColors(
        selectedContentColor: Color = OpalineTheme.colorScheme.onSurfaceContainer,
        unselectedContentColor: Color = OpalineTheme.colorScheme.onSurfaceSecondary,
        disabledContentColor: Color = OpalineTheme.colorScheme.disabledOnSurface,
    ): NavigationBarItemColors = remember(selectedContentColor, unselectedContentColor, disabledContentColor) {
        NavigationBarItemColors(
            selectedContentColor = selectedContentColor,
            unselectedContentColor = unselectedContentColor,
            disabledContentColor = disabledContentColor,
        )
    }
}

/**
 * Content colors shared by [NavigationBarItem] and [FloatingNavigationBarItem].
 *
 * @param selectedContentColor The color of selected items; the icon also uses it while pressed.
 * @param unselectedContentColor The color of unselected items.
 * @param disabledContentColor The color of disabled items.
 */
@Immutable
data class NavigationBarItemColors(
    private val selectedContentColor: Color,
    private val unselectedContentColor: Color,
    private val disabledContentColor: Color,
) {
    @Stable
    internal fun labelColor(enabled: Boolean, selected: Boolean): Color = when {
        !enabled -> disabledContentColor
        selected -> selectedContentColor
        else -> unselectedContentColor
    }

    @Stable
    internal fun iconColor(enabled: Boolean, selected: Boolean, isPressed: Boolean): Color = when {
        !enabled -> disabledContentColor
        selected || isPressed -> selectedContentColor
        else -> unselectedContentColor
    }
}

/** Contains default values used by [FloatingNavigationBar] and [FloatingNavigationBarItem]. */
object FloatingNavigationBarDefaults {
    /** The default horizontal outside padding. */
    val HorizontalOutSidePadding = 36.dp

    /** The default shadow elevation. */
    val ShadowElevation = 1.dp

    /** The default horizontal padding inside the bar. */
    val HorizontalPadding = 12.dp

    /** The default spacing between items. */
    val ItemSpacing = 12.dp

    /** The icon size for items in [FloatingNavigationBar]. */
    val IconSize = 28.dp

    /** The padding around the icon in [FloatingNavigationBar]. */
    val IconPadding = 10.dp

    /** The alpha value for an unselected item. */
    val UnselectedAlpha = 0.4f
}

/**
 * Defines the display mode for items in a NavigationBar.
 *
 * This controls whether to show both icon and text, icon only, or text only.
 */
enum class NavigationBarDisplayMode {
    /** Show both icon and text. */
    IconAndText,

    /** Show icon only. */
    IconOnly,

    /** Show text only. */
    TextOnly,

    /** Show icon always, show text only when selected. */
    IconWithSelectedLabel,
}

/**
 * A composition local to control the display mode for items in a NavigationBar.
 */
val LocalNavigationBarDisplayMode = compositionLocalOf { NavigationBarDisplayMode.IconAndText }

/**
 * The data class for [NavigationBar].
 *
 * @param label The label of the item.
 * @param icon The icon of the item.
 */
@Immutable
data class NavigationItem(
    val label: String,
    val icon: ImageVector,
)
