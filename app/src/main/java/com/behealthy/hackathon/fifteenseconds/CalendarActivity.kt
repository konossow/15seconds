package com.behealthy.hackathon.fifteenseconds

import android.app.Activity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import com.squareup.timessquare.CalendarPickerView
import java.util.*

class CalendarActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)
        val calendar_view = findViewById<CalendarPickerView>(R.id.calendar_view)
        calendar_view.init(Date(119,0,1), Date(1119,11,30))
            .inMode(CalendarPickerView.SelectionMode.MULTIPLE)
        SettingsSingleton.getSuccededDates().forEach {
            calendar_view.selectDate(it)
        }
    }
    fun goBack(view: View)
    {
        finish()
    }
}
