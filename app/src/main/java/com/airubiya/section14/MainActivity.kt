package com.airubiya.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun buClick(view:View){
        val buSelected=view as Button
         var cellId=0
        when(buSelected.id){

            R.id.b1->cellId=1
            R.id.b2->cellId=2
            R.id.b3->cellId=3
            R.id.b4->cellId=4
            R.id.b5->cellId=5
            R.id.b6->cellId=6
            R.id.b7->cellId=7
            R.id.b8->cellId=8
            R.id.b9->cellId=9
        }
        playGame(cellId,buSelected)
    }
    var activePlayer=1
    var player1=ArrayList<Int>()
    var player2=ArrayList<Int>()
    fun playGame(cellID:Int,buSelected:Button){
        if(activePlayer==1){
            buSelected.text="X"
            buSelected.setBackgroundResource(R.color.blue)
            player1.add(cellID)
            activePlayer=2
        }
        else{
            buSelected.text="0"
            buSelected.setBackgroundResource(R.color.darkGreen)
            player2.add(cellID)
            activePlayer=1
        }
        buSelected.isEnabled=false
        checkWinner()
    }
    fun checkWinner(){
        var winner=0
//        row 1
        if (player1.contains(1) && player1.contains(2) && player1.contains(3)){
            winner=1
        }
        if (player2.contains(1) && player2.contains(2) && player2.contains(3)){
            winner=2
        }

//        row2

        if (player1.contains(4) && player1.contains(5) && player1.contains(6)){
            winner=1
        }
        if (player2.contains(4) && player2.contains(5) && player2.contains(6)){
            winner=2
        }

//        row3
        if (player1.contains(7) && player1.contains(8) && player1.contains(9)){
            winner=1
        }
        if (player2.contains(7) && player2.contains(8) && player2.contains(9)){
            winner=2
        }

//        Diagonal 1

        if (player1.contains(1) && player1.contains(5) && player1.contains(9)){
            winner=1
        }
        if (player2.contains(1) && player2.contains(5) && player2.contains(9)){
            winner=2
        }

//        Diagonal 2

        if (player1.contains(3) && player1.contains(5) && player1.contains(7)){
            winner=1
        }
        if (player2.contains(3) && player2.contains(5) && player2.contains(7)){
            winner=2
        }

//        Column1

        if (player1.contains(1) && player1.contains(4) && player1.contains(7)){
            winner=1
        }
        if (player2.contains(1) && player2.contains(4) && player2.contains(7)){
            winner=2
        }

//         Column 2
        if (player1.contains(2) && player1.contains(5) && player1.contains(8)){
            winner=1
        }
        if (player2.contains(2) && player2.contains(5) && player2.contains(8)){
            winner=2
        }

//          Column 3
        if (player1.contains(3) && player1.contains(6) && player1.contains(9)){
            winner=1
        }
        if (player2.contains(3) && player2.contains(6) && player2.contains(9)){
            winner=2
        }

        if (winner==1){
            Toast.makeText(this,"Player1 win the game", Toast.LENGTH_LONG).show()
        }
        else if(winner==2){
            Toast.makeText(this,"Player2 win the game", Toast.LENGTH_LONG).show()
        }
    }















}
