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

class sunnypage4 : AppCompatActivity() {

    // declared the variables.


    private lateinit var progressBarv: ProgressBar
    private lateinit var cleanbuttonh: Button
    private var progressStatus = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sunnypage4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // declared the variables.


        progressBarv = findViewById(R.id.progressBarv) //progress bar
        cleanbuttonh = findViewById(R.id.cleanbuttonh)

        // progress bar placed to increases the progress bar level.

        cleanbuttonh.setOnClickListener {
            if (progressStatus < 100) {
                progressStatus += 10
                progressBarv.progress = progressStatus
            } else {
                Toast.makeText(this, " Cleaning Complete", Toast.LENGTH_SHORT).show()
                Handler().postDelayed({
                    progressStatus = 0
                    progressBarv.progress = 0
                }, 180000) // progress bar decreases after 2 minutes.
            }
        }



        var backbuttonh = findViewById<Button>(R.id.backbuttonh)
        backbuttonh.setOnClickListener {
            val intent = Intent(this, sunnypage1::class.java)
            startActivity(intent) }
    }
}

// Reference:

/* The Independent Institution of Education. (2024). Introduction of Mobile Application Development.
IMAD5112. Varsity College Pietermaritzburg. [Online]. Available at: Tertiary Students
– IMAD5112MM.pdf– Default View (sharepoint.com). [Accessed: 18 April 2024]. */

/* Android Minutes - YouTube. (2019). Android Studio - Progress Bar. [Online]. Available at: Android Studio - Progress Bar!
    (youtube.com). [Accessed: 25 April 2024]. */