package com.example.myfirstkotlinapp

import android.os.Bundle
import android.content.Intent
import android.support.wearable.activity.WearableActivity
import android.view.View
import android.widget.Button
import android.widget.EditText

const val EXTRA_MESSAGE = "com.example.MyFirstKotlinApp.MESSAGE"

class MainActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enables Always-on
        setAmbientEnabled()
    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        val maxValue = findViewById<EditText>(R.id.maxValue);
        var btn = findViewById<Button>(R.id.start).apply {
            text = maxValue.text.toString()
        }
    }
}
