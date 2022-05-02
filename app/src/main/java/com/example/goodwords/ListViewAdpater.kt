package com.example.goodwords

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdpater(val List : MutableList<String>) : BaseAdapter() {
    override fun getCount(): Int {
      return List.size
    }//전체 리스트의 크기를 카운트

    override fun getItem(position: Int): Any {
       return List[position]
    }//각각 해당 하는 아이템

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, converView: View?, parnet: ViewGroup?): View {

        var converView = converView
        if(converView == null){
            converView = LayoutInflater.from(parnet?.context).inflate(R.layout.listview_item,parnet,false)
        }

        val listviewText = converView?.findViewById<TextView>(R.id.listViewTextArea)
        listviewText!!.text = List[position]

        return converView!!
    }

}