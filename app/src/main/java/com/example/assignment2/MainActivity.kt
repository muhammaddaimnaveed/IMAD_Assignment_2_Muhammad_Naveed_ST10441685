package com.example.assignment2

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

// This code delays the loading screens automatic transition to the home splash screen by 10 second.

        val DELAY_TIME: Long = 10000
        Handler().postDelayed({
            val intent = Intent(this, page1::class.java)
            startActivity(intent)
            finish() }, DELAY_TIME)
        j
    }
}

// Reference:

 /* The Independent Institution of Education. (2024). Introduction of Mobile Application Development.
 IMAD5112. Varsity College Pietermaritzburg. [Online]. Available at: Tertiary Students –
 IMAD5112MM.pdf – Default View (sharepoint.com). [Accessed: 18 April 2024].
 */
