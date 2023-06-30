package com.itis.summerpractic

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
        private var nameEditText: EditText? = null
        private var heightEditText: EditText? = null
        private var weightEditText: EditText? = null
        private var ageEditText: EditText? = null
        private var calculateButton: Button? = null
        private var resultTextView: TextView? = null

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            nameEditText = findViewById<EditText>(R.id.nameEditText)
            heightEditText = findViewById<EditText>(R.id.heightEditText)
            weightEditText = findViewById<EditText>(R.id.weightEditText)
            ageEditText = findViewById<EditText>(R.id.ageEditText)
            calculateButton = findViewById<Button>(R.id.calculateButton)
            resultTextView = findViewById<TextView>(R.id.resultTextView)

            calculateButton?.setOnClickListener {
                readingAndCalculate()
            }
        }

        private fun readingAndCalculate() {
            val name = nameEditText?.text.toString()
            val height = heightEditText?.text.toString().toDoubleOrNull()
            val weight = weightEditText?.text.toString().toDoubleOrNull()
            val age = ageEditText?.text.toString().toIntOrNull()
            val range = 0.0.rangeTo(250.0)
            val nameEmpty = name.isNullOrEmpty()
            val nameLen = name.length
            if (!nameEmpty && nameLen <= 50 && height != null && weight != null && age != null && height in range && weight in range && age in 0..150) {
                val result = calculateCalories(name, height, weight, age)
                resultTextView?.text = "Ответ: $result + "
            } else {
                resultTextView?.text = "Данные введены некорректно."
            }
        }


        private fun calculateCalories(name: String, height: Double?, weight: Double?, age: Int?): Double {
            return ((height!! * weight!!) / age!!)
        }
    }



