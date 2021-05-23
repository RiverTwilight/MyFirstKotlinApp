package com.example.myfirstkotlinapp

import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlin.random.Random

const val EXTRA_MESSAGE = "com.example.MyFirstKotlinApp.MESSAGE"

fun rand(start: Int, end: Int): Int {
    require(!(start > end || end - start + 1 > Int.MAX_VALUE)) { "Illegal Argument" }
    return Random(System.nanoTime()).nextInt(end - start + 1) + start
}

class MainActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enables Always-on
        setAmbientEnabled()
    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        val maxValue = findViewById<EditText>(R.id.maxValue).text.toString().toInt();
        val minValue = findViewById<EditText>(R.id.minValue).text.toString().toInt()

        var btn = findViewById<Button>(R.id.start).apply {
            text = rand(minValue, maxValue).toString()
        }
    }
}
