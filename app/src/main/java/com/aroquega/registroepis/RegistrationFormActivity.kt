package com.aroquega.registroepis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrationFormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_form)

        val signupButton = findViewById<Button>(R.id.signup_button)
        signupButton.setOnClickListener {
            signup()
        }
    }

    fun signup() {
        val intent = Intent(this, AppActivity::class.java)
        startActivity(intent)
    }
}