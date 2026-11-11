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

/** `icon_car_in_use` */
val OpalineIcons.System.DeviceCar: ImageVector
    get() {
        if (_deviceCar != null) return _deviceCar!!
        _deviceCar = ImageVector.Builder(
            name = "DeviceCar",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.359f, 3.3f),
                    PathNode.CurveTo(17.239f, 3.3f, 18.938f, 4.421f, 19.679f, 6.149f),
                    PathNode.LineTo(21.544f, 10.5f),
                    PathNode.CurveTo(22.255f, 10.933f, 22.696f, 11.708f, 22.696f, 12.55f),
                    PathNode.LineTo(22.696f, 16.499f),
                    PathNode.CurveTo(22.696f, 16.912f, 22.485f, 17.232f, 22.25f, 17.45f),
                    PathNode.CurveTo(22.087f, 17.603f, 21.888f, 17.728f, 21.677f, 17.837f),
                    PathNode.CurveTo(21.689f, 17.889f, 21.699f, 17.943f, 21.699f, 17.998f),
                    PathNode.LineTo(21.699f, 19.998f),
                    PathNode.LineTo(21.685f, 20.139f),
                    PathNode.CurveTo(21.619f, 20.458f, 21.337f, 20.698f, 20.999f, 20.698f),
                    PathNode.LineTo(19.999f, 20.698f),
                    PathNode.CurveTo(19.612f, 20.698f, 19.299f, 20.385f, 19.299f, 19.998f),
                    PathNode.LineTo(19.299f, 18.537f),
                    PathNode.CurveTo(19.196f, 18.556f, 19.093f, 18.578f, 18.987f, 18.596f),
                    PathNode.CurveTo(17.061f, 18.917f, 14.519f, 19.074f, 11.997f, 19.074f),
                    PathNode.CurveTo(9.475f, 19.074f, 6.934f, 18.917f, 5.008f, 18.596f),
                    PathNode.CurveTo(4.904f, 18.579f, 4.802f, 18.557f, 4.7f, 18.538f),
                    PathNode.LineTo(4.7f, 19.998f),
                    PathNode.LineTo(4.686f, 20.139f),
                    PathNode.CurveTo(4.62f, 20.458f, 4.338f, 20.698f, 4.0f, 20.698f),
                    PathNode.LineTo(3.0f, 20.698f),
                    PathNode.CurveTo(2.613f, 20.698f, 2.3f, 20.385f, 2.3f, 19.998f),
                    PathNode.LineTo(2.3f, 17.998f),
                    PathNode.CurveTo(2.3f, 17.943f, 2.307f, 17.89f, 2.319f, 17.838f),
                    PathNode.CurveTo(2.107f, 17.729f, 1.909f, 17.603f, 1.745f, 17.45f),
                    PathNode.CurveTo(1.511f, 17.232f, 1.298f, 16.912f, 1.298f, 16.499f),
                    PathNode.LineTo(1.298f, 12.55f),
                    PathNode.CurveTo(1.298f, 11.708f, 1.738f, 10.933f, 2.449f, 10.5f),
                    PathNode.LineTo(4.315f, 6.149f),
                    PathNode.CurveTo(5.056f, 4.421f, 6.755f, 3.3f, 8.635f, 3.3f),
                    PathNode.LineTo(15.359f, 3.3f),
                    PathNode.Close,
                    PathNode.MoveTo(5.5f, 12.749f),
                    PathNode.CurveTo(4.81f, 12.749f, 4.25f, 13.309f, 4.25f, 13.999f),
                    PathNode.CurveTo(4.25f, 14.689f, 4.81f, 15.249f, 5.5f, 15.249f),
                    PathNode.CurveTo(6.19f, 15.249f, 6.75f, 14.689f, 6.75f, 13.999f),
                    PathNode.CurveTo(6.75f, 13.309f, 6.19f, 12.749f, 5.5f, 12.749f),
                    PathNode.Close,
                    PathNode.MoveTo(18.499f, 12.749f),
                    PathNode.CurveTo(17.809f, 12.749f, 17.249f, 13.309f, 17.249f, 13.999f),
                    PathNode.CurveTo(17.249f, 14.689f, 17.809f, 15.249f, 18.499f, 15.249f),
                    PathNode.CurveTo(19.189f, 15.249f, 19.749f, 14.689f, 19.749f, 13.999f),
                    PathNode.CurveTo(19.749f, 13.309f, 19.189f, 12.749f, 18.499f, 12.749f),
                    PathNode.Close,
                    PathNode.MoveTo(8.703f, 5.3f),
                    PathNode.CurveTo(7.599f, 5.3f, 6.606f, 5.972f, 6.196f, 6.997f),
                    PathNode.LineTo(5.352f, 9.111f),
                    PathNode.LineTo(5.268f, 9.322f),
                    PathNode.CurveTo(5.156f, 9.601f, 5.315f, 9.916f, 5.606f, 9.991f),
                    PathNode.LineTo(5.826f, 10.048f),
                    PathNode.CurveTo(9.939f, 11.107f, 14.059f, 11.107f, 18.172f, 10.048f),
                    PathNode.LineTo(18.393f, 9.991f),
                    PathNode.CurveTo(18.684f, 9.916f, 18.844f, 9.601f, 18.732f, 9.322f),
                    PathNode.LineTo(18.647f, 9.111f),
                    PathNode.LineTo(17.802f, 6.997f),
                    PathNode.CurveTo(17.392f, 5.972f, 16.399f, 5.3f, 15.295f, 5.3f),
                    PathNode.LineTo(8.703f, 5.3f),
                    PathNode.Close,
                    PathNode.MoveTo(1.92f, 9.964f),
                    PathNode.CurveTo(1.405f, 9.923f, 1.0f, 9.493f, 1.0f, 8.968f),
                    PathNode.CurveTo(1.0f, 8.416f, 1.448f, 7.968f, 2.0f, 7.968f),
                    PathNode.LineTo(2.776f, 7.968f),
                    PathNode.LineTo(1.92f, 9.964f),
                    PathNode.Close,
                    PathNode.MoveTo(21.999f, 7.968f),
                    PathNode.CurveTo(22.551f, 7.968f, 22.998f, 8.416f, 22.998f, 8.968f),
                    PathNode.CurveTo(22.998f, 9.494f, 22.593f, 9.924f, 22.077f, 9.964f),
                    PathNode.LineTo(21.223f, 7.968f),
                    PathNode.LineTo(21.999f, 7.968f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.296f, 6.5f),
                    PathNode.LineTo(8.704f, 6.5f),
                    PathNode.CurveTo(8.091f, 6.5f, 7.539f, 6.873f, 7.311f, 7.443f),
                    PathNode.LineTo(6.853f, 8.589f),
                    PathNode.CurveTo(6.793f, 8.738f, 6.763f, 8.812f, 6.773f, 8.878f),
                    PathNode.CurveTo(6.781f, 8.936f, 6.81f, 8.99f, 6.853f, 9.029f),
                    PathNode.CurveTo(6.903f, 9.074f, 6.98f, 9.09f, 7.134f, 9.123f),
                    PathNode.CurveTo(10.378f, 9.815f, 13.621f, 9.815f, 16.866f, 9.123f),
                    PathNode.CurveTo(17.02f, 9.09f, 17.097f, 9.074f, 17.147f, 9.029f),
                    PathNode.CurveTo(17.19f, 8.99f, 17.219f, 8.936f, 17.227f, 8.878f),
                    PathNode.CurveTo(17.236f, 8.812f, 17.207f, 8.738f, 17.147f, 8.589f),
                    PathNode.LineTo(16.688f, 7.443f),
                    PathNode.CurveTo(16.461f, 6.873f, 15.909f, 6.5f, 15.296f, 6.5f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 0.29f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _deviceCar!!
    }

private var _deviceCar: ImageVector? = null
