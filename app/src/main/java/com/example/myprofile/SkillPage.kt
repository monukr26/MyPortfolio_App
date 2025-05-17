package com.example.myprofile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2

class SkillPage : AppCompatActivity() {

    private  lateinit var viewPager : ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_skill_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.skillInfo)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        viewPager = findViewById(R.id.viewPager)

        val viewProject = findViewById<Button>(R.id.viewProject)
        viewProject.setOnClickListener{
            val intent = Intent(this,ProjectPage::class.java)
            startActivity(intent)
        }

        val cardItems = listOf(
            CardItem("Language", "C++\nJava\nKotlin\nJavaScript"),
            CardItem("Development","XML\nJetpack Compose\nHTML\nCSS"),
            CardItem("DataBase", "MySql\nFirebase"),
            CardItem("Library", "Retrofit\nREST API"),
            CardItem("FrameWork","Android Studio\nAndroid SDK\nGradle\nVS Code\nVersion Control"),
            CardItem("CourseWork", "Android App Development\nDSA\nDBMS\nOOPs")

        )

        val adapter = CardAdapter(cardItems)
        viewPager.adapter = adapter

        viewPager.offscreenPageLimit = 1

    }
}