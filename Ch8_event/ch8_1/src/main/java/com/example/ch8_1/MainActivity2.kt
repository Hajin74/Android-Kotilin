package com.example.ch8_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
       when (keyCode) {
           KeyEvent.KEYCODE_0 -> Log.d("keyEvent", "0키를 눌렀네요")
           KeyEvent.KEYCODE_A -> Log.d("keyEvent", "A키를 눌렀네요")
           KeyEvent.KEYCODE_BACK -> Log.d("keyEvent", "백 버튼 를 눌렀네요")
       }
        return super.onKeyDown(keyCode, event)
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        Log.d("key event", "onKeyUp")
        return super.onKeyUp(keyCode, event)
    }
}