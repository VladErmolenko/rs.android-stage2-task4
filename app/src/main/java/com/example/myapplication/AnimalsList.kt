package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import kotlinx.android.synthetic.main.animals_list.*
import kotlinx.android.synthetic.main.add_menu.*
import java.lang.Exception

class AnimalsList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animals_list)
        val w=window
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)

        add_btn.setOnClickListener {
            val intent = Intent(this, AddAnimal::class.java)
            startActivity(intent)
        }
    }
}
