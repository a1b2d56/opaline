// Copyright 2026, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package io.github.a1b2d56.opaline.nav.core

import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import io.github.a1b2d56.opaline.nav.runtime.NavChange
import io.github.a1b2d56.opaline.nav.runtime.NavPresentation
import io.github.a1b2d56.opaline.nav.runtime.relativeDepth
import io.github.a1b2d56.opaline.nav.runtime.roleFor
import io.github.a1b2d56.opaline.nav.transition.NavGesture
import io.github.a1b2d56.opaline.nav.transition.NavRole
import io.github.a1b2d56.opaline.nav.transition.NavSettle
import io.github.a1b2d56.opaline.nav.transition.NavTransitionScope

/**
 * A [NavTransitionScope] whose [relativeDepth] (and derived [role]) are **deferred reads** of the
 * live [NavPresentation.animatedTop]. Passing this into a transition that itself reads inside a
 * `graphicsLayer { }` (e.g. [io.github.a1b2d56.opaline.nav.transition.navGraphicsTransition]) yields
 * zero-recomposition, per-frame visual updates.
 *
 * @param presentation source of the single driving float.
 * @param entryIndex this entry's index in the back stack (for the depth subtraction).
 * @param isRemoving whether this entry is animating out (affects [role]).
 */
@Stable
internal class LiveNavTransitionScope(
    private val presentation: NavPresentation,
    private val entryIndex: Int,
    private val isRemoving: Boolean,
    override val change: NavChange,
    override val layoutSize: IntSize,
    override val layoutDirection: LayoutDirection,
    override val density: Density,
) : NavTransitionScope {
    override val relativeDepth: Float
        get() = relativeDepth(presentation.animatedTop.value, entryIndex)

    override val role: NavRole
        get() = roleFor(relativeDepth, isRemoving)

    override val gesture: NavGesture? get() = presentation.gesture

    // gestureActive deliberately uses a derived Boolean: gesture is replaced on every pointer
    // event, but consumers reading this from composition only need the start/end boundaries.
    override val isRunning: Boolean
        get() = presentation.gestureActive || presentation.settle != null || presentation.animatedTop.isRunning

    override val settle: NavSettle? get() = presentation.settle

    /** Coarse gesture flag for composition-time branch dispatch (see navDirectionalTransition). */
    internal val gestureActive: Boolean get() = presentation.gestureActive
}
