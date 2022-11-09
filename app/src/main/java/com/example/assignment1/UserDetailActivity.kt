package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.assignment1.databinding.ActivityUserDetailBinding
import com.example.assignment1.model.User

class UserDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_user_detail)
        val binding : ActivityUserDetailBinding = DataBindingUtil.setContentView(this, R.layout.activity_user_detail)
        val selectedUser = intent.getSerializableExtra("USER") as User
        binding.user = selectedUser
    }
}