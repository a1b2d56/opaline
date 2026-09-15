// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package io.github.a1b2d56.opaline.theme

import androidx.compose.runtime.Composable

@Composable
actual fun platformDynamicColors(dark: Boolean): Colors = monetSystemColors(dark)
