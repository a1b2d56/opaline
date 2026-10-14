// Copyright 2026, Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package io.github.a1b2d56.opaline.basic

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SwitchDragTest {
    private val start = 10f
    private val end = 50f

    @Test
    fun thumbFollowsTheFingerInsideTheTrack() {
        assertEquals(30f, switchDragDisplayPosition(30f, start, end))
    }

    @Test
    fun thumbResistsPastEitherEnd() {
        assertEquals(end + 20f * SwitchDefaults.DragOverscrollFactor, switchDragDisplayPosition(end + 20f, start, end))
        assertEquals(start - 20f * SwitchDefaults.DragOverscrollFactor, switchDragDisplayPosition(start - 20f, start, end))
    }

    @Test
    fun releaseTogglesOnlyPastTheMiddle() {
        assertTrue(switchDragTarget(31f, start, end))
        assertFalse(switchDragTarget(30f, start, end))
        assertFalse(switchDragTarget(-100f, start, end))
        assertTrue(switchDragTarget(100f, start, end))
    }
}
