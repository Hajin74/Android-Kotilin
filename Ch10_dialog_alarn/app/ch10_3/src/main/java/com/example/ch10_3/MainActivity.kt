package com.example.ch10_3

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.example.ch10_3.databinding.ActivityMainBinding

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
            AlertDialog.Builder(this).run {
                setTitle("test dialog")
                setIcon(android.R.drawable.ic_dialog_info)
                setMessage("정말 종료하시겠습니까?")
                setPositiveButton("Ok", eventHandler)
                setNegativeButton("Cancel", eventHandler)
                show()
            }
        }
    }
}