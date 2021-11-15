package com.example.hw2_fragments.view_model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.hw2_fragments.data.User
import com.example.hw2_fragments.data.UsersData
import java.util.*

class SharedViewModel(application: Application) : AndroidViewModel(application) {

    private var usersData: UsersData = UsersData(application)

    private val _selectedUserLiveData = MutableLiveData<LinkedList<User>>()
    private val selectedUserLiveData: LiveData<LinkedList<User>> = _selectedUserLiveData

    fun buttonPressed(from: Int, to: Int) {
        _selectedUserLiveData.value = usersData.get(from, to)
    }

    fun getUsers(): LiveData<LinkedList<User>> {
        return selectedUserLiveData
    }
}