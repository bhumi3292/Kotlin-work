package com.example.a34a

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.a34a.databinding.ActivityLoginBinding
import android.content.Intent
import com.example.a34a.Dashboard

class Login : AppCompatActivity() {

    lateinit var loginBinding: ActivityLoginBinding
    lateinit var sharedPreferences: SharedPreferences

    var email: String? = null
    var password: String? = null
    var rememberMe: Boolean? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)

        sharedPreferences = getSharedPreferences("UserData", MODE_PRIVATE)

        loginBinding.Register.setOnClickListener {
            email = loginBinding.Email.text.toString()
            password = loginBinding.Password.text.toString()
            rememberMe = loginBinding.checkBox.isChecked

            val editor = sharedPreferences.edit()
            editor.putString("Email", email)
            editor.putString("Password", password)
            editor.putBoolean("Remember", rememberMe!!)
            editor.apply()

            Toast.makeText(applicationContext, "Data Saved", Toast.LENGTH_LONG).show()
        }

        //----------Login Button--------------------------------------------

        loginBinding.Login.setOnClickListener {
            val storedEmail = sharedPreferences.getString("Email", "")
            val storedPassword = sharedPreferences.getString("Password", "")

            val enteredEmail = loginBinding.Email.text.toString()
            val enteredPassword = loginBinding.Password.text.toString()

            if (enteredEmail == storedEmail && enteredPassword == storedPassword) {
                // Login successful
                Toast.makeText(applicationContext, "Login Successful", Toast.LENGTH_SHORT).show()
                val intent = Intent(this,Dashboard::class.java)
                startActivity(intent)
            } else {
                // Login failed
                Toast.makeText(applicationContext, "Invalid Email or Password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}