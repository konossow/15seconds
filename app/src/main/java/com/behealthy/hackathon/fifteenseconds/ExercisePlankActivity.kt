package com.behealthy.hackathon.fifteenseconds

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ExercisePlankActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_plank)
    }

    fun goBack(view: View)
    {
        finish()
    }
}
