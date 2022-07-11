package com.example.ch9_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.example.ch9_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tv2.text = getString(R.string.txt_data2)
        binding.tv2.setTextColor(ResourcesCompat.getColor(resources, R.color.txt_color, null))
        binding.tv2.setBackgroundColor(ResourcesCompat.getColor(resources, R.color.txt_bg_color, null))
        binding.tv2.textSize = resources.getDimension(R.dimen.txt_size)
    }
}