package com.example.shipcaptaingame.units

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.shipcaptaingame.R

@Composable
fun GameGUIUnit(){
    Image(
        painter = painterResource(R.drawable.ship_png),
        contentDescription = "",
        modifier = Modifier.offset(170.dp, 280.dp)
            .size(80.dp).rotate(0f)
    )
}