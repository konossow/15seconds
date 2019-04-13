package com.behealthy.hackathon.fifteenseconds

import android.app.Activity
import android.os.Bundle

class SettingsActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        var list_of_items = arrayOf("15 seconds", "30 seconds", "45 second", "60 seconds")

        /*override fun onCreate(savedInstanceState: Bundle?) {
            spinner!!.setOnItemSelectedListener(this)

            // Create an ArrayAdapter using a simple spinner layout and languages array
            val aa = ArrayAdapter(this, android.R.layout.simple_spinner_item, list_of_items)
            // Set layout to use when the list of choices appear
            aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Set Adapter to Spinner
            spinner!!.setAdapter(aa)
        }

        override fun onItemSelected(arg0: AdapterView<*>, arg1: View, position: Int, id: Long) {
            // use position to know the selected item
        }

        override fun onNothingSelected(arg0: AdapterView<*>) {

        }*/
    }
}
