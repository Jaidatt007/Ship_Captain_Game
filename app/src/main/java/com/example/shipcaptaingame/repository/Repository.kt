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

    private val step = 50

    fun buttonClicked(dir : String){
        if(dir == "N") {
            _turn.value = 0
            _y.value -= step
            Log.d("Button Clicked", "North")
            Log.d("Position" , "x = ${_x.value} & y = ${_y.value}")
        }else if(dir == "W"){
            _turn.value = 270
            _x.value -= step
            Log.d("Button Clicked", "West")
            Log.d("Position" , "x = ${_x.value} & y = ${_y.value}")
        }else if(dir == "E"){
            _turn.value = 90
            _x.value += step
            Log.d("Button Clicked", "East")
            Log.d("Position" , "x = ${_x.value} & y = ${_y.value}")
        }else if(dir == "S"){
            _turn.value = 180
            _y.value += step
            Log.d("Button Clicked", "South")
            Log.d("Position" , "x = ${_x.value} & y = ${_y.value}")
        }
    }

    fun resetGame(){
        _score.value = 0
        _attempt.value = 50

        _x.value = 170
        _y.value = 280
        _turn.value = 0
        Log.d("Button Clicked", "Reset")
        Log.d("Position" , "x = ${_x.value} & y = ${_y.value}")
    }
}