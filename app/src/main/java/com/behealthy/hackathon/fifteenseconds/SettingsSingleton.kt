package com.behealthy.hackathon.fifteenseconds

import java.util.*
import java.util.regex.Pattern
import kotlin.collections.ArrayList

object SettingsSingleton {
    var dayAvailableFrom: Int = 17
    var dayAvailableTo: Int = 20
    private var succededDates: ArrayList<Date> = arrayOf(Date(119,3,10), Date(119,3,11),Date()).toCollection(ArrayList())
    private var exerciseDuration: Int = 15

    fun setExerciseDuration(ex_dur: String){
        val pattern = Pattern.compile("\\d+")
        var matcher = pattern.matcher(ex_dur)
        matcher.find()
        this.exerciseDuration = matcher.group().toInt()
    }

    fun getExerciseDuration(): String{
        return this.exerciseDuration.toString() + " seconds"
    }

    fun setSuccededDates(dates: ArrayList<Date>){
        this.succededDates.clear()
        dates.forEach {
            this.succededDates.add(it)
        }
    }

    fun getSuccededDates(): ArrayList<Date>{
        return this.succededDates
    }
}