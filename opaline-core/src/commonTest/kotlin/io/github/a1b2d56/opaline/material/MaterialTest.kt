// Copyright 2026, Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package io.github.a1b2d56.opaline.material

import androidx.compose.ui.graphics.Color
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class MaterialTest {
    @Test
    fun toolbarControlsFallBackToTheirSolidColors() {
        assertEquals(Color(0xFFF0F0F0), materialFallbackColor(MaterialType.TopBarCircle, dark = false))
        assertEquals(Color(0xFF333333), materialFallbackColor(MaterialType.TopBarCapsule, dark = true))
    }

    @Test
    fun otherSurfacesKeepTheirOwnFill() {
        MaterialType.entries
            .filter { it != MaterialType.TopBarCircle && it != MaterialType.TopBarCapsule }
            .forEach { assertNull(materialFallbackColor(it, dark = false)) }
    }
}
