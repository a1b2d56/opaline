// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package component

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import io.github.a1b2d56.opaline.basic.Icon
import io.github.a1b2d56.opaline.basic.IconButton
import io.github.a1b2d56.opaline.icon.OpalineIcons
import io.github.a1b2d56.opaline.icon.extended.Back
import io.github.a1b2d56.opaline.theme.OpalineTheme.colorScheme

@Composable
fun BackNavigationIcon(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val layoutDirection = LocalLayoutDirection.current
    IconButton(
        modifier = modifier,
        onClick = onClick,
    ) {
        Icon(
            modifier = Modifier.graphicsLayer {
                if (layoutDirection == LayoutDirection.Rtl) scaleX = -1f
            },
            imageVector = OpalineIcons.Back,
            contentDescription = null,
            tint = colorScheme.onBackground,
        )
    }
}
