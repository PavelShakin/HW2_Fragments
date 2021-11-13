package com.example.hw2_fragments.data

import android.app.Application
import androidx.core.content.res.ResourcesCompat
import com.example.hw2_fragments.R

class UsersData(application: Application) {

    var usersList = listOf(
        User(0, "Jon", ResourcesCompat.getDrawable(application.resources, R.drawable.ic_user1, null)!!, "was online 1 hour ago"),
        User(1, "Bob", ResourcesCompat.getDrawable(application.resources, R.drawable.ic_user2, null)!!, "was online 12 minutes ago"),
        User(2, "Ann", ResourcesCompat.getDrawable(application.resources, R.drawable.ic_user3, null)!!, "was online 10 hour ago"),
        User(3, "Ferdinand", ResourcesCompat.getDrawable(application.resources, R.drawable.ic_user4, null)!!, "was online 3 days ago"),
        User(4, "David", ResourcesCompat.getDrawable(application.resources, R.drawable.ic_user5, null)!!, "was online yesterday ago"),
        User(5, "Paul", ResourcesCompat.getDrawable(application.resources, R.drawable.ic_user6, null)!!, "online"),
        User(6, "Mike", ResourcesCompat.getDrawable(application.resources, R.drawable.ic_user7, null)!!, "was online a week ago"),
        User(7, "Julia", ResourcesCompat.getDrawable(application.resources, R.drawable.ic_user8, null)!!, "was online 6 years ago"),
        User(8, "Kelly", ResourcesCompat.getDrawable(application.resources, R.drawable.ic_user9, null)!!, "was online 3 month ago")
    )
}