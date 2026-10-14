// Copyright 2026, Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package io.github.a1b2d56.opaline.basic

import androidx.compose.ui.unit.dp
import kotlin.test.Test
import kotlin.test.assertEquals

class TopTipsRadiusTest {
    @Test
    fun capsuleOnOneLineAndRoundedRectangleOnceWrapped() {
        assertEquals(TopTipsDefaults.SingleLineCornerRadius, topTipsCornerRadius(null, singleLine = true))
        assertEquals(TopTipsDefaults.MultiLineCornerRadius, topTipsCornerRadius(null, singleLine = false))
    }

    @Test
    fun explicitRadiusWins() {
        assertEquals(8.dp, topTipsCornerRadius(8.dp, singleLine = true))
        assertEquals(8.dp, topTipsCornerRadius(8.dp, singleLine = false))
    }
}
