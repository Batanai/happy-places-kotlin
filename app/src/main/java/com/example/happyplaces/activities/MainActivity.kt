package com.example.happyplaces.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.happyplaces.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fabAddHappyPlace = findViewById<FloatingActionButton>(R.id.fabAddHappyPlace)


        fabAddHappyPlace.setOnClickListener{
            val intent =  Intent(this, AddHappyPlaceActivity::class.java)
            startActivity(intent)
        }
    }
}
