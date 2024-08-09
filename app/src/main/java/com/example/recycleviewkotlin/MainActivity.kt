package com.example.recycleviewkotlin

import android.icu.text.CaseMap.Title
import android.os.Bundle
import android.provider.ContactsContract.Data
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<DataClass>
    lateinit var titleList: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        titleList= arrayOf(
            "Book 1, Author: a",
            "Book 2, Author: b",
            "Book 3, Author: c",
            "Book 4, Author: d",
            "Book 5, Author: e",
            "Book 6, Author: f"

        )
        recyclerView=findViewById(R.id.recyclerView)
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        dataList= arrayListOf<DataClass>()
        getData()
    }
    private fun getData() {
        for (i in titleList.indices) {
            val dataClass = DataClass(titleList[i])
            dataList.add(dataClass)
        }
        recyclerView.adapter = AdapterClass(dataList)
    }
}