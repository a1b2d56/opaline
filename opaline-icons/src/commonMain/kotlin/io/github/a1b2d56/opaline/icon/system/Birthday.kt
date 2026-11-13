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

/** `ic_birthday_calendar` */
val OpalineIcons.System.Birthday: ImageVector
    get() {
        if (_birthday != null) return _birthday!!
        _birthday = ImageVector.Builder(
            name = "Birthday",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.699f, 5.798f),
                    PathNode.CurveTo(13.076f, 5.558f, 13.328f, 5.128f, 13.328f, 4.638f),
                    PathNode.CurveTo(13.328f, 3.884f, 12.996f, 3.261f, 12.0f, 2.237f),
                    PathNode.CurveTo(12.0f, 2.713f, 11.714f, 2.972f, 11.406f, 3.249f),
                    PathNode.CurveTo(11.053f, 3.568f, 10.673f, 3.911f, 10.673f, 4.638f),
                    PathNode.CurveTo(10.673f, 5.127f, 10.923f, 5.555f, 11.299f, 5.796f),
                    PathNode.LineTo(11.299f, 8.128f),
                    PathNode.LineTo(5.999f, 8.128f),
                    PathNode.CurveTo(4.549f, 8.128f, 3.299f, 9.245f, 3.299f, 10.71f),
                    PathNode.LineTo(3.299f, 20.364f),
                    PathNode.LineTo(2.06f, 20.364f),
                    PathNode.CurveTo(1.673f, 20.364f, 1.36f, 20.678f, 1.36f, 21.064f),
                    PathNode.CurveTo(1.36f, 21.451f, 1.673f, 21.764f, 2.06f, 21.764f),
                    PathNode.LineTo(21.939f, 21.764f),
                    PathNode.CurveTo(22.326f, 21.764f, 22.639f, 21.451f, 22.639f, 21.064f),
                    PathNode.CurveTo(22.639f, 20.678f, 22.326f, 20.364f, 21.939f, 20.364f),
                    PathNode.LineTo(20.7f, 20.364f),
                    PathNode.LineTo(20.7f, 10.71f),
                    PathNode.CurveTo(20.7f, 9.245f, 19.45f, 8.128f, 18.0f, 8.128f),
                    PathNode.LineTo(12.699f, 8.128f),
                    PathNode.LineTo(12.699f, 5.798f),
                    PathNode.Close,
                    PathNode.MoveTo(5.999f, 9.528f),
                    PathNode.CurveTo(5.241f, 9.528f, 4.699f, 10.097f, 4.699f, 10.71f),
                    PathNode.LineTo(4.699f, 12.93f),
                    PathNode.CurveTo(5.479f, 13.126f, 5.968f, 13.58f, 6.364f, 13.947f),
                    PathNode.LineTo(6.38f, 13.961f),
                    PathNode.CurveTo(6.872f, 14.418f, 7.206f, 14.715f, 7.933f, 14.715f),
                    PathNode.CurveTo(8.661f, 14.715f, 8.994f, 14.418f, 9.487f, 13.961f),
                    PathNode.LineTo(9.502f, 13.947f),
                    PathNode.CurveTo(10.022f, 13.464f, 10.703f, 12.833f, 11.993f, 12.833f),
                    PathNode.CurveTo(13.284f, 12.833f, 13.965f, 13.464f, 14.486f, 13.947f),
                    PathNode.LineTo(14.502f, 13.961f),
                    PathNode.CurveTo(14.995f, 14.418f, 15.33f, 14.715f, 16.059f, 14.715f),
                    PathNode.CurveTo(16.788f, 14.715f, 17.123f, 14.418f, 17.616f, 13.961f),
                    PathNode.LineTo(17.631f, 13.947f),
                    PathNode.CurveTo(18.028f, 13.579f, 18.518f, 13.125f, 19.3f, 12.93f),
                    PathNode.LineTo(19.3f, 10.71f),
                    PathNode.CurveTo(19.3f, 10.097f, 18.758f, 9.528f, 18.0f, 9.528f),
                    PathNode.LineTo(5.999f, 9.528f),
                    PathNode.Close,
                    PathNode.MoveTo(4.699f, 20.364f),
                    PathNode.LineTo(4.699f, 14.417f),
                    PathNode.CurveTo(4.952f, 14.55f, 5.167f, 14.746f, 5.427f, 14.988f),
                    PathNode.LineTo(5.443f, 15.002f),
                    PathNode.CurveTo(5.962f, 15.484f, 6.643f, 16.115f, 7.933f, 16.115f),
                    PathNode.CurveTo(9.223f, 16.115f, 9.904f, 15.484f, 10.424f, 15.001f),
                    PathNode.LineTo(10.439f, 14.988f),
                    PathNode.CurveTo(10.932f, 14.53f, 11.266f, 14.233f, 11.993f, 14.233f),
                    PathNode.CurveTo(12.722f, 14.233f, 13.057f, 14.531f, 13.55f, 14.988f),
                    PathNode.LineTo(13.566f, 15.002f),
                    PathNode.CurveTo(14.087f, 15.484f, 14.768f, 16.115f, 16.059f, 16.115f),
                    PathNode.CurveTo(17.35f, 16.115f, 18.031f, 15.484f, 18.552f, 15.002f),
                    PathNode.LineTo(18.568f, 14.988f),
                    PathNode.CurveTo(18.829f, 14.746f, 19.046f, 14.548f, 19.3f, 14.416f),
                    PathNode.LineTo(19.3f, 20.364f),
                    PathNode.LineTo(4.699f, 20.364f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _birthday!!
    }

private var _birthday: ImageVector? = null
