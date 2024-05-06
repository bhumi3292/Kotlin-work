package com.example.a34a

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a34a.adapter.RecyclerAdapter

class Dashboard : AppCompatActivity() {

    lateinit var recyclerView : RecyclerView
    var titleList = ArrayList<String>()
    var imageList = ArrayList<Int>()
    var descriptionList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycler_view)

        recyclerView = findViewById(R.id.RecyclerView)
        titleList.add("fire")
        titleList.add("flowers")
        titleList.add("girls")
        titleList.add("house")
        titleList.add("monkey")
        titleList.add("mountain")
        titleList.add("icecream")

        imageList.add(R.drawable.fire)
        imageList.add(R.drawable.flowers)
        imageList.add(R.drawable.foods)
        imageList.add(R.drawable.girl)
        imageList.add(R.drawable.houses)
        imageList.add(R.drawable.monkey)
        imageList.add(R.drawable.mountain)
        imageList.add(R.drawable.icecreams)

        descriptionList.add("This is an image of fire ")
        descriptionList.add("This is an image of flower ")
        descriptionList.add("This is an image of food ")
        descriptionList.add("This is an image of girl")
        descriptionList.add("This is an image of house ")
        descriptionList.add("This is an image of monkey ")
        descriptionList.add("This is an image of mountain ")
        descriptionList.add("This is an image of icecream")

        var adapter= RecyclerAdapter<Any>(titleList,imageList,descriptionList)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }



}