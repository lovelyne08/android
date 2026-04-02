package com.lovelyne.chui_wellnessapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
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

//        healthy recipe intent
//        finding the views from the layout using their ids

//        creating a variable to store the buttons

        val recipe=findViewById<Button>(R.id.recipy)
//        set on click listener
        recipe.setOnClickListener{
//            write your intents
            val recipeIntent= Intent(applicationContext, HealthyRecipes::class.java)
            startActivity(recipeIntent)
        }

//        nutrition intent

        val nutrition=findViewById<Button>(R.id.nutrition)

        nutrition.setOnClickListener {

            val nutritionIntent= Intent(applicationContext, NutritionAdvice::class.java)
            startActivity(nutritionIntent)
        }

//        meditation intent

        val meditation=findViewById<Button>(R.id.meditation)

        meditation.setOnClickListener {
            val meditationIntent= Intent(applicationContext,Meditation::class.java)
            startActivity(meditationIntent)
        }

    }
}