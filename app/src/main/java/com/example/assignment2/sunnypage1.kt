package com.example.assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class sunnypage1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sunnypage1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
// Consists of the feed, play and clean buttons which takes the users to 3 different activities.

        var feedbuttone = findViewById<Button>(R.id.feedbuttone)
        feedbuttone.setOnClickListener {
            val intent = Intent(this, sunnypage2::class.java)
            startActivity(intent) }

        var cleanbuttone = findViewById<Button>(R.id.cleanbuttone)
        cleanbuttone.setOnClickListener {
            val intent = Intent(this, sunnypage4::class.java)
            startActivity(intent) }

        var playbuttone = findViewById<Button>(R.id.playbuttone)
        playbuttone.setOnClickListener {
            val intent = Intent(this, sunnypage3::class.java)
            startActivity(intent) }

        var backbuttone = findViewById<Button>(R.id.backbuttone)
        backbuttone.setOnClickListener {
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