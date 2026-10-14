// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package io.github.a1b2d56.opaline.window

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.window.Dialog
import io.github.a1b2d56.opaline.basic.ListPopupColumn
import io.github.a1b2d56.opaline.basic.ListPopupDefaults
import io.github.a1b2d56.opaline.basic.PopupPositionProvider
import io.github.a1b2d56.opaline.basic.PreciseClickState
import io.github.a1b2d56.opaline.layout.ListPopupLayout
import io.github.a1b2d56.opaline.material.LocalMaterialRenderer
import io.github.a1b2d56.opaline.theme.LocalDismissState
import io.github.a1b2d56.opaline.utils.RemovePlatformDialogDefaultEffects
import io.github.a1b2d56.opaline.utils.WindowNavigationEventScope
import io.github.a1b2d56.opaline.utils.platformDialogProperties

/**
 * A popup with a list of items, rendered at window level without `Scaffold`.
 *
 * Use [LocalDismissState] inside `content` to request dismissal from inner composables.
 *
 * @param show Whether the [WindowListPopup] is shown.
 * @param popupModifier The modifier to be applied to the [WindowListPopup].
 * @param popupPositionProvider The [PopupPositionProvider] of the [WindowListPopup].
 * @param alignment The alignment of the [WindowListPopup].
 * @param enableWindowDim Whether to enable window dimming when the [WindowListPopup] is shown.
 *   Defaults to false: `COUIPopupListWindow` calls `setBackgroundDrawable(null)` and never dims,
 *   so a COUI dropdown leaves the content behind it untouched.
 * @param onDismissRequest The callback when the [WindowListPopup] is dismissed.
 * @param onDismissFinished The callback when the [WindowListPopup] is completely dismissed (after exit animation).
 * @param maxHeight The maximum height of the [WindowListPopup]. If null, the height will be calculated automatically.
 * @param minWidth The minimum width of the [WindowListPopup].
 * @param preciseClickState Opens the popup at the last point recorded by
 *   [io.github.a1b2d56.opaline.basic.preciseClickAnchor] on the anchor instead of centring it on the
 *   anchor, matching COUI `PreciseClickHelper`. Null (default) keeps anchor-centred placement.
 * @param content The [Composable] content of the [WindowListPopup]. You should use the [ListPopupColumn] in general.
 */
@Composable
fun WindowListPopup(
    show: Boolean,
    popupModifier: Modifier = Modifier,
    popupPositionProvider: PopupPositionProvider = ListPopupDefaults.DropdownPositionProvider,
    alignment: PopupPositionProvider.Align = PopupPositionProvider.Align.Start,
    enableWindowDim: Boolean = false,
    onDismissRequest: (() -> Unit)? = null,
    onDismissFinished: (() -> Unit)? = null,
    maxHeight: Dp? = null,
    minWidth: Dp = ListPopupDefaults.MinWidth,
    preciseClickState: PreciseClickState? = null,
    content: @Composable () -> Unit,
) {
    val currentOnDismissRequest = rememberUpdatedState(onDismissRequest)

    ListPopupLayout(
        show = show,
        popupHost = { visible, hostContent ->
            if (visible) {
                Dialog(
                    onDismissRequest = { currentOnDismissRequest.value?.invoke() },
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
        popupModifier = popupModifier,
        popupPositionProvider = popupPositionProvider,
        alignment = alignment,
        enableWindowDim = enableWindowDim,
        onDismissRequest = onDismissRequest,
        onDismissFinished = onDismissFinished,
        maxHeight = maxHeight,
        minWidth = minWidth,
        preciseClickState = preciseClickState,
        content = {
            CompositionLocalProvider(
                LocalDismissState provides {
                    currentOnDismissRequest.value?.invoke()
                },
            ) {
                content()
            }
        },
    )
}
