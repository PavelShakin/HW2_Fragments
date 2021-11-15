package com.example.hw2_fragments.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.hw2_fragments.R
import com.example.hw2_fragments.adapter.UserAdapter
import com.example.hw2_fragments.data.User
import com.example.hw2_fragments.data.UsersData
import com.example.hw2_fragments.view_model.SharedViewModel
import java.util.*

class FragmentDetails : Fragment(R.layout.fragment_details) {

    private lateinit var users: LinkedList<User>
    private lateinit var viewModel: SharedViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView? = getView()?.findViewById(R.id.recyclerView)

        viewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        viewModel.getUsers().observe(viewLifecycleOwner, {
            users = viewModel.getUsers().value!!
            recyclerView!!.adapter = UserAdapter(users)
        })
    }
}