package com.project.simplecode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

    fun AppCompatActivity.intentActivity(activity: Class<*>) {
        val intent = Intent(this, activity)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intent)
        finish()
    }

    fun AppCompatActivity.noFinishIntentActivity(activity: Class<*>) {
        val intent = Intent(this, activity)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intent)
    }

    fun AppCompatActivity.shortToast(text : String) {
        android.widget.Toast.makeText(applicationContext, text, android.widget.Toast.LENGTH_SHORT).show()
    }

    fun AppCompatActivity.longToast(text : String) {
        android.widget.Toast.makeText(applicationContext, text, android.widget.Toast.LENGTH_LONG).show()
    }
