package com.example.view_pager2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private var title:List<String>,private var details:List<String>,private var images:List<String>):RecyclerView.Adapter<MyAdapter.Pager2ViewHolder>() {

    inner class Pager2ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        val itemtitle:TextView = itemView.findViewById(R.id.tvtitle)
        val itemDetails:TextView = itemView.findViewById(R.id.tvabout)
        val itemtimage:ImageView = itemView.findViewById(R.id.tvimage)
        init {
            itemtimage.setOnClickListener { v:View->
                val position= adapterPosition
                Toast.makeText(itemView.context,"you click item",Toast.LENGTH_LONG).show()
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.Pager2ViewHolder {
        var pg = Pager2ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_page,parent,false))
        return pg
    }

    override fun onBindViewHolder(holder: Pager2ViewHolder, position: Int) {

        holder.itemtitle.text = title[position]
        holder.itemDetails.text = details[position]
        holder.itemtimage.setImageResource(images[position].toInt())
        
    }

    override fun getItemCount(): Int {
        return title.size
    }
}