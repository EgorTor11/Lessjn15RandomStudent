package com.example.lessjn15randomstudent

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

 class  DataModel: ViewModel() {
    val message: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val messageFromFrag1: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}