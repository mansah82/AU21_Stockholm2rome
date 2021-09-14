package com.example.stockholmtorome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Italy : AppCompatActivity() {

    lateinit var userSeeQuestionView: TextView
    lateinit var userPutInAnswerView: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_italy)


        userSeeQuestionView = findViewById(R.id.userSeeQuestionItTv)
        userPutInAnswerView = findViewById(R.id.userAnswerItEt)

        userSeeQuestionView.setText(
            "Why is the tower of pisa leaning?\n" +

                    "1. Because the mud on one of the sides of the base where softer" +
                    " \n" +
                    "2. The builders did not communicate and made the base slightly higher on one side" +
                    "\n" +
                    "3. The architect made an error with the blueprint and didnt notice until halfway done\n" +
                    "" +
                    "4. It actually was straight when it was finished, a storm made it leaning 50 years after")

        val button = findViewById<Button>(R.id.answerButtonIt)
        button.setOnClickListener {
            userAnswerItaly()
        }


    }

    fun userAnswerItaly(): Boolean {
        if (userPutInAnswerView.text.toString().toInt() == 3) { // Fixa sleep thread
            startRomePage()

            return true

        } else {
            userSeeQuestionView.setText("You failed!")
        }
        return false

    }

    fun startRomePage() {
        val intent = Intent(this, Rome::class.java)
            startActivity(intent)
    }




}