package com.example.assignment2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class cleopage1 : AppCompatActivity() {


    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cleopage1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


// Consists of the feed, play and clean buttons which takes the users to 3 different activities.

        var feedbutton1 = findViewById<Button>(R.id.feedbutton1)
        feedbutton1.setOnClickListener {
            val intent = Intent(this, cleopage2::class.java)
            startActivity(intent) }

        var cleanbutton1 = findViewById<Button>(R.id.cleanbutton1)
        cleanbutton1.setOnClickListener {
            val intent = Intent(this, cleopage3::class.java)
            startActivity(intent) }

        var playbutton1 = findViewById<Button>(R.id.playbutton1)
        playbutton1.setOnClickListener {
            val intent = Intent(this, cleopage4::class.java)
            startActivity(intent) }

        var backbutton2 = findViewById<Button>(R.id.backbutton2)
        backbutton2.setOnClickListener {
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