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

/** `systemui_icon_volume_assistant` */
val OpalineIcons.System.VolumeAssistant: ImageVector
    get() {
        if (_volumeAssistant != null) return _volumeAssistant!!
        _volumeAssistant = ImageVector.Builder(
            name = "VolumeAssistant",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.369f, 3.369f),
                    PathNode.CurveTo(4.949f, 1.79f, 7.388f, 1.723f, 9.723f, 2.432f),
                    PathNode.CurveTo(10.569f, 2.689f, 11.387f, 3.031f, 12.174f, 3.438f),
                    PathNode.CurveTo(12.93f, 3.042f, 13.681f, 2.722f, 14.411f, 2.486f),
                    PathNode.CurveTo(16.715f, 1.741f, 19.147f, 1.738f, 20.704f, 3.295f),
                    PathNode.CurveTo(22.262f, 4.853f, 22.259f, 7.285f, 21.514f, 9.589f),
                    PathNode.CurveTo(21.261f, 10.37f, 20.939f, 11.126f, 20.562f, 11.857f),
                    PathNode.CurveTo(20.988f, 12.674f, 21.328f, 13.486f, 21.569f, 14.278f),
                    PathNode.CurveTo(22.278f, 16.613f, 22.211f, 19.052f, 20.631f, 20.631f),
                    PathNode.CurveTo(19.052f, 22.211f, 16.613f, 22.278f, 14.278f, 21.569f),
                    PathNode.CurveTo(13.431f, 21.311f, 12.612f, 20.969f, 11.824f, 20.562f),
                    PathNode.CurveTo(11.068f, 20.957f, 10.319f, 21.278f, 9.589f, 21.514f),
                    PathNode.CurveTo(7.285f, 22.259f, 4.853f, 22.262f, 3.295f, 20.704f),
                    PathNode.CurveTo(1.738f, 19.147f, 1.741f, 16.715f, 2.486f, 14.411f),
                    PathNode.CurveTo(2.723f, 13.676f, 3.045f, 12.919f, 3.445f, 12.157f),
                    PathNode.CurveTo(3.015f, 11.336f, 2.674f, 10.519f, 2.432f, 9.723f),
                    PathNode.CurveTo(1.723f, 7.388f, 1.79f, 4.949f, 3.369f, 3.369f),
                    PathNode.Close,
                    PathNode.MoveTo(9.094f, 4.502f),
                    PathNode.CurveTo(7.062f, 3.885f, 5.639f, 4.158f, 4.899f, 4.899f),
                    PathNode.CurveTo(4.158f, 5.639f, 3.885f, 7.062f, 4.502f, 9.094f),
                    PathNode.CurveTo(4.588f, 9.376f, 4.69f, 9.665f, 4.807f, 9.958f),
                    PathNode.CurveTo(5.023f, 9.657f, 5.25f, 9.356f, 5.488f, 9.059f),
                    PathNode.CurveTo(5.823f, 8.638f, 6.063f, 8.12f, 5.946f, 7.595f),
                    PathNode.CurveTo(5.886f, 7.324f, 5.79f, 7.058f, 5.656f, 6.807f),
                    PathNode.LineTo(5.475f, 6.465f),
                    PathNode.CurveTo(5.276f, 6.09f, 5.682f, 5.684f, 6.058f, 5.882f),
                    PathNode.LineTo(6.4f, 6.063f),
                    PathNode.CurveTo(7.321f, 6.548f, 8.423f, 6.547f, 9.343f, 6.061f),
                    PathNode.LineTo(9.686f, 5.88f),
                    PathNode.CurveTo(10.061f, 5.682f, 10.467f, 6.087f, 10.269f, 6.462f),
                    PathNode.LineTo(10.088f, 6.804f),
                    PathNode.CurveTo(9.602f, 7.724f, 9.603f, 8.825f, 10.09f, 9.744f),
                    PathNode.LineTo(10.271f, 10.086f),
                    PathNode.CurveTo(10.469f, 10.461f, 10.063f, 10.867f, 9.688f, 10.669f),
                    PathNode.LineTo(9.346f, 10.488f),
                    PathNode.CurveTo(9.009f, 10.311f, 8.647f, 10.198f, 8.279f, 10.151f),
                    PathNode.CurveTo(7.7f, 10.076f, 7.166f, 10.409f, 6.816f, 10.876f),
                    PathNode.CurveTo(5.736f, 12.316f, 4.967f, 13.766f, 4.543f, 15.076f),
                    PathNode.CurveTo(3.884f, 17.115f, 4.14f, 18.49f, 4.824f, 19.175f),
                    PathNode.CurveTo(5.509f, 19.86f, 6.885f, 20.116f, 8.924f, 19.456f),
                    PathNode.CurveTo(9.154f, 19.382f, 9.387f, 19.295f, 9.624f, 19.199f),
                    PathNode.CurveTo(8.87f, 18.653f, 8.153f, 18.052f, 7.481f, 17.41f),
                    PathNode.CurveTo(6.561f, 16.532f, 6.211f, 15.192f, 6.763f, 14.046f),
                    PathNode.CurveTo(6.856f, 13.852f, 7.12f, 13.829f, 7.257f, 13.995f),
                    PathNode.CurveTo(7.656f, 14.483f, 8.092f, 14.965f, 8.564f, 15.437f),
                    PathNode.CurveTo(10.636f, 17.509f, 12.924f, 18.896f, 14.906f, 19.498f),
                    PathNode.CurveTo(16.939f, 20.115f, 18.361f, 19.843f, 19.102f, 19.102f),
                    PathNode.CurveTo(19.843f, 18.361f, 20.115f, 16.939f, 19.498f, 14.906f),
                    PathNode.CurveTo(19.415f, 14.631f, 19.315f, 14.35f, 19.201f, 14.065f),
                    PathNode.CurveTo(18.579f, 14.931f, 17.885f, 15.75f, 17.143f, 16.512f),
                    PathNode.CurveTo(16.263f, 17.416f, 14.924f, 17.73f, 13.801f, 17.156f),
                    PathNode.CurveTo(13.621f, 17.063f, 13.601f, 16.817f, 13.758f, 16.689f),
                    PathNode.CurveTo(14.277f, 16.264f, 14.793f, 15.8f, 15.296f, 15.296f),
                    PathNode.CurveTo(17.393f, 13.199f, 18.817f, 10.901f, 19.456f, 8.924f),
                    PathNode.CurveTo(20.116f, 6.885f, 19.86f, 5.509f, 19.175f, 4.824f),
                    PathNode.CurveTo(18.49f, 4.14f, 17.115f, 3.884f, 15.076f, 4.543f),
                    PathNode.CurveTo(14.846f, 4.618f, 14.612f, 4.704f, 14.374f, 4.799f),
                    PathNode.CurveTo(15.13f, 5.346f, 15.847f, 5.948f, 16.52f, 6.59f),
                    PathNode.CurveTo(17.44f, 7.468f, 17.79f, 8.808f, 17.237f, 9.954f),
                    PathNode.CurveTo(17.144f, 10.149f, 16.88f, 10.172f, 16.743f, 10.005f),
                    PathNode.CurveTo(16.344f, 9.518f, 15.908f, 9.035f, 15.437f, 8.564f),
                    PathNode.CurveTo(13.365f, 6.492f, 11.076f, 5.104f, 9.094f, 4.502f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _volumeAssistant!!
    }

private var _volumeAssistant: ImageVector? = null
