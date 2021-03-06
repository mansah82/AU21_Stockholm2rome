package com.example.stockholmtorome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Germany : AppCompatActivity() {

    lateinit var userSeeQuestionView: TextView
    lateinit var userPutInAnswerView: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_germany)


        userSeeQuestionView = findViewById(R.id.userSeeQuestionGrTv)
        userPutInAnswerView = findViewById(R.id.userAnswerGrEt)

        userSeeQuestionView.setText("Which river is the longest in Germany?\n" +
                "1. Rhen\n" +
                "2. Elbe\n" +
                "3. Donau\n" +
                "4. Weser")


        val button = findViewById<Button>(R.id.answerButtonGr)
            button.setOnClickListener {
                userAnswerGermany()
            }


    }


    fun userAnswerGermany(): Boolean {
        if(userPutInAnswerView.text.toString().toInt() == 1) { // Fixa sleep thread
            startSwitzerlandPage()

                return true

        }else {
            userSeeQuestionView.setText("You faild!")
        }
        return false

    }

    fun startSwitzerlandPage() {
        val intent = Intent(this, Switzerland::class.java)
        startActivity(intent)
    }



}