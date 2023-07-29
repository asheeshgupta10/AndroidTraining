package com.example.myfirstprogram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding  btnShowToast.setOnClickListener {
            Log.i("this", "Button was clicked")
            Toast.makeText(this,"Click Button call", Toast.LENGTH_SHORT).show()
        }






    }

}