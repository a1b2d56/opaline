// Copyright 2026, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package io.github.a1b2d56.opaline.window

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import io.github.a1b2d56.opaline.basic.DropdownColors
import io.github.a1b2d56.opaline.basic.DropdownDefaults
import io.github.a1b2d56.opaline.basic.DropdownEntry
import io.github.a1b2d56.opaline.basic.DropdownItem
import io.github.a1b2d56.opaline.basic.ListPopupDefaults
import io.github.a1b2d56.opaline.basic.PopupPositionProvider
import io.github.a1b2d56.opaline.layout.CascadingListPopupLayout
import io.github.a1b2d56.opaline.material.LocalMaterialRenderer
import io.github.a1b2d56.opaline.utils.RemovePlatformDialogDefaultEffects
import io.github.a1b2d56.opaline.utils.WindowNavigationEventScope
import io.github.a1b2d56.opaline.utils.platformDialogProperties

/**
 * A cascading list popup rendered at window level (as a [Dialog]) instead of inside a
 * `Scaffold`, using the traditional solid panel fill and default shadow.
 */
@Composable
fun WindowCascadingListPopup(
    show: Boolean,
    entries: List<DropdownEntry>,
    onDismissRequest: () -> Unit,
    popupModifier: Modifier = Modifier,
    onDismissFinished: (() -> Unit)? = null,
    popupPositionProvider: PopupPositionProvider = ListPopupDefaults.DropdownPositionProvider,
    alignment: PopupPositionProvider.Align = PopupPositionProvider.Align.End,
    enableWindowDim: Boolean = true,
    maxHeight: Dp? = null,
    minWidth: Dp = 200.dp,
    dropdownColors: DropdownColors = DropdownDefaults.dropdownColors(),
    collapseOnSelection: Boolean = true,
) {
    WindowCascadingListPopup(
        show = show,
        entries = entries,
        onDismissRequest = onDismissRequest,
        popupModifier = popupModifier,
        onDismissFinished = onDismissFinished,
        popupPositionProvider = popupPositionProvider,
        alignment = alignment,
        enableWindowDim = enableWindowDim,
        maxHeight = maxHeight,
        minWidth = minWidth,
        dropdownColors = dropdownColors,
        collapseOnSelection = collapseOnSelection,
        surface = null,
    )
}

/**
 * A cascading list popup rendered at window level (as a [Dialog]) instead of inside a
 * `Scaffold`, with a caller-provided panel surface. Pass a modifier factory to draw it with a material. Otherwise behaves identically to
 * [io.github.a1b2d56.opaline.overlay.OverlayCascadingListPopup].
 *
 * @param show Whether the popup is shown.
 * @param entries Grouped dropdown entries; top-level [DropdownItem]s with non-empty
 *   [DropdownItem.children] become submenu triggers. Keep the entry and item order stable while the
 *   popup is shown; item state such as [DropdownItem.selected] may change.
 * @param onDismissRequest Invoked when the popup wants to be dismissed.
 * @param surface Paints the panel's body, given the silhouette it must fill. `null` uses the plain
 *   shadow and fill. A material library hands its own surface in here rather than reimplementing
 *   the popup.
 * @param onDismissFinished Invoked after the exit animation finishes.
 * @param popupModifier Modifier applied to the popup body.
 * @param popupPositionProvider Position strategy for the primary popup relative to its anchor.
 * @param alignment Alignment of the primary popup.
 * @param enableWindowDim Whether to dim the rest of the window while the popup is shown.
 * @param maxHeight Maximum height of either side. Null bounds it by the safe area.
 * @param minWidth Minimum width of the popup.
 * @param dropdownColors Colors used by every row.
 * @param collapseOnSelection When true, selecting any leaf dismisses the popup.
 */
@Composable
fun WindowCascadingListPopup(
    show: Boolean,
    entries: List<DropdownEntry>,
    onDismissRequest: () -> Unit,
    surface: (@Composable (Shape) -> Modifier)?,
    popupModifier: Modifier = Modifier,
    onDismissFinished: (() -> Unit)? = null,
    popupPositionProvider: PopupPositionProvider = ListPopupDefaults.DropdownPositionProvider,
    alignment: PopupPositionProvider.Align = PopupPositionProvider.Align.End,
    enableWindowDim: Boolean = true,
    maxHeight: Dp? = null,
    minWidth: Dp = 200.dp,
    dropdownColors: DropdownColors = DropdownDefaults.dropdownColors(),
    collapseOnSelection: Boolean = true,
) {
    val currentOnDismissRequest = rememberUpdatedState(onDismissRequest)

    CascadingListPopupLayout(
        show = show,
        popupHost = { visible, hostContent ->
            if (visible) {
                Dialog(
                    onDismissRequest = { currentOnDismissRequest.value() },
                    properties = platformDialogProperties(),
                ) {
                    // Materials sample the main window's backdrop; a separate window cannot.
                    CompositionLocalProvider(LocalMaterialRenderer provides null) {
                        RemovePlatformDialogDefaultEffects()
                        WindowNavigationEventScope {
                            hostContent()
                        }
                    }
                }
            }
        },
        entries = entries,
        onDismissRequest = onDismissRequest,
        onDismissFinished = onDismissFinished,
        popupModifier = popupModifier,
        popupPositionProvider = popupPositionProvider,
        alignment = alignment,
        enableWindowDim = enableWindowDim,
        maxHeight = maxHeight,
        minWidth = minWidth,
        dropdownColors = dropdownColors,
        collapseOnSelection = collapseOnSelection,
        surface = surface,
    )
}
