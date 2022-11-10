package com.example.zd1_stahovskiy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var spinner: Spinner
    lateinit var loginT: TextView
    lateinit var movie:TextView
    lateinit var usName: String
    lateinit var Fl: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        spinner = findViewById(R.id.sp)
        loginT = findViewById(R.id.LoGin)
        movie = findViewById(R.id.Film)
        usName= getIntent().getStringExtra("login").toString()
        loginT.setText(usName)
    }

    fun YourFilm(view: android.view.View)
    {
        Fl = spinner.getSelectedItem().toString()
        movie.setText(Fl)
    }
}


