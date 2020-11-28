package com.project.simplecode

import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
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
    startActivity(
        Intent(
            context!!.applicationContext,
            moveActivity
        ).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
    )
    activity!!.finish()
}

fun Fragment.spfIntentNoFin(moveActivity: Class<*>) {
    startActivity(
        Intent(
            context!!.applicationContext,
            moveActivity
        ).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
    )
}

fun Fragment.spfToastShort(message: String?) {
    Toast.makeText(context!!.applicationContext, message, Toast.LENGTH_SHORT).show()
}

fun Fragment.spfToastLong(message: String?) {
    Toast.makeText(context!!.applicationContext, message, Toast.LENGTH_LONG).show()
}


//Function
fun spDateFormat(format: String, num: Int): String {
    var cal: Calendar = GregorianCalendar()
    cal.add(Calendar.DATE, num)

    var date: Date = cal.time
    var dateFormat: SimpleDateFormat = SimpleDateFormat(format)
    var getTime: String = dateFormat.format(date)

    return getTime
}

fun spStringDigit(text: String): Boolean {
    try {
        var i: Int = text.toInt()
    } catch (e: NumberFormatException) {
        return false
    }
    return true
}

fun spStringConcat(vararg text: String): String {
    var result: String = ""
    for (s in text) {
        result += s
    }
    return result
}

fun spRandom(start: Int, end: Int): Int {
    val r = Random()
    return r.nextInt((end + 1) - start) + start
}

fun spAverage(vararg num: Double): Double {
    var result: Double = 0.0;
    for (i in num) {
        result += i
    }

    result /= num.size

    return result
}

fun spAverage(vararg num: Int): Double {
    var result: Double = 0.0;
    for (i in num) {
        result += i
    }

    result /= num.size

    return result
}

fun spStringSimilarity(s1: String, s2: String): Double {
    val longStrLen = s1.length + 1
    val shortStrLen = s2.length + 1

    var cost = IntArray(longStrLen)
    var newcost = IntArray(longStrLen)

    for (i in 0 until longStrLen) {
        cost[i] = i
    }


    for (j in 1 until shortStrLen) {

        newcost[0] = j
        for (i in 1 until longStrLen) {

            var match = 0
            if (s1[i - 1] != s2[j - 1]) {
                match = 1
            }


            val replace = cost[i - 1] + match
            val insert = cost[i] + 1
            val delete = newcost[i - 1] + 1

            newcost[i] = Math.min(Math.min(insert, delete), replace)
        }

        val temp = cost
        cost = newcost
        newcost = temp
    }

    return (s2.length - cost[longStrLen - 1]) / s2.length.toDouble() * 100
}

fun spCheckEmpty(vararg text:String) : Boolean{
    for(i in text){
        if(i.isNullOrBlank()){
            return false
        }
    }
    return true
}

fun spUnixTimeToDateTime(time : Long, format: String, timeZone : String) : String{
    val date : Date = Date(time)
    val sdf : SimpleDateFormat = SimpleDateFormat(format)
    sdf.timeZone = TimeZone.getTimeZone("GMT+9")
    return sdf.format(date)
}



