package com.example.wk

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.wk.viewmodels.LoginViewModeFactory
import com.example.wk.viewmodels.LoginViewModel

class MainActivity : AppCompatActivity() {
    val loginViewModel by lazy {
        ViewModelProviders.of(this, LoginViewModeFactory("aa")).get(LoginViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//        Handler().post {
//            initRecyclerView()
//        }
//
//        AsyncTask.execute {
//
//        }


    }
//
//    fun initRecyclerView() {
//        rv_view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//        val adapter = NumsAdapter(getData())
//        rv_view.addItemDecoration(HorizontalLineDecoration(Color.RED))
//        rv_view.addItemDecoration(HorizontalLineDecoration(Color.BLUE), 1)
//        rv_view.adapter = adapter
//
//    }
//
//    private fun getData(): MutableList<String> {
//        val list = mutableListOf<String>()
//        for (i in 0..30) {
//            list.add("$i")
//        }
//        return list
//    }
}
