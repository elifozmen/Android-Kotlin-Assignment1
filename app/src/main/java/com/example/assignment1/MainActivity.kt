package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment1.adapter.ItemAdapter
import com.example.assignment1.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val users = DataSource(this).loadUsers()

        val rv :RecyclerView = findViewById(R.id.recyclerView)
        rv.adapter = ItemAdapter(users)
        rv.setHasFixedSize(true)
    }

}