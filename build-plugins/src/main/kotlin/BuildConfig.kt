// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0

object BuildConfig {
    const val LIBRARY_VERSION = "0.1.0"
    const val LIBRARY_ID = "io.github.a1b2d56.opaline"
    const val APPLICATION_NAME = "Opaline"
    const val APPLICATION_VERSION_NAME = "0.1.0"
    const val APPLICATION_ID = "io.github.a1b2d56.opaline.demo"
    const val APPLICATION_SHARED_ID = "io.github.a1b2d56.opaline.shared"
    const val COMPILE_SDK = 37
    const val COMPILE_SDK_MINOR = 0
    const val TARGET_SDK = 37
    const val MIN_SDK = 24
    const val BUILD_TOOLS_VERSION = "37.0.0"
    const val JDK_VERSION = 21
}

fun org.gradle.api.Project.getGitVersionCode(): Int {
    return providers.exec {
        commandLine("git", "rev-list", "--count", "HEAD")
    }.standardOutput.asText.get().trim().toInt()
}

fun org.gradle.api.Project.getGitHashShort(): String {
    return providers.exec {
        commandLine("git", "rev-parse", "--short", "HEAD")
    }.standardOutput.asText.get().trim()
}
