package com.example.assignment2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // This code takes the user from the home splash screen to page 2 to pick a character when clicked.

        var playbutton = findViewById<Button>(R.id.playbutton)
        playbutton.setOnClickListener {
            val intent = Intent(this, page2::class.java)
            startActivity(intent) }
    }
}

// Reference:

/* The Independent Institution of Education. (2024). Introduction of Mobile Application Development.
 IMAD5112. Varsity College Pietermaritzburg. [Online]. Available at: Tertiary Students –
 IMAD5112MM.pdf – Default View (sharepoint.com). [Accessed: 18 April 2024].
 */
