// Copyright 2026, Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package io.github.a1b2d56.opaline.layout

import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import kotlin.test.Test
import kotlin.test.assertEquals

class DialogButtonBarTest {
    @Test
    fun cellBudgetSubtractsTextAndCellPaddings() {
        // 360 / 2 - 12 * 2 (text) - 16 (outer) - 4 (inner)
        assertEquals(136, Density(1f).rowLabelBudgetPx(360.dp, 2))
        // 360 / 3 - 24 - 16 - 4
        assertEquals(76, Density(1f).rowLabelBudgetPx(360.dp, 3))
    }

    @Test
    fun cellBudgetScalesWithDensity() {
        assertEquals(272, Density(2f).rowLabelBudgetPx(360.dp, 2))
    }
}
