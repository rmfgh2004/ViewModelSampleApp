package com.example.viewmodelsampleapp.activity

import android.graphics.drawable.Drawable
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter


object BindingAdapter {
    @BindingAdapter("setCountText")
    @JvmStatic
    fun setCountText(view: TextView, count: Int) {
        view.text = "Count : $count"
    }

    @BindingAdapter("app:firstNumber", "app:secondNumber", requireAll = true)
    @JvmStatic
    fun plusText(view: TextView, firstNumber: Int, secondNumber: Int) {
        view.text = "$firstNumber + $secondNumber = ${firstNumber + secondNumber}"
    }
}