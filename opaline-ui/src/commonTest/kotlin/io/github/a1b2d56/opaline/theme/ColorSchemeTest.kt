// Copyright 2026, Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package io.github.a1b2d56.opaline.theme

import androidx.compose.ui.graphics.Color
import kotlin.test.Test
import kotlin.test.assertEquals

class ColorSchemeTest {
    @Test
    fun controlsSlotMatchesCouiColorControls() {
        assertEquals(Color(0x29000000), lightColorScheme().controls)
        assertEquals(Color(0x40FFFFFF), darkColorScheme().controls)
    }
}
