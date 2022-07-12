package com.example.ch10_3

import android.app.ProgressDialog.show
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.example.ch10_3.databinding.ActivityMainBinding
import com.example.ch10_3.databinding.DialogInputBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    val eventHandler = object: DialogInterface.OnClickListener {
        override fun onClick(p0: DialogInterface?, p1: Int) {
            if (p1 == DialogInterface.BUTTON_POSITIVE) {
                Log.d("다이얼로그 이벤트핸들러", "파시티브 버튼 클릭")
            } else if (p1 == DialogInterface.BUTTON_NEGATIVE) {
                Log.d("다이얼로그 이벤트 핸들러", "네가티브 버튼 클릭")
            }
        }

    }

    fun onClick(view: View) {
        if(view.id == R.id.button) {
            val dialogBinding = DialogInputBinding.inflate(layoutInflater)
            AlertDialog.Builder(this).run {
                setTitle("Input")
                setView(dialogBinding.root)
                setPositiveButton("닫기", null)
                show()
            }

        }
    }
}