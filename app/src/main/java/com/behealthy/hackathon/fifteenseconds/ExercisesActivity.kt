package com.behealthy.hackathon.fifteenseconds

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View



class ExercisesActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercises)
    }

    fun goBack(view:View)
    {
        finish()
    }

    fun goToJJacks(view: View){
        val intent = Intent(this,ExerciseJJacksActivity::class.java)
        startActivity(intent)
    }

    fun goToJRope(view: View){
        val intent = Intent(this,ExerciseJRopeActivity::class.java)
        startActivity(intent)
    }

    fun goToPlank(view: View){
        val intent = Intent(this,ExercisePlankActivity::class.java)
        startActivity(intent)
    }

    fun goToPushup(view: View){
        val intent = Intent(this,ExercisePushupActivity::class.java)
        startActivity(intent)
    }

    fun goToSitup(view: View){
        val intent = Intent(this,ExerciseSitupActivity::class.java)
        startActivity(intent)
    }

    fun goToSquats(view: View){
        val intent = Intent(this,ExerciseSquatsActivity::class.java)
        startActivity(intent)
    }

    fun goToSuperman(view: View){
        val intent = Intent(this,ExerciseSupermanActivity::class.java)
        startActivity(intent)
    }
}
