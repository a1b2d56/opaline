// Copyright 2026, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package io.github.a1b2d56.opaline.interfaces

/**
 * Marks ScrollBar APIs as experimental.
 *
 * This scrollbar component is in an early experimental stage with known issues.
 * Its API surface is unstable and subject to breaking changes in future releases.
 */
@Suppress("ExperimentalAnnotationRetention")
@RequiresOptIn(
    message = "This ScrollBar API is experimental. It has known issues and may change without notice.",
    level = RequiresOptIn.Level.WARNING,
)
@Retention(AnnotationRetention.BINARY)
@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY,
)
annotation class ExperimentalScrollBarApi
