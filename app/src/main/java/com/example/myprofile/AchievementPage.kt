package com.example.myprofile

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AchievementPage : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: AchievementAdapter
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_achievement_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.achInfo)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        recyclerView = findViewById(R.id.achievementRv)


        val achievement = listOf(
            Achievement("Certification",R.drawable.dsa,"DSA(C++)", R.drawable.cpp) ,
            Achievement("Certification",R.drawable.dsa,"JavaScript", R.drawable.js),
            Achievement("Certification",R.drawable.dsa,"Data Analytics", R.drawable.data),
            Achievement("LeetCode",R.drawable.dsa,"50 Days Badge 2025", R.drawable.star),
            Achievement("LeetCode",R.drawable.dsa,"100 Days Badge 2025", R.drawable.ribbon),
            Achievement("LeetCode",R.drawable.dsa,"50 Days Badge 2024", R.drawable.star),
            Achievement("Certification",R.drawable.dsa,"C Programming", R.drawable.c)

        )

        adapter = AchievementAdapter(achievement)

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter


    }


}

