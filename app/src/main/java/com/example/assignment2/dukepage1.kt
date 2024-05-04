package com.example.assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class dukepage1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dukepage1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
// Consists of the feed, play and clean buttons which takes the users to 3 different activities.

        var feedbuttoni = findViewById<Button>(R.id.feedbuttoni)
        feedbuttoni.setOnClickListener {
            val intent = Intent(this, dukepage2::class.java)
            startActivity(intent) }

        var cleanbuttoni = findViewById<Button>(R.id.cleanbuttoni)
        cleanbuttoni.setOnClickListener {
            val intent = Intent(this, dukepage4::class.java)
            startActivity(intent) }

        var playbuttoni = findViewById<Button>(R.id.playbuttoni)
        playbuttoni.setOnClickListener {
            val intent = Intent(this, dukepage3::class.java)
            startActivity(intent) }

        var backbuttoni = findViewById<Button>(R.id.backbuttoni)
        backbuttoni.setOnClickListener {
            val intent = Intent(this, page2::class.java)
            startActivity(intent) }
    }
}

// Reference:

/* The Independent Institution of Education. (2024). Introduction of Mobile Application Development.
IMAD5112. Varsity College Pietermaritzburg. [Online]. Available at: Tertiary Students
– IMAD5112MM.pdf– Default View (sharepoint.com). [Accessed: 18 April 2024]. */

/* Android Minutes - YouTube. (2019). Android Studio - Progress Bar. [Online]. Available at: Android Studio - Progress Bar!
    (youtube.com). [Accessed: 25 April 2024]. */