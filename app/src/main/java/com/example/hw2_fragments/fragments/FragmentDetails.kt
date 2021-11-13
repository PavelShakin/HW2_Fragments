package com.example.hw2_fragments.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.hw2_fragments.R
import com.example.hw2_fragments.adapter.UserAdapter
import com.example.hw2_fragments.data.User
import com.example.hw2_fragments.data.UsersData

class FragmentDetails : Fragment(R.layout.fragment_details) {

    private lateinit var users: List<User>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        users = UsersData(requireActivity().application).usersList
        val recyclerView: RecyclerView? = getView()?.findViewById(R.id.recyclerView)
        recyclerView!!.adapter = UserAdapter(users)
    }
}