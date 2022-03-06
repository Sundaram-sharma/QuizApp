package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)


        val username: TextView = findViewById(R.id.username)
        val score: TextView = findViewById(R.id.score)
        val btnFinish: TextView = findViewById(R.id.btn_finish)
        btnFinish?.text = "Retry ?"
        username.text = intent.getStringExtra(Constants.USER_NAME) //fetch the username

        val totalQuestion = intent.getIntExtra(Constants.TOTAL_QUESTION, 0)
        val correctAnswer = intent.getIntExtra(Constants.CORRECT_ANSWER,0)

        score.text = "Score is $correctAnswer out of $totalQuestion"

        btnFinish.setOnClickListener{

            startActivity(Intent(this, MainActivity::class.java)) // to back to the main activity
        }
    }
}