package com.behealthy.hackathon.fifteenseconds

import android.content.Context
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Vibrator
import android.transition.Visibility
import android.view.View
import kotlinx.android.synthetic.main.activity_exercise_jjacks.*
import java.util.*

class ExerciseJJacksActivity : AppCompatActivity() {
    var startWorkout:Boolean = false
    var mp :MediaPlayer? = null
    var vb :Vibrator? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_jjacks)
        this.mp = MediaPlayer.create(this, R.raw.crab_rave60s)
        this.vb = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        this.startWorkout = intent.getBooleanExtra("startWorkout", false)
        if(this.startWorkout){
            mp!!.start()
            vb!!.vibrate(SettingsSingleton.getExerciseDurationInt().toLong()*1000)
            timerTextView.visibility = View.VISIBLE
            var minutes = SettingsSingleton.getExerciseDurationInt()/60
            var seconds = SettingsSingleton.getExerciseDurationInt()%60
            timerTextView.text = "0"+minutes.toString() + " : " + seconds.toString()
            val timer = object: CountDownTimer((SettingsSingleton.getExerciseDurationInt()*1000).toLong(), 200) {
                override fun onTick(millisUntilFinished: Long) {
                    var secondsRemaining:Int = (millisUntilFinished/1000).toInt()
                    var minutes = secondsRemaining/60
                    var seconds = secondsRemaining%60
                    fun getTimerString(value: Int):String{
                        if(value/10 < 1){
                            return "0"+value.toString()
                        }
                        return value.toString()
                    }
                    timerTextView.text = getTimerString(minutes) + " : " + getTimerString(seconds)

                }

                override fun onFinish() {
                    mp!!.stop()
                    vb!!.cancel()
                    saveButton.visibility = View.VISIBLE
                }
            }
            timer.start()
        }
        else{
            saveButton.visibility = View.INVISIBLE
            timerTextView.visibility = View.INVISIBLE
        }
    }

    fun goBack(view: View)
    {
        mp!!.stop()
        vb!!.cancel()
        finish()
    }

    fun done(view: View){
        var succededDates = SettingsSingleton.getSuccededDates()
        if(succededDates.indexOf(Date()) == -1){
            succededDates.add(Date())
        }
        SettingsSingleton.setSuccededDates(succededDates)
        this.goBack(view)
    }
}
