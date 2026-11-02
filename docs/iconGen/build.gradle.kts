// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
plugins {
    kotlin("jvm")
    id("module.kotlin-jvm-toolchain")
    id("module.spotless")
}

dependencies {
    implementation(projects.opalineUi)
}

val iconsSourceDir =
    rootProject.layout.projectDirectory
        .dir("opaline-ui/src/commonMain/kotlin/io/github/a1b2d56/opaline/icon")
        .asFile
val extendedIconsSourceDir =
    rootProject.layout.projectDirectory
        .dir("opaline-icons/src/commonMain/kotlin/io/github/a1b2d56/opaline/icon")
        .asFile
val outputDir = project.file("../public/icons")
val docFile = project.file("../guide/icons.md")
val mainClasspath = objects.fileCollection().from(sourceSets.main.map { it.runtimeClasspath })
val lightColor = providers.gradleProperty("iconLightColor").getOrElse("#000000")
val darkColor = providers.gradleProperty("iconDarkColor").getOrElse("#FFFFFF")
val preserve = providers.gradleProperty("iconPreserveColors").map { it.equals("true", true) }.getOrElse(false)

tasks.register<JavaExec>("generateIcons") {
    group = "docIconGenerate"
    description = "Generate SVGs from Compose ImageVector definitions"
    dependsOn(tasks.named("classes"))
    classpath = mainClasspath
    mainClass.set("io.github.a1b2d56.opaline.docs.icongen.MainKt")
    outputs.dir(outputDir)
    args =
        listOf(
            "--src",
            iconsSourceDir.absolutePath,
            "--src",
            extendedIconsSourceDir.absolutePath,
            "--out",
            outputDir.absolutePath,
            "--light",
            lightColor,
            "--dark",
            darkColor,
            "--preserve-colors",
            preserve.toString(),
            "--gen-doc",
            "true",
            "--doc-file",
            docFile.absolutePath,
        )
}
