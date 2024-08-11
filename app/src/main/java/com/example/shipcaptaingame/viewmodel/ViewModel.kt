package com.example.shipcaptaingame.viewmodel

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel
import com.example.shipcaptaingame.repository.Repository

class ViewModel : ViewModel()  {

    private val _repository : Repository = Repository()

    private val _score = mutableIntStateOf(_repository.get_score().value)
    private val _attempt = mutableIntStateOf(_repository.get_attempt().value)

    private val _x = mutableIntStateOf(_repository.get_x().value)
    private val _y = mutableIntStateOf(_repository.get_y().value)
    private val _turn = mutableIntStateOf(_repository.get_turn().value)

    val score : MutableState<Int> = _score
    val attempt : MutableState<Int> = _attempt

    val x : MutableState<Int> = _x
    val y : MutableState<Int> = _y
    val turn : MutableState<Int> = _turn

    fun buttonClicked(dir:String){
        _repository.buttonClicked(dir = dir)
        _x.value = _repository.get_x().value
        _y.value = _repository.get_y().value
        Log.d("viewmodel","x = ${x.value} and y = ${y.value}")
    }
}