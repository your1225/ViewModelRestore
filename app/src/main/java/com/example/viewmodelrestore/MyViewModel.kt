package com.example.viewmodelrestore

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    private var number: MutableLiveData<Int> = MutableLiveData(0)

    public fun getNumber(): MutableLiveData<Int> {
        if (number == null) {
            number = MutableLiveData()
            number.value = 0
        }

        return number
    }

    public fun add() {
        number.value = number.value!!.plus(1)
    }
}