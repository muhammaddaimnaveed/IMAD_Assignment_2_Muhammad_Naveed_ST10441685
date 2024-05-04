package com.example.assignment2

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ProgressBar
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class harrypage2 : AppCompatActivity() {

    // declared the variables.


    private lateinit var progressBarm: ProgressBar
    private lateinit var feedbuttonb: Button
    private var progressStatus = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_harrypage2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // declared the variables.

        progressBarm = findViewById(R.id.progressBarm) //progress bar
        feedbuttonb = findViewById(R.id.feedbuttonb)

        // progress bar placed to increases the progress bar level.

        feedbuttonb.setOnClickListener {
            if (progressStatus < 100) {
                progressStatus += 10
                progressBarm.progress = progressStatus
            } else {
                Toast.makeText(this, " Feeding Complete", Toast.LENGTH_SHORT).show()
                Handler().postDelayed({
                    progressStatus = 0
                    progressBarm.progress = 0
                }, 120000) // progress bar decreases after 2 minutes.
            }
        }



        var backbuttonb = findViewById<Button>(R.id.backbuttonb)
        backbuttonb.setOnClickListener {
            val intent = Intent(this, harrypage1::class.java)
            startActivity(intent) }
    }
}

// Reference:

/* The Independent Institution of Education. (2024). Introduction of Mobile Application Development.
IMAD5112. Varsity College Pietermaritzburg. [Online]. Available at: Tertiary Students
– IMAD5112MM.pdf– Default View (sharepoint.com). [Accessed: 18 April 2024]. */

/* Android Minutes - YouTube. (2019). Android Studio - Progress Bar. [Online]. Available at: Android Studio - Progress Bar!
    (youtube.com). [Accessed: 25 April 2024]. */