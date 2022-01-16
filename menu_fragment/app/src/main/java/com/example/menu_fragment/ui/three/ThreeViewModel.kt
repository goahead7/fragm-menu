package com.example.menu_fragment.ui.three

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ThreeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Three"
    }
    val text: LiveData<String> = _text
}