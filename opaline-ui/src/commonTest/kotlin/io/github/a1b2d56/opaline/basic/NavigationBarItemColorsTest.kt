// Copyright 2026, compose-miuix-ui contributors
// Modifications Copyright 2026, Opaline contributors
// SPDX-License-Identifier: Apache-2.0

package io.github.a1b2d56.opaline.basic

import androidx.compose.ui.graphics.Color
import kotlin.test.Test
import kotlin.test.assertEquals

class NavigationBarItemColorsTest {
    private val selected = Color(0xE6000000)
    private val unselected = Color(0x8A000000)
    private val disabled = Color(0x42000000)
    private val colors = NavigationBarItemColors(
        selectedContentColor = selected,
        unselectedContentColor = unselected,
        disabledContentColor = disabled,
    )

    @Test
    fun labelSwitchesInstantlyWithoutAPressedState() {
        // COUI coui_navigation_tab_color has no state_pressed entry.
        assertEquals(selected, colors.labelColor(enabled = true, selected = true))
        assertEquals(unselected, colors.labelColor(enabled = true, selected = false))
    }

    @Test
    fun iconShowsTheSelectedVariantWhilePressed() {
        // COUI tab icon selectors show the selected drawable for state_selected or state_pressed.
        assertEquals(selected, colors.iconColor(enabled = true, selected = true, isPressed = false))
        assertEquals(selected, colors.iconColor(enabled = true, selected = false, isPressed = true))
        assertEquals(unselected, colors.iconColor(enabled = true, selected = false, isPressed = false))
    }

    @Test
    fun disabledWinsOverEveryOtherState() {
        for (isSelected in listOf(false, true)) {
            assertEquals(disabled, colors.labelColor(enabled = false, selected = isSelected))
            for (pressed in listOf(false, true)) {
                assertEquals(disabled, colors.iconColor(enabled = false, selected = isSelected, isPressed = pressed))
            }
        }
    }

    @Test
    fun colorsAreUsedAsGivenWithoutAlphaScaling() {
        val translucent = Color(0x804080C0)
        val c = NavigationBarItemColors(translucent, translucent, translucent)
        assertEquals(translucent, c.iconColor(enabled = true, selected = false, isPressed = false))
        assertEquals(translucent, c.labelColor(enabled = true, selected = true))
    }
}
