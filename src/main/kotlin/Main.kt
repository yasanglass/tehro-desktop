// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import data.model.Line
import ui.composable.preview.PreviewHelper

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        TehroApp()
    }
}

@Preview
@Composable
fun TehroApp() {

    MaterialTheme {
        Column {
            PreviewHelper.lines.forEach { line ->
                LineItem(line)
            }
        }
    }

}

@Composable
fun LineItem(
    line: Line,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .padding(horizontal = grid(1.5f))
            .padding(top = grid())
            .fillMaxWidth()
            .background(color = line.color)
            .clickable {}
            .padding(grid(2)),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = line.nameEn,
            color = line.color.getTextOnColor(),
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = line.id.toString(),
            color = line.color.getTextOnColor(),
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        )
    }
}

private val dimenGrid = 8.dp

@Stable
fun grid() = dimenGrid

@Stable
fun grid(multiplier: Float) = dimenGrid * multiplier

@Stable
fun grid(multiplier: Int) = dimenGrid * multiplier

fun Color.isDark(): Boolean = luminance() < 0.5

fun Color.isLight(): Boolean = !this.isDark()

fun Color.getTextOnColor() = if (this.isDark()) Color.White else Color.Black
