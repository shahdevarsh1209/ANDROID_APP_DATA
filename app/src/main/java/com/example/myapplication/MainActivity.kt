package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var username = findViewById<EditText>(R.id.username)
        var password = findViewById<EditText>(R.id.password)
        var reset = findViewById<Button>(R.id.reset_btn)
        var submit = findViewById<Button>(R.id.submit_btn)

        submit.setOnClickListener {
            val username = username.text;
            val password = password.text;
            Toast.makeText(this@MainActivity, username, Toast.LENGTH_LONG).show()
            val intent = Intent(this,welcome::class.java)
            intent.putExtra("Uname", username)
            startActivity(intent)
        }

        reset.setOnClickListener {
            username.setText("")
            password.setText("")
        }
    }
}

