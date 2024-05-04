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

class cleopage3 : AppCompatActivity() {
    // declared the variables.

    private lateinit var progressBarr: ProgressBar
    private lateinit var cleanbutton2: Button
    private var progressStatus = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cleopage3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
// declared the variables.
        progressBarr = findViewById(R.id.progressBarr) //progress bar
        cleanbutton2 = findViewById(R.id.cleanbutton2)

        // progress bar placed to increases the progress bar level.

        cleanbutton2.setOnClickListener {
            if (progressStatus < 100) {
                progressStatus += 10
                progressBarr.progress = progressStatus
            } else {
                Toast.makeText(this, " Cleaning Complete", Toast.LENGTH_SHORT).show()
                Handler().postDelayed({
                    progressStatus = 0
                    progressBarr.progress = 0
                }, 120000)  // progress bar decreases after 2 minutes.
            }
        }


        var backbutton5 = findViewById<Button>(R.id.backbutton5)
        backbutton5.setOnClickListener {
            val intent = Intent(this, cleopage1::class.java)
            startActivity(intent) }
    }
}

// Reference:

/* The Independent Institution of Education. (2024). Introduction of Mobile Application Development.
IMAD5112. Varsity College Pietermaritzburg. [Online]. Available at: Tertiary Students
– IMAD5112MM.pdf– Default View (sharepoint.com). [Accessed: 18 April 2024]. */

/* Android Minutes - YouTube. (2019). Android Studio - Progress Bar. [Online]. Available at: Android Studio - Progress Bar!
    (youtube.com). [Accessed: 25 April 2024]. */