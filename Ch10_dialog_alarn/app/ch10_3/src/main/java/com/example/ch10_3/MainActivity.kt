package com.example.ch10_3

import android.app.ProgressDialog.show
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
            val items = arrayOf<String>("사과", "불닭볶음면", "쌀국수", "육회비빔밥", "라멘")
            AlertDialog.Builder(this).run {
                setTitle("item list")
                setIcon(android.R.drawable.ic_dialog_info)
                setSingleChoiceItems(items, 1, object: DialogInterface.OnClickListener {
                    override fun onClick(p0: DialogInterface?, p1: Int) {
                        Log.d("다이얼로그 싱글 초이스", "${items[p1]}이 선택되었습니다.")
                    }
                })
                setPositiveButton("닫기", null)
                setCancelable(false)
                show()
            }.setCanceledOnTouchOutside(false)
        }
    }
}