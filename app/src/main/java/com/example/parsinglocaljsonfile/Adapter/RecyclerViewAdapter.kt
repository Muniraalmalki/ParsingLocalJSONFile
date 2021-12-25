package com.example.parsinglocaljsonfile.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.parsinglocaljsonfile.Activity.MainActivity2
import com.example.parsinglocaljsonfile.Nasa
import com.example.parsinglocaljsonfile.databinding.ItemRowBinding

class RecyclerViewAdapter(private val activity: MainActivity2, private val nasaList:ArrayList<Nasa>): RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder>() {
    class ItemViewHolder(val binding: ItemRowBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return  ItemViewHolder(ItemRowBinding.inflate(
            LayoutInflater.from(parent.context)
            , parent,
            false))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val nasa = nasaList[position]
        holder.binding.apply {
            imageTitle.text = nasa.title
            tvDate.text = nasa.date
            Glide.with(activity).load(nasa.url).override(400,300).into(imageIv)
        }

    }

    override fun getItemCount(): Int {
        return nasaList.size
    }
}