package com.example.ch8_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import com.example.ch8_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener { 
            Log.d("클릭 이벤트: ","발생")
        }
        
        binding.button.setOnLongClickListener { 
            Log.d("롱클릭 이벤트: ", "발생")
            true
        }
    }
}