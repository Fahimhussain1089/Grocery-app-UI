package com.hussain.tasktesting.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hussain.tasktesting.R

import android.os.Handler
import android.os.Looper

import androidx.viewpager2.widget.ViewPager2
import com.hussain.tasktesting.Adapter.ImageSliderAdapter
import com.hussain.tasktesting.Adapter.SliderAdapter


import com.smarteist.autoimageslider.SliderView

class HomeFragment : Fragment() {

    private lateinit var sliderView: SliderView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        sliderView = view.findViewById(R.id.imageSlider)

        val imageList = listOf(
            R.drawable.sliderimageone,
            R.drawable.imageslidertwo,
            R.drawable.imagesliderthree,
            R.drawable.imagesliderfour
        )


        val sliderAdapter = SliderAdapter(requireContext(), imageList)
        sliderView.setSliderAdapter(sliderAdapter)
        sliderView.startAutoCycle()

        return view
    }
}
