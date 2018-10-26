package com.example.wk

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v7.widget.LinearLayoutManager
import com.example.wk.adapters.NumsAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().post {
            initRecyclerView()
        }
    }

    fun initRecyclerView() {
        rv_view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val adapter = NumsAdapter(getData())
        rv_view.adapter = adapter

    }

    private fun getData(): MutableList<String> {
        val list = mutableListOf<String>()
        for (i in 0..30) {
            list.add("$i")
        }
        return list
    }
}
