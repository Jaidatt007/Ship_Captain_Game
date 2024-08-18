package com.example.shipcaptaingame.viewmodel

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

    private val _width = mutableIntStateOf(_repository.get_width().value)
    private val _height = mutableIntStateOf(_repository.get_height().value)


    val score : MutableState<Int> = _score
    val attempt : MutableState<Int> = _attempt

    val x : MutableState<Int> = _x
    val y : MutableState<Int> = _y
    val turn : MutableState<Int> = _turn

    val width : MutableState<Int> = _width
    val height : MutableState<Int> = _height

    fun buttonClicked(dir:String){
        _repository.buttonClicked(dir = dir)

        _score.value = _repository.get_score().value
        _attempt.value = _repository.get_attempt().value

        _x.value = _repository.get_x().value
        _y.value = _repository.get_y().value
        _turn.value = _repository.get_turn().value

    }
    fun resetGame(){
        _repository.resetGame()

        _score.value = _repository.get_score().value
        _attempt.value = _repository.get_attempt().value

        _x.value = _repository.get_x().value
        _y.value = _repository.get_y().value
        _turn.value = _repository.get_turn().value

    }
    fun setWidthHeight(width:Int , height:Int){
        _repository.setWidthHeight(width,height)
    }

}