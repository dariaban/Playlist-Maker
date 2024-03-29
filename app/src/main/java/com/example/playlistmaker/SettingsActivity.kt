package com.example.playlistmaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        val backButton = findViewById<MaterialButton>(R.id.backButton)
        backButton.setOnClickListener {
            val displayIntent4 = Intent(this, MainActivity::class.java)
            startActivity(displayIntent4)
        }
    }
}