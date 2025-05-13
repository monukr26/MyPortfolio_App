package com.example.myprofile

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    @SuppressLint("QueryPermissionsNeeded")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn = findViewById<Button>(R.id.nextButton)
        val card1 = findViewById<CardView>(R.id.card1)
        val card2 = findViewById<CardView>(R.id.card2)
        val card3 = findViewById<CardView>(R.id.card3)

        btn.setOnClickListener {
            val intent = Intent(this, DashBoard::class.java)
            startActivity(intent)
        }

        card1.setOnClickListener{
            val linkdnUrl = "https://www.linkedin.com/in/monu-kumar-a91763256"
            val linkdnAppUrl = "https://www.linkedin.com/in/monu-kumar-a91763256"

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(linkdnAppUrl))
            if(intent.resolveActivity(packageManager)!=null){
                startActivity(intent)
            } else{
                startActivity(intent.setData(Uri.parse(linkdnUrl)))
            }


        }

        card2.setOnClickListener{
            val leetCodeUrl = "https://leetcode.com/u/monukr26"
            val leetCodeAppUrl = "https://leetcode.com/u/monukr26"

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(leetCodeAppUrl))
            if(intent.resolveActivity(packageManager)!=null){
                startActivity(intent)
            } else{
                startActivity(intent.setData(Uri.parse(leetCodeUrl)))
            }


        }

        card3.setOnClickListener{
            val gitHubUrl = "https://github.com/monukr26"
            val gitHubAppUrl = "https://github.com/monukr26"

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(gitHubAppUrl))
            if(intent.resolveActivity(packageManager)!=null){
                startActivity(intent)
            } else{
                startActivity(intent.setData(Uri.parse(gitHubUrl)))
            }


        }


    }
}