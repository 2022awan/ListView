package com.example.latihan;

import android.view.View;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;

import kotlin.collections.List;

class AdapterList (private val itemList: List<itemList>):RecyclerView.Adapter<AdapterList.ViewHolder>(){

class ViewHolder (@NonNull itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.item_image)
        val judul: TextView = itemView.findViewById(R.id.title)
        val subJudul: TextView = itemView.findViewById(R.id.sub_title)

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterList.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_data, parent, false)
        return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: AdapterList.ViewHolder, position: Int) {
        val item = itemList[position]
        holder.judul.text = item.judul
        holder.subJudul.text = item.subJudul
        Glide.with(holder.imageView.context).load(item.imageUrl).into(holder.imageView)
        }

        override fun getItemCount(): Int {
        return itemList.size
        }

        }