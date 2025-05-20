package com.example.myprofile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProjectAdapter(private val project:List<projectContent>):
RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder>() {
    class ProjectViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val projectImage : ImageView = itemView.findViewById(R.id.imageView)
        val projectTitle : TextView = itemView.findViewById(R.id.projectTitle)
        val projectSkill : TextView = itemView.findViewById(R.id.projectSkills)
        val projectDescription : TextView = itemView.findViewById(R.id.projectdesc)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.projectlist,parent,false)
        return ProjectAdapter.ProjectViewHolder(view)

    }

    override fun getItemCount(): Int = project.size

    override fun onBindViewHolder(holder: ProjectViewHolder, position: Int) {
        val project = project[position]
        holder.projectTitle.text = project.title
        holder.projectSkill.text = project.skills
        holder.projectDescription.text = project.description

        holder.projectImage.setImageResource(project.image)

    }


}