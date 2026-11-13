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

/** `note_book_icon` */
val OpalineIcons.System.Notebook: ImageVector
    get() {
        if (_notebook != null) return _notebook!!
        _notebook = ImageVector.Builder(
            name = "Notebook",
            defaultWidth = 20.0f.dp,
            defaultHeight = 20.0f.dp,
            viewportWidth = 20.0f,
            viewportHeight = 20.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.047f, 2.633f),
                    PathNode.CurveTo(13.483f, 2.633f, 13.852f, 2.633f, 14.153f, 2.657f),
                    PathNode.CurveTo(14.463f, 2.683f, 14.764f, 2.738f, 15.05f, 2.884f),
                    PathNode.CurveTo(15.482f, 3.104f, 15.834f, 3.456f, 16.055f, 3.889f),
                    PathNode.CurveTo(16.201f, 4.175f, 16.256f, 4.475f, 16.281f, 4.785f),
                    PathNode.CurveTo(16.306f, 5.087f, 16.306f, 5.456f, 16.306f, 5.893f),
                    PathNode.LineTo(16.306f, 14.0f),
                    PathNode.CurveTo(16.305f, 14.386f, 15.992f, 14.699f, 15.606f, 14.699f),
                    PathNode.LineTo(15.229f, 14.699f),
                    PathNode.LineTo(15.229f, 15.966f),
                    PathNode.LineTo(15.689f, 15.966f),
                    PathNode.CurveTo(16.075f, 15.966f, 16.389f, 16.279f, 16.389f, 16.666f),
                    PathNode.CurveTo(16.389f, 17.053f, 16.075f, 17.366f, 15.689f, 17.366f),
                    PathNode.LineTo(5.723f, 17.366f),
                    PathNode.LineTo(5.723f, 17.365f),
                    PathNode.CurveTo(5.175f, 17.365f, 4.643f, 17.161f, 4.244f, 16.785f),
                    PathNode.CurveTo(3.844f, 16.407f, 3.611f, 15.886f, 3.611f, 15.333f),
                    PathNode.CurveTo(3.611f, 14.018f, 3.611f, 9.005f, 3.611f, 5.89f),
                    PathNode.CurveTo(3.611f, 5.454f, 3.611f, 5.086f, 3.636f, 4.784f),
                    PathNode.CurveTo(3.661f, 4.474f, 3.717f, 4.175f, 3.862f, 3.889f),
                    PathNode.CurveTo(4.083f, 3.456f, 4.435f, 3.104f, 4.867f, 2.884f),
                    PathNode.CurveTo(5.153f, 2.738f, 5.454f, 2.683f, 5.764f, 2.657f),
                    PathNode.CurveTo(6.065f, 2.633f, 6.434f, 2.633f, 6.87f, 2.633f),
                    PathNode.CurveTo(8.693f, 2.633f, 11.147f, 2.633f, 13.047f, 2.633f),
                    PathNode.Close,
                    PathNode.MoveTo(5.724f, 14.699f),
                    PathNode.CurveTo(5.522f, 14.699f, 5.337f, 14.776f, 5.206f, 14.899f),
                    PathNode.CurveTo(5.109f, 14.991f, 5.048f, 15.102f, 5.023f, 15.217f),
                    PathNode.LineTo(5.012f, 15.333f),
                    PathNode.LineTo(5.023f, 15.449f),
                    PathNode.CurveTo(5.048f, 15.564f, 5.109f, 15.675f, 5.206f, 15.767f),
                    PathNode.CurveTo(5.337f, 15.89f, 5.522f, 15.966f, 5.723f, 15.966f),
                    PathNode.LineTo(13.829f, 15.966f),
                    PathNode.LineTo(13.829f, 14.699f),
                    PathNode.LineTo(5.724f, 14.699f),
                    PathNode.Close,
                    PathNode.MoveTo(6.87f, 4.033f),
                    PathNode.CurveTo(6.411f, 4.033f, 6.108f, 4.034f, 5.877f, 4.053f),
                    PathNode.CurveTo(5.654f, 4.071f, 5.559f, 4.102f, 5.503f, 4.131f),
                    PathNode.CurveTo(5.334f, 4.217f, 5.196f, 4.355f, 5.109f, 4.524f),
                    PathNode.CurveTo(5.081f, 4.581f, 5.049f, 4.676f, 5.031f, 4.898f),
                    PathNode.CurveTo(5.012f, 5.129f, 5.012f, 5.431f, 5.012f, 5.89f),
                    PathNode.CurveTo(5.012f, 8.112f, 5.012f, 11.299f, 5.012f, 13.421f),
                    PathNode.CurveTo(5.239f, 13.342f, 5.48f, 13.3f, 5.724f, 13.3f),
                    PathNode.LineTo(14.905f, 13.3f),
                    PathNode.LineTo(14.905f, 5.893f),
                    PathNode.CurveTo(14.905f, 5.433f, 14.905f, 5.131f, 14.886f, 4.899f),
                    PathNode.CurveTo(14.868f, 4.676f, 14.836f, 4.58f, 14.808f, 4.524f),
                    PathNode.CurveTo(14.721f, 4.355f, 14.583f, 4.217f, 14.414f, 4.131f),
                    PathNode.CurveTo(14.358f, 4.102f, 14.263f, 4.071f, 14.04f, 4.053f),
                    PathNode.CurveTo(13.809f, 4.034f, 13.506f, 4.033f, 13.047f, 4.033f),
                    PathNode.CurveTo(11.147f, 4.033f, 8.693f, 4.033f, 6.87f, 4.033f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _notebook!!
    }

private var _notebook: ImageVector? = null
