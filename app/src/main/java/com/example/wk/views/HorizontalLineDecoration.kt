package com.example.wk.views

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.text.TextPaint
import android.util.Log
import android.view.View

class HorizontalLineDecoration(val color: Int): RecyclerView.ItemDecoration() {
    private val paint  = TextPaint(Paint.ANTI_ALIAS_FLAG)

    override fun onDraw(c: Canvas?, parent: RecyclerView?, state: RecyclerView.State?) {
        if (c != null && parent != null) {
            paint.color = color
            paint.textSize = 30f
            val childCount = parent.childCount
            val childAt = parent.getChildAt(1)
            val top = childAt!!.top - 30
            val bottom = childAt!!.top
            val s = "Hello world"
            c.drawText(s, childAt.x / 2, bottom.toFloat(),  paint)
        }
    }



    override fun getItemOffsets(outRect: Rect?, view: View?, parent: RecyclerView?, state: RecyclerView.State?) {
        if (view != null) {
            val viewParent = view.parent
            Log.d("way", viewParent.toString())
        }
        outRect?.top = 30

    }

}