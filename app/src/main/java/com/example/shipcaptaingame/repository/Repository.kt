package com.example.shipcaptaingame.repository

import android.util.Log
import com.example.shipcaptaingame.model.Bool
import com.example.shipcaptaingame.model.Position
import com.example.shipcaptaingame.model.Value
import kotlin.random.Random

class Repository {
    private var _score : Value = Value(0)
    private var _attempt : Value = Value(20)

    private var _x : Position = Position(0)
    private var _y : Position = Position(0)

    private var _turn : Position = Position(0)

    private var _width : Value = Value(0)
    private var _height : Value = Value(0)

    private var _alertDialogbox : Bool = Bool(false)

    fun get_score() = _score
    fun get_attempt() = _attempt

    fun get_x() = _x
    fun get_y() = _y
    fun get_turn() = _turn

    fun get_width() = _width
    fun get_height() = _height

    fun get_alertDialogbox() = _alertDialogbox


    private val step = 25


    fun buttonClicked(dir : String){

        if(_attempt.value >= 1){
            _attempt.value -= 1
            doWeGetTreasure()

            if (dir == "N") {
                _turn.value = 0
                _y.value -= step
                Log.d("Button Clicked", "North")
                Log.d("Position", "x = ${_x.value} & y = ${_y.value}")
            } else if (dir == "W") {
                _turn.value = 270
                _x.value -= step
                Log.d("Button Clicked", "West")
                Log.d("Position", "x = ${_x.value} & y = ${_y.value}")
            } else if (dir == "E") {
                _turn.value = 90
                _x.value += step
                Log.d("Button Clicked", "East")
                Log.d("Position", "x = ${_x.value} & y = ${_y.value}")
            } else if (dir == "S") {
                _turn.value = 180
                _y.value += step
                Log.d("Button Clicked", "South")
                Log.d("Position", "x = ${_x.value} & y = ${_y.value}")
            }

            Log.d("width", "width N = ${-(_width.value / 2)} width P = ${(_width.value / 2)}")
            Log.d("height", "height N = ${-(_height.value / 2)} height P = ${(_height.value / 2)}")

            if (_x.value < -(_width.value / 2) || _x.value > (_width.value / 2) || _y.value < -(_height.value / 2) || _y.value > (_height.value / 2)) {
                _alertDialogbox.bool = true
                Log.d("Reseting", "${_alertDialogbox.bool}")
            } else {
                _alertDialogbox.bool = false
                Log.d("Reseting", "${_alertDialogbox.bool}")
            }
        }else{
            _alertDialogbox.bool = true
        }

    }

    fun resetGame(){

        _score.value = 0
        _attempt.value = 20

        _x.value = 0
        _y.value = 0
        _turn.value = 0

        _alertDialogbox.bool = false

        Log.d("Button Clicked", "Reset")
        Log.d("Position" , "x = ${_x.value} & y = ${_y.value}")
    }

    fun setWidthHeight(width:Int , height:Int) {
        _width.value = width
        _height.value = height
    }

    fun doWeGetTreasure(){
        if (Random.nextBoolean()){
            _score.value += 1
        }
    }

    fun onAttemptChange(attempt : Int){
        _attempt.value = attempt
    }

}