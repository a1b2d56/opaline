// Copyright 2026, Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.basic.ButtonDefaults
import io.github.a1b2d56.opaline.basic.Chip
import io.github.a1b2d56.opaline.basic.SmallTitle
import io.github.a1b2d56.opaline.basic.TabRowWithContour
import io.github.a1b2d56.opaline.basic.TextButton
import io.github.a1b2d56.opaline.blur.ContentMaterialBox
import io.github.a1b2d56.opaline.blur.isRuntimeShaderSupported
import io.github.a1b2d56.opaline.shared.generated.resources.Res
import io.github.a1b2d56.opaline.shared.generated.resources.blur_test_bg
import org.jetbrains.compose.resources.painterResource

fun LazyListScope.contentGlassSection() {
    if (!isRuntimeShaderSupported()) return
    item(key = "content_glass") {
        SmallTitle(text = "Content Glass")
        ContentGlassDemo()
    }
}

@Composable
private fun ContentGlassDemo() {
    var tab by remember { mutableIntStateOf(0) }
    var chipA by remember { mutableStateOf(true) }
    var chipB by remember { mutableStateOf(false) }
    ContentMaterialBox(
        background = {
            Image(
                painter = painterResource(Res.drawable.blur_test_bg),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop,
            )
        },
        modifier = Modifier
            .padding(horizontal = 12.dp)
            .padding(bottom = 12.dp)
            .fillMaxWidth()
            .height(260.dp)
            .clip(RoundedCornerShape(16.dp)),
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            TabRowWithContour(
                tabs = listOf("Photos", "Albums", "Places"),
                selectedTabIndex = tab,
                onTabSelected = { tab = it },
            )
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Chip(selected = chipA, onClick = { chipA = !chipA }, label = "Favorites")
                Chip(selected = chipB, onClick = { chipB = !chipB }, label = "Videos")
            }
            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                TextButton(text = "Secondary", onClick = {}, modifier = Modifier.weight(1f))
                TextButton(
                    text = "Primary",
                    onClick = {},
                    modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.textButtonColorsPrimary(),
                )
            }
            TextButton(
                text = "Borderless",
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.textButtonColorsBorderless(),
            )
        }
    }
}
