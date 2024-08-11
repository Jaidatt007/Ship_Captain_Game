package com.example.shipcaptaingame.repository

import android.util.Log
import com.example.shipcaptaingame.model.Position
import com.example.shipcaptaingame.model.Value

class Repository {
    private var _score : Value = Value(0)
    private var _attempt : Value = Value(50)

    private var _x : Position = Position(170)
    private var _y : Position = Position(280)

    private var _turn : Position = Position(0)

    fun get_score() = _score
    fun get_attempt() = _attempt

    fun get_x() = _x
    fun get_y() = _y
    fun get_turn() = _turn

    fun buttonClicked(dir : String){
        if(dir == "N") {
            _y.value -= 10
            Log.d("Button Clicked", "North ${_y.value}")
        }else if(dir == "W"){
            _x.value -= 10
            Log.d("Button Clicked", "West")
        }else if(dir == "E"){
            _x.value += 10
            Log.d("Button Clicked", "East")
        }else if(dir == "S"){
            _y.value += 10
            Log.d("Button Clicked", "South")
        }
    }
}