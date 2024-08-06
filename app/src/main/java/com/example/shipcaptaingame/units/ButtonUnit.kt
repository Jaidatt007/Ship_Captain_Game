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
            Spacer(modifier = Modifier.width(80.dp))
            ButtonDesign("EAST") { }
        }
        Spacer(modifier = Modifier.height(4.dp))
        ButtonDesign("SOUTH") { }
    }
}

@Composable
fun ButtonDesign(text:String , onClick : ()->Unit){
    var ts = 0  ; var te = 0  ; var bs = 0  ; var be = 0

    when(text){
        "NORTH" -> {
            ts = 24 ; te = 24 ; bs = 12 ; be = 12
        }
        "WEST" -> {
            ts = 36 ; te = 12 ; bs = 36 ; be = 12
        }
        "EAST" -> {
            ts = 12 ; te = 24 ; bs = 12 ; be = 24
        }
        "SOUTH" -> {
            ts = 12 ; te = 12 ; bs = 24 ; be = 24
        }
    }

    FloatingActionButton(modifier = Modifier.width(110.dp).height(56.dp).padding(4.dp),
        onClick = onClick,
        elevation = FloatingActionButtonDefaults.elevation(4.dp),
        shape = RoundedCornerShape(topStart = ts.dp,topEnd = te.dp,bottomStart = bs.dp,bottomEnd = be.dp),
    ) {
        Text(text = text, fontSize = 22.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonUnitPreview(){
//    ButtonUnit()
}