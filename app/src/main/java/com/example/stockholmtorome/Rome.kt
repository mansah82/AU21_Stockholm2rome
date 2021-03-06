package com.example.stockholmtorome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Rome : AppCompatActivity() {

    lateinit var userSeeQuestionView: TextView
    lateinit var userPutInAnswerView: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rome)


        userSeeQuestionView = findViewById(R.id.userSeeQuestionItRo)
        userPutInAnswerView = findViewById(R.id.userAnswerRoEt)

        userSeeQuestionView.setText(
            "What was Julius Ceasers dying word\n" +
                    "1.Veni, vidi, vici\n" +
                    "2.Non ducor, duco\n" +
                    "3.Et tu, Brute?\n" +
                    "4.Aqua vitae"
        )

        val button = findViewById<Button>(R.id.answerButtonRo)
            button.setOnClickListener {
                userAnswerRome()
            }





    }

    fun userAnswerRome(): Boolean {
        if (userPutInAnswerView.text.toString().toInt() == 3) { // Fixa sleep thread
                userSeeQuestionView.setText("Good job")

            return true

        } else {
            userSeeQuestionView.setText("You failed!")
        }
        return false

    }




}