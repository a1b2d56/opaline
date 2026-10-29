// Copyright 2026, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package component.liquid

// Adapted from Kyant0/AndroidLiquidGlass — https://github.com/Kyant0/AndroidLiquidGlass (Apache 2.0).

import io.github.a1b2d56.opaline.blur.BackdropEffectScope
import io.github.a1b2d56.opaline.blur.colorControls

/** Lightweight stand-in for Kyant's `vibrancy()`. */
fun BackdropEffectScope.vibrancy() {
    colorControls(
        brightness = 0f,
        contrast = 1f,
        saturation = 1.5f,
    )
}
