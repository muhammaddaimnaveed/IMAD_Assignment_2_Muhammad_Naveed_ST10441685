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

class percypage3 : AppCompatActivity() {

    // declared the variables.

    private lateinit var progressBars: ProgressBar
    private lateinit var cleanbutton3: Button
    private var progressStatus = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_percypage3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // declared the variables.

        progressBars = findViewById(R.id.progressBars) //progress bar
        cleanbutton3 = findViewById(R.id.cleanbutton3)

        // progress bar placed to increases the progress bar level.

        cleanbutton3.setOnClickListener {
            if (progressStatus < 100) {
                progressStatus += 10
                progressBars.progress = progressStatus
            } else {
                Toast.makeText(this, " Cleaning Complete", Toast.LENGTH_SHORT).show()
                Handler().postDelayed({
                    progressStatus = 0
                    progressBars.progress = 0
                }, 120000) // progress bar decreases after 2 minutes.
            }
        }



        var backbutton8 = findViewById<Button>(R.id.backbutton8)
        backbutton8.setOnClickListener {
            val intent = Intent(this, percypage1::class.java)
            startActivity(intent) }
    }
}

// Reference:

/* The Independent Institution of Education. (2024). Introduction of Mobile Application Development.
IMAD5112. Varsity College Pietermaritzburg. [Online]. Available at: Tertiary Students
– IMAD5112MM.pdf– Default View (sharepoint.com). [Accessed: 18 April 2024]. */

/* Android Minutes - YouTube. (2019). Android Studio - Progress Bar. [Online]. Available at: Android Studio - Progress Bar!
    (youtube.com). [Accessed: 25 April 2024]. */


