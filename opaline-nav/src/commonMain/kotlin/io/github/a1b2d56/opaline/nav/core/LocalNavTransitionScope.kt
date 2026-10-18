// Copyright 2026, compose-miuix-ui contributors
// Modifications Copyright 2026, Opaline contributors
// SPDX-License-Identifier: Apache-2.0

package io.github.a1b2d56.opaline.nav.core

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import io.github.a1b2d56.opaline.nav.transition.NavTransitionScope

/**
 * The live Opaline transition scope for the current entry.
 *
 * Use this local when entry content needs Opaline-specific navigation data such as relative depth,
 * gesture progress, settle state or the coarse [NavTransitionScope.isRunning] lifecycle signal.
 * Reads of per-frame values remain deferred when performed from a `graphicsLayer` block.
 *
 * Accessing this local outside a [NavDisplay] entry is an error.
 */
public val LocalNavTransitionScope: ProvidableCompositionLocal<NavTransitionScope> =
    compositionLocalOf {
        error(
            "Unexpected access to LocalNavTransitionScope. Access it only inside a " +
                "NavDisplay entry.",
        )
    }
