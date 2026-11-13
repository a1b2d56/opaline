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

/** `app_ic_tab_photo` */
val OpalineIcons.System.Image: ImageVector
    get() {
        if (_image != null) return _image!!
        _image = ImageVector.Builder(
            name = "Image",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.458f, 2.999f),
                    PathNode.CurveTo(18.119f, 2.999f, 18.657f, 2.999f, 19.092f, 3.034f),
                    PathNode.CurveTo(19.535f, 3.07f, 19.934f, 3.148f, 20.306f, 3.337f),
                    PathNode.CurveTo(20.889f, 3.634f, 21.363f, 4.108f, 21.66f, 4.691f),
                    PathNode.CurveTo(21.849f, 5.063f, 21.928f, 5.463f, 21.964f, 5.906f),
                    PathNode.CurveTo(21.999f, 6.341f, 21.998f, 6.879f, 21.998f, 7.539f),
                    PathNode.LineTo(21.998f, 16.459f),
                    PathNode.CurveTo(21.998f, 17.119f, 21.999f, 17.658f, 21.964f, 18.093f),
                    PathNode.CurveTo(21.928f, 18.536f, 21.849f, 18.935f, 21.66f, 19.307f),
                    PathNode.CurveTo(21.363f, 19.89f, 20.889f, 20.364f, 20.306f, 20.661f),
                    PathNode.CurveTo(19.934f, 20.85f, 19.535f, 20.928f, 19.092f, 20.964f),
                    PathNode.CurveTo(18.657f, 20.999f, 18.119f, 20.999f, 17.458f, 20.999f),
                    PathNode.LineTo(6.54f, 20.999f),
                    PathNode.CurveTo(5.88f, 20.999f, 5.342f, 20.999f, 4.907f, 20.964f),
                    PathNode.CurveTo(4.464f, 20.928f, 4.064f, 20.85f, 3.692f, 20.661f),
                    PathNode.CurveTo(3.11f, 20.364f, 2.635f, 19.889f, 2.338f, 19.307f),
                    PathNode.CurveTo(2.149f, 18.935f, 2.071f, 18.536f, 2.035f, 18.093f),
                    PathNode.CurveTo(2.0f, 17.658f, 2.0f, 17.119f, 2.0f, 16.459f),
                    PathNode.LineTo(2.0f, 7.539f),
                    PathNode.CurveTo(2.0f, 6.879f, 2.0f, 6.341f, 2.035f, 5.906f),
                    PathNode.CurveTo(2.071f, 5.463f, 2.149f, 5.063f, 2.338f, 4.691f),
                    PathNode.CurveTo(2.635f, 4.108f, 3.109f, 3.634f, 3.692f, 3.337f),
                    PathNode.CurveTo(4.064f, 3.147f, 4.464f, 3.07f, 4.907f, 3.034f),
                    PathNode.CurveTo(5.342f, 2.999f, 5.88f, 2.999f, 6.54f, 2.999f),
                    PathNode.LineTo(17.458f, 2.999f),
                    PathNode.Close,
                    PathNode.MoveTo(16.492f, 9.689f),
                    PathNode.CurveTo(16.352f, 9.644f, 16.2f, 9.644f, 16.06f, 9.689f),
                    PathNode.CurveTo(16.023f, 9.701f, 15.954f, 9.732f, 15.809f, 9.855f),
                    PathNode.CurveTo(15.657f, 9.984f, 15.472f, 10.168f, 15.187f, 10.453f),
                    PathNode.LineTo(8.693f, 16.945f),
                    PathNode.CurveTo(8.42f, 17.218f, 7.976f, 17.218f, 7.703f, 16.945f),
                    PathNode.CurveTo(7.43f, 16.672f, 7.43f, 16.228f, 7.703f, 15.955f),
                    PathNode.LineTo(8.92f, 14.737f),
                    PathNode.LineTo(7.46f, 13.134f),
                    PathNode.CurveTo(7.177f, 12.823f, 6.993f, 12.622f, 6.841f, 12.48f),
                    PathNode.CurveTo(6.696f, 12.346f, 6.625f, 12.31f, 6.588f, 12.297f),
                    PathNode.CurveTo(6.445f, 12.245f, 6.288f, 12.241f, 6.143f, 12.286f),
                    PathNode.CurveTo(6.105f, 12.298f, 6.034f, 12.33f, 5.882f, 12.458f),
                    PathNode.CurveTo(5.723f, 12.592f, 5.53f, 12.785f, 5.232f, 13.082f),
                    PathNode.LineTo(3.4f, 14.914f),
                    PathNode.LineTo(3.4f, 16.459f),
                    PathNode.CurveTo(3.4f, 17.142f, 3.401f, 17.614f, 3.431f, 17.979f),
                    PathNode.CurveTo(3.46f, 18.335f, 3.514f, 18.529f, 3.586f, 18.671f),
                    PathNode.CurveTo(3.749f, 18.99f, 4.009f, 19.251f, 4.328f, 19.414f),
                    PathNode.CurveTo(4.47f, 19.486f, 4.664f, 19.539f, 5.021f, 19.568f),
                    PathNode.CurveTo(5.386f, 19.598f, 5.857f, 19.6f, 6.54f, 19.6f),
                    PathNode.LineTo(17.458f, 19.6f),
                    PathNode.CurveTo(18.141f, 19.6f, 18.613f, 19.598f, 18.977f, 19.568f),
                    PathNode.CurveTo(19.334f, 19.539f, 19.528f, 19.486f, 19.67f, 19.414f),
                    PathNode.CurveTo(19.989f, 19.251f, 20.25f, 18.99f, 20.413f, 18.671f),
                    PathNode.CurveTo(20.485f, 18.529f, 20.539f, 18.335f, 20.568f, 17.979f),
                    PathNode.CurveTo(20.598f, 17.614f, 20.599f, 17.142f, 20.599f, 16.459f),
                    PathNode.LineTo(20.599f, 13.688f),
                    PathNode.LineTo(17.364f, 10.454f),
                    PathNode.CurveTo(17.079f, 10.169f, 16.894f, 9.984f, 16.742f, 9.855f),
                    PathNode.CurveTo(16.598f, 9.733f, 16.529f, 9.702f, 16.492f, 9.689f),
                    PathNode.Close,
                    PathNode.MoveTo(6.54f, 4.399f),
                    PathNode.CurveTo(5.857f, 4.399f, 5.386f, 4.4f, 5.021f, 4.43f),
                    PathNode.CurveTo(4.664f, 4.459f, 4.47f, 4.513f, 4.328f, 4.585f),
                    PathNode.CurveTo(4.009f, 4.748f, 3.749f, 5.008f, 3.586f, 5.327f),
                    PathNode.CurveTo(3.514f, 5.469f, 3.46f, 5.663f, 3.431f, 6.02f),
                    PathNode.CurveTo(3.401f, 6.384f, 3.4f, 6.856f, 3.4f, 7.539f),
                    PathNode.LineTo(3.4f, 12.934f),
                    PathNode.LineTo(4.242f, 12.092f),
                    PathNode.CurveTo(4.523f, 11.811f, 4.764f, 11.57f, 4.978f, 11.39f),
                    PathNode.CurveTo(5.197f, 11.204f, 5.435f, 11.039f, 5.729f, 10.948f),
                    PathNode.CurveTo(6.165f, 10.813f, 6.634f, 10.824f, 7.063f, 10.979f),
                    PathNode.CurveTo(7.352f, 11.084f, 7.584f, 11.26f, 7.794f, 11.455f),
                    PathNode.CurveTo(7.998f, 11.645f, 8.228f, 11.898f, 8.495f, 12.191f),
                    PathNode.LineTo(9.911f, 13.746f),
                    PathNode.LineTo(14.196f, 9.464f),
                    PathNode.CurveTo(14.465f, 9.195f, 14.697f, 8.962f, 14.902f, 8.788f),
                    PathNode.CurveTo(15.114f, 8.609f, 15.344f, 8.449f, 15.627f, 8.357f),
                    PathNode.CurveTo(16.049f, 8.221f, 16.503f, 8.22f, 16.925f, 8.357f),
                    PathNode.CurveTo(17.207f, 8.449f, 17.437f, 8.609f, 17.648f, 8.788f),
                    PathNode.CurveTo(17.854f, 8.962f, 18.086f, 9.195f, 18.355f, 9.464f),
                    PathNode.LineTo(20.599f, 11.708f),
                    PathNode.LineTo(20.599f, 7.539f),
                    PathNode.CurveTo(20.599f, 6.856f, 20.598f, 6.384f, 20.568f, 6.02f),
                    PathNode.CurveTo(20.539f, 5.663f, 20.485f, 5.469f, 20.413f, 5.327f),
                    PathNode.CurveTo(20.25f, 5.008f, 19.989f, 4.748f, 19.67f, 4.585f),
                    PathNode.CurveTo(19.528f, 4.513f, 19.334f, 4.459f, 18.977f, 4.43f),
                    PathNode.CurveTo(18.613f, 4.4f, 18.142f, 4.399f, 17.458f, 4.399f),
                    PathNode.LineTo(6.54f, 4.399f),
                    PathNode.Close,
                    PathNode.MoveTo(7.67f, 6.179f),
                    PathNode.CurveTo(8.526f, 6.179f, 9.219f, 6.873f, 9.219f, 7.729f),
                    PathNode.CurveTo(9.218f, 8.584f, 8.525f, 9.278f, 7.67f, 9.278f),
                    PathNode.CurveTo(6.814f, 9.278f, 6.12f, 8.584f, 6.12f, 7.729f),
                    PathNode.CurveTo(6.12f, 6.873f, 6.814f, 6.179f, 7.67f, 6.179f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _image!!
    }

private var _image: ImageVector? = null
