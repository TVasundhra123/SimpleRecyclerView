package com.example.exampleclear

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val items: ArrayList<String>, private val listener: CallBack): RecyclerView.Adapter<ListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val currentItem = items[position]
        holder.bind(currentItem)
        holder.listItem.setOnClickListener {
            listener.clickListner(currentItem)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

interface CallBack {
    fun clickListner(item: String)
}