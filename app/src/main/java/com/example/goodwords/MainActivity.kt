package com.example.goodwords

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.goodwords.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     val sentenceList = mutableListOf<String>()//문자열 리스트를 만든다

        sentenceList.add("떡볶이")
        sentenceList.add("마라탕")
        sentenceList.add("샤브샤브")
        sentenceList.add("육회")
        sentenceList.add("밀키스")
        sentenceList.add("웰치스")
        sentenceList.add("라면")
        sentenceList.add("치킨")
        sentenceList.add("탄산수")
        sentenceList.add("아아")

        Log.e("MainActivity",sentenceList.random())
        //sentenceList 중 랜덤 값의 로그

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.showAllSentenceBtn.setOnClickListener{

            val intent = Intent(this,SentenceActivity::class.java)
            startActivity(intent)
        }
        binding.goodWordTextArea.setText(sentenceList.random())
        //binding해서 goodWordTextArea에 sentenceList의 random를 넣어준다.
    }
}