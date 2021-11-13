package com.example.hw2_fragments.data

import android.graphics.drawable.Drawable

data class User(

    val userId: Int,
    var name: String,
    val profilePhoto: Drawable,
    val wasOnline: String,
)