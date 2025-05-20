package com.example.myprofile

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProjectPage : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ProjectAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_project_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.projectInfo)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        recyclerView = findViewById(R.id.projectitem)

        val project = listOf(
            projectContent("Blood Donation App", "Skills : Android Studio, Kotlin, XML, Firebase, Gradle, API","Description : Connect donors with those in need. Find nearby blood donation camps, request or donate blood, and save lives with just a few taps.",R.drawable.blooddrop),
            projectContent("PortFolio App", "Skills : Android Studio, Kotlin, XML, Gradle","Description : Create, manage, and customize your personal or professional profile in one easy-to-use app. Showcase your identity, skills, and achievements—all in one place.",
                R.drawable.profilep
            ),
            projectContent("ImageToText Converter", "Skills : Android Studio, Kotlin, Android ML Kit, XML","Description : Easily extract text from images with Image to Text Converter. Capture printed or handwritten text from photos, documents, or screenshots and convert it into editable, shareable digital text in seconds.",
                R.drawable.scan
            ),
            projectContent("News App", "Skills : Android SDK, Kotlin, Jetpack Compose, API","Description : Quickly scan and convert newspaper clippings, articles, or headlines into editable text. Stay informed by turning printed news into digital content you can save, share, or search instantly.",
                R.drawable.newsreport
            )
        )

        adapter = ProjectAdapter(project)
        recyclerView.layoutManager = GridLayoutManager(this, 1)
        recyclerView.adapter = adapter
    }
}