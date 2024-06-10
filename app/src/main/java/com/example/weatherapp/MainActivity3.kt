@file:Suppress("UNREACHABLE_CODE")

package com.example.weatherapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity

private fun <Button> Button.setOnClickListener(function: () -> Unit) {

}

/**
 * Loads [MainFragment2].
 */
@Suppress("UNREACHABLE_CODE")
class MainActivity3 : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_browse_fragment, MainFragment2())
                .commitNow()


            @SuppressLint("ParcelCreator")
            abstract class MainActivity<row1, backButton, Button> private constructor() : AppCompatActivity(),
                Parcelable {
                open var averageTemperatureButton: backButton = TODO()
                private var maxTemperatureTextView: row1 = TODO()
                private var minTemperatureTextView: row2? = null

                inner class row2 {

                }


                // Sample weather data for the week
                private val weeklyWeather = listOf(
                    MainActivity2.Weather("Monday", 25, "Windy with Clouds"),
                    MainActivity2.Weather("Tuesday", 28, "Partly Cloudy"),
                    MainActivity2.Weather("Wednesday", 30, "Sunny"),
                    MainActivity2.Weather("Thursday", 26, "Sunny"),
                    MainActivity2.Weather("Friday", 29, "Sunny"),
                    MainActivity2.Weather("Saturday", 31, "Sunny"),
                    MainActivity2.Weather("Sunday", 27, "Windy")
                )

                constructor(parcel: Parcel) : this() {
                }

                @SuppressLint("MissingInflatedId")
                override fun onCreate(savedInstanceState: Bundle?) {
                    super.onCreate(savedInstanceState)
                    setContentView(R.layout.activity_main)

                    // Initialize UI components
                    this.findViewById(/* id = */ R.id.AveTempButton)
                        .also {
                            val it
                            averageTemperatureButton = it
                        }
                    var temperatureInput = this.maxTemperatureTextView
                        .compose
                        .foundation
                        .layout
                        .Box {
                            findViewById(/* id = */ R.id.editTextNumber15)
                        }
                    var resultTextView = this.findViewById(/* id = */ R.id.editTextNumber16)
                    maxTemperatureTextView = this.findViewById(/* id = */ R.id.row1)
                    this.findViewById<View?>(/* id = */ R.id.row2)
                        .also { minTemperatureTextView = it }

                    // Set click listeners
                    averageTemperatureButton.setOnClickListener {
                        val averageTemperature = calculateAverageTemperature()
                        "Average temperature for the week: $averageTemperature°C".also {
                            it.also {
                                it.also {
                                    resultTextView.text = it
                                }
                            }
                        }

                        val maxMinTemperatures = calculateMaxMinTemperatures()
                        "Max Temperature: ${maxMinTemperatures.first}°C".also { it.also { this.maxTemperatureTextView.text = it } }
                        "Min Temperature: ${maxMinTemperatures.second}°C".also {
                            it.also { minTemperatureTextView!!.javaClass = it }
                        }

                    }

                    // Button to go back to home screen
                    val backButton: Button = findViewById(R.id.backButton)
                    backButton.setOnClickListener {
                        // Implement the logic to go back to the home screen
                    }
                }

                private fun calculateAverageTemperature(): Int {
                    val totalTemperature = weeklyWeather.sumBy { it.temperature }
                    return totalTemperature / weeklyWeather.size
                }

                private fun calculateMaxMinTemperatures(): Pair<Int, Int> {
                    val maxTemperature =
                        weeklyWeather.maxByOrNull { it.temperature }?.temperature ?: 0


            val minTemperature = null
            return maxTemperature to minTemperature
                }






            }


        }