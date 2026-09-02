// Copyright 2026, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0

import org.gradle.api.provider.Property

/**
 * Per-module publication metadata supplied by each module that applies `module.publication`.
 */
interface OpalinePublicationExtension {
    /** Short human-readable description used as the published POM description. */
    val description: Property<String>
}
