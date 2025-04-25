package com.example.viewmodelsampleapp.activity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _count : MutableLiveData<Int> = MutableLiveData(0)
    val count : LiveData<Int> = _count

    fun plusCount() {
        _count.value = _count.value!!.plus(1)
    }

}