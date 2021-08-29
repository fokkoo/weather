package com.example.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView) // подсмотрено у  Александра Климова,

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {

            var myStringhello: String = hello("Hello Kotlin! I am starting to learn you")
         //   textView.text = "Hello Kotlin! I am starting to learn you"
            textView.text = myStringhello
        }





        Repository.weatherList
    }
}