package com.example.task_kakao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.task_kakao.databinding.ActivityBottomBinding

class Bottom_Activity : AppCompatActivity() {
    // 바인딩 객체 선언
    private lateinit var binding: ActivityBottomBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 바인딩 객체 초기화
        binding = ActivityBottomBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}