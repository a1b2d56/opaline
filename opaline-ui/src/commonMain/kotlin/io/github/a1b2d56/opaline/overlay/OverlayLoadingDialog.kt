// Copyright 2026, COUI contributors
// Modifications Copyright 2026, Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package io.github.a1b2d56.opaline.overlay

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import io.github.a1b2d56.opaline.layout.DialogDefaults
import io.github.a1b2d56.opaline.layout.LoadingDialogContentLayout
import io.github.a1b2d56.opaline.layout.LoadingDialogDefaults
import io.github.a1b2d56.opaline.utils.OpalinePopupUtils.Companion.DialogLayout

/**
 * A small always-centered loading dialog with a rotating spinner and an optional message,
 * matching the COUI rotating progress dialog (COUIRotatingDialogBuilder).
 *
 * @param show Whether the [OverlayLoadingDialog] is shown.
 * @param modifier The modifier to be applied to the [OverlayLoadingDialog].
 * @param text The optional message shown below the spinner.
 * @param textColor The color of the message text.
 * @param spinnerColor The color of the spinner.
 * @param backgroundColor The background color of the loading card.
 * @param enableWindowDim Whether to enable window dimming when the dialog is shown.
 * @param onDismissRequest Will be called when the user tries to dismiss the dialog by clicking
 *   outside or pressing the back button. When null (default), the dialog cannot be dismissed
 *   by the user.
 * @param onDismissFinished The callback when the [OverlayLoadingDialog] is completely dismissed.
 * @param renderInRootScaffold Whether to render the dialog in the root (outermost) Scaffold.
 */
@Composable
fun OverlayLoadingDialog(
    show: Boolean,
    modifier: Modifier = Modifier,
    text: String? = null,
    textColor: Color = LoadingDialogDefaults.textColor(),
    spinnerColor: Color = LoadingDialogDefaults.spinnerColor(),
    backgroundColor: Color = DialogDefaults.backgroundColor(),
    enableWindowDim: Boolean = true,
    onDismissRequest: (() -> Unit)? = null,
    onDismissFinished: (() -> Unit)? = null,
    renderInRootScaffold: Boolean = true,
) {
    LoadingDialogContentLayout(
        show = show,
        popupHost = { visible, hostContent ->
            val visibleState = remember { mutableStateOf(false) }
            visibleState.value = visible
            DialogLayout(
                visible = visibleState,
                enableWindowDim = false,
                enterTransition = EnterTransition.None,
                exitTransition = ExitTransition.None,
                enableAutoLargeScreen = false,
                renderInRootScaffold = renderInRootScaffold,
            ) {
                hostContent()
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
    )
}
