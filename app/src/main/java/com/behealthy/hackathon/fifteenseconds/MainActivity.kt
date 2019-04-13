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
        excersisesButtonName.text = getString(R.string.excersisesButtonName)
        calendaryButtonName.text = getString(R.string.calendaryButtonName)
        showoffButtonName.text = getString(R.string.showoffButtonName)
        settingsButtonName.text = getString(R.string.settingsButtonName)


    }

    fun goToSettings(view: View){
        val settingsIntent = Intent(this, SettingsActivity::class.java)
        startActivity(settingsIntent)
    }
}
