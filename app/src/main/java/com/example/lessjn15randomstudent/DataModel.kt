package com.example.lessjn15randomstudent

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataModel : ViewModel() {
    private val arreyListIdFrag = mutableListOf<Int>()
    val message: MutableLiveData<List<Int>> by lazy {
        MutableLiveData<List<Int>>()
    }

    fun onCheckBoxClick(id: Int) {
        if (arreyListIdFrag.contains(id)) {
            arreyListIdFrag.remove(id)
            // str = ""
        } else {
            arreyListIdFrag.add(id)

        }
        message.value = arreyListIdFrag
    }
}