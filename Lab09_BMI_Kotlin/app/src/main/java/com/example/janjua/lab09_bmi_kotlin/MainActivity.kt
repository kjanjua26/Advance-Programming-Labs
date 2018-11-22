package com.example.janjua.lab09_bmi_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        var weight = findViewById(R.id.editText3).toString().toDouble()
        var height = findViewById(R.id.editText4).toString().toDouble()
        Toast.makeText(this, "Weight", Toast.LENGTH_LONG).show()
        val btnBMI = findViewById(R.id.button)
        btnBMI?.setOnClickListener { calculateBMI(weight, height)}*/c

    }
    private fun calculateBMI(weight: Double, height: Double){
        var firstDiv = weight/height
        var BMI = firstDiv/height
        Toast.makeText(this@MainActivity, BMI.toString(), Toast.LENGTH_LONG).show()
    }
}
