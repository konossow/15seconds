package com.behealthy.hackathon.fifteenseconds

import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //TextView tv = findViewById<TextView>(R.id.textView)
        textView.text = "Hello in 15 seconds!" 
    }
}
