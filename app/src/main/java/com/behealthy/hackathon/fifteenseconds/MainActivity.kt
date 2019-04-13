package com.behealthy.hackathon.fifteenseconds

import android.app.DatePickerDialog
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.view.*
import java.util.*
import javax.xml.datatype.DatatypeConstants.MONTHS

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

    fun showDatePicker(view: View){
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

//val dpdas = DatePickerDialog()
        val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
            Toast.makeText(this,"" + dayOfMonth + " " + monthOfYear + ", " + year, Toast.LENGTH_LONG ).show()
            // Display Selected date in textbox
            //lblDate.setText("" + dayOfMonth + " " + MONTHS[monthOfYear] + ", " + year)
        }, year, month, day)

        dpd.show()
    }
}
