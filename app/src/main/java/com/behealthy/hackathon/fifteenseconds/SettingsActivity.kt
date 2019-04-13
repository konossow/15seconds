package com.behealthy.hackathon.fifteenseconds

import android.app.Activity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : Activity() {

    private val exerciseSpinnerFactory = ExerciseSpinnerFactory(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        fromEditText.setText(SettingsSingleton.getAvailableFrom())
        toEditText.setText(SettingsSingleton.getAvailableTo())
        exerciseSpinner!!.onItemSelectedListener = exerciseSpinnerFactory.getListener()
        exerciseSpinner!!.adapter = exerciseSpinnerFactory.getOptionsArrayAdapter()
        exerciseSpinner!!.setSelection(exerciseSpinnerFactory.getSelectionIndex())
    }

    fun saveButtonClick(view: View){
        if(fromEditText.text!=null){
            SettingsSingleton.setAvailableFrom(fromEditText.text.toString())
        }else{
            SettingsSingleton.setAvailableFrom(null)
        }
        if(toEditText.text!=null){
            SettingsSingleton.setAvailableTo(toEditText.text.toString())
        }else{
            SettingsSingleton.setAvailableTo(null)
        }

        SettingsSingleton.setExerciseDuration(exerciseSpinnerFactory.getExercise())
        finish()
    }
    fun goBack(view: View)
    {
        finish()
    }
}
