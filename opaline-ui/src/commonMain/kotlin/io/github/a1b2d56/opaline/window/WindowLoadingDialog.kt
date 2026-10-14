// Copyright 2026, COUI contributors
// Modifications Copyright 2026, Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package io.github.a1b2d56.opaline.window

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.captionBar
import androidx.compose.foundation.layout.displayCutout
import androidx.compose.foundation.layout.statusBars
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.Dialog
import io.github.a1b2d56.opaline.layout.DialogDefaults
import io.github.a1b2d56.opaline.layout.LoadingDialogContentLayout
import io.github.a1b2d56.opaline.layout.LoadingDialogDefaults
import io.github.a1b2d56.opaline.material.LocalMaterialRenderer
import io.github.a1b2d56.opaline.utils.RemovePlatformDialogDefaultEffects
import io.github.a1b2d56.opaline.utils.platformDialogProperties

/**
 * A small always-centered loading dialog with a rotating spinner and an optional message,
 * rendered at window level without `Scaffold`, matching the COUI rotating progress dialog
 * (COUIRotatingDialogBuilder).
 *
 * @param show Whether the [WindowLoadingDialog] is shown.
 * @param modifier The modifier to be applied to the [WindowLoadingDialog].
 * @param text The optional message shown below the spinner.
 * @param textColor The color of the message text.
 * @param spinnerColor The color of the spinner.
 * @param backgroundColor The background color of the loading card.
 * @param enableWindowDim Whether to enable window dimming when the dialog is shown.
 * @param onDismissRequest Will be called when the user tries to dismiss the dialog by clicking
 *   outside or pressing the back button. When null (default), the dialog cannot be dismissed
 *   by the user.
 * @param onDismissFinished The callback when the [WindowLoadingDialog] is completely dismissed.
 */
@Composable
fun WindowLoadingDialog(
    show: Boolean,
    modifier: Modifier = Modifier,
    text: String? = null,
    textColor: Color = LoadingDialogDefaults.textColor(),
    spinnerColor: Color = LoadingDialogDefaults.spinnerColor(),
    backgroundColor: Color = DialogDefaults.backgroundColor(),
    enableWindowDim: Boolean = true,
    onDismissRequest: (() -> Unit)? = null,
    onDismissFinished: (() -> Unit)? = null,
) {
    val statusBarsPadding = WindowInsets.statusBars.asPaddingValues().calculateTopPadding()
    val captionBarPadding = WindowInsets.captionBar.asPaddingValues().calculateTopPadding()
    val displayCutoutPadding = WindowInsets.displayCutout.asPaddingValues().calculateTopPadding()
    val safeTopInset = remember(statusBarsPadding, captionBarPadding, displayCutoutPadding) {
        maxOf(statusBarsPadding, captionBarPadding, displayCutoutPadding)
    }

    val currentOnDismissRequest = rememberUpdatedState(onDismissRequest)

    LoadingDialogContentLayout(
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
                        hostContent()
                    }
                }
            }
        },
        modifier = modifier,
        text = text,
        textColor = textColor,
        spinnerColor = spinnerColor,
        backgroundColor = backgroundColor,
        enableWindowDim = enableWindowDim,
        onDismissRequest = onDismissRequest,
        onDismissFinished = onDismissFinished,
        topInset = safeTopInset,
    )
}
