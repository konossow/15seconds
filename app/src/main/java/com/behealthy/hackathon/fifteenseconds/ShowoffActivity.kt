package com.behealthy.hackathon.fifteenseconds

import android.app.Activity
import android.os.Bundle
import android.view.View

class ShowoffActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_showoff)
    }
    fun goBack(view: View)
    {
        finish()
    }
}
