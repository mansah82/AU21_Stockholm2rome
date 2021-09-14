package com.example.stockholmtorome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlin.concurrent.thread

class Danmark : AppCompatActivity() {

    lateinit var userSeeQuestionView: TextView
    lateinit var userPutInAnswerView: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_danmark)

        userSeeQuestionView = findViewById(R.id.userSeeQuestionTv)
        userPutInAnswerView = findViewById(R.id.userAnswerEt)


        userSeeQuestionView.setText("Who was the Danish king whom ruled over England during the viking era?\n" +
                "1. Knut the great one\n" +
                "2. Albert the gready\n" +
                "3. Björn ironside\n" +
                "4. Gorm the old")


        val button = findViewById<Button>(R.id.answerButton)
            button.setOnClickListener {
                userAnswerDanmark()

            }







    }

    fun userAnswerDanmark():Boolean {

        if(userPutInAnswerView.text.toString().toInt() == 1) {
            userSeeQuestionView.setText("Good job travel along to next country!")
            Thread.sleep(5000)
            startGermanyPage()
            return true


        }else {
            userSeeQuestionView.setText("You faild!")
        }


        return false
    }

    fun startGermanyPage() {
            userSeeQuestionView.setText("Good job! travel on to Germany") // Fixa till en sleep
        val intent = Intent(this, Germany::class.java)
            startActivity(intent)
    }



}