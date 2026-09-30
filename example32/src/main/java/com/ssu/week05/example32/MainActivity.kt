package com.ssu.week05.example32

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView_id)
        textView.setText("Hello World!")
        textView.setTextColor(Color.parseColor("#03A9F4"))
        textView.setTypeface(Typeface.SERIF)
        textView.setTextSize(50f)
    }
}
