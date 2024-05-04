package com.example.assignment2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page2 : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // The coding below takes the users from page 2 to the introduction page of different characters they have selected.

        // 5 characters present, meaning 5 different introductions on 5 different activities.

        var percybutton = findViewById<Button>(R.id.percybutton)
        percybutton.setOnClickListener {
            val intent = Intent(this, percyintroduction::class.java)
            startActivity(intent) }


        var dukebutton = findViewById<Button>(R.id.dukebutton)
        dukebutton.setOnClickListener {
            val intent = Intent(this, dukeintroduction::class.java)
            startActivity(intent) }


        var sunnybutton = findViewById<Button>(R.id.sunnybutton)
        sunnybutton.setOnClickListener {
            val intent = Intent(this, sunnyintroduction::class.java)
            startActivity(intent) }


        var harrybutton = findViewById<Button>(R.id.harrybutton)
        harrybutton.setOnClickListener {
            val intent = Intent(this, harryintroduction::class.java)
            startActivity(intent) }


        var cleobutton = findViewById<Button>(R.id.cleobutton)
        cleobutton.setOnClickListener {
            val intent = Intent(this, cleointroduction::class.java)
            startActivity(intent) }

        // Back button to go back to the home splash screen.

        var backbutton1 = findViewById<Button>(R.id.backbutton1)
        backbutton1.setOnClickListener {
            val intent = Intent(this, page1::class.java)
            startActivity(intent) }

    }
}

// Reference:

/* The Independent Institution of Education. (2024). Introduction of Mobile Application Development.
IMAD5112. Varsity College Pietermaritzburg. [Online]. Available at: Tertiary Students –
IMAD5112MM.pdf – Default View (sharepoint.com). [Accessed: 18 April 2024].
*/