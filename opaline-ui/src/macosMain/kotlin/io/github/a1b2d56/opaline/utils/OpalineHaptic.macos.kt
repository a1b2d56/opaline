// Copyright 2025, COUI contributors
// Modifications Copyright 2026, Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package io.github.a1b2d56.opaline.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback

// No OEM linear motor off Android; map COUI effects to the closest standard Compose haptic.
@Composable
actual fun rememberOpalineHaptic(): (OpalineHapticEffect) -> Unit {
    val haptic = LocalHapticFeedback.current
    return { effect: OpalineHapticEffect ->
        haptic.performHapticFeedback(
            when (effect) {
                OpalineHapticEffect.Switch -> HapticFeedbackType.ToggleOn
                OpalineHapticEffect.Strength -> HapticFeedbackType.SegmentTick
            },
        )
    }
}
