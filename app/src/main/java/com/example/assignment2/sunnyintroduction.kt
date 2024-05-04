package com.example.assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class sunnyintroduction : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sunnyintroduction)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
// The coding below takes the users from Sunny introduction to Sunny's main page

        var nextbutton5 = findViewById<Button>(R.id.nextbutton5)
        nextbutton5.setOnClickListener {
            val intent = Intent(this, sunnypage1::class.java)
            startActivity(intent) }


        var backbutton14 = findViewById<Button>(R.id.backbutton14)
        backbutton14.setOnClickListener {
            val intent = Intent(this, page2::class.java)
            startActivity(intent) }
    }
}

// Reference:

/* The Independent Institution of Education. (2024). Introduction of Mobile Application Development. IMAD5112.
Varsity College Pietermaritzburg.[Online]. Available at: Tertiary Students – IMAD5112MM.pdf – Default View
(sharepoint.com). [Accessed: 18 April 2024]. */