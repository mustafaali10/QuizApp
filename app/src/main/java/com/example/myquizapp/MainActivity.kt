package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart: Button =findViewById(R.id.btn_start)
        val name: EditText =findViewById(R.id.name)
        btnStart.setOnClickListener {
            if(name.text.isEmpty()){
                Toast.makeText(this,"Naam Daalo Yaaro Kya Thande Kaaman Karre",Toast.LENGTH_LONG).show()
            }
            else{
                val intent=Intent(this,QuizQuestionsActivity::class.java)//moving from MainActivity to QuizQuestionActivity
                intent.putExtra(Constants.USER_NAME,name.text.toString())
                startActivity(intent)

                finish()
            }
        }
    }
}