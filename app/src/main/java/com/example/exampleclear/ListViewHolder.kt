package com.example.exampleclear

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val listItem: TextView = itemView.findViewById(R.id.textView)
    fun bind(item: String) {
        listItem.text = item
    }
}