package com.example.menu_fragment.ui.five

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.menu_fragment.R

class FiveFragment : Fragment() {

    companion object {
        fun newInstance() = FiveFragment()
    }

    private lateinit var viewModel: FiveViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.five_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FiveViewModel::class.java)
        // TODO: Use the ViewModel
    }

}