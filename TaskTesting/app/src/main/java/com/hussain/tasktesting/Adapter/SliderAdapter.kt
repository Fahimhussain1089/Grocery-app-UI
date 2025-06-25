package com.hussain.tasktesting.Adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

import com.hussain.tasktesting.R
import com.smarteist.autoimageslider.SliderViewAdapter
class SliderAdapter(
    private val context: Context,
    private val imageList: List<Int> // Drawable resource IDs
) : SliderViewAdapter<SliderAdapter.SliderViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup): SliderViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.slider_item, parent, false)
        return SliderViewHolder(view)
    }

    override fun onBindViewHolder(holder: SliderViewHolder, position: Int) {
        Glide.with(context)
            .load(imageList[position]) // Now loading drawable resource
            .placeholder(R.drawable.sliderimageone)
            .error(R.drawable.imageslidertwo)
            .into(holder.imageView)
    }

    override fun getCount(): Int = imageList.size

    class SliderViewHolder(itemView: View) : ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.iv_auto_image_slider)
    }
}
