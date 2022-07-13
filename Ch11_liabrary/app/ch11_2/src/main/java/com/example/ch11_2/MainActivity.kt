package com.example.ch11_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuItem1: MenuItem? = menu?.add(0, 0, 0, "menu1")
        val menuItem2: MenuItem? = menu?.add(0, 1, 0, "menu2")

        return super.onCreateOptionsMenu(menu)
    }
}