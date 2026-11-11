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

/** `settings_search_more_settings_ic_oplus` */
val OpalineIcons.System.SettingsConnections: ImageVector
    get() {
        if (_settingsConnections != null) return _settingsConnections!!
        _settingsConnections = ImageVector.Builder(
            name = "SettingsConnections",
            defaultWidth = 16.0f.dp,
            defaultHeight = 16.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.448f, 6.957f),
                    PathNode.CurveTo(7.377f, 7.872f, 5.899f, 9.881f, 5.737f, 12.253f),
                    PathNode.CurveTo(5.225f, 12.278f, 4.72f, 12.404f, 4.253f, 12.622f),
                    PathNode.CurveTo(4.279f, 9.382f, 6.293f, 6.618f, 9.136f, 5.494f),
                    PathNode.LineTo(9.153f, 5.538f),
                    PathNode.CurveTo(9.231f, 4.04f, 10.47f, 2.85f, 11.987f, 2.85f),
                    PathNode.CurveTo(13.554f, 2.85f, 14.824f, 4.12f, 14.824f, 5.687f),
                    PathNode.CurveTo(14.824f, 7.255f, 13.554f, 8.525f, 11.987f, 8.525f),
                    PathNode.CurveTo(10.876f, 8.525f, 9.914f, 7.887f, 9.448f, 6.957f),
                    PathNode.Close,
                    PathNode.MoveTo(18.252f, 12.689f),
                    PathNode.CurveTo(18.252f, 10.523f, 17.157f, 8.614f, 15.489f, 7.49f),
                    PathNode.CurveTo(15.72f, 7.042f, 15.868f, 6.545f, 15.911f, 6.019f),
                    PathNode.CurveTo(18.193f, 7.362f, 19.722f, 9.846f, 19.722f, 12.689f),
                    PathNode.CurveTo(19.722f, 13.076f, 19.693f, 13.449f, 19.646f, 13.809f),
                    PathNode.LineTo(19.583f, 13.8f),
                    PathNode.CurveTo(20.367f, 14.305f, 20.886f, 15.186f, 20.886f, 16.188f),
                    PathNode.CurveTo(20.886f, 17.755f, 19.616f, 19.025f, 18.049f, 19.025f),
                    PathNode.CurveTo(16.482f, 19.025f, 15.211f, 17.755f, 15.211f, 16.188f),
                    PathNode.CurveTo(15.211f, 14.62f, 16.482f, 13.35f, 18.049f, 13.35f),
                    PathNode.CurveTo(18.106f, 13.35f, 18.162f, 13.352f, 18.219f, 13.355f),
                    PathNode.CurveTo(18.24f, 13.135f, 18.252f, 12.913f, 18.252f, 12.689f),
                    PathNode.Close,
                    PathNode.MoveTo(14.734f, 18.316f),
                    PathNode.CurveTo(13.906f, 18.723f, 12.973f, 18.952f, 11.986f, 18.952f),
                    PathNode.CurveTo(10.604f, 18.952f, 9.328f, 18.504f, 8.298f, 17.745f),
                    PathNode.CurveTo(8.592f, 17.298f, 8.763f, 16.763f, 8.763f, 16.188f),
                    PathNode.CurveTo(8.763f, 14.62f, 7.492f, 13.35f, 5.925f, 13.35f),
                    PathNode.CurveTo(4.358f, 13.35f, 3.088f, 14.62f, 3.088f, 16.188f),
                    PathNode.CurveTo(3.088f, 17.755f, 4.358f, 19.025f, 5.925f, 19.025f),
                    PathNode.CurveTo(6.376f, 19.025f, 6.803f, 18.92f, 7.181f, 18.733f),
                    PathNode.LineTo(7.177f, 18.738f),
                    PathNode.CurveTo(8.494f, 19.793f, 10.169f, 20.422f, 11.986f, 20.422f),
                    PathNode.CurveTo(13.37f, 20.422f, 14.672f, 20.057f, 15.795f, 19.416f),
                    PathNode.CurveTo(15.369f, 19.12f, 15.01f, 18.746f, 14.734f, 18.316f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _settingsConnections!!
    }

private var _settingsConnections: ImageVector? = null
