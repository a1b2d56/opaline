// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
@file:Suppress("UnstableApiUsage")

rootProject.name = "opaline"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
enableFeaturePreview("NO_IMPLICIT_LOOKUP_IN_PARENT_PROJECTS")
enableFeaturePreview("ENHANCED_GRAPH_ORDERING")

pluginManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

includeBuild("build-plugins")

include(":opaline-core")
include(":opaline-ui")
include(":opaline-preference")
include(":opaline-shader")
include(":opaline-blur")
include(":opaline-squircle")
include(":opaline-icons")
include(":opaline-navigation3-ui")
include(":opaline-nav")

include(":baselineprofile")

include(":example:shared")
include(":example:android")
include(":example:desktop")
include(":example:web")
include(":example:macos")

include(":docs:demo")
include(":docs:iconGen")
