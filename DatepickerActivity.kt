package com.example.a34a

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Calendar
import kotlin.math.min

class DatepickerActivity : AppCompatActivity() {
    lateinit var loadCalendar:Button
    lateinit var textview:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datepicker)

        loadCalendar=findViewById(R.id.loadCalendar)
        textview=findViewById(R.id.textView3)

        loadCalendar.setOnClickListener {
            loadCalendar()
        }

    }
    private fun loadCalendar(){
        val c= Calendar.getInstance()
        val year =c.get(Calendar.YEAR)
        val month=c.get(Calendar.MONTH)
        val day=c.get(Calendar.DAY_OF_MONTH)


        val datePickerDialog=DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { view, year,monthOfYear, dayOfMonth ->
                textview.text = "Selected Date : ${year}/${monthOfYear+1}/$year"
            },
            year,
            month,
            day,

        )
        datePickerDialog.show()

    }
}