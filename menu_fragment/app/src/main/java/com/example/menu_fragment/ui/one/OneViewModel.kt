package com.example.menu_fragment.ui.one

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OneViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "One"
    }
    val text: LiveData<String> = _text
}