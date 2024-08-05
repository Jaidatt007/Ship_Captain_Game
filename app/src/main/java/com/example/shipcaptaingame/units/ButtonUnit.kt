package com.example.shipcaptaingame.units

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ButtonUnit(){
    Column(modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        ButtonDesign("NORTH") { }
        Spacer(modifier = Modifier.height(4.dp))
        Row {
            ButtonDesign("WEST") { }
            Spacer(modifier = Modifier.width(40.dp))
            ButtonDesign("EAST") { }
        }
        Spacer(modifier = Modifier.height(4.dp))
        ButtonDesign("SOUTH") { }
    }
}

@Composable
fun ButtonDesign(text:String , onClick : ()->Unit){
    var shape = RoundedCornerShape(0.dp)
    if (text == "NORTH"){
        shape = RoundedCornerShape(topStart = 24.dp,topEnd = 24.dp,bottomStart = 12.dp,bottomEnd = 12.dp)
    } else if(text == "WEST"){
        shape = RoundedCornerShape(topStart = 36.dp,topEnd = 12.dp,bottomStart = 36.dp,bottomEnd = 12.dp)
    }else if(text == "EAST"){
        shape = RoundedCornerShape(topStart = 12.dp,topEnd = 36.dp,bottomStart = 12.dp,bottomEnd = 36.dp)
    }else if(text == "SOUTH"){
        shape = RoundedCornerShape(topStart = 12.dp,topEnd = 12.dp,bottomStart = 24.dp,bottomEnd = 24.dp)
    }
    FloatingActionButton(modifier = Modifier.width(110.dp).height(56.dp).padding(4.dp),
        onClick = onClick,
        elevation = FloatingActionButtonDefaults.elevation(4.dp),
        shape = shape,
    ) {
        Text(text = text, fontSize = 22.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonUnitPreview(){
//    ButtonUnit()
}