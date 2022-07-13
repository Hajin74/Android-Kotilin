package com.example.ch11_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId){
//        0 -> {
//            Log.d("Selected Menu ", "menu1 click")
//            true
//        }
//        1 -> {
//            Log.d("Selected Menu ", "menu2 click")
//            true
//        }
//        else -> super.onOptionsItemSelected(item)
//    }
}