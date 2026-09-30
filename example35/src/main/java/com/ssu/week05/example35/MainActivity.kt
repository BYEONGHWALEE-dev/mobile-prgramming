package com.ssu.week05.example35

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private val imageIds = intArrayOf(
        R.drawable.cat1,
        R.drawable.cat2,
        R.drawable.cat3,
        R.drawable.cat4,
        R.drawable.cat5
    )
    private val imageNames = arrayOf(
        "cat1.png",
        "cat2.png",
        "cat3.png",
        "cat4.png",
        "cat5.png"
    )
    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.imageView_id)
        showImage()
    }

    fun onButtonClick(view: View?) {
        currentIndex = (currentIndex + 1) % imageIds.size
        showImage()
    }

    private fun showImage() {
        imageView.setImageResource(imageIds[currentIndex])
        supportActionBar?.title = imageNames[currentIndex]
    }
}
