package com.behealthy.hackathon.fifteenseconds

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ExerciseSupermanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_superman)
    }

    fun goBack(view: View)
    {
        finish()
    }
}
