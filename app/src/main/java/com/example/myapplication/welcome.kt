package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        var bundle :Bundle? = intent.extras
        var un = bundle!!.getString("User_name")

        Toast.makeText(this,un,Toast.LENGTH_LONG).show()
    }
}