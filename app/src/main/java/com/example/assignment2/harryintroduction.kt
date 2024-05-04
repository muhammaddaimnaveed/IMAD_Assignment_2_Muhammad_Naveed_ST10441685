package com.example.assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class harryintroduction : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_harryintroduction)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // The coding below takes the users from Harry introduction to Harry's main page

        var nextbutton4 = findViewById<Button>(R.id.nextbutton4)
        nextbutton4.setOnClickListener {
            val intent = Intent(this, harrypage1::class.java)
            startActivity(intent) }


        var backbutton13 = findViewById<Button>(R.id.backbutton13)
        backbutton13.setOnClickListener {
            val intent = Intent(this, page2::class.java)
            startActivity(intent) }
    }
}

// Reference:

/* The Independent Institution of Education. (2024). Introduction of Mobile Application Development. IMAD5112.
Varsity College Pietermaritzburg.[Online]. Available at: Tertiary Students – IMAD5112MM.pdf – Default View
(sharepoint.com). [Accessed: 18 April 2024]. */