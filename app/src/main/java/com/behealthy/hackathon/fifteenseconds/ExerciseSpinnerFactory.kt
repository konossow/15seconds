package com.behealthy.hackathon.fifteenseconds

import android.content.Context
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter

class ExerciseSpinnerFactory(var context: Context){
    private var options =  arrayOf("15 seconds", "30 seconds", "45 seconds", "60 seconds")
    private var listener: Listener

    init {
        this.listener = Listener(options)
    }

    class Listener(var options: Array<String>): AdapterView.OnItemSelectedListener{
        private var option: String = SettingsSingleton.getExerciseDuration()
        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            this.option = this.options[position]
        }

        override fun onNothingSelected(parent: AdapterView<*>?) {
            //do nothing
        }

        fun getOption(): String{
            return this.option
        }
    }

    fun getExercise(): String{
        return this.listener.getOption()
    }

    fun getSelectionIndex(): Int{
        return this.options.indexOf(this.listener.getOption())
    }

    fun getOptionsArrayAdapter():ArrayAdapter<String>{
        val optionsArrayAdapter = ArrayAdapter(this.context, android.R.layout.simple_spinner_item, this.options)
        optionsArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        return optionsArrayAdapter
    }

    fun getListener(): Listener {
        return this.listener
    }
}