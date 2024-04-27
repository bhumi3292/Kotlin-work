package com.example.a34a

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListViewActivity : AppCompatActivity() {

    lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        setContentView(R.layout.activity_list_view)

        listView=findViewById(R.id.listView)
        var data=resources.getStringArray(R.array.countries)

        var adapter= ArrayAdapter(this,
            android.R.layout.simple_dropdown_item_1line,data

        )
        listView.adapter=adapter

        listView.setOnItemClickListener{parent,view,position,id ->
        val datas: String=parent.getItemIdAtPosition(position).toString()}







    }


}