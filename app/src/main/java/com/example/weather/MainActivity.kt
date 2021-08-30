package com.example.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var j = 0;
        val textView: TextView = findViewById(R.id.textView) // подсмотрено у  Александра Климова,

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {

             j = j+ 1 ;

            for(i in j..j+2) {

                Thread.sleep(1_000)  // wait for 1 second

                print("Hello Kotlin!"+i);

                

            var myStringhello: String = hello("Hello Kotlin! I am starting to learn you"+i)
         //   textView.text = "Hello Kotlin! I am starting to learn you"
            textView.text = myStringhello

             //   textView.text = "Hello Kotlin!"+i


            }
        }



        Repository.weatherList


    }
}