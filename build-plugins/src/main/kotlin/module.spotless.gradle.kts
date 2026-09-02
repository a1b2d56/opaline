// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0

import com.diffplug.spotless.LineEnding

plugins {
    id("com.diffplug.spotless")
}

val composeKtlintRules = "io.nlopez.compose.rules:ktlint:0.6.8"

spotless {
    lineEndings = LineEnding.PLATFORM_NATIVE

    kotlin {
        target("src/**/*.kt")
        targetExclude(
            "**/build/**/*.kt",
            "**/icon/**/*.kt",
            "**/navigation3/ListUtils.kt",
            "**/navigation3/scene/*.kt",
            "**/navigation3/ui/*.kt",
        )
        ktlint()
            .customRuleSets(listOf(composeKtlintRules))
            .editorConfigOverride(
                mapOf(
                    "ktlint_function_naming_ignore_when_annotated_with" to "Composable",
                    "ktlint_compose_modifier-missing-check" to "disabled",
                    "ktlint_compose_compositionlocal-allowlist" to "disabled",
                    "ktlint_compose_mutable-state-param-check" to "disabled",
                    "ktlint_compose_parameter-naming" to "disabled",
                    "ktlint_compose_modifier-naming" to "disabled",
                ),
            )
    }

    kotlinGradle {
        target("*.kts")
        targetExclude("**/build/**/*.kts")
        ktlint()
    }
}

// Attribution headers are checked separately: Spotless' license step would collapse the upstream
// copyright lines Opaline is required to keep.
val checkLicenseHeaders = tasks.register<LicenseHeaderCheckTask>("checkLicenseHeaders") {
    sources.from(
        fileTree("src") {
            include("**/*.kt")
            exclude(
                "**/build/**",
                "**/icon/**",
                "**/navigation3/ListUtils.kt",
                "**/navigation3/scene/*.kt",
                "**/navigation3/ui/*.kt",
            )
        },
        fileTree(".") { include("*.kts") },
    )
}

tasks.named("spotlessCheck") { dependsOn(checkLicenseHeaders) }
