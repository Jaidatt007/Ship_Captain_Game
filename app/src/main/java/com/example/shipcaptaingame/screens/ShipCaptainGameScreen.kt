package com.example.shipcaptaingame.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.shipcaptaingame.R
import com.example.shipcaptaingame.units.ButtonUnit
import com.example.shipcaptaingame.units.GameGUIUnit
import com.example.shipcaptaingame.units.ResultUnit
import com.example.shipcaptaingame.viewmodel.ViewModel

@Composable
fun ShipCaptainGameScreen(modifier: Modifier,
                          viewModel: ViewModel) {
    Column(modifier = modifier) {
        Box(modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background)
            .weight(34f),
            contentAlignment = Alignment.Center) {
            GameGUIUnit(viewModel = viewModel)
        }
        Box(modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.secondary)
            .weight(4f),
            contentAlignment = Alignment.Center) {
            ResultUnit(viewModel = viewModel)
        }
        Box(modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background)
            .weight(14f),
            contentAlignment = Alignment.Center) {
            ButtonUnit(viewModel = viewModel)
        }
    }
    Row(modifier = modifier.then(Modifier.fillMaxWidth().padding(16.dp)),
        horizontalArrangement = Arrangement.End) {
        Icon(
            modifier = Modifier.size(40.dp).clickable {
                viewModel.resetGame()
            },
            painter = painterResource(R.drawable.round_refresh_24), contentDescription = "",
            tint = MaterialTheme.colorScheme.primary
        )
    }
}