package com.example.mopsy.viewbasic.views

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.LayoutInflater
import com.example.mopsy.viewbasic.R
import kotlinx.android.synthetic.main.view_custom_text.view.*

class CustomTestView @JvmOverloads
constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout(context, attrs, defStyleAttr) {
    init {
        LayoutInflater.from(context).inflate(R.layout.view_custom_text, this, true)
        custom_btn_1.text = "button1"
        custom_btn_2.text = "button2"
    }
}
