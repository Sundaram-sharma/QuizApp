package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart: Button = findViewById(R.id.btn_start)
        val etName: EditText = findViewById(R.id.et_name)
        btnStart.setOnClickListener {
            btnStart.setOnClickListener {

                if(etName.text.isEmpty()){
                    //show a message to the user if the name field is empty
                    Toast.makeText(this,"Please enter your name",Toast.LENGTH_LONG).show()
                }
                else{
                    //welcome message
                    Toast.makeText(this,"Welcome ${etName.toString()}",Toast.LENGTH_LONG).show()
                    // to make the program to jump on the other class. Intent is from java class
                    val intent = Intent(this,quizQuestionActivity::class.java)
                    intent.putExtra(Constants.USER_NAME, etName.text.toString()) //to pass additonal data to the activity
                    startActivity(intent) // this will start the intent
                }
            }

        }
    }
}