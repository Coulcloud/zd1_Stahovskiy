package com.example.zd1_stahovskiy

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var login: EditText
    lateinit var pass: EditText
    lateinit var butt:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main)
        super.onCreate(savedInstanceState)
        login = findViewById(R.id.edittext1)
        pass = findViewById(R.id.edittext2)
        butt=findViewById(R.id.button1)
        butt.setOnClickListener()
        {
            if(login.text.toString().isEmpty())
            {
                var alert=AlertDialog.Builder(this)
                    .setTitle(("ошибка"))
                    .setMessage("У вас есть незаполненные поля")
                    .setPositiveButton("ok",null)
                    .create()
                    .show()
            }
            else
            {

                    val intent = Intent(this@MainActivity,MainActivity2::class.java)
                    intent.putExtra("login", login.text)

            }
            if(pass.text.toString().isEmpty())
            {
                var alert=AlertDialog.Builder(this)
                    .setTitle(("ошибка"))
                    .setMessage("У вас есть незаполненные поля")
                    .setPositiveButton("ok",null)
                    .create()
                    .show()
            }
        }






    }
}