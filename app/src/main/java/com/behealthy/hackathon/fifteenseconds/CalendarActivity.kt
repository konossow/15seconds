package com.behealthy.hackathon.fifteenseconds

import android.app.Activity
import android.os.Bundle
import com.squareup.timessquare.CalendarPickerView
import java.util.*

class CalendarActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)
        val calendar_view = findViewById<CalendarPickerView>(R.id.calendar_view)
        calendar_view.init(Date(119,0,1), Date(119,4,30))
            .inMode(CalendarPickerView.SelectionMode.MULTIPLE)
        SettingsSingleton.getSuccededDates().forEach {
            calendar_view.selectDate(it)
        }
    }
}
