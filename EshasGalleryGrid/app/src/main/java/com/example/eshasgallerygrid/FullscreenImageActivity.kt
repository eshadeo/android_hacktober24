package com.example.eshasgallerygrid

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class FullscreenImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fullscreen_image)

        val imageView: ImageView = findViewById(R.id.fullscreenImageView)
        val imageRes = intent.getIntExtra("image_res", 0)

        if (imageRes != 0) {
            imageView.setImageResource(imageRes)
        }
    }
}

