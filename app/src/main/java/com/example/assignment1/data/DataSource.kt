package com.example.assignment1.data

import android.content.Context
import com.example.assignment1.R
import com.example.assignment1.model.User

class DataSource (val context: Context) {
    fun getUserName(): Array<String> {
        return context.resources.getStringArray(R.array.album_array)
    }

    fun getUserAddress(): Array<String> {
        return context.resources.getStringArray(R.array.lyric_array)

    }

    fun getProfileDesc(): Array<String> {
        return context.resources.getStringArray(R.array.albumdesc_array)

    }

    fun loadUsers(): List<User> {
        val albumList = getUserName()
        val lyricList = getUserAddress()
        val albumDescList = getProfileDesc()
        var users = mutableListOf<User>()

        for (i in 0..9) {
            val user = User(albumList[i], lyricList[i], albumDescList[i])
            users.add(user)
        }
        return users
    }
}
