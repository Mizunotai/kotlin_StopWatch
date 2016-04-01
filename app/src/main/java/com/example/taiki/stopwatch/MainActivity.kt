package com.example.taiki.stopwatch

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView
import java.util.*
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {

    var timer: Timer? = Timer()
    var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView: TextView = findViewById(R.id.textView2) as TextView
        var startButton: Button = findViewById(R.id.button) as Button
        var stopButton: Button = findViewById(R.id.button2) as Button

        startButton.setOnClickListener {
            val handler = Handler()

            timer?.schedule(1000, 1000) {
                handler.post({
                    number++
                    textView.text = number.toString()
                })
            }


        }

        stopButton.setOnClickListener {


            timer?.cancel()
        }

    }
}
