package com.prox.demokolingst.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.prox.demokolingst.databinding.ItemPostBinding
import com.prox.demokolingst.model.Music

class MusicAdapter : RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {

    var mList = arrayListOf<Music>()

    class MusicViewHolder (binding: ItemPostBinding): RecyclerView.ViewHolder(binding.root){
        val binding: ItemPostBinding
        init {
            this.binding = binding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val binding =
            ItemPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MusicViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        val music = mList[position]

        holder.binding.itemTitle.text = music.name
        holder.binding.itemDetail.text = music.audio
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}