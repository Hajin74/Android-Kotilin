package com.example.intenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intenttest.databinding.ActivitySubBinding
import com.example.intenttest.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(intent.hasExtra("message")) {
            binding.tvThird.text = intent.getStringExtra("message")
        }
    }
}