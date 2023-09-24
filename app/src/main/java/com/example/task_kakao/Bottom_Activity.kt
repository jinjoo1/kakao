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

        //여기 좋아요 같은 마이박스에 추가할 기능 넣어야함.

        // 바인딩 객체 초기화
        binding = ActivityBottomBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //버튼에 클릭 리스너설정(하단에 searchButton과 myboxbutton누르면 전환되는 클릭리스너)
        binding.run {
            searchButton.setOnClickListener {
                setFragment(Search_Fragment())
            }
            myboxButton.setOnClickListener {
                setFragment(Mybox_Fragment())
            }

        }
//앱시작시 서치프래그먼트 기본으로 설정해주기
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