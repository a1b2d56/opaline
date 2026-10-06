// Copyright 2026, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
@file:Suppress("FunctionName")

package io.github.a1b2d56.opaline.blur

import androidx.compose.ui.graphics.Shader
import androidx.compose.ui.graphics.ShaderBrush
import io.github.a1b2d56.opaline.shader.asBrush as coreAsBrush
import io.github.a1b2d56.opaline.shader.asComposeShader as coreAsComposeShader
import io.github.a1b2d56.opaline.shader.isRuntimeShaderSupported as coreIsRuntimeShaderSupported

/** Back-compat re-export. New code should use `io.github.a1b2d56.opaline.shader.RuntimeShader`. */
typealias RuntimeShader = io.github.a1b2d56.opaline.shader.RuntimeShader

/**
 * Back-compat re-export.
 *
 * @param shaderString The AGSL/SkSL shader source code to compile into the [RuntimeShader].
 */
fun RuntimeShader(shaderString: String): RuntimeShader = io.github.a1b2d56.opaline.shader.RuntimeShader(shaderString)

/** Back-compat re-export. */
fun RuntimeShader.asComposeShader(): Shader = coreAsComposeShader()

/** Back-compat re-export. */
fun RuntimeShader.asBrush(): ShaderBrush = coreAsBrush()

/** Back-compat re-export. */
fun isRuntimeShaderSupported(): Boolean = coreIsRuntimeShaderSupported()
