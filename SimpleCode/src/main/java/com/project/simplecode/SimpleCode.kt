package com.project.simplecode

import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import java.lang.NumberFormatException
import java.text.SimpleDateFormat
import java.util.*

//sp = SimpleCode 줄임말
//a = Activity, f = Fragment
//그냥 함수는 따로 X

//Activity
fun AppCompatActivity.spaIntent(activity: Class<*>) {
    startActivity(Intent(this, activity).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
    finish()
}

fun AppCompatActivity.spaIntentNoFin(activity: Class<*>) {
    startActivity(Intent(this, activity).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
}

fun AppCompatActivity.spaToastShort(text: String) {
    Toast.makeText(applicationContext, text, android.widget.Toast.LENGTH_SHORT).show()
}

fun AppCompatActivity.spaToastLong(text: String) {
    Toast.makeText(applicationContext, text, android.widget.Toast.LENGTH_LONG).show()
}


//Fragment
fun Fragment.spfIntent(moveActivity: Class<*>) {
    startActivity(Intent(context!!.applicationContext, moveActivity).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
    activity!!.finish()
}

fun Fragment.spfIntentNoFin(moveActivity: Class<*>) {
    startActivity(Intent(context!!.applicationContext, moveActivity).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
}

fun Fragment.spfToastShort(message: String?) {
    Toast.makeText(context!!.applicationContext, message, Toast.LENGTH_SHORT).show()
}

fun Fragment.spfToastLong(message: String?) {
    Toast.makeText(context!!.applicationContext, message, Toast.LENGTH_LONG).show()
}


//Function
fun spDateForma(format : String, num : Int) : String {
    var cal : Calendar = GregorianCalendar()
    cal.add(Calendar.DATE, num)

    var date : Date = cal.time
    var dateFormat : SimpleDateFormat = SimpleDateFormat(format)
    var getTime : String = dateFormat.format(date)

    return getTime
}

fun spStringDigit(text : String) : Boolean {
    try{
        var i : Int = text.toInt()
    }catch (e : NumberFormatException){
        return false
    }
    return true
}

fun spStringConcat(vararg text:String) : String{
    var result : String = ""
    for(s in text){
        result += s
    }
    return result
}


