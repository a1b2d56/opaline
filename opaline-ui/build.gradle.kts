// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    alias(libs.plugins.androidKotlinMultiplatformLibrary)
    alias(libs.plugins.baselineprofile)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.dokka)
    alias(libs.plugins.kotlinMultiplatform)
    id("module.kotlin-jvm-toolchain")
    id("module.publication")
    id("module.spotless")
}

opalinePublication {
    description.set("A UI library for Compose Multiplatform")
}

kotlin {
    withSourcesJar(true)

    android {
        buildToolsVersion = BuildConfig.BUILD_TOOLS_VERSION
        compileSdk {
            version =
                release(BuildConfig.COMPILE_SDK) {
                    minorApiLevel = BuildConfig.COMPILE_SDK_MINOR
                }
        }
        minSdk = BuildConfig.MIN_SDK
        namespace = "${BuildConfig.LIBRARY_ID}.ui"
        withHostTest {}
    }

    jvm("desktop")

    iosArm64()
    iosSimulatorArm64()
    macosArm64()

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        browser()
    }

    js(IR) {
        browser()
    }

    applyOpalineSourceSetHierarchy()

    sourceSets {
        commonTest.dependencies {
            implementation(kotlin("test"))
        }

        commonMain.dependencies {
            api(projects.opalineCore)
            api(projects.opalineSquircle)
            api(libs.jetbrains.compose.foundation)

            implementation(libs.androidx.navigationevent)
            implementation(libs.jetbrains.compose.window.size)

            implementation(libs.materialKolor.utilities) // Material Color for Multiplatform
        }
    }
}

baselineProfile {
    filter {
        include("io.github.a1b2d56.opaline.**")
    }
}

val convertBaselineProfile =
    tasks.register<ConvertBaselineProfileTask>("convertBaselineProfile") {
        description = "convertBaselineProfile"
        inputFile.convention(
            provider {
                val generatedUiProfile = layout.projectDirectory.file("src/androidMain/generated/baselineProfiles/baseline-prof.txt")
                val generatedExampleProfile =
                    rootProject.layout.projectDirectory.file(
                        "example/android/src/release/generated/baselineProfiles/baseline-prof.txt",
                    )
                if (generatedUiProfile.asFile.exists()) generatedUiProfile else generatedExampleProfile
            },
        )
        outputFile.set(
            layout.projectDirectory.file("src/androidMain/baselineProfiles/baseline-prof.txt"),
        )
        targetPackage.set("io/github/a1b2d56/opaline/")
        excludePackages.set(
            listOf(
                "io/github/a1b2d56/opaline/icon/extended/",
                "io/github/a1b2d56/opaline/shared/",
            ),
        )
        additionalOutputs.put(
            "io/github/a1b2d56/opaline/preference/",
            rootProject.layout.projectDirectory
                .file(
                    "opaline-preference/src/androidMain/baselineProfiles/baseline-prof.txt",
                ).asFile.absolutePath,
        )
        additionalOutputs.put(
            "io/github/a1b2d56/opaline/menu/",
            rootProject.layout.projectDirectory
                .file(
                    "opaline-preference/src/androidMain/baselineProfiles/baseline-prof.txt",
                ).asFile.absolutePath,
        )
        additionalOutputs.put(
            "io/github/a1b2d56/opaline/popup/",
            rootProject.layout.projectDirectory
                .file(
                    "opaline-preference/src/androidMain/baselineProfiles/baseline-prof.txt",
                ).asFile.absolutePath,
        )
        additionalOutputs.put(
            "io/github/a1b2d56/opaline/blur/",
            rootProject.layout.projectDirectory
                .file(
                    "opaline-blur/src/androidMain/baselineProfiles/baseline-prof.txt",
                ).asFile.absolutePath,
        )
        additionalOutputs.put(
            "io/github/a1b2d56/opaline/nav/",
            rootProject.layout.projectDirectory
                .file(
                    "opaline-nav/src/androidMain/baselineProfiles/baseline-prof.txt",
                ).asFile.absolutePath,
        )
        additionalOutputs.put(
            "io/github/a1b2d56/opaline/navigation3/ui/",
            rootProject.layout.projectDirectory
                .file(
                    "opaline-navigation3-ui/src/androidMain/baselineProfiles/baseline-prof.txt",
                ).asFile.absolutePath,
        )
        additionalOutputs.put(
            "io/github/a1b2d56/opaline/shader/",
            rootProject.layout.projectDirectory
                .file(
                    "opaline-shader/src/androidMain/baselineProfiles/baseline-prof.txt",
                ).asFile.absolutePath,
        )
        additionalOutputs.put(
            "io/github/a1b2d56/opaline/squircle/",
            rootProject.layout.projectDirectory
                .file(
                    "opaline-squircle/src/androidMain/baselineProfiles/baseline-prof.txt",
                ).asFile.absolutePath,
        )
    }

tasks.matching { it.name == "generateBaselineProfile" }.configureEach {
    finalizedBy(convertBaselineProfile)
}

dependencies {
    baselineProfile(projects.baselineprofile)
}
