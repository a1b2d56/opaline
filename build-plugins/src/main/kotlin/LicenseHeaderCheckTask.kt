// Copyright 2026, Opaline contributors
// SPDX-License-Identifier: Apache-2.0

import org.gradle.api.DefaultTask
import org.gradle.api.GradleException
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction

/**
 * Verifies that every Kotlin source starts with an Apache-2.0 attribution header.
 *
 * Opaline keeps the copyright notices of the projects it derives from, so a header is one or more
 * `// Copyright ...` / `// Modifications Copyright ...` lines followed by
 * `// SPDX-License-Identifier: Apache-2.0`. Spotless' license step would collapse those to a single
 * template line, so this task replaces it.
 */
abstract class LicenseHeaderCheckTask : DefaultTask() {
    @get:InputFiles
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val sources: ConfigurableFileCollection

    @TaskAction
    fun check() {
        val offenders = sources.files.filter { file ->
            val lines = file.useLines { seq -> seq.take(HEADER_SCAN_LINES).toList() }
            !hasValidHeader(lines)
        }
        if (offenders.isNotEmpty()) {
            throw GradleException(
                "Missing or malformed license header in:\n" +
                    offenders.joinToString("\n") { "  ${it.path}" } +
                    "\nExpected '// Copyright <year>, <holder>' lines followed by " +
                    "'// SPDX-License-Identifier: Apache-2.0'.",
            )
        }
    }

    private fun hasValidHeader(lines: List<String>): Boolean {
        val copyrightLines = lines.takeWhile { COPYRIGHT_LINE.matches(it.trimEnd()) }
        if (copyrightLines.isEmpty()) return false
        return lines.getOrNull(copyrightLines.size)?.trimEnd() == SPDX_LINE
    }

    private companion object {
        const val HEADER_SCAN_LINES = 8
        const val SPDX_LINE = "// SPDX-License-Identifier: Apache-2.0"
        val COPYRIGHT_LINE = Regex("^// (Modifications )?Copyright \\d{4}(-\\d{4})?, .+$")
    }
}
