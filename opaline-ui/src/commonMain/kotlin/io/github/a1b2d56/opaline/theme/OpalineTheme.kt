// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package io.github.a1b2d56.opaline.theme

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.LocalOverscrollFactory
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import io.github.a1b2d56.opaline.utils.OpalineIndication
import io.github.a1b2d56.opaline.utils.OpalineOverscrollFactory

/**
 * The COUI theme that provides color and text styles for the COUI components.
 * This theme supports dynamic color schemes through the [ThemeController].
 *
 * @param controller The [ThemeController] that controls the current color scheme.
 * @param textStyles The text styles for the COUI components.
 * @param content The content of the COUI theme.
 */
@Composable
fun OpalineTheme(
    controller: ThemeController,
    textStyles: TextStyles = OpalineTheme.textStyles,
    content: @Composable () -> Unit,
) {
    ProvideDisplayCutoutFix()
    val rawColors = controller.currentColors()
    val opalineColors = remember { rawColors.copy() }.apply { updateColorsFrom(rawColors) }
    val opalineTextStyles = remember { textStyles.copy() }.apply { updateTextStylesFrom(textStyles) }
    val opalineIndication = remember(opalineColors.onBackground) { OpalineIndication(color = opalineColors.onBackground) }
    CompositionLocalProvider(
        LocalColors provides opalineColors,
        LocalTextStyles provides opalineTextStyles,
        LocalIndication provides opalineIndication,
        LocalContentColor provides opalineColors.onBackground,
        LocalColorSchemeMode provides controller.colorSchemeMode,
        LocalOverscrollFactory provides OpalineOverscrollFactory,
    ) {
        content()
    }
}

/**
 * The COUI theme that provides color and text styles for the COUI components.
 * This theme uses the provided [colors] and [textStyles].
 *
 * @param colors The color scheme for the COUI components.
 * @param textStyles The text styles for the COUI components.
 * @param content The content of the COUI theme.
 */
@Composable
fun OpalineTheme(
    colors: Colors = OpalineTheme.colorScheme,
    textStyles: TextStyles = OpalineTheme.textStyles,
    content: @Composable () -> Unit,
) {
    ProvideDisplayCutoutFix()
    val opalineColors = remember { colors.copy() }.apply { updateColorsFrom(colors) }
    val opalineTextStyles = remember { textStyles.copy() }.apply { updateTextStylesFrom(textStyles) }
    val opalineIndication = remember(opalineColors.onBackground) { OpalineIndication(color = opalineColors.onBackground) }
    CompositionLocalProvider(
        LocalColors provides opalineColors,
        LocalTextStyles provides opalineTextStyles,
        LocalIndication provides opalineIndication,
        LocalOverscrollFactory provides OpalineOverscrollFactory,
    ) {
        content()
    }
}

object OpalineTheme {
    val colorScheme: Colors
        @Composable @ReadOnlyComposable
        get() = LocalColors.current

    val textStyles: TextStyles
        @Composable @ReadOnlyComposable
        get() = LocalTextStyles.current

    val colorSchemeMode: ColorSchemeMode?
        @Composable @ReadOnlyComposable
        get() = LocalColorSchemeMode.current

    val isDynamicColor: Boolean
        @Composable @ReadOnlyComposable
        get() = when (colorSchemeMode) {
            ColorSchemeMode.MonetSystem,
            ColorSchemeMode.MonetLight,
            ColorSchemeMode.MonetDark,
            -> true

            else -> false
        }
}
