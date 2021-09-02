package com.pankaj.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var mlistview: ListView? = null
    private val languagename = arrayOf("Android", "java", "Kotlin", "Dart", "Php")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mlistview = findViewById(R.id.listview)
        mlistview!!.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, languagename)
        mlistview!!.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->

            Toast.makeText(applicationContext,"You clicked - "+languagename[+position],Toast.LENGTH_SHORT).show()
        }
    }
}