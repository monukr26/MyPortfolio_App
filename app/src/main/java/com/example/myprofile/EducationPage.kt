package com.example.myprofile

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EducationPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_education_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.eduInfo)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val result10th = findViewById<Button>(R.id.matric)
        val result12th = findViewById<Button>(R.id.inter)
        val resultBtech = findViewById<Button>(R.id.btech)

        result10th.setOnClickListener {
            val dailogView = layoutInflater.inflate(R.layout.matric, null)
            val dailogBuilder = android.app.AlertDialog.Builder(this)
            dailogBuilder.setView(dailogView)
            dailogBuilder.setCancelable(true)
            val dailog = dailogBuilder.create()
            dailog.show()
        }

        result12th.setOnClickListener {
            val dailogView = layoutInflater.inflate(R.layout.inter, null)
            val dailogBuilder = android.app.AlertDialog.Builder(this)
            dailogBuilder.setView(dailogView)
            dailogBuilder.setCancelable(true)
            val dailog = dailogBuilder.create()
            dailog.show()
        }

        resultBtech.setOnClickListener {
            val dailogView = layoutInflater.inflate(R.layout.btech, null)
            val dailogBuilder = android.app.AlertDialog.Builder(this)
            dailogBuilder.setView(dailogView)
            dailogBuilder.setCancelable(true)
            val dailog = dailogBuilder.create()
            dailog.show()
        }
    }
}