package com.example.myfirstkotlinapp

import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.view.View

class MainActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enables Always-on
        setAmbientEnabled()

        /** Called when the user taps the Send button */
        fun sendMessage(view: View) {
            // Do something in response to button
        }
    }
}
