package com.oluwasegun.displaytextview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TextField : AppCompatActivity() {

    private lateinit var textView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_field)
    }

    override fun onResume() {
        super.onResume()
        val data = intent.getStringExtra("MY_DATA")

        textView = findViewById(R.id.textView)
        textView.text = data
    }
}