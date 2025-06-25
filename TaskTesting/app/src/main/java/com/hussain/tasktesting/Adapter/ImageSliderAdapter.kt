package com.hussain.tasktesting.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.hussain.tasktesting.R

class ImageSliderAdapter(private val images: List<Any>) : RecyclerView.Adapter<ImageSliderAdapter.SliderViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SliderViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_slide, parent, false)
        return SliderViewHolder(view)
    }

    override fun onBindViewHolder(holder: SliderViewHolder, position: Int) {
        val image = images[position % images.size]

        when (image) {
            is Int -> Glide.with(holder.itemView)
                .load(image)
                .into(holder.imageView)
            is String -> Glide.with(holder.itemView)
                .load(image)
                .into(holder.imageView)
        }
    }

    override fun getItemCount(): Int = Int.MAX_VALUE // Infinite scrolling

    class SliderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.slideImage)
    }
}