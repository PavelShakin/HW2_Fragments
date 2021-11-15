package com.example.hw2_fragments.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.hw2_fragments.R
import com.example.hw2_fragments.view_model.SharedViewModel

class FragmentButtons : Fragment(R.layout.fragment_buttons) {

    private lateinit var viewModel: SharedViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        requireView().findViewById<Button>(R.id.btn1).setOnClickListener {
            viewModel.buttonPressed(0, 2)
        }

        requireView().findViewById<Button>(R.id.btn2).setOnClickListener {
            viewModel.buttonPressed(3, 5)
        }

        requireView().findViewById<Button>(R.id.btn3).setOnClickListener {
            viewModel.buttonPressed(6, 8)
        }

        requireView().findViewById<Button>(R.id.btn4).setOnClickListener {
            viewModel.buttonPressed(0, 8)
        }
    }
}