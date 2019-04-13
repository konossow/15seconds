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
        fromEditText.setText(SettingsSingleton.dayAvailableFrom.toString())
        toEditText.setText(SettingsSingleton.dayAvailableTo.toString())
        exerciseSpinner!!.onItemSelectedListener = exerciseSpinnerFactory.getListener()
        exerciseSpinner!!.adapter = exerciseSpinnerFactory.getOptionsArrayAdapter()
        exerciseSpinner!!.setSelection(exerciseSpinnerFactory.getSelectionIndex())
    }

    fun saveButtonClick(view: View){
        SettingsSingleton.dayAvailableFrom = fromEditText.text.toString().toInt()
        SettingsSingleton.dayAvailableTo = toEditText.text.toString().toInt()
        SettingsSingleton.setExerciseDuration(exerciseSpinnerFactory.getExercise())
        finish()
    }
    fun goBack(view: View)
    {
        finish()
    }
}
