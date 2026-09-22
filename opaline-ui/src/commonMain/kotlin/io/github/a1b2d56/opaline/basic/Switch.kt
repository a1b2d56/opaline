// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package io.github.a1b2d56.opaline.basic

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.VectorConverter
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.shadow.Shadow
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.layout
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.disabled
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.toggleableState
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.theme.LocalColors
import io.github.a1b2d56.opaline.theme.OpalineTheme
import io.github.a1b2d56.opaline.theme.OpalineTheme.isDynamicColor
import io.github.a1b2d56.opaline.utils.OpalineHapticEffect
import io.github.a1b2d56.opaline.utils.rememberOpalineHaptic
import kotlinx.coroutines.launch
import kotlin.math.roundToInt

/**
 * A [Switch] component in the ColorOS style.
 *
 * @param checked The checked state of the [Switch].
 * @param onCheckedChange The callback to be called when the state of the [Switch] changes.
 * @param modifier The modifier to be applied to the [Switch].
 * @param colors The [SwitchColors] of the [Switch].
 * @param enabled Whether the [Switch] is enabled.
 * @param isLoading Whether the [Switch] is in the COUI loading state: the thumb shrinks away and
 *   is replaced by a spinning gradient arc; touch input is swallowed while loading.
 */
@Composable
fun Switch(
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    modifier: Modifier = Modifier,
    colors: SwitchColors = SwitchDefaults.switchColors(),
    enabled: Boolean = true,
    isLoading: Boolean = false,
) {
    val currentOnCheckedChange by rememberUpdatedState(onCheckedChange)
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    val isHovered by interactionSource.collectIsHoveredAsState()

    val opalineHaptic = rememberOpalineHaptic()

    val capsuleShape = CircleShape
    // COUI toggle interpolator, shared by every child animator (COUISwitch.animateWhenStateChanged()).
    val opalineToggleEasing = remember { CubicBezierEasing(0.3f, 0f, 0.1f, 1f) }

    // ColorOS 17 COUISwitch also follows the finger: COUISpringDragHelper with anchors at both ends.
    val thumbOffset = remember {
        Animatable(
            if (checked) SwitchDefaults.ThumbEndOffset else SwitchDefaults.ThumbStartOffset,
            Dp.VectorConverter,
        )
    }

    // COUI thumb stretch ("tail drag"), played on toggle only (COUISwitch.animateWhenStateChanged()).
    val thumbSquash = remember { Animatable(1f) }
    var isFirstComposition by remember { mutableStateOf(true) }
    // Set when a drag released on the other side: the toggle then continues from the finger.
    var toggledByDrag by remember { mutableStateOf(false) }
    LaunchedEffect(checked) {
        if (isFirstComposition) {
            isFirstComposition = false
            return@LaunchedEffect
        }
        if (toggledByDrag) {
            toggledByDrag = false
            thumbOffset.animateTo(
                if (checked) SwitchDefaults.ThumbEndOffset else SwitchDefaults.ThumbStartOffset,
                SwitchDefaults.DragSettleSpec,
            )
            return@LaunchedEffect
        }
        // A new toggle snaps the running animation to its settled values first (COUISwitch.setChecked()).
        thumbOffset.snapTo(if (checked) SwitchDefaults.ThumbStartOffset else SwitchDefaults.ThumbEndOffset)
        thumbSquash.snapTo(1f)
        launch {
            thumbOffset.animateTo(
                if (checked) SwitchDefaults.ThumbEndOffset else SwitchDefaults.ThumbStartOffset,
                tween(durationMillis = 383, easing = opalineToggleEasing),
            )
        }
        thumbSquash.animateTo(1.3f, tween(durationMillis = 133, easing = opalineToggleEasing))
        thumbSquash.animateTo(1f, tween(durationMillis = 250, easing = opalineToggleEasing))
    }

    val thumbColorState = animateColorAsState(
        if (checked) colors.checkedThumbColor(enabled) else colors.uncheckedThumbColor(enabled),
    )

    val backgroundColorState = animateColorAsState(
        if (checked) colors.checkedTrackColor(enabled) else colors.uncheckedTrackColor(enabled),
        animationSpec = tween(durationMillis = 450, easing = opalineToggleEasing),
    )

    // COUI press/hover feedback: translucent overlay over the bar color (coui_color_press / coui_color_hover).
    val overlayTone = OpalineTheme.colorScheme.onSurface
    val pressOverlayState = animateColorAsState(
        when {
            !enabled -> Color.Transparent
            isPressed -> overlayTone.copy(alpha = 0.12f)
            isHovered -> overlayTone.copy(alpha = 0.078f)
            else -> Color.Transparent
        },
    )

    // COUI loading state (COUISwitch.startLoading()/stopLoading()).
    val thumbScale = remember { Animatable(1f) }
    val loadingAlpha = remember { Animatable(0f) }
    val loadingScale = remember { Animatable(0.5f) }
    val loadingRotation = remember { Animatable(0f) }
    LaunchedEffect(isLoading) {
        if (isLoading) {
            loadingAlpha.snapTo(0f)
            loadingScale.snapTo(0.5f)
            launch { thumbScale.animateTo(0f, tween(durationMillis = 433, easing = opalineToggleEasing)) }
            launch { loadingScale.animateTo(1f, tween(durationMillis = 550, easing = opalineToggleEasing)) }
            launch { loadingAlpha.animateTo(1f, tween(durationMillis = 550, easing = opalineToggleEasing)) }
            while (true) {
                loadingRotation.snapTo(0f)
                loadingRotation.animateTo(360f, tween(durationMillis = 800, easing = LinearEasing))
            }
        } else {
            thumbScale.snapTo(1f)
            loadingAlpha.animateTo(0f, tween(durationMillis = 100, easing = opalineToggleEasing))
        }
    }

    val currentOpalineHaptic by rememberUpdatedState(opalineHaptic)
    // Loading switches cannot be toggled (COUISwitch loading style swallows touch).
    val interactive = enabled && !isLoading
    val hasCallback = onCheckedChange != null
    val toggleableModifier = if (hasCallback) {
        remember(checked, interactive, interactionSource) {
            Modifier.toggleable(
                value = checked,
                onValueChange = { v ->
                    currentOnCheckedChange?.invoke(v)
                    currentOpalineHaptic(OpalineHapticEffect.Switch)
                },
                enabled = interactive,
                role = Role.Switch,
                interactionSource = interactionSource,
            )
        }
    } else {
        Modifier.semantics {
            role = Role.Switch
            toggleableState = ToggleableState(checked)
            if (!enabled) disabled()
        }
    }

    val isRtl = LocalLayoutDirection.current == LayoutDirection.Rtl
    val dragScope = rememberCoroutineScope()
    val dragModifier = if (hasCallback && interactive) {
        Modifier.pointerInput(checked, isRtl) {
            val start = SwitchDefaults.ThumbStartOffset.toPx()
            val end = SwitchDefaults.ThumbEndOffset.toPx()
            var position = 0f
            detectHorizontalDragGestures(
                onDragStart = {
                    position = thumbOffset.value.toPx()
                    dragScope.launch { thumbSquash.snapTo(1f) }
                },
                onHorizontalDrag = { change, dragAmount ->
                    change.consume()
                    position += if (isRtl) -dragAmount else dragAmount
                    val shown = switchDragDisplayPosition(position, start, end)
                    dragScope.launch { thumbOffset.snapTo(shown.toDp()) }
                },
                onDragEnd = {
                    val target = switchDragTarget(position, start, end)
                    if (target != checked) {
                        toggledByDrag = true
                        currentOnCheckedChange?.invoke(target)
                        currentOpalineHaptic(OpalineHapticEffect.Switch)
                    } else {
                        dragScope.launch {
                            thumbOffset.animateTo(
                                if (checked) SwitchDefaults.ThumbEndOffset else SwitchDefaults.ThumbStartOffset,
                                SwitchDefaults.DragSettleSpec,
                            )
                        }
                    }
                },
                onDragCancel = {
                    dragScope.launch {
                        thumbOffset.animateTo(
                            if (checked) SwitchDefaults.ThumbEndOffset else SwitchDefaults.ThumbStartOffset,
                            SwitchDefaults.DragSettleSpec,
                        )
                    }
                },
            )
        }
    } else {
        Modifier
    }

    Box(
        modifier = modifier
            .wrapContentSize(Alignment.Center)
            .size(SwitchDefaults.TrackWidth, SwitchDefaults.TrackHeight)
            .clip(capsuleShape)
            .drawBehind {
                drawRect(backgroundColorState.value)
                drawRect(pressOverlayState.value)
            }
            .hoverable(
                interactionSource = interactionSource,
                enabled = interactive,
            )
            .then(toggleableModifier)
            .then(dragModifier),
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .offset {
                    // The stretch extends backwards, against the direction of travel
                    // (COUISwitch.setOuterCircleRectF()).
                    val thumbPx = SwitchDefaults.ThumbSize.roundToPx()
                    val stretchedPx = (thumbPx * thumbSquash.value).roundToInt()
                    val restingLeft = thumbOffset.value.roundToPx()
                    val left = if (checked) restingLeft + thumbPx - stretchedPx else restingLeft
                    IntOffset(left, 0)
                }
                .layout { measurable, _ ->
                    // Stretch by resizing instead of scaling so the thumb stays a capsule.
                    val thumbPx = SwitchDefaults.ThumbSize.roundToPx()
                    val stretchedPx = (thumbPx * thumbSquash.value).roundToInt()
                    val placeable = measurable.measure(Constraints.fixed(stretchedPx, thumbPx))
                    layout(stretchedPx, thumbPx) { placeable.place(0, 0) }
                },
        ) {
            Box(
                modifier = Modifier
                    .matchParentSize()
                    .graphicsLayer {
                        // COUI loading hides the thumb by scaling it about its centre.
                        scaleX = thumbScale.value
                        scaleY = thumbScale.value
                    }
                    .then(
                        if (enabled) {
                            // COUISwitch clears the shadow layer when disabled.
                            Modifier.dropShadow(shape = CircleShape, shadow = SwitchDefaults.ThumbShadow)
                        } else {
                            Modifier
                        },
                    )
                    .drawBehind {
                        // A circle at rest, a capsule while stretched (COUISwitch.drawOuterCircle).
                        drawRoundRect(
                            color = thumbColorState.value,
                            cornerRadius = CornerRadius(size.height / 2f),
                        )
                    },
            )
            Box(
                modifier = Modifier
                    .matchParentSize()
                    .drawBehind {
                        // COUISwitch.drawLoading(): arc geometry follows switch_loading.png
                        // (stroke 8/40, centre-line diameter 32/40, ~312 deg alpha-tail sweep).
                        val alpha = loadingAlpha.value
                        if (alpha > 0f) {
                            val side = size.minDimension
                            val strokeWidth = side * 0.2f
                            val arcDiameter = side * 0.8f
                            val topLeft = Offset((size.width - arcDiameter) / 2f, (size.height - arcDiameter) / 2f)
                            val color = thumbColorState.value
                            val brush = Brush.sweepGradient(
                                0f to color.copy(alpha = 0f),
                                312f / 360f to color.copy(alpha = color.alpha * alpha),
                                center = Offset(size.width / 2f, size.height / 2f),
                            )
                            scale(loadingScale.value) {
                                // +150 deg phase puts the head at ~102 deg like the source PNG.
                                rotate(loadingRotation.value + 150f) {
                                    drawArc(
                                        brush = brush,
                                        startAngle = 0f,
                                        sweepAngle = 312f,
                                        useCenter = false,
                                        topLeft = topLeft,
                                        size = Size(arcDiameter, arcDiameter),
                                        style = Stroke(width = strokeWidth, cap = StrokeCap.Butt),
                                    )
                                }
                            }
                        }
                    },
            )
        }
    }
}

object SwitchDefaults {

    /** The track width of the [Switch] (COUISwitch switchMinWidth = bar_width, 44dp on ColorOS 17). */
    val TrackWidth: Dp = 44.dp

    /** The track height of the [Switch] (COUISwitch bar_height). */
    val TrackHeight: Dp = 24.dp

    /** The diameter of the [Switch] thumb (COUISwitch outer_circle_width). */
    val ThumbSize: Dp = 18.dp

    /** The inset of the thumb from the track edge when fully on one side (COUISwitch circle_padding). */
    private val ThumbMargin: Dp = 3.dp

    /** The thumb offset in the unchecked (off) position. */
    val ThumbStartOffset: Dp = ThumbMargin

    /** The thumb offset in the checked (on) position. */
    val ThumbEndOffset: Dp = TrackWidth - ThumbSize - ThumbMargin

    /** The distance the thumb travels between off and on. */
    val Travel: Dp = ThumbEndOffset - ThumbStartOffset

    /**
     * How far the thumb follows the finger past either end of its travel
     * (COUISwitch.initSpringDragHelper: COUISpringDragHelper over-drag factor 0.55).
     */
    val DragOverscrollFactor: Float = 0.55f

    /** The spring that settles the thumb after a drag (critically damped, like COUISpringDragHelper). */
    val DragSettleSpec: AnimationSpec<Dp> = spring(dampingRatio = 1f, stiffness = Spring.StiffnessMediumLow)

    /**
     * The drop shadow under the thumb while the [Switch] is enabled
     * (COUISwitch.setPaintShadowLayer at the 3.5x ColorOS reference density).
     */
    val ThumbShadow: Shadow = Shadow(
        radius = 2.29.dp,
        color = Color(0x19000000),
        offset = DpOffset(x = 0.dp, y = 1.14.dp),
    )

    /**
     * The default colors for the [Switch]. COUISwitch keeps the thumb white in both states.
     */
    @Composable
    fun switchColors(
        checkedThumbColor: Color = if (isDynamicColor) LocalColors.current.onPrimary else OpalineTheme.colorScheme.onPrimary,
        uncheckedThumbColor: Color = if (isDynamicColor) LocalColors.current.onPrimary else OpalineTheme.colorScheme.onSecondary,
        disabledCheckedThumbColor: Color = if (isDynamicColor) LocalColors.current.surface else OpalineTheme.colorScheme.disabledOnPrimary,
        disabledUncheckedThumbColor: Color = OpalineTheme.colorScheme.disabledOnSecondary,
        checkedTrackColor: Color = OpalineTheme.colorScheme.primary,
        uncheckedTrackColor: Color = OpalineTheme.colorScheme.controls,
        disabledCheckedTrackColor: Color = OpalineTheme.colorScheme.disabledPrimary,
        disabledUncheckedTrackColor: Color = OpalineTheme.colorScheme.disabledSecondary,
    ): SwitchColors = remember(
        checkedThumbColor,
        uncheckedThumbColor,
        disabledCheckedThumbColor,
        disabledUncheckedThumbColor,
        checkedTrackColor,
        uncheckedTrackColor,
        disabledCheckedTrackColor,
        disabledUncheckedTrackColor,
    ) {
        SwitchColors(
            checkedThumbColor = checkedThumbColor,
            uncheckedThumbColor = uncheckedThumbColor,
            disabledCheckedThumbColor = disabledCheckedThumbColor,
            disabledUncheckedThumbColor = disabledUncheckedThumbColor,
            checkedTrackColor = checkedTrackColor,
            uncheckedTrackColor = uncheckedTrackColor,
            disabledCheckedTrackColor = disabledCheckedTrackColor,
            disabledUncheckedTrackColor = disabledUncheckedTrackColor,
        )
    }
}

@Immutable
data class SwitchColors(
    private val checkedThumbColor: Color,
    private val uncheckedThumbColor: Color,
    private val disabledCheckedThumbColor: Color,
    private val disabledUncheckedThumbColor: Color,
    private val checkedTrackColor: Color,
    private val uncheckedTrackColor: Color,
    private val disabledCheckedTrackColor: Color,
    private val disabledUncheckedTrackColor: Color,
) {
    @Stable
    internal fun checkedThumbColor(enabled: Boolean): Color = if (enabled) checkedThumbColor else disabledCheckedThumbColor

    @Stable
    internal fun uncheckedThumbColor(enabled: Boolean): Color = if (enabled) uncheckedThumbColor else disabledUncheckedThumbColor

    @Stable
    internal fun checkedTrackColor(enabled: Boolean): Color = if (enabled) checkedTrackColor else disabledCheckedTrackColor

    @Stable
    internal fun uncheckedTrackColor(enabled: Boolean): Color = if (enabled) uncheckedTrackColor else disabledUncheckedTrackColor
}

/**
 * Where the thumb is drawn for a drag [position] between the [start] and [end] anchors: past either
 * end it resists like `COUISpringDragHelper`, moving by [factor] of the finger travel.
 */
internal fun switchDragDisplayPosition(
    position: Float,
    start: Float,
    end: Float,
    factor: Float = SwitchDefaults.DragOverscrollFactor,
): Float = when {
    position < start -> start + (position - start) * factor
    position > end -> end + (position - end) * factor
    else -> position
}

/** Whether a drag released at [position] leaves the switch checked: past the middle of the track. */
internal fun switchDragTarget(position: Float, start: Float, end: Float): Boolean = position.coerceIn(start, end) > (start + end) / 2f
