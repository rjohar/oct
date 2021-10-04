package com.example.oct

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    lateinit var button:Button
    lateinit var msgText:EditText
    var chatApp:ChatApp= ChatApp()
    lateinit  var recyclerView:RecyclerView
    lateinit var msgAdapter:MsgAdapter
    var listOfMsgs = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        button= findViewById(R.id.button)
        msgText= findViewById(R.id.editText)

        recyclerView= findViewById(R.id.listOfMsgs_rcy)

        msgAdapter= MsgAdapter(listOfMsgs)
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.adapter=msgAdapter
        button.setOnClickListener(object:View.OnClickListener{
            override fun onClick(v: View?) {
               // chatApp.send();
                listOfMsgs.add(msgText.text.toString())
                msgAdapter.notifyDataSetChanged();
                Toast.makeText(this@MainActivity,chatApp.getResponseOfChatSend(),Toast.LENGTH_LONG).show();
            }
        })

    }
}