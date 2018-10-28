package com.example.wk.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.wk.R

class NumsAdapter(val list: MutableList<String>): RecyclerView.Adapter<NumsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.adapter_nums_item, p0, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.setNum(list[p1])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var tvNumLeft: TextView
        private var tvNumRight: TextView
        init {
            tvNumLeft = itemView.findViewById(R.id.tv_num_left)
            tvNumRight = itemView.findViewById(R.id.tv_num_right)
        }

        fun setNum(num: String) {
            tvNumLeft.text = num
            tvNumRight.text = num
        }
    }
}