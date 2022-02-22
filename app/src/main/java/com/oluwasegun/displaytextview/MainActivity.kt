package com.oluwasegun.displaytextview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume(){
        super.onResume()
        val btnDisplay = findViewById<Button>(R.id.btnDisplay)

        btnDisplay.setOnClickListener {
            val intent = Intent(this, TextField::class.java)
            startActivity(intent)
        }

    }

}