package com.example.intenttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intenttest.databinding.ActivityMainBinding
import com.example.intenttest.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySubBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(intent.hasExtra("msg")) {
            binding.tvGetMsg.text = intent.getStringExtra("msg")
        }

        binding.btnB.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("message", binding.tvGetMsg.text.toString())
            startActivity(intent)
        }
    }
}