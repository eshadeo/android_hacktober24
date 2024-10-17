package com.example.eshasgallerygrid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(private val images: List<Int>, private val onItemClick: (Int) -> Unit) :
    RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_image, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bind(images[position], onItemClick)
    }

    override fun getItemCount(): Int = images.size

    // ViewHolder class defined within ImageAdapter
    class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.imageView)

        fun bind(imageRes: Int, onItemClick: (Int) -> Unit) {
            imageView.setImageResource(imageRes)
            itemView.setOnClickListener {
                onItemClick(imageRes)
            }
        }
    }
}
