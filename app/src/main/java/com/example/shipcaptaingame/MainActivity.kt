package com.example.shipcaptaingame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.shipcaptaingame.screens.ShipCaptainGameScreen
import com.example.shipcaptaingame.ui.theme.ShipCaptainGameTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShipCaptainGameTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ShipCaptainGameScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}