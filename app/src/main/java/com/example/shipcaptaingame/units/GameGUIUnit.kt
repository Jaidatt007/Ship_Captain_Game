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
import com.example.shipcaptaingame.viewmodel.ViewModel

@Composable
fun GameGUIUnit(viewModel: ViewModel){
    Image(
        painter = painterResource(R.drawable.ship_png),
        contentDescription = "",
        modifier = Modifier.offset((viewModel.x.value).dp, (viewModel.y.value).dp)
            .size(80.dp).rotate((viewModel.turn.value).toFloat())
    )
}