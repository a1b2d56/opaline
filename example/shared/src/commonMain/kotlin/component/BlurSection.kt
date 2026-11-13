// Copyright 2026, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.a1b2d56.opaline.basic.Card
import io.github.a1b2d56.opaline.basic.HorizontalDivider
import io.github.a1b2d56.opaline.basic.SmallTitle
import io.github.a1b2d56.opaline.basic.Text
import io.github.a1b2d56.opaline.blur.BlurDefaults
import io.github.a1b2d56.opaline.blur.OpalineMaterial
import io.github.a1b2d56.opaline.blur.isRuntimeShaderSupported
import io.github.a1b2d56.opaline.blur.layerBackdrop
import io.github.a1b2d56.opaline.blur.rememberLayerBackdrop
import io.github.a1b2d56.opaline.blur.textureBlur
import io.github.a1b2d56.opaline.preference.OverlayDropdownPreference
import io.github.a1b2d56.opaline.preference.SliderPreference
import io.github.a1b2d56.opaline.preference.SwitchPreference
import io.github.a1b2d56.opaline.shared.generated.resources.Res
import io.github.a1b2d56.opaline.shared.generated.resources.blur_test_bg
import io.github.a1b2d56.opaline.theme.OpalineTheme
import org.jetbrains.compose.resources.painterResource
import ui.isInDarkTheme
import androidx.compose.ui.graphics.BlendMode as ComposeBlendMode

fun LazyListScope.blurSection() {
    if (!isRuntimeShaderSupported()) return
    item(key = "blur") {
        SmallTitle(text = "Texture Blur")
        BlurDemo()
    }
    item(key = "foreground_blur") {
        SmallTitle(text = "Foreground Blur")
        ForegroundBlurDemo()
    }
}

@Composable
private fun BlurDemo() {
    var blurRadiusX by remember { mutableFloatStateOf(100f) }
    var blurRadiusY by remember { mutableFloatStateOf(100f) }
    var noiseCoefficient by remember { mutableFloatStateOf(BlurDefaults.NoiseCoefficient) }
    var brightness by remember { mutableFloatStateOf(0f) }
    var contrast by remember { mutableFloatStateOf(1f) }
    var saturation by remember { mutableFloatStateOf(1f) }

    val isInDark = isInDarkTheme()

    val backdrop = rememberLayerBackdrop()

    val materials = OpalineMaterial.entries
    val materialItems = remember { listOf("None") + materials.map { it.name } }
    var materialIndex by remember { mutableIntStateOf(materials.indexOf(OpalineMaterial.FrameworkBottomBar) + 1) }
    val material = materials.getOrNull(materialIndex - 1)
    val blendColors = remember(material, isInDark) {
        material?.blur(isInDark)?.let { listOf(it.layer1, it.layer2) } ?: emptyList()
    }
    val highlight = remember(material, isInDark) { material?.stroke(isInDark)?.toHighlight() }

    Column(
        modifier = Modifier
            .padding(horizontal = 16.dp),
    ) {
        // Preview area
        Card(
            modifier = Modifier.padding(bottom = 16.dp),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(280.dp),
            ) {
                // Background layer (captured by layerBackdrop)
                Box(
                    modifier = Modifier
                        .matchParentSize()
                        .layerBackdrop(backdrop),
                ) {
                    StaticBackground()
                }

                // Blur overlay
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.8f)
                        .height(140.dp)
                        .align(Alignment.Center)
                        .textureBlur(
                            backdrop = backdrop,
                            shape = RoundedCornerShape(24.dp),
                            blurRadiusX = blurRadiusX,
                            blurRadiusY = blurRadiusY,
                            noiseCoefficient = noiseCoefficient,
                            colors = BlurDefaults.blurColors(
                                blendColors = blendColors,
                                brightness = brightness,
                                contrast = contrast,
                                saturation = saturation,
                            ),
                            highlight = highlight,
                        ),
                    contentAlignment = Alignment.Center,
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "Texture Blur | R=${blurRadiusX.toInt()}",
                            style = OpalineTheme.textStyles.headline2,
                        )
                        Spacer(Modifier.height(4.dp))
                        Text(
                            text = materialItems[materialIndex],
                            style = OpalineTheme.textStyles.body2,
                            color = OpalineTheme.colorScheme.onSurfaceVariantActions,
                        )
                    }
                }
            }

            OverlayDropdownPreference(
                title = "Material",
                items = materialItems,
                selectedIndex = materialIndex,
                onSelectedIndexChange = { materialIndex = it },
            )

            HorizontalDivider(Modifier.fillMaxWidth().padding(horizontal = 16.dp))

            SliderPreference(
                title = "Blur Radius",
                valueText = "${blurRadiusX.toInt()}",
                value = blurRadiusX / 200f,
                onValueChange = {
                    blurRadiusX = it * 200f
                    blurRadiusY = it * 200f
                },
                insideMargin = PaddingValues(16.dp, 16.dp, 16.dp, 0.dp),
            )

            SliderPreference(
                title = "Noise",
                valueText = "${(noiseCoefficient * 10000).toInt() / 10000f}",
                value = noiseCoefficient / 0.1f,
                onValueChange = { noiseCoefficient = it * 0.1f },
                insideMargin = PaddingValues(16.dp, 16.dp, 16.dp, 0.dp),
            )

            SliderPreference(
                title = "Brightness",
                valueText = "${(brightness * 100).toInt() / 100f}",
                value = (brightness + 1f) / 2f,
                onValueChange = { brightness = it * 2f - 1f },
                insideMargin = PaddingValues(16.dp, 16.dp, 16.dp, 0.dp),
            )

            SliderPreference(
                title = "Contrast",
                valueText = "${(contrast * 100).toInt() / 100f}",
                value = contrast / 3f,
                onValueChange = { contrast = it * 3f },
                insideMargin = PaddingValues(16.dp, 16.dp, 16.dp, 0.dp),
            )

            SliderPreference(
                title = "Saturation",
                valueText = "${(saturation * 100).toInt() / 100f}",
                value = saturation / 3f,
                onValueChange = { saturation = it * 3f },
            )
        }
    }
}

@Composable
private fun ForegroundBlurDemo() {
    var blurRadiusX by remember { mutableFloatStateOf(200f) }
    var blurRadiusY by remember { mutableFloatStateOf(200f) }
    var noiseCoefficient by remember { mutableFloatStateOf(BlurDefaults.NoiseCoefficient) }
    var brightness by remember { mutableFloatStateOf(0f) }
    var contrast by remember { mutableFloatStateOf(1f) }
    var saturation by remember { mutableFloatStateOf(1f) }

    val isInDark = isInDarkTheme()

    val backdrop = rememberLayerBackdrop()
    val materials = OpalineMaterial.entries
    val materialItems = remember { listOf("None") + materials.map { it.name } }
    var materialIndex by remember { mutableIntStateOf(materials.indexOf(OpalineMaterial.FrameworkTopBar) + 1) }
    val blendColors = remember(materialIndex, isInDark) {
        materials.getOrNull(materialIndex - 1)?.blur(isInDark)?.let { listOf(it.layer1, it.layer2) } ?: emptyList()
    }

    Column(
        modifier = Modifier.padding(horizontal = 16.dp),
    ) {
        Card(
            modifier = Modifier.padding(bottom = 16.dp),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(280.dp),
            ) {
                Box(
                    modifier = Modifier
                        .matchParentSize()
                        .layerBackdrop(backdrop),
                ) {
                    StaticBackground()
                }
                // Foreground blur text
                Text(
                    text = "Foreground Blur\nOpaline Demo",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Black,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.Center)
                        .textureBlur(
                            backdrop = backdrop,
                            shape = RoundedCornerShape(0.dp),
                            blurRadiusX = blurRadiusX,
                            blurRadiusY = blurRadiusY,
                            noiseCoefficient = noiseCoefficient,
                            colors = BlurDefaults.blurColors(
                                blendColors = blendColors,
                                brightness = brightness,
                                contrast = contrast,
                                saturation = saturation,
                            ),
                            contentBlendMode = ComposeBlendMode.DstIn,
                        ),
                )
            }

            OverlayDropdownPreference(
                title = "Material",
                items = materialItems,
                selectedIndex = materialIndex,
                onSelectedIndexChange = { materialIndex = it },
            )

            HorizontalDivider(Modifier.fillMaxWidth().padding(horizontal = 16.dp))

            SliderPreference(
                title = "Blur Radius",
                valueText = "${blurRadiusX.toInt()}",
                value = blurRadiusX / 200f,
                onValueChange = {
                    blurRadiusX = it * 200f
                    blurRadiusY = it * 200f
                },
                insideMargin = PaddingValues(16.dp, 16.dp, 16.dp, 0.dp),
            )

            SliderPreference(
                title = "Noise",
                valueText = "${(noiseCoefficient * 10000).toInt() / 10000f}",
                value = noiseCoefficient / 0.1f,
                onValueChange = { noiseCoefficient = it * 0.1f },
                insideMargin = PaddingValues(16.dp, 16.dp, 16.dp, 0.dp),
            )

            SliderPreference(
                title = "Brightness",
                valueText = "${(brightness * 100).toInt() / 100f}",
                value = (brightness + 1f) / 2f,
                onValueChange = { brightness = it * 2f - 1f },
                insideMargin = PaddingValues(16.dp, 16.dp, 16.dp, 0.dp),
            )

            SliderPreference(
                title = "Contrast",
                valueText = "${(contrast * 100).toInt() / 100f}",
                value = contrast / 3f,
                onValueChange = { contrast = it * 3f },
                insideMargin = PaddingValues(16.dp, 16.dp, 16.dp, 0.dp),
            )

            SliderPreference(
                title = "Saturation",
                valueText = "${(saturation * 100).toInt() / 100f}",
                value = saturation / 3f,
                onValueChange = { saturation = it * 3f },
            )
        }
    }
}

@Composable
private fun StaticBackground() {
    Image(
        painter = painterResource(Res.drawable.blur_test_bg),
        contentDescription = null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop,
    )
}
