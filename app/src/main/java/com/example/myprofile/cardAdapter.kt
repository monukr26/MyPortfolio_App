package com.example.myprofile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CardAdapter (private val items: List<CardItem>) :
    RecyclerView.Adapter<CardAdapter.CardViewHolder>(){
    class CardViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.text1)
        val contentView: TextView = view.findViewById(R.id.content)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cardlist, parent, false)
        return CardViewHolder(view)

    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val item = items[position]
        holder.textView.text = item.title
        holder.contentView.text = item.content


    }

    override fun getItemCount(): Int =
        items.size



}
