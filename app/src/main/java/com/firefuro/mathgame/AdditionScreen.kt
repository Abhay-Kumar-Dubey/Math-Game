package com.firefuro.mathgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class AdditionScreen : AppCompatActivity() {
    lateinit var question : TextView
    lateinit var answer : EditText
    lateinit var buttonOk : Button
    lateinit var buttonNext : Button
    var score = 0
    var life = 3
    var correctAnswer = 0

    lateinit var scoreText:TextView
    lateinit var lifeText:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addition_screen)

        question=findViewById(R.id.textViewQuestion)
        answer=findViewById(R.id.editTextNumber)
        buttonOk=findViewById(R.id.buttonOk)
        buttonNext=findViewById(R.id.buttonNext)
        scoreText=findViewById(R.id.ScoreCount)
        lifeText=findViewById(R.id.LifeCount)
        additionGame()

        buttonOk.setOnClickListener{
            val input= answer.text.toString()
            if(input==""){
                Toast.makeText(applicationContext,"plz write something in answer tab", Toast.LENGTH_SHORT).show()
            }
            else{
                val answer = input.toInt()
                if (answer == correctAnswer){
                    score=score+10
                    question.text="Congratulation Your Answer is Correct!!"
                    scoreText.text=score.toString()

                }
                else{
                    life=life-1
                    question.text="Sorry Your answer is wrong T_T"
                    lifeText.text=life.toString()
                }
            }

        }
        buttonNext.setOnClickListener{
            additionGame()
            answer.setText("")

        }


    }
    fun additionGame()
    {
        var number1 = Random.nextInt(0,100)
        var number2 = Random.nextInt(0,100)

        question.text="$number1 + $number2"

        correctAnswer=number1 + number2

    }
}