package com.example.ch9_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ch9_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tv2.text = getString(R.string.txt_data2)
    }
}