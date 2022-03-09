package com.alecbrando.intentinclasswork.util

import android.app.Activity
import android.util.Log
import androidx.viewbinding.BuildConfig
import com.alecbrando.intentinclasswork.MainActivity

fun Activity.logger(message: String) {
    if (BuildConfig.DEBUG) Log.d(this::class.java.simpleName, message)
}