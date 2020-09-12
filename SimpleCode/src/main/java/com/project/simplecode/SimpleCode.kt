package com.project.simplecode

import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

fun AppCompatActivity.simIntent(activity: Class<*>) {
    val intent = Intent(this, activity)
    intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
    startActivity(intent)
    finish()
}

fun AppCompatActivity.simIntentNoFinish(activity: Class<*>) {
    val intent = Intent(this, activity)
    intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
    startActivity(intent)
}

fun AppCompatActivity.simToastShort(text: String) {
    Toast.makeText(applicationContext, text, android.widget.Toast.LENGTH_SHORT).show()
}

fun AppCompatActivity.simToastLong(text: String) {
    Toast.makeText(applicationContext, text, android.widget.Toast.LENGTH_LONG).show()
}

fun AppCompatActivity.simDateFormatNow(format : String) : String {
    var now : Long = System.currentTimeMillis()
    var date : Date = Date(now)
    var dateFormat : SimpleDateFormat = SimpleDateFormat(format)
    var getTime : String = dateFormat.format(date)

    return getTime
}


