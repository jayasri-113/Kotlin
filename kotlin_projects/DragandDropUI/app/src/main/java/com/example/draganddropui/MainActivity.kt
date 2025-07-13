package com.example.draganddropui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.example.draganddropui.ui.theme.DragandDropUITheme
import kotlin.io.path.Path
import kotlin.io.path.moveTo
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.graphicsLayer
import kotlin.math.absoluteValue


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DragandDropUITheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   //DraggableResizableBox()
                   //TapToRevealCard()
                    ImageCarousel()


                }
            }
        }
    }
}

@Composable
fun DraggableResizableBox() {
    var size by remember { mutableStateOf(100.dp) }
    var offsetX by remember { mutableStateOf(0f) }
    var offsetY by remember { mutableStateOf(0f) }

    Box(
        modifier = Modifier
            .size(size)
            .offset { IntOffset(offsetX.toInt(), offsetY.toInt()) }
            .background(Color.Cyan)
            .pointerInput(Unit) {
                detectTransformGestures { _, pan, zoom, _ ->
                    offsetX += pan.x
                    offsetY += pan.y
                    size = (size.value * zoom).dp.coerceIn(50.dp, 300.dp)
                }
            }
    )
}
@Composable
fun SignaturePad() {
    var path = remember { androidx.compose.ui.graphics.Path() }
    val paint = Paint()
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .pointerInput(Unit) {
                detectDragGestures { change, _ ->
                    val point = Offset(change.position.x, change.position.y)
                    if (path.isEmpty) {
                        path.moveTo(point.x, point.y)
                    } else {
                        path.lineTo(point.x, point.y)
                    }
                }
            }
    ) {
        drawPath(
            path,
            color = Color.Black,
            alpha = 4f.also { paint.strokeWidth = it }
        )
    }
}

@Composable
fun ImageCarousel() {
    val images = listOf(Color.Red, Color.Green, Color.Blue, Color.Yellow)
    val state = rememberScrollState()

    Box(modifier = Modifier.fillMaxSize()) {
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            state = rememberLazyListState()
        ) {
            items(images) { color ->
                Box(
                    modifier = Modifier
                        .size(300.dp)
                        .background(color)
                        .padding(8.dp)
                )
            }
        }
    }
}
@Composable
fun TapToRevealCard() {
    var flipped by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .size(150.dp)
            .graphicsLayer(rotationY = if (flipped) 180f else 0f)
            .clickable { flipped = !flipped }
            .background(if (flipped) Color.Green else Color.Blue),
        contentAlignment = Alignment.Center
    ) {
        Text(text = if (flipped) "Back" else "Front", color = Color.White)
    }
}
