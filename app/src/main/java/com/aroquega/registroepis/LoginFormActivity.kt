package com.aroquega.registroepis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LoginFormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_form)


    }

    fun login() {
        val intent = Intent(this, AppActivity::class.java)
        startActivity(intent)
    }
}