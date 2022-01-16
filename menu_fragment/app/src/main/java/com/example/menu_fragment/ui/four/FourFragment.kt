package com.example.menu_fragment.ui.four

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.menu_fragment.R

class FourFragment : Fragment() {

    companion object {
        fun newInstance() = FourFragment()
    }

    private lateinit var viewModel: FourViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.four_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FourViewModel::class.java)
        // TODO: Use the ViewModel
    }

}