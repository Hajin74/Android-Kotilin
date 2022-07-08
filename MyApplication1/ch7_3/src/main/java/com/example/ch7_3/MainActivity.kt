package com.example.ch7_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ch7_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            binding.btn.visibility = View.INVISIBLE
            binding.iv.visibility = View.VISIBLE
        }

        binding.iv.setOnClickListener {
            binding.btn.visibility = View.VISIBLE
            binding.iv.visibility = View.INVISIBLE
        }
    }
}