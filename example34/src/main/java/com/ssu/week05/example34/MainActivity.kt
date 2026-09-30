package com.ssu.week05.example34

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onResultClick(view: View?) {
        val name = findViewById<EditText>(R.id.editTextName).text.toString()
        val password = findViewById<EditText>(R.id.editTextPassword).text.toString()
        val email = findViewById<EditText>(R.id.editTextEmail).text.toString()
        val birth = findViewById<EditText>(R.id.editTextBirth).text.toString()
        val phone = findViewById<EditText>(R.id.editTextPhone).text.toString()

        val result = findViewById<TextView>(R.id.textViewResult)
        result.text = "성명 - $name\n비밀번호 - $password\n이메일 - $email\n생년월일 - $birth\n연락처 - $phone"
        result.setTextColor(Color.BLACK)
        result.setBackgroundColor(Color.parseColor("#C8E6C9"))
    }
}
