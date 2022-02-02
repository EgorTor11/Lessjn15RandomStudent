package com.example.lessjn15randomstudent

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataModel : ViewModel() {
    val message: MutableLiveData<List<Int>> by lazy {
        MutableLiveData<List<Int>>()
    }

}