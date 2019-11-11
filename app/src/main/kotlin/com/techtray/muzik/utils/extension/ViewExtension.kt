package com.techtray.muzik.utils.extension

import android.content.ContextWrapper
import androidx.appcompat.app.AppCompatActivity
import android.view.View

fun View.getParentActivity(): AppCompatActivity?{
    var context = this.context
    while (context is ContextWrapper) {
        if (context is AppCompatActivity) {
            return context
        }
        context = context.baseContext
    }
    return null
}