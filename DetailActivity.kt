package com.example.weatherlyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail2)

        val dailyDetails = findViewById<TextView>(R.id.dailyDetails)
        val btnBackMain = findViewById<Button>(R.id.btnBackMain)
        val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        val minTemps = arrayOf(12, 15, 13, 16, 12, 12, 14)
        val maxTemps = arrayOf(26, 28, 28, 32, 22, 24, 30)
        val conditions = arrayOf("Sunny", "Sunny", "Sunny", "Sunny", "Partly Cloudy", "Sunny", "Sunny")


            val details = StringBuilder()
            for (i in days.indices) {
                details.append("${days[i]}: Min Temp: ${minTemps[i]}°C, Max Temp: ${maxTemps[i]}°C, Condition: ${conditions[i]}\n\n")
            }
            dailyDetails.text = details.toString()

            btnBackMain.setOnClickListener {
                finish()
            }
    }
}
