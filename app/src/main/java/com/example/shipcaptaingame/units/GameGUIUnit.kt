package com.example.shipcaptaingame.units

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import com.example.shipcaptaingame.R
import com.example.shipcaptaingame.viewmodel.ViewModel

@Composable
fun GameGUIUnit(viewModel: ViewModel){

    // State to hold the size in dp
    val widthInDp = remember { mutableStateOf(0.dp) }
    val heightInDp = remember { mutableStateOf(0.dp) }

    val density = LocalDensity.current

    Box(modifier = Modifier.fillMaxSize().background(Color.Cyan),
        contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(R.drawable.ship_png),
            contentDescription = "",
            modifier = Modifier.offset((viewModel.x.value).dp, (viewModel.y.value).dp)
                .size(80.dp).rotate((viewModel.turn.value).toFloat())
        )
    }
    Box(modifier = Modifier.fillMaxSize()
        .border(BorderStroke(8.dp, MaterialTheme.colorScheme.background))
        .onGloballyPositioned { coordinates ->
            // Retrieve the size in pixels
            val sizeInPx: IntSize = coordinates.size
            // Convert the size to dp
            widthInDp.value = with(density) { sizeInPx.width.toDp() }
            heightInDp.value = with(density) { sizeInPx.height.toDp() }
        }){
        viewModel.setWidthHeight(widthInDp.value.value.toInt()-40,heightInDp.value.value.toInt()-60)
    }
}