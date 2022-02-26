package com.oluwasegun.displaytextview

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    var message: String = "Message: "
    private lateinit var editTextMessage: EditText
    private lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume(){
        super.onResume()
        val btnDisplay = findViewById<Button>(R.id.btnDisplay)
        editTextMessage = findViewById(R.id.editText)

        btnSend = findViewById(R.id.btnDisplay)

        btnDisplay.setOnClickListener {
            var message = editTextMessage.text.toString().trim()

            val intent = Intent(this, TextField::class.java)
            intent.putExtra("MY_DATA", message)
            startActivity(intent)
            Log.i(message, message)
        }

    }

}