package com.example.loginscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextTextEmailAddress = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val editTextTextPassword = findViewById<EditText>(R.id.editTextTextPassword)

        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            if(editTextTextEmailAddress.text.isNullOrBlank()&&editTextTextPassword.text.isNullOrBlank()){
                Toast.makeText(this,"Please fill the required fields", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"${editTextTextEmailAddress.text} is logged in!!", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
