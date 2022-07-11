package com.example.ch8_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import com.example.ch8_2.databinding.ActivityMainBinding

class MyEventHandler: CompoundButton.OnCheckedChangeListener {
    override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
        Log.d("이벤트: ", "체크박스 클릭!!!")
    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.checkBox.setOnCheckedChangeListener(object: CompoundButton.OnCheckedChangeListener {
//            override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
//                Log.d("이벤트: ", "체크박스 클릭")
//            }
//        })

        binding.checkBox.setOnCheckedChangeListener(MyEventHandler())
    }
}