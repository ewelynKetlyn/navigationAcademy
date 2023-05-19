package com.example.navigationacademy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonA = findViewById<Button>(R.id.buttonA)

        buttonA.setOnClickListener {
            irParaActivityB()
        }
    }
    private fun irParaActivityB(){
        val activityB = Intent(this, ActivityB::class.java)
        startActivity(activityB)
    }
}