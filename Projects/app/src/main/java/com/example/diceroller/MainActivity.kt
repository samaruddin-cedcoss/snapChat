package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numText1 : TextView = findViewById(R.id.descView1)
        val numText2 : TextView = findViewById(R.id.descView2)
        val sum : TextView = findViewById(R.id.sumId)


        val btn : Button = findViewById(R.id.rollbtn)
        btn.setOnClickListener {
            rollTheDice(numText1,numText2,sum)
        }
    }

    private fun rollTheDice(numText1 : TextView,numText2 : TextView,sum:TextView ) {
        val diceImage1 : ImageView = findViewById(R.id.dice_img1)
        val diceImage2 : ImageView = findViewById(R.id.dice_img2)
        diceImage1.setImageResource(R.drawable.dice1)
        diceImage2.setImageResource(R.drawable.dice1)

        val dice=Dice(6)
        val diceRoll = dice.roll()

        val dice2=Dice2(6)
        val diceRoll2=dice2.roll2()

        val drawableIMage= when(diceRoll){
            1->R.drawable.dice1
            2->R.drawable.dice2
            3->R.drawable.dice3
            4->R.drawable.dice4
            5->R.drawable.dice5
            else ->R.drawable.dice6

        }


        val drawableIMage2= when(diceRoll2){
            1->R.drawable.dice1
            2->R.drawable.dice2
            3->R.drawable.dice3
            4->R.drawable.dice4
            5->R.drawable.dice5
            else ->R.drawable.dice6

        }


        diceImage1.setImageResource(drawableIMage)
        diceImage2.setImageResource(drawableIMage2)
        numText1.text=diceRoll.toString()
        numText2.text=diceRoll2.toString()
        val one = Integer.parseInt(diceRoll.toString())
        val two = Integer.parseInt(diceRoll2.toString())
        val total  = one + two
        sum.text= "Score is $total"

    }
}

class Dice(private var numSides : Int){
    fun roll() : Int {
        return (1..numSides).random()
    }
}

class Dice2(private var numSides: Int){
    fun roll2() : Int{
        return (1..numSides).random()
    }
}