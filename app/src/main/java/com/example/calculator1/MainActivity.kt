package com.example.calculator1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calc()
    }

    private fun calc(){
        var n1=findViewById<EditText>(R.id.number1)
        var n2=findViewById<EditText>(R.id.number2)
        var b1=findViewById<Button>(R.id.add)
        var b4=findViewById<Button>(R.id.sub)
        var b2=findViewById<Button>(R.id.multiply)
        var b3=findViewById<Button>(R.id.divide)
        var b5=findViewById<Button>(R.id.percent)
        var cb=findViewById<Button>(R.id.clear)

        b1.setOnClickListener {
            var sum1 = n1.text.toString().toDouble()
            var sum2 = n2.text.toString().toDouble()
            var sum = sum1 + sum2

            Toast.makeText(this, "$sum", Toast.LENGTH_SHORT).show()

        }

        b2.setOnClickListener {
            var num1 = n1.text.toString().toDouble()
            var num2 = n2.text.toString().toDouble()
            var prod = num1 * num2

            Toast.makeText(this, "$prod", Toast.LENGTH_SHORT).show()
        }

        b4.setOnClickListener {
            var num1 = n1.text.toString().toDouble()
            var num2 = n2.text.toString().toDouble()
            var sub = num1 - num2

            Toast.makeText(this, "$sub", Toast.LENGTH_SHORT).show()
        }

        b3.setOnClickListener {
            var num1 = n1.text.toString().toDouble()
            var num2 = n2.text.toString().toDouble()
            var ans = num1 / num2

            Toast.makeText(this, "$ans", Toast.LENGTH_SHORT).show()
        }

        b5.setOnClickListener {
            var num1 = n1.text.toString().toDouble()
            var num2 = n2.text.toString().toDouble()
            var per = (num1 * 0.01) * num2

            Toast.makeText(this, "$per", Toast.LENGTH_SHORT).show()
        }

        cb.setOnClickListener {
            n1.setText("")
            n2.setText("")

            Toast.makeText(this, "Cleared", Toast.LENGTH_SHORT).show()
        }

    }

}