package com.example.shipcaptaingame.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.shipcaptaingame.R

@Composable
fun ShipCaptainGameScreen(modifier: Modifier) {
    Column(modifier = modifier) {
        Box(modifier = Modifier.fillMaxSize().background(Color.Gray).weight(34f)) {
            Image(
                painter = painterResource(R.drawable.baseline_arrow_upward_24),
                contentDescription = "",
                modifier = Modifier.offset(200.dp, 200.dp).rotate(180f)
            )
        }
        Box(modifier = Modifier.fillMaxSize().background(Color.Magenta).weight(4f)) {

        }
        Box(modifier = Modifier.fillMaxSize().background(Color.Cyan).weight(14f)) {

        }
    }
}