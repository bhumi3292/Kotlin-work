package com.example.a34a

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

@Suppress("UNREACHABLE_CODE")
class SpinnerActivity : AppCompatActivity(),AdapterView.OnItemSelectedListener {
    lateinit var textView: TextView
    lateinit var spinner: Spinner
    var data= arrayOf("Nepal","China","Pakistan","India")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        textView=findViewById(R.id.textView)
        spinner=findViewById(R.id.spinner)

        val adapter=ArrayAdapter(this@SpinnerActivity,
            android.R.layout.simple_spinner_item,
            data)

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)

        spinner.adapter=adapter
        spinner.onItemSelectedListener=this

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, index : Int, id: Long) {


        if(parent!=null) {
            textView.text = parent.getItemAtPosition(index).toString()
        }
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

}