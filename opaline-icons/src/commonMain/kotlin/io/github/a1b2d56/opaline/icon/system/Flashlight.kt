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

/** `coui_component_flashlight_on` */
val OpalineIcons.System.Flashlight: ImageVector
    get() {
        if (_flashlight != null) return _flashlight!!
        _flashlight = ImageVector.Builder(
            name = "Flashlight",
            defaultWidth = 20.0f.dp,
            defaultHeight = 20.0f.dp,
            viewportWidth = 20.0f,
            viewportHeight = 20.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.2f, 4.011f),
                    PathNode.LineTo(9.2f, 0.824f),
                    PathNode.LineTo(10.8f, 0.824f),
                    PathNode.LineTo(10.8f, 4.011f),
                    PathNode.LineTo(9.2f, 4.011f),
                    PathNode.Close,
                    PathNode.MoveTo(4.42f, 5.601f),
                    PathNode.LineTo(5.22f, 5.601f),
                    PathNode.LineTo(14.781f, 5.601f),
                    PathNode.LineTo(15.581f, 5.601f),
                    PathNode.LineTo(15.581f, 6.401f),
                    PathNode.LineTo(15.581f, 7.995f),
                    PathNode.LineTo(15.581f, 8.031f),
                    PathNode.LineTo(15.578f, 8.067f),
                    PathNode.CurveTo(15.438f, 9.615f, 14.699f, 11.048f, 13.519f, 12.06f),
                    PathNode.LineTo(13.52f, 12.059f),
                    PathNode.LineTo(12.996f, 11.454f),
                    PathNode.LineTo(13.516f, 12.062f),
                    PathNode.LineTo(13.519f, 12.06f),
                    PathNode.CurveTo(13.506f, 12.071f, 13.496f, 12.085f, 13.488f, 12.1f),
                    PathNode.CurveTo(13.482f, 12.115f, 13.478f, 12.13f, 13.477f, 12.146f),
                    PathNode.LineTo(13.477f, 17.712f),
                    PathNode.CurveTo(13.477f, 18.136f, 13.309f, 18.542f, 13.009f, 18.841f),
                    PathNode.CurveTo(12.71f, 19.14f, 12.304f, 19.309f, 11.88f, 19.309f),
                    PathNode.LineTo(8.143f, 19.309f),
                    PathNode.CurveTo(7.719f, 19.309f, 7.313f, 19.14f, 7.013f, 18.841f),
                    PathNode.CurveTo(6.714f, 18.542f, 6.546f, 18.136f, 6.546f, 17.712f),
                    PathNode.LineTo(6.546f, 12.147f),
                    PathNode.CurveTo(6.545f, 12.13f, 6.541f, 12.115f, 6.534f, 12.1f),
                    PathNode.CurveTo(6.527f, 12.085f, 6.517f, 12.071f, 6.504f, 12.06f),
                    PathNode.CurveTo(5.319f, 11.051f, 4.572f, 9.621f, 4.424f, 8.072f),
                    PathNode.LineTo(4.42f, 8.033f),
                    PathNode.LineTo(4.42f, 7.995f),
                    PathNode.LineTo(4.42f, 6.401f),
                    PathNode.LineTo(4.42f, 5.601f),
                    PathNode.Close,
                    PathNode.MoveTo(6.02f, 7.201f),
                    PathNode.LineTo(6.02f, 7.955f),
                    PathNode.CurveTo(6.137f, 9.078f, 6.683f, 10.113f, 7.545f, 10.845f),
                    PathNode.LineTo(7.551f, 10.85f),
                    PathNode.LineTo(7.551f, 10.85f),
                    PathNode.CurveTo(7.734f, 11.008f, 7.881f, 11.203f, 7.983f, 11.421f),
                    PathNode.CurveTo(8.085f, 11.64f, 8.141f, 11.877f, 8.146f, 12.119f),
                    PathNode.LineTo(8.146f, 12.127f),
                    PathNode.LineTo(8.146f, 12.135f),
                    PathNode.LineTo(8.146f, 17.709f),
                    PathNode.LineTo(11.877f, 17.709f),
                    PathNode.LineTo(11.877f, 12.135f),
                    PathNode.LineTo(11.877f, 12.127f),
                    PathNode.LineTo(11.877f, 12.119f),
                    PathNode.CurveTo(11.882f, 11.878f, 11.937f, 11.64f, 12.04f, 11.421f),
                    PathNode.CurveTo(12.142f, 11.203f, 12.289f, 11.008f, 12.472f, 10.85f),
                    PathNode.LineTo(12.475f, 10.847f),
                    PathNode.LineTo(12.475f, 10.847f),
                    PathNode.CurveTo(13.331f, 10.114f, 13.871f, 9.078f, 13.981f, 7.957f),
                    PathNode.LineTo(13.981f, 7.201f),
                    PathNode.LineTo(6.02f, 7.201f),
                    PathNode.Close,
                    PathNode.MoveTo(5.357f, 2.502f),
                    PathNode.LineTo(6.951f, 4.82f),
                    PathNode.LineTo(8.269f, 3.913f),
                    PathNode.LineTo(6.676f, 1.596f),
                    PathNode.LineTo(5.357f, 2.502f),
                    PathNode.Close,
                    PathNode.MoveTo(11.732f, 3.913f),
                    PathNode.LineTo(13.325f, 1.596f),
                    PathNode.LineTo(14.644f, 2.502f),
                    PathNode.LineTo(13.05f, 4.82f),
                    PathNode.LineTo(11.732f, 3.913f),
                    PathNode.Close,
                    PathNode.MoveTo(9.105f, 11.241f),
                    PathNode.LineTo(9.105f, 14.158f),
                    PathNode.LineTo(10.705f, 14.158f),
                    PathNode.LineTo(10.705f, 11.241f),
                    PathNode.LineTo(9.105f, 11.241f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
