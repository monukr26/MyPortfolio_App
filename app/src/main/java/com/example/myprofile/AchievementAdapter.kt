package com.example.myprofile

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AchievementAdapter(private val achievement: List<Achievement>) :
    RecyclerView.Adapter<AchievementAdapter.AchievementViewHolder>()
{
    class AchievementViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val title : TextView = itemView.findViewById(R.id.certTitle)
        val subject : TextView = itemView.findViewById(R.id.certSubject)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AchievementViewHolder {
       val view = LayoutInflater.from(parent.context)
           .inflate(R.layout.achievementitems,parent,false)
        return AchievementViewHolder(view)
    }

    override fun getItemCount() =
        achievement.size



    override fun onBindViewHolder(holder: AchievementViewHolder, position: Int) {
        val achievement = achievement[position]
        holder.title.text = achievement.title
        holder.subject.text = achievement.subject
        holder.imageView.setImageResource(achievement.imageRes)

        holder.itemView.setOnClickListener {
            showImageDialog(holder.imageView.context, achievement.certificateItem)
        }

    }

    private fun showImageDialog(context: Context, imageRes: Int) {
        val dialog = Dialog(context)
         dialog.setContentView(R.layout.achdailogimg)

        val imageView = dialog.findViewById<ImageView>(R.id.imaged)
        imageView.setImageResource(imageRes)
        dialog.show()

    }

}