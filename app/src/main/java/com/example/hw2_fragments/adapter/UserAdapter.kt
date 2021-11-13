package com.example.hw2_fragments.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hw2_fragments.R
import com.example.hw2_fragments.data.User

class UserAdapter(private val users: List<User>) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var profilePhoto: ImageView = view.findViewById(R.id.imgUserIcon)
        var name: TextView = view.findViewById(R.id.txtUsername)
        var wasOnline: TextView = view.findViewById(R.id.txtWasOnline)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.profilePhoto.setImageDrawable(users[position].profilePhoto)
        holder.name.text = users[position].name
        holder.wasOnline.text = users[position].wasOnline
    }

    override fun getItemCount(): Int = users.size
}