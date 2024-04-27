package com.example.a34a

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import java.util.Calendar

class FormActivity : AppCompatActivity() {
    private lateinit var radioGroup: RadioGroup
    private lateinit var radiofemale: RadioButton
    private lateinit var radiomale: RadioButton
    private lateinit var radioother: RadioButton
    private lateinit var country: Spinner
    private lateinit var loadCalendarButton: Button
    private lateinit var dateOfBirth: TextView
    private lateinit var professionAutoComplete: AutoCompleteTextView
    private lateinit var submitButton: Button
    private val professions = arrayOf("Student", "Banker", "Teacher", "Politician", "Corporate Officer", "Business Person")
    private val nationalities = arrayOf(
        "Nepal", "China", "Pakistan", "India", "Bhutan", "Sri Lanka", "Maldives", "Indonesia", "Afghanistan", "Australia",
        "Myanmar", "Thailand", "England", "Italy", "Russia", "Iran", "Iraq", "Sudan", "Japan", "South Korea", "Switzerland", "New Zealand"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        // View Binding
        radioGroup = findViewById(R.id.radioGroup)
        radiofemale = findViewById(R.id.radiofemale)
        radiomale = findViewById(R.id.radiomale)
        radioother = findViewById(R.id.radioother)
        country = findViewById(R.id.country)
        submitButton = findViewById(R.id.Submit)
        professionAutoComplete = findViewById(R.id.profession)
        loadCalendarButton = findViewById(R.id.loadCalendar)
        dateOfBirth = findViewById(R.id.dateofbirth)

        // AutoCompleteTextView Adapter
        val autoCompleteAdapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, professions)
        professionAutoComplete.setAdapter(autoCompleteAdapter)
        professionAutoComplete.threshold = 1

        // Nationality Spinner Adapter
        val nationalityAdapter = ArrayAdapter(this@FormActivity, android.R.layout.simple_spinner_item, nationalities)
        nationalityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        country.adapter = nationalityAdapter

        // Radio Button Gender
        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.radiofemale -> {
                    radiomale.isChecked = false
                    radioother.isChecked = false
                }
                R.id.radiomale -> {
                    radiofemale.isChecked = false
                    radioother.isChecked = false
                }
                R.id.radioother -> {
                    radiofemale.isChecked = false
                    radiomale.isChecked = false
                }
            }
        }

        // Submit Button Click Listener
        submitButton.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this@FormActivity)
            alertDialog.setTitle("Confirm")
                .setMessage("Are you sure?")
                .setCancelable(false)
                .setNegativeButton("No") { _, _ -> }
                .setPositiveButton("Yes") { _, _ ->
                    Toast.makeText(this@FormActivity, "Submitted", Toast.LENGTH_SHORT).show()
                    Toast.makeText(this@FormActivity, "Logged in", Toast.LENGTH_SHORT).show()
                }
            alertDialog.create().show()
        }

        // Load Calendar Button Click Listener
        loadCalendarButton.setOnClickListener {
            loadCalendar()
        }
    }

    // Date-of-Birth
    private fun loadCalendar() {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { _, year, monthOfYear, dayOfMonth ->
                dateOfBirth.text = "$year/${monthOfYear + 1}/$dayOfMonth"
            },
            year,
            month,
            day
        )
        datePickerDialog.show()
    }
}