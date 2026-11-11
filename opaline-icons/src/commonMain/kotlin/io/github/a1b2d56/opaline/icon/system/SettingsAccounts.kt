// Copyright 2026, Opaline contributors
// SPDX-License-Identifier: Apache-2.0

package io.github.a1b2d56.opaline.icon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.icon.OpalineIcons

/** `settings_search_accounts_sync_ic_oplus` */
val OpalineIcons.System.SettingsAccounts: ImageVector
    get() {
        if (_settingsAccounts != null) return _settingsAccounts!!
        _settingsAccounts = ImageVector.Builder(
            name = "SettingsAccounts",
            defaultWidth = 16.0f.dp,
            defaultHeight = 16.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.547f, 7.626f),
                    PathNode.CurveTo(9.547f, 6.272f, 10.645f, 5.174f, 12.0f, 5.174f),
                    PathNode.CurveTo(13.354f, 5.174f, 14.452f, 6.272f, 14.452f, 7.626f),
                    PathNode.CurveTo(14.452f, 8.981f, 13.354f, 10.078f, 12.0f, 10.078f),
                    PathNode.CurveTo(10.645f, 10.078f, 9.547f, 8.981f, 9.547f, 7.626f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 3.604f),
                    PathNode.CurveTo(9.778f, 3.604f, 7.977f, 5.404f, 7.977f, 7.626f),
                    PathNode.CurveTo(7.977f, 9.848f, 9.778f, 11.649f, 12.0f, 11.649f),
                    PathNode.CurveTo(14.221f, 11.649f, 16.022f, 9.848f, 16.022f, 7.626f),
                    PathNode.CurveTo(16.022f, 5.404f, 14.221f, 3.604f, 12.0f, 3.604f),
                    PathNode.Close,
                    PathNode.MoveTo(8.736f, 12.965f),
                    PathNode.CurveTo(6.69f, 12.965f, 4.873f, 14.275f, 4.226f, 16.216f),
                    PathNode.CurveTo(4.044f, 16.762f, 4.114f, 17.398f, 4.503f, 17.892f),
                    PathNode.CurveTo(6.247f, 20.109f, 8.957f, 21.535f, 12.0f, 21.535f),
                    PathNode.CurveTo(15.043f, 21.535f, 17.753f, 20.109f, 19.497f, 17.892f),
                    PathNode.CurveTo(19.886f, 17.398f, 19.956f, 16.762f, 19.774f, 16.216f),
                    PathNode.CurveTo(19.127f, 14.275f, 17.31f, 12.965f, 15.264f, 12.965f),
                    PathNode.LineTo(8.736f, 12.965f),
                    PathNode.Close,
                    PathNode.MoveTo(5.715f, 16.713f),
                    PathNode.CurveTo(6.148f, 15.412f, 7.365f, 14.535f, 8.736f, 14.535f),
                    PathNode.LineTo(15.264f, 14.535f),
                    PathNode.CurveTo(16.635f, 14.535f, 17.852f, 15.412f, 18.285f, 16.713f),
                    PathNode.CurveTo(18.317f, 16.809f, 18.294f, 16.883f, 18.264f, 16.921f),
                    PathNode.CurveTo(16.804f, 18.776f, 14.541f, 19.965f, 12.0f, 19.965f),
                    PathNode.CurveTo(9.459f, 19.965f, 7.196f, 18.776f, 5.737f, 16.921f),
                    PathNode.CurveTo(5.707f, 16.883f, 5.683f, 16.809f, 5.715f, 16.713f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _settingsAccounts!!
    }

private var _settingsAccounts: ImageVector? = null
