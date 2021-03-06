package com.example.stockholmtorome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Switzerland : AppCompatActivity() {

    lateinit var userSeeQuestionView: TextView
    lateinit var userPutInAnswerView: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switzerland)

        userSeeQuestionView = findViewById(R.id.userSeeQuestionSwTv)
        userPutInAnswerView = findViewById(R.id.userAnswerSwEt)

        userSeeQuestionView.setText("What brand does not originate from Switzerland?\n" +
                "1. Knorr\n" +
                "2. Breitling\n" +
                "3. Birkenstock\n" +
                "4. Lindt")

        val button = findViewById<Button>(R.id.answerButtonSw)
        button.setOnClickListener {
            answerSwitzerland()

        }



    }

    fun answerSwitzerland(): Boolean {
        if(userPutInAnswerView.text.toString().toInt() == 3) {
            startItalyPage()
                return true
        }else {
            userSeeQuestionView.setText("You faild!")
        }
        return false

    }
    fun startItalyPage() {
       val intent = Intent(this, Italy::class.java)
            startActivity(intent)
    }



}