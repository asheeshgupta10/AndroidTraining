package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import kotlinx.parcelize.Parcelize
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var result =findViewById<TextView>(R.id.result)
        val butPlush = findViewById<Button>(R.id.btnPlus)


        butPlush.setOnClickListener {
            val inputText1 =findViewById<TextInputEditText>(R.id.textInput1);
            val inputText2 =findViewById<TextInputEditText>(R.id.textInput2);

            var input1 =inputText1.text.toString().toInt();
            var input2 =inputText2.text.toString().toInt();
            result.text ="Result :"+(input1+input2).toString();


        }
        val butMinus = findViewById<Button>(R.id.btnMinus)
        butMinus.setOnClickListener {
            val inputText1 =findViewById<TextInputEditText>(R.id.textInput1);
            val inputText2 =findViewById<TextInputEditText>(R.id.textInput2);

            var input1 =inputText1.text.toString().toInt();
            var input2 =inputText2.text.toString().toInt();
            result.text ="Result :" +(input1-input2).toString();


        }

    }
}