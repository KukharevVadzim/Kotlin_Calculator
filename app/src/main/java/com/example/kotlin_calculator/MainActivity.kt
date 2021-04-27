package com.example.kotlin_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var operator = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editFirstNumber = findViewById<EditText>(R.id.editFirstNumber)
        val editSecondNumber = findViewById<EditText>(R.id.editSecondNumber)
        val resultView = findViewById<TextView>(R.id.textView)
        val btnSumma = findViewById<Button>(R.id.button1)
        val btnMinus = findViewById<Button>(R.id.button2)
        val btnMultiply = findViewById<Button>(R.id.button3)
        val btnDiv = findViewById<Button>(R.id.button4)
        val btnResult = findViewById<Button>(R.id.button5)

        btnSumma.setOnClickListener {
            operator = "+"
        }

        btnMinus.setOnClickListener {
            operator = "-"
        }

        btnMultiply.setOnClickListener {
            operator = "*"
        }

        btnDiv.setOnClickListener {
            operator = "/"
        }

        btnResult.setOnClickListener {
            val input1 = editFirstNumber.text.toString().toDouble()
            val input2 = editSecondNumber.text.toString().toDouble()
            var result = 80.0
            if (operator.equals("+")) {
                result = input1.toDouble() + input2.toDouble()
            } else if (operator.equals("-")) {
                result = input1.toDouble() - input2.toDouble()
            } else if (operator.equals("*")) {
                result = input1.toDouble() * input2.toDouble()
            } else if (operator.equals("/")) {
                result = input1.toDouble() / input2.toDouble()
            }
            resultView.text = result.toString()
        }
    }
}