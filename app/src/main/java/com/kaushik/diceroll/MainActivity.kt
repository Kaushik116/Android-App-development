package com.kaushik.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val rollButtonMa: Button = findViewById(R.id.button_AM)
        rollButtonMa.setOnClickListener {

            rollDiceMA()

            val toastMA = Toast.makeText(this,"Dice Rolled!",Toast.LENGTH_LONG)
            toastMA.show()
        }
    }

    private fun rollDiceMA() {
        val diceMA = DiceMA(6)
        val cubeRoll = diceMA.rollMA()
        val diceImage: ImageView = findViewById(R.id.imageView)
        diceImage.setImageResource(R.drawable.dice_4)

        when (cubeRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
    }

    class DiceMA (val numSidesMA: Int){
        fun rollMA(): Int{
            return (1..numSidesMA).random()
        }
    }
}