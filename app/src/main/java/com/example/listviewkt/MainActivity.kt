package com.example.listviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView : ListView = findViewById(R.id.list_item)

        val listItems = arrayOf(
            "Read A Book",
            "Create A project",
            "Learn Kotlin",
            "Go for shopping"
        )

        val listAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,listItems)
        listView.adapter = listAdapter


    }
}