package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import kotlinx.android.synthetic.main.add_menu.*
import java.lang.Exception
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class AddAnimal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_menu)
        Read.setOnClickListener{this}
        Add.setOnClickListener{this}
        Clear.setOnClickListener{this}

     }
    @Override
    fun onClick(v:View){
        val name=Name.text.toString()
        val age=Age.text.toString()
        val breed=Breed.text.toString()
        when(v.id){
            R.id.Add->{}
            R.id.Read->{}
            R.id.Clear->{}
        }
    }
}
