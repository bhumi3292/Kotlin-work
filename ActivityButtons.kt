package com.example.a34a

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class ActivityButtons : AppCompatActivity() {

    lateinit var checkBoxToast: CheckBox
    lateinit var checkBoxSnack:CheckBox
    lateinit var checkBoxAlert:CheckBox
    lateinit var buttonClick: Button
    lateinit var main:ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buttons)

        checkBoxAlert = findViewById(R.id.AlertDialog)
        checkBoxSnack = findViewById(R.id.Snackbar)
        checkBoxToast = findViewById(R.id.ToastMessage)
        buttonClick = findViewById(R.id.Clickme)
        main = findViewById(R.id.loadcalendar)

        buttonClick.setOnClickListener {
            if (checkBoxToast.isChecked){
                Toast.makeText(applicationContext,
                    "This is a toast message",
                    Toast.LENGTH_SHORT).show()

            }else if (checkBoxSnack.isChecked){
                Snackbar.make(main, "This is snack bar", Snackbar.LENGTH_LONG)
                    .setAction("Close", View.OnClickListener {  }).show()

            }else {
                checkBoxAlert.isChecked
                val alertDialog = AlertDialog.Builder(this@ActivityButtons)
                alertDialog.setTitle("Confirm")
                    .setMessage("Are you sure?")
                    .setCancelable(false)
                    .setNegativeButton("No", {dialogInterface, i-> })
                    .setPositiveButton("Yes",{dialogInterface, i->})
                alertDialog.create().show()
            }
        }

    }
}