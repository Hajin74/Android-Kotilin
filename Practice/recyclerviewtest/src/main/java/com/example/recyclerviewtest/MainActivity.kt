package com.example.recyclerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val profileList = arrayListOf(
            Profiles(R.drawable.man, "홍드로이드", 27, "앱 개발자"),
            Profiles(R.drawable.man, "홍드로이드", 27, "앱 개발자"),
            Profiles(R.drawable.man, "홍드로이드", 27, "앱 개발자"),
            Profiles(R.drawable.man, "홍드로이드", 27, "앱 개발자"),
            Profiles(R.drawable.man, "홍드로이드", 27, "웹 개발자"),
            Profiles(R.drawable.man, "홍드로이드", 27, "앱 개발자"),
            Profiles(R.drawable.man, "홍드로이드", 27, "앱 개발자"),
            Profiles(R.drawable.man, "홍드로이드", 27, "앱 개발자"),
            Profiles(R.drawable.man, "홍드로이드", 27, "앱 개발자"),
            Profiles(R.drawable.man, "홍드로이드", 27, "앱 개발자"),
            Profiles(R.drawable.man, "홍드로이드", 27, "앱 개발자"),
            Profiles(R.drawable.man, "홍드로이드", 27, "앱 개발자"),
            Profiles(R.drawable.man, "홍드로이드", 27, "앱 개발자"),
            Profiles(R.drawable.man, "홍드로이드", 27, "앱 개발자"),
        )

        binding.rvProfile.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvProfile.setHasFixedSize(true)

        binding.rvProfile.adapter = ProfileAdapter(profileList)
    }

}