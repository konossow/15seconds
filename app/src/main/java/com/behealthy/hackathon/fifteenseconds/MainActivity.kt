package com.behealthy.hackathon.fifteenseconds

import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //TextView tv = findViewById<TextView>(R.id.textView)
        textView.text = getString(R.string.welcome_messege_0)
    }

    fun goToExercises(view: View){
        val exercisesIntent = Intent(this, ExercisesActivity::class.java)
        startActivity(exercisesIntent)
    }

    fun goToCalendar(view: View){
        val calendarIntent = Intent(this, CalendarActivity::class.java)
        startActivity(calendarIntent)
    }

    fun goToShowoff(view: View){
        val showoffIntent = Intent(this, ShowoffActivity::class.java)
        startActivity(showoffIntent)
    }

    fun goToSettings(view: View){
        val settingsIntent = Intent(this, SettingsActivity::class.java)
        startActivity(settingsIntent)
    }
}
