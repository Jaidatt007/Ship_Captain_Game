package com.example.shipcaptaingame.units

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shipcaptaingame.viewmodel.ViewModel

@Composable
fun ResultUnit(viewModel: ViewModel){
    Row(modifier = Modifier.fillMaxWidth().padding(8.dp),
        horizontalArrangement = Arrangement.SpaceEvenly){
        Row(verticalAlignment = Alignment.CenterVertically){
            Text("Score", fontSize = 18.sp , color = MaterialTheme.colorScheme.onSecondary)
            Text("  =  " , color = MaterialTheme.colorScheme.onSecondary)
            Text(viewModel.score.value.toString(), fontSize = 24.sp , fontWeight = FontWeight.Bold , color = MaterialTheme.colorScheme.onSecondary)
        }
        Spacer(modifier = Modifier.width(40.dp))
        Row(verticalAlignment = Alignment.CenterVertically){
            Text("Attempts", fontSize = 18.sp , color = MaterialTheme.colorScheme.onSecondary)
            Text("  =  " , color = MaterialTheme.colorScheme.onSecondary)
            Text(viewModel.attempt.value.toString(), fontSize = 24.sp , fontWeight = FontWeight.Bold , color = MaterialTheme.colorScheme.onSecondary)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ResultUnitPreview(){
//    ResultUnit()
}