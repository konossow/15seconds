package com.behealthy.hackathon.fifteenseconds

import java.util.regex.Pattern

object SettingsSingleton {
    var dayAvailableFrom: Int = 17
    var dayAvailableTo: Int = 20
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
}