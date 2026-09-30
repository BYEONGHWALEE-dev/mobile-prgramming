package com.ssu.week05.example33

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onButtonClick(view: View?) {
        val num1 = findViewById<TextView>(R.id.textViewNum1).text.toString().toInt()
        val num2 = findViewById<TextView>(R.id.textViewNum2).text.toString().toInt()
        Toast.makeText(applicationContext, "합계: ${num1 + num2}", Toast.LENGTH_SHORT).show()
    }
}
