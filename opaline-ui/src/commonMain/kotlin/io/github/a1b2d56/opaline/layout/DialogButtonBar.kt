// Copyright 2026, COUI contributors
// Modifications Copyright 2026, Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package io.github.a1b2d56.opaline.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextMeasurer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.basic.ButtonDefaults
import io.github.a1b2d56.opaline.basic.TextButton
import io.github.a1b2d56.opaline.basic.TextButtonColors
import io.github.a1b2d56.opaline.theme.OpalineTheme

/**
 * A single action in a [DialogButtonBar], addressed by role rather than position because
 * `COUIButtonBarLayout.resortButton` reorders the buttons when the bar stacks.
 *
 * @param text The button label.
 * @param enabled Whether the button is enabled.
 * @param onClick Invoked when the button is clicked.
 */
@Stable
data class DialogButtonBarAction(
    val text: String,
    val enabled: Boolean = true,
    val onClick: () -> Unit,
)

/**
 * A COUI dialog button bar (`COUIButtonBarLayout`) that automatically flips between a horizontal
 * row and a vertical stack.
 *
 * On ColorOS 17 every bar button is a `Widget.COUI.Button.Large.ButtonNew.Secondary` capsule
 * (`COUIAlertDialogBottomButtonSecondary`): a 44dp pill filled with couiColorContainer8 and
 * labelled in couiColorLabelPrimary, the neutral (third) button using the error tint
 * (`COUIAlertDialogBottomButtonSecondary.Last`). Each pill sits in a cell padded by
 * `coui_alert_dialog_button_parent_padding_*` (16dp outer edge, 4dp towards a neighbour, 4dp on
 * top, 16dp under the last row), so two buttons read as a pair of pills with an 8dp gap.
 *
 * `COUIButtonBarLayout.onMeasure` keeps the bar horizontal only when every label fits and there are
 * exactly two buttons; in every other case it stacks, ordering the buttons neutral / positive /
 * negative. See [DialogButtonBarDefaults] for the metrics.
 *
 * One button can be [recommended] (`COUIButtonBarLayout.setRecommendButtonId`): it becomes a
 * primary pill filled with the theme color, in either layout. Recommending a button does not change
 * whether the bar stacks.
 *
 * @param negative The negative (cancel) action. Hidden when null.
 * @param positive The positive (confirm) action. Hidden when null.
 * @param modifier The modifier to be applied to the bar.
 * @param neutral The neutral (third) action. Hidden when null.
 * @param recommended The role drawn as the highlighted primary pill, or null for none.
 * @param dynamicLayout Whether the bar may stack itself, like
 *   `COUIButtonBarLayout.setDynamicLayout`.
 * @param showDivider Whether hairlines are drawn between stacked pills. ColorOS 17 pills carry no
 *   dividers, so this defaults to false.
 * @param hasContentAbove Whether the dialog shows a title, message or custom panel above the bar.
 *   COUI adds [DialogButtonBarDefaults.StackedButtonPaddingTopExtra] to the top-most stacked pill
 *   only when nothing sits above it.
 * @param colors The [TextButtonColors] of the negative and positive pills.
 * @param neutralColors The [TextButtonColors] of the neutral pill.
 * @param recommendedColors The [TextButtonColors] of the [recommended] pill.
 * @param dividerColor The color of the optional hairlines between stacked pills.
 * @param textStyle The text style of the labels, also used to measure them for the flip decision.
 */
@Composable
fun DialogButtonBar(
    negative: DialogButtonBarAction?,
    positive: DialogButtonBarAction?,
    modifier: Modifier = Modifier,
    neutral: DialogButtonBarAction? = null,
    recommended: DialogButtonBarRole? = null,
    dynamicLayout: Boolean = true,
    showDivider: Boolean = false,
    hasContentAbove: Boolean = true,
    colors: TextButtonColors = DialogButtonBarDefaults.buttonColors(),
    neutralColors: TextButtonColors = DialogButtonBarDefaults.neutralButtonColors(),
    recommendedColors: TextButtonColors = DialogButtonBarDefaults.recommendedButtonColors(),
    dividerColor: Color = OpalineTheme.colorScheme.dividerLine,
    textStyle: TextStyle = OpalineTheme.textStyles.button,
) {
    if (negative == null && positive == null && neutral == null) return

    BoxWithConstraints(modifier) {
        val textMeasurer = rememberTextMeasurer()
        val density = LocalDensity.current
        // COUI clamps the measured bar width to coui_dialog_max_width before deciding.
        val barWidth = minOf(maxWidth, DialogDefaults.MaxWidth)
        val buttonCount = listOfNotNull(negative, positive, neutral).size

        val stacked = remember(
            barWidth,
            buttonCount,
            dynamicLayout,
            textStyle,
            density,
            negative?.text,
            positive?.text,
            neutral?.text,
        ) {
            if (!dynamicLayout) {
                false
            } else {
                val labelsFit = labelsFitInRow(
                    negative = negative,
                    positive = positive,
                    neutral = neutral,
                    barWidth = barWidth,
                    buttonCount = buttonCount,
                    textStyle = textStyle,
                    textMeasurer = textMeasurer,
                    density = density,
                )
                // COUIButtonBarLayout.onMeasure stays horizontal only when the labels fit and there
                // are exactly two buttons.
                !(labelsFit && buttonCount == 2)
            }
        }

        val colorsFor: (DialogButtonBarRole) -> TextButtonColors = { role ->
            when (role) {
                recommended -> recommendedColors
                DialogButtonBarRole.Neutral -> neutralColors
                else -> colors
            }
        }
        if (stacked) {
            StackedButtonBar(
                negative = negative,
                positive = positive,
                neutral = neutral,
                showDivider = showDivider,
                hasContentAbove = hasContentAbove,
                colorsFor = colorsFor,
                dividerColor = dividerColor,
                textStyle = textStyle,
            )
        } else {
            RowButtonBar(
                negative = negative,
                positive = positive,
                neutral = neutral,
                colorsFor = colorsFor,
                textStyle = textStyle,
            )
        }
    }
}

/**
 * Whether every label fits its pill, inverting `COUIButtonBarLayout.needSetButVertical`: the bar
 * width is split evenly between the buttons, and each cell loses its two text paddings plus the
 * outer (`coui_alert_dialog_button_parent_padding_horizontal`) and inner
 * (`coui_alert_dialog_button_parent_padding_horizontal_inside`) cell paddings. One label wider
 * than what is left forces the bar to stack.
 */
private fun labelsFitInRow(
    negative: DialogButtonBarAction?,
    positive: DialogButtonBarAction?,
    neutral: DialogButtonBarAction?,
    barWidth: Dp,
    buttonCount: Int,
    textStyle: TextStyle,
    textMeasurer: TextMeasurer,
    density: Density,
): Boolean {
    if (buttonCount == 0) return true
    val availablePx = density.rowLabelBudgetPx(barWidth, buttonCount)
    return listOfNotNull(positive, negative, neutral).all { action ->
        // COUI measures the raw single-line paint width of the label.
        textMeasurer.measure(
            text = action.text,
            style = textStyle,
            softWrap = false,
            maxLines = 1,
        ).size.width <= availablePx
    }
}

/** The widest label, in pixels, that fits one of [buttonCount] equal cells of a [barWidth] row. */
internal fun Density.rowLabelBudgetPx(barWidth: Dp, buttonCount: Int): Int = barWidth.roundToPx() / buttonCount -
    DialogButtonBarDefaults.ButtonHorizontalPadding.roundToPx() * 2 -
    DialogButtonBarDefaults.CellPaddingOuter.roundToPx() -
    DialogButtonBarDefaults.CellPaddingInner.roundToPx()

/**
 * The horizontal tier of `COUIButtonBarLayout` (`setButtonsHorizontal` + `resetHorButsPadding`):
 * equal-weight pills ordered negative / neutral / positive. The leading cell is padded
 * (outer, top, inner, bottom) and the trailing one (inner, top, outer, bottom).
 */
@Composable
private fun RowButtonBar(
    negative: DialogButtonBarAction?,
    positive: DialogButtonBarAction?,
    neutral: DialogButtonBarAction?,
    colorsFor: (DialogButtonBarRole) -> TextButtonColors,
    textStyle: TextStyle,
) {
    val slots = listOfNotNull(
        negative?.let { DialogButtonBarRole.Negative to it },
        neutral?.let { DialogButtonBarRole.Neutral to it },
        positive?.let { DialogButtonBarRole.Positive to it },
    )
    Row(modifier = Modifier.fillMaxWidth()) {
        slots.forEachIndexed { index, (slot, action) ->
            val isFirst = index == 0
            val isLast = index == slots.lastIndex
            Box(
                modifier = Modifier
                    .weight(1f)
                    .padding(
                        start = if (isFirst) DialogButtonBarDefaults.CellPaddingOuter else DialogButtonBarDefaults.CellPaddingInner,
                        top = DialogButtonBarDefaults.CellPaddingTop,
                        end = if (isLast) DialogButtonBarDefaults.CellPaddingOuter else DialogButtonBarDefaults.CellPaddingInner,
                        bottom = DialogButtonBarDefaults.CellPaddingBottom,
                    ),
            ) {
                BarPill(
                    action = action,
                    colors = colorsFor(slot),
                    textStyle = textStyle,
                    topPadding = DialogButtonBarDefaults.RowButtonPaddingVertical,
                    bottomPadding = DialogButtonBarDefaults.RowButtonPaddingVertical,
                )
            }
        }
    }
}

/**
 * The vertical tier of `COUIButtonBarLayout` (`setButtonsVertical` + `resetVerButsPadding`):
 * full-width pills ordered neutral / positive / negative, each in a cell padded 16dp on both
 * sides and 4dp on top, with 4dp below every pill but the last, which gets the 16dp panel inset.
 */
@Composable
private fun StackedButtonBar(
    negative: DialogButtonBarAction?,
    positive: DialogButtonBarAction?,
    neutral: DialogButtonBarAction?,
    showDivider: Boolean,
    hasContentAbove: Boolean,
    colorsFor: (DialogButtonBarRole) -> TextButtonColors,
    dividerColor: Color,
    textStyle: TextStyle,
) {
    // COUI resortButton brings neutral, then positive, then negative to the front when stacking.
    val slots = listOfNotNull(
        neutral?.let { DialogButtonBarRole.Neutral to it },
        positive?.let { DialogButtonBarRole.Positive to it },
        negative?.let { DialogButtonBarRole.Negative to it },
    )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            // COUI only adds coui_bottom_alert_dialog_buttonbar_margintop once the stacked bar
            // holds more than one button.
            .padding(top = if (slots.size > 1) DialogButtonBarDefaults.StackedBarMarginTop else 0.dp),
    ) {
        slots.forEachIndexed { index, (slot, action) ->
            if (index > 0 && showDivider) {
                Box(
                    modifier = Modifier
                        .padding(horizontal = DialogButtonBarDefaults.StackedDividerInsetHorizontal)
                        .fillMaxWidth()
                        .height(DialogButtonBarDefaults.StackedDividerThickness)
                        .background(dividerColor),
                )
            }
            val isTop = index == 0
            val isBottom = index == slots.lastIndex
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = DialogButtonBarDefaults.CellPaddingOuter,
                        top = DialogButtonBarDefaults.CellPaddingTop,
                        end = DialogButtonBarDefaults.CellPaddingOuter,
                        bottom = if (isBottom) DialogButtonBarDefaults.CellPaddingBottom else DialogButtonBarDefaults.CellPaddingTop,
                    ),
            ) {
                BarPill(
                    action = action,
                    colors = colorsFor(slot),
                    textStyle = textStyle,
                    topPadding = DialogButtonBarDefaults.StackedButtonPaddingVertical +
                        if (isTop && !hasContentAbove) DialogButtonBarDefaults.StackedButtonPaddingTopExtra else 0.dp,
                    bottomPadding = DialogButtonBarDefaults.StackedButtonPaddingVertical +
                        if (isBottom) DialogButtonBarDefaults.StackedButtonPaddingBottomExtra else 0.dp,
                )
            }
        }
    }
}

/** One `ButtonNew.Secondary` capsule: 44dp minimum height, fully rounded, press-scaled. */
@Composable
private fun BarPill(
    action: DialogButtonBarAction,
    colors: TextButtonColors,
    textStyle: TextStyle,
    topPadding: Dp,
    bottomPadding: Dp,
) {
    TextButton(
        text = action.text,
        onClick = action.onClick,
        modifier = Modifier.fillMaxWidth(),
        enabled = action.enabled,
        cornerRadius = DialogButtonBarDefaults.ButtonCornerRadius,
        minWidth = 0.dp,
        minHeight = DialogButtonBarDefaults.ButtonMinHeight,
        colors = colors,
        insideMargin = PaddingValues(
            start = DialogButtonBarDefaults.ButtonHorizontalPadding,
            top = topPadding,
            end = DialogButtonBarDefaults.ButtonHorizontalPadding,
            bottom = bottomPadding,
        ),
        textStyle = textStyle,
    )
}

/** The roles of the buttons in a [DialogButtonBar], which decide their order and colors. */
enum class DialogButtonBarRole {
    /** The cancel action. */
    Negative,

    /** The confirm action. */
    Positive,

    /** The third action, tinted with the error color. */
    Neutral,
}

object DialogButtonBarDefaults {
    /**
     * The horizontal text padding inside a bar pill. COUI
     * `coui_alert_dialog_button_horizontal_padding` (12dp on ColorOS 17).
     */
    val ButtonHorizontalPadding = 12.dp

    /** The minimum height of a bar pill. COUI `coui_btn_large_height_min` (44dp). */
    val ButtonMinHeight = 44.dp

    /**
     * The corner radius of a bar pill: half of [ButtonMinHeight], since `ButtonNew` sets
     * `drawableRadius` to the full-capsule sentinel.
     */
    val ButtonCornerRadius = 22.dp

    /** The padding of a cell on the bar's outer edge. COUI `coui_alert_dialog_button_parent_padding_horizontal`. */
    val CellPaddingOuter = 16.dp

    /** The padding of a cell towards its neighbour. COUI `coui_alert_dialog_button_parent_padding_horizontal_inside`. */
    val CellPaddingInner = 4.dp

    /** The top padding of a cell. COUI `coui_alert_dialog_button_parent_padding_vertical`. */
    val CellPaddingTop = 4.dp

    /** The bottom padding of the last row of cells. COUI `coui_alert_dialog_button_parent_padding_bottom`. */
    val CellPaddingBottom = 16.dp

    /**
     * The vertical text padding of a pill in the horizontal tier. COUI
     * `coui_bottom_alert_dialog_horizontal_button_padding_top_extra_new` / `_bottom_extra_new`.
     */
    val RowButtonPaddingVertical = 4.dp

    /**
     * The vertical text padding of a stacked pill. COUI
     * `coui_bottom_alert_dialog_vertical_button_padding_vertical_new` (`mVerButtonVecPaddingNew`).
     */
    val StackedButtonPaddingVertical = 4.dp

    /**
     * The extra top padding of the top-most stacked pill when nothing sits above the bar.
     * COUI `coui_bottom_alert_dialog_vertical_button_padding_top_extra_new` (0dp on ColorOS 17).
     */
    val StackedButtonPaddingTopExtra = 0.dp

    /**
     * The extra bottom padding of the bottom-most stacked pill.
     * COUI `coui_bottom_alert_dialog_vertical_button_padding_bottom_extra_new` (0dp on ColorOS 17).
     */
    val StackedButtonPaddingBottomExtra = 0.dp

    /**
     * The top margin of a stacked bar holding more than one button. COUI
     * `coui_bottom_alert_dialog_buttonbar_margintop` (0dp on ColorOS 17).
     */
    val StackedBarMarginTop = 0.dp

    /**
     * The thickness of the optional hairline between stacked pills. COUI
     * `coui_delete_alert_dialog_divider_height_verticalbutton`.
     */
    val StackedDividerThickness = 0.33.dp

    /** The horizontal inset of the optional hairline between stacked pills. */
    val StackedDividerInsetHorizontal = 16.dp

    /**
     * The colors of the negative and positive pills: couiColorContainer8 fill
     * (`#14000000` / `#1AFFFFFF`) and couiColorLabelPrimary text, as in
     * `COUIAlertDialogBottomButtonSecondary` (`coui_btn_secondary_text_color`).
     */
    @Composable
    fun buttonColors(): TextButtonColors = ButtonDefaults.textButtonColors(
        color = OpalineTheme.colorScheme.secondaryVariant,
        disabledColor = OpalineTheme.colorScheme.disabledSecondaryVariant,
        textColor = OpalineTheme.colorScheme.onSecondaryVariant,
        disabledTextColor = OpalineTheme.colorScheme.disabledOnSecondaryVariant,
    )

    /**
     * The colors of the neutral pill: the same container with couiColorError text, as in
     * `COUIAlertDialogBottomButtonSecondary.Last` (`coui_btn_error_text_color`).
     */
    @Composable
    fun neutralButtonColors(): TextButtonColors = ButtonDefaults.textButtonColors(
        color = OpalineTheme.colorScheme.secondaryVariant,
        disabledColor = OpalineTheme.colorScheme.disabledSecondaryVariant,
        textColor = OpalineTheme.colorScheme.error,
        disabledTextColor = OpalineTheme.colorScheme.error.copy(alpha = 0.3f),
    )

    /**
     * The colors of the recommended pill, which `COUIButtonBarLayout` turns into a
     * `ButtonType.PRIMARY` button: couiColorLabelTheme fill, `coui_btn_default_text_color` text and
     * couiColorDisable when disabled.
     */
    @Composable
    fun recommendedButtonColors(): TextButtonColors = ButtonDefaults.textButtonColorsPrimary()
}
