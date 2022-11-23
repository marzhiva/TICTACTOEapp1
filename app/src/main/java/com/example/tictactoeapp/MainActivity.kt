package com.example.tictactoeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    private lateinit var player1: EditText
    private lateinit var player2: EditText
    private lateinit var startGameButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        player1=findViewById(R.id.textView1)
        player2=findViewById(R.id.textView2)
        startGameButton=findViewById(R.id.startGameButton)

        startGameButton.setOnClickListener{

            val player1 = player1.text.toString()
            val player2=player2.text.toString()

            val intent= Intent(this, MainActivity2::class.java)

            intent.putExtra("PLAYER1", player1)
            intent.putExtra("PLAYER2", player2)

            startActivity(intent)
            finish()

        }


    }
}