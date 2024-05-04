package com.example.assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class dukeintroduction : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dukeintroduction)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // The coding below takes the users from Duke introduction to Duke's main page.

        var nextbutton3 = findViewById<Button>(R.id.nextbutton3)
        nextbutton3.setOnClickListener {
            val intent = Intent(this, dukepage1::class.java)
            startActivity(intent) }


        var backbutton12 = findViewById<Button>(R.id.backbutton12)
        backbutton12.setOnClickListener {
            val intent = Intent(this, page2::class.java)
            startActivity(intent) }
    }
}

// Reference:

/* The Independent Institution of Education. (2024). Introduction of Mobile Application Development. IMAD5112.
Varsity College Pietermaritzburg.[Online]. Available at: Tertiary Students – IMAD5112MM.pdf – Default View
(sharepoint.com). [Accessed: 18 April 2024]. */