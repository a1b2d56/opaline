// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package io.github.a1b2d56.opaline.anim

import androidx.compose.animation.core.Easing
import kotlin.math.PI
import kotlin.math.sin

val SinOutEasing: Easing = Easing { fraction ->
    sin((fraction * PI / 2).toFloat())
}
