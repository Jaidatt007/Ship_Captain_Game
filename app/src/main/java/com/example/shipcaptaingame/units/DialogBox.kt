package com.example.shipcaptaingame.units

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shipcaptaingame.viewmodel.ViewModel


@Composable
fun ResetDialogBox(viewModel: ViewModel){

    if(viewModel.alertDialogbox.value) {
        AlertDialog(
            onDismissRequest = {
                viewModel.alertDialogbox.value = false
                viewModel.resetGame()
            },
            title = {
                Text(
                    text = "🎉 Scoreboard 🎉",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            },
            text = {
                Column() {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            "Score  = ",
                            modifier = Modifier.padding(8.dp),
                            fontSize = 18.sp
                        )
                        Text(
                            "${viewModel.score.value}",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            "Attempts  = ",
                            modifier = Modifier.padding(8.dp),
                            fontSize = 18.sp
                        )
                        Text(
                            "${viewModel.attempt.value}",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        viewModel.alertDialogbox.value = false
                        Log.d("Reseting","${viewModel.alertDialogbox.value}")
                        viewModel.resetGame()
                    }
                ) {
                    Text("Continue !")
                }
            }
        )
    }
}