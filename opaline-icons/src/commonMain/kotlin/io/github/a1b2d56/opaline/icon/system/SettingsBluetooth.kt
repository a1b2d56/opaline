// Copyright 2026, Opaline contributors
// SPDX-License-Identifier: Apache-2.0

package io.github.a1b2d56.opaline.icon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.icon.OpalineIcons

/** `settings_search_bluetooh_ic_oplus` */
val OpalineIcons.System.SettingsBluetooth: ImageVector
    get() {
        if (_settingsBluetooth != null) return _settingsBluetooth!!
        _settingsBluetooth = ImageVector.Builder(
            name = "SettingsBluetooth",
            defaultWidth = 16.0f.dp,
            defaultHeight = 16.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.143f, 7.227f),
                    PathNode.LineTo(16.596f, 16.68f),
                    PathNode.LineTo(11.947f, 20.716f),
                    PathNode.LineTo(11.947f, 12.031f),
                    PathNode.LineTo(11.997f, 11.998f),
                    PathNode.LineTo(11.997f, 3.313f),
                    PathNode.LineTo(16.646f, 7.349f),
                    PathNode.LineTo(7.184f, 16.811f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.575f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _settingsBluetooth!!
    }

private var _settingsBluetooth: ImageVector? = null
