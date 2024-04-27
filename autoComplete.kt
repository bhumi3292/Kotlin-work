package com.example.a34a

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class autoComplete : AppCompatActivity() {

    private val languages = arrayOf("Nepali","Hindi","Urdu","English","Chinese","Nigeria")
    private lateinit var autoComplete: AutoCompleteTextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_complete)

        autoComplete=findViewById(R.id.autoComplete)

        val autcompleteAdapter= ArrayAdapter(this,
            android.R.layout.simple_dropdown_item_1line,
            languages
        )
        autoComplete.setAdapter(autcompleteAdapter)
        autoComplete.threshold=1

    }
}