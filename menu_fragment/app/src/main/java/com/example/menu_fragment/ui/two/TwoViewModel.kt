package com.example.menu_fragment.ui.two

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TwoViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Two"
    }
    val text: LiveData<String> = _text
}