package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View



class ExitButton {

}

private operator fun Unit.invoke(value: () -> Unit): View? {

    return TODO("Provide the return value")
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                setUpStartButton()
                setUpExitButton()
            }

            private fun setUpStartButton() {
                // Set up click listener for the start button

                StartButton.setOnClickListener {
                    // Start the MainViewScreen activity
                    class MainViewScreen
                    val intent = Intent(this, MainViewScreen::class.java)
                    startActivity(intent)
                }
            }

    class StartButton {
        companion object {
            fun setOnClickListener(function: () -> Unit) {

            }
        }

    }

    private fun setUpExitButton() {
                // Set up click listener for the exit button
                class ExitButton {
                   // Close the app


                }


                }
            }





