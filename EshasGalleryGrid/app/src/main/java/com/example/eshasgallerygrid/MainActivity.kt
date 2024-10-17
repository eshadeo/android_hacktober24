package com.example.eshasgallerygrid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val imageList = listOf(
        R.drawable.image1, R.drawable.image2, R.drawable.image3,R.drawable.image4,R.drawable.image5,
        R.drawable.image6,R.drawable.image7,R.drawable.image8,R.drawable.image9,R.drawable.image10,
        R.drawable.image11,R.drawable.image12,R.drawable.image13,R.drawable.image14,R.drawable.image15
        // Add your image resources here
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery) // Use the gallery layout directly

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        val adapter = ImageAdapter(imageList) { imageRes ->
            val intent = Intent(this, FullscreenImageActivity::class.java).apply {
                putExtra("image_res", imageRes)
            }
            startActivity(intent)
        }

        recyclerView.adapter = adapter
    }
}
