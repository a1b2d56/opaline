// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package io.github.a1b2d56.opaline.preference

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.basic.BasicComponent
import io.github.a1b2d56.opaline.basic.BasicComponentColors
import io.github.a1b2d56.opaline.basic.BasicComponentDefaults
import io.github.a1b2d56.opaline.basic.CardListPosition
import io.github.a1b2d56.opaline.icon.OpalineIcons
import io.github.a1b2d56.opaline.icon.basic.ArrowRight
import io.github.a1b2d56.opaline.theme.OpalineTheme

/**
 * An arrow with a title and a summary.
 *
 * @param title The title of the [ArrowPreference].
 * @param titleColor The color of the title.
 * @param summary The summary of the [ArrowPreference].
 * @param summaryColor The color of the summary.
 * @param startAction The [Composable] content on the start side of the [ArrowPreference].
 * @param endActions The [Composable] content on the end side of the [ArrowPreference].
 * @param bottomAction The [Composable] content at the bottom of the [ArrowPreference].
 * @param modifier The modifier to be applied to the [ArrowPreference].
 * @param insideMargin The margin inside the [ArrowPreference].
 * @param cardListPosition The row's position inside its card group. Rounded outer edges receive extra padding.
 * @param holdDownState Used to determine whether it is in the pressed state.
 * @param enabled Whether the [ArrowPreference] is clickable.
 */
@Composable
@NonRestartableComposable
fun ArrowPreference(
    title: String,
    modifier: Modifier = Modifier,
    titleColor: BasicComponentColors = BasicComponentDefaults.titleColor(),
    summary: String? = null,
    summaryColor: BasicComponentColors = BasicComponentDefaults.summaryColor(),
    startAction: @Composable (() -> Unit)? = null,
    endActions: @Composable RowScope.() -> Unit = {},
    bottomAction: (@Composable () -> Unit)? = null,
    insideMargin: PaddingValues = BasicComponentDefaults.InsideMargin,
    cardListPosition: CardListPosition = CardListPosition.None,
    onClick: (() -> Unit)? = null,
    holdDownState: Boolean = false,
    enabled: Boolean = true,
) {
    BasicComponent(
        modifier = modifier,
        insideMargin = insideMargin,
        cardListPosition = cardListPosition,
        title = title,
        titleColor = titleColor,
        summary = summary,
        summaryColor = summaryColor,
        startAction = startAction,
        endActions = {
            Row(
                modifier = Modifier
                    .padding(end = 4.dp)
                    .align(Alignment.CenterVertically)
                    .weight(1f, fill = false),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                endActions()
            }
            ArrowPreferenceEndAction(
                enabled = enabled,
            )
        },
        bottomAction = bottomAction,
        onClick = onClick,
        holdDownState = holdDownState,
        enabled = enabled,
    )
}

@Composable
private fun RowScope.ArrowPreferenceEndAction(
    enabled: Boolean,
) {
    val actionColors = ArrowPreferenceDefaults.endActionColors()
    val tintFilter = remember(enabled, actionColors) {
        ColorFilter.tint(actionColors.color(enabled = enabled))
    }
    Image(
        modifier = Modifier
            // RTL mirroring is handled by the icon itself (autoMirror).
            .size(width = 12.dp, height = 24.dp)
            .align(Alignment.CenterVertically),
        imageVector = OpalineIcons.Basic.ArrowRight,
        contentDescription = null,
        colorFilter = tintFilter,
    )
}

object ArrowPreferenceDefaults {
    /**
     * The default color of the arrow (COUI coui_btn_next, couiColorLabelTertiary).
     */
    @Composable
    fun endActionColors(): EndActionColors {
        val color = OpalineTheme.colorScheme.onSurfaceVariantActions
        val disabledColor = OpalineTheme.colorScheme.disabledOnSecondaryVariant
        return remember(color, disabledColor) {
            EndActionColors(
                color = color,
                disabledColor = disabledColor,
            )
        }
    }
}

@Immutable
data class EndActionColors(
    private val color: Color,
    private val disabledColor: Color,
) {
    @Stable
    internal fun color(enabled: Boolean): Color = if (enabled) color else disabledColor
}
