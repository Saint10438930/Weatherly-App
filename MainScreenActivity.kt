package com.example.weatherlyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainScreenActivity : AppCompatActivity() {

        //Declaration
            val btnViewDetails = findViewById<Button>(R.id.btnViewDetails)
            val btnClearData = findViewById<Button>(R.id.btnClearData)
            val btnExit = findViewById<Button>(R.id.btnExit)
            var avgTempText = findViewById<TextView>(R.id.avgTempText)

        //Arrays
            val minTemps = arrayOf(12, 15, 13, 16, 12, 12, 14)
            var maxTemps = arrayOf(26, 28, 28, 32, 22, 24, 30)

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main_screen)

                val avgTemp = calculateAverageTemp(minTemps, maxTemps)
            avgTempText.text= "Average Temperature: $avgTemp°C"

                btnViewDetails.setOnClickListener {
                    val intent = Intent(this, DetailActivity::class.java)
                    startActivity(intent)
                }

                btnClearData.setOnClickListener {
                    // Code to clear and re-input data
                }

                btnExit.setOnClickListener {
                    finish()
                }
        }

            private fun calculateAverageTemp(minTemps: Array<Int>, maxTemps: Array<Int>): Double {
                val totalTemp = (minTemps.sum() + maxTemps.sum()).toDouble()
                return totalTemp / (minTemps.size + maxTemps.size)
            }
}