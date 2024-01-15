package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var login : Button = findViewById<Button>(R.id.login)
        var text : TextView = findViewById(R.id.label)


        login.setOnClickListener(){
            text.setVisibility(View.INVISIBLE);
            text.text="Let's Sign Up first"
            text.setVisibility(View.VISIBLE)
        }
    }
}