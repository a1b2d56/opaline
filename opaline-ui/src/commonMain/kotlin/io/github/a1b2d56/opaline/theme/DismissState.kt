// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package io.github.a1b2d56.opaline.theme

import androidx.compose.runtime.staticCompositionLocalOf
import io.github.a1b2d56.opaline.overlay.OverlayBottomSheet
import io.github.a1b2d56.opaline.overlay.OverlayDialog
import io.github.a1b2d56.opaline.overlay.OverlayListPopup
import io.github.a1b2d56.opaline.window.WindowBottomSheet
import io.github.a1b2d56.opaline.window.WindowDialog
import io.github.a1b2d56.opaline.window.WindowListPopup

/**
 * CompositionLocal that provides a dismiss request function for overlay components.
 *
 * This is automatically provided by all overlay components ([OverlayDialog], [WindowDialog],
 * [OverlayBottomSheet], [WindowBottomSheet], [OverlayListPopup], [WindowListPopup]).
 *
 * Call the provided function to request dismissal from inside overlay content:
 * ```kotlin
 * val dismiss = LocalDismissState.current
 * Button(onClick = { dismiss?.invoke() }) { Text("Close") }
 * ```
 */
val LocalDismissState = staticCompositionLocalOf<(() -> Unit)?> { null }
