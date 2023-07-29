package com.example.advancecalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textInput =findViewById<TextView>(R.id.textInput);

        var result =findViewById<TextView>(R.id.result);
        var btnAc = findViewById<Button>(R.id.btnAc);
        btnAc.setOnClickListener {
            result.text=""
        }


        var btnDivide =findViewById<TextView>(R.id.btnDivide);
        Log.i("MainActivity", "Call Div")
        btnDivide.setOnClickListener {
            Log.i("MainActivity", "input text"+textInput.text.toString().length)
            if(textInput.text.toString().length>0){
                textInput.text=textInput.text.toString()+"/";
            }
        }

        var btn7 =findViewById<TextView>(R.id.btn7);
        btn7.setOnClickListener {
            textInput.text=textInput.text.toString()+"7"

        }
    }
}