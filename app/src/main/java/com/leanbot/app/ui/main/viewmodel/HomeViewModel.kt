package com.leanbot.app.ui.main.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.leanbot.app.model.User

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    private val _userList = MutableLiveData<ArrayList<User>>().apply {

        value = arrayListOf(
            User("John", "", "", ""),
            User("John", "", "", ""),
            User("John", "", "", ""),
            User("John", "", "", ""),
            User("John", "", "", ""),
            User("John", "", "", ""),
            User("Jane", "", "","Doe"))
    }

    val userList: LiveData<ArrayList<User>> = _userList
}