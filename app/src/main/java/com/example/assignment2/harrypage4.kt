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

class harrypage4 : AppCompatActivity() {

    // declared the variables.


    private lateinit var progressBart: ProgressBar
    private lateinit var cleanbuttond: Button
    private var progressStatus = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_harrypage4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // declared the variables.

        progressBart = findViewById(R.id.progressBart) //progress bar
        cleanbuttond = findViewById(R.id.cleanbuttond)

        // progress bar placed to increases the progress bar level.

        cleanbuttond.setOnClickListener {
            if (progressStatus < 100) {
                progressStatus += 10
                progressBart.progress = progressStatus
            } else {
                Toast.makeText(this, " Cleaning Complete", Toast.LENGTH_SHORT).show()
                Handler().postDelayed({
                    progressStatus = 0
                    progressBart.progress = 0
                }, 120000) // progress bar decreases after 2 minutes.
            }
        }
        var backbuttond = findViewById<Button>(R.id.backbuttond)
        backbuttond.setOnClickListener {
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