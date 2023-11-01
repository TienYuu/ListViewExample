package com.example.listexample

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter (private val context: Activity,private val arrayList: ArrayList<User>):ArrayAdapter<User> (context,R.layout.list_item,arrayList)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val  inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.list_item,null)

        val imageView :ImageView = view.findViewById(R.id.profilePic)
        val userName : TextView = view.findViewById(R.id.name)
        val lastMsg : TextView = view.findViewById(R.id.lastMsg)
        val lastMsgTime: TextView = view.findViewById(R.id.msgTime)

        imageView.setImageResource(arrayList[position].imageId)
        userName.text = arrayList[position].name
        lastMsg.text = arrayList[position].lastMsg
        lastMsgTime.text = arrayList[position].lastMsgTime

        return view
    }

}