package com.example.task_kakao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.task_kakao.databinding.ActivityBottomBinding

class Bottom_Activity : AppCompatActivity() {

    // 바인딩 객체 선언
    private lateinit var binding: ActivityBottomBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 바인딩 객체 초기화
        binding = ActivityBottomBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //버튼에 클릭 리스너설정
        binding.run {
            searchButton.setOnClickListener {
                setFragment(Search_Fragment())
            }
            myboxButton.setOnClickListener {
                setFragment(Mybox_Fragment())
            }

        }

        setFragment(Search_Fragment())

    }

    //viewpager_home
    private fun setFragment(frag: Fragment) {
        supportFragmentManager.commit {
            replace(R.id.viewpager_home, frag)
            setReorderingAllowed(true)
            addToBackStack(null)
        }
    }

}