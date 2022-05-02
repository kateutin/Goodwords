package com.example.goodwords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class SentenceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)
        val sentenceList = mutableListOf<String>()//문자열 리스트를 만든다

        sentenceList.add("떡볶이")
        sentenceList.add("빵")
        sentenceList.add("샤브샤브")
        sentenceList.add("육회")
        sentenceList.add("밀키스")
        sentenceList.add("웰치스")
        sentenceList.add("라면")
        sentenceList.add("치킨")
        sentenceList.add("탄산수")
        sentenceList.add("아아")

        //여기서부터는 연결
        val sentenceAdapter = ListViewAdpater(sentenceList)//어댑터는 리스트 뷰 어뎁터다
        val listview = findViewById<ListView>(R.id.sentenceListView)

        listview.adapter = sentenceAdapter//listview adpater에 adpater 연결

    }
}