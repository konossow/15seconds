package com.behealthy.hackathon.fifteenseconds

import java.util.*
import java.util.regex.Pattern
import kotlin.collections.ArrayList

object SettingsSingleton {
    private var dayAvailableFrom: Int? = null
    private var dayAvailableTo: Int? = null
    private var succededDates: ArrayList<Date> = arrayOf(Date(119,3,10), Date(119,3,11),Date()).toCollection(ArrayList())
    private var exerciseDuration: Int = 15

    fun getAvailableFrom():String{
        if(dayAvailableFrom == null){
            return ""
        }
        return this.dayAvailableFrom!!.toString()
    }

    fun getAvailableTo():String{
        if(dayAvailableTo == null){
            return ""
        }
        return this.dayAvailableTo!!.toString()
    }

    fun setAvailableFrom(from:String?){
        if(from == ""){
            this.dayAvailableFrom = null
            return
        }
        this.dayAvailableFrom = from!!.toInt()
    }

    fun setAvailableTo(from:String?){
        if(from == ""){
            this.dayAvailableTo = null
            return
        }
        this.dayAvailableTo = from!!.toInt()
    }

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