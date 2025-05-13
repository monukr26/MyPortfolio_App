package com.example.myprofile

import android.content.Intent
import android.icu.text.IDNA.Info
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment

class DashBoard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dash_board)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Dashboard)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val info = findViewById<CardView>(R.id.info)
        val ed = findViewById<CardView>(R.id.education)
        val skill = findViewById<CardView>(R.id.skill)
        val project = findViewById<CardView>(R.id.project)
        val extra = findViewById<CardView>(R.id.extra)
        val achievement = findViewById<CardView>(R.id.achieve)

        info.setOnClickListener{
            navigateToActivity(personalInfo::class.java)
        }

        ed.setOnClickListener{
            navigateToActivity(EducationPage::class.java)
        }

        skill.setOnClickListener {
            navigateToActivity(SkillPage::class.java)
        }

        project.setOnClickListener {
            navigateToActivity(ProjectPage::class.java)
        }

        extra.setOnClickListener {
            navigateToActivity(ExtraPage::class.java)
        }

        achievement.setOnClickListener {
            navigateToActivity(AchievementPage::class.java)
        }
    }

    private fun navigateToActivity (activityClass: Class<*>) {
        val intent = Intent(this, activityClass)
        startActivity(intent)
    }



}