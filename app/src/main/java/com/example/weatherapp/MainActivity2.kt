package com.example.weatherapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable


import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 private constructor() : AppCompatActivity(), Parcelable {
    private lateinit var averageTemperatureButton: Button
    private lateinit var temperatureInput: EditText
    private lateinit var resultTextView: EditText

    class DetailedViewScreen
    val intent = Intent(this, DetailedViewScreen::class.java)

    // Sample weather data for the week
    private val weeklyWeather = arrayOf(
        Weather("Monday", 25),
        Weather("Tuesday", 28),
        Weather("Wednesday", 30),
        Weather("Thursday", 26),
        Weather("Friday", 29),
        Weather("Saturday", 31),
        Weather("Sunday", 27)
    )

    constructor(parcel: Parcel) : this() {

    }

    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI components
        averageTemperatureButton = findViewById(R.id.AveTempButton)
        temperatureInput = findViewById(R.id.editTextNumber15)
        resultTextView = findViewById(R.id.editTextNumber16)

        // Set click listeners
        averageTemperatureButton.setOnClickListener {
            val averageTemperature = calculateAverageTemperature()
            "Average temperature for the week: $averageTemperature°C".also { it.also { "resultTextView.text = it" } }
        }

        // This should be the click listener for temperatureInput
        temperatureInput.setOnClickListener {
            val temperature = temperatureInput.text.toString().toIntOrNull()
            if (temperature != null) {
                "Entered temperature: $temperature°C".also { "resultTextView.text = it" }
            } else {
                "Error , you need to enter the correct temperature".also { "resultTextView.text = it" }
            }
        }
    }

    private fun calculateAverageTemperature(): Int {
        val totalTemperature = weeklyWeather.sumBy { it.temperature }
        return totalTemperature / weeklyWeather.size
    }

    data class Weather(val day: String, val temperature: Int) {
        constructor(day: String, temperature: Int, s: String) : this(day, temperature)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity2> {
        override fun createFromParcel(parcel: Parcel): MainActivity2 {
            return MainActivity2(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity2?> {
            return arrayOfNulls(size)
        }
    }

    private object {
        fun Weather(day: String, temperature: Int, s: String) {

        
    }

}
