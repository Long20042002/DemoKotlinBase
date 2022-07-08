package com.prox.demokolingst.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.prox.demokolingst.api.MyDataItem
import com.prox.demokolingst.callback.ItemClickPost
import com.prox.demokolingst.databinding.ItemPostBinding

class AdapterPost (
    private val callback: ItemClickPost) : RecyclerView.Adapter<AdapterPost.PostViewHolder>(){

    var mList = arrayListOf<MyDataItem>()

    class PostViewHolder(binding: ItemPostBinding): RecyclerView.ViewHolder(binding.root) {
        val biding: ItemPostBinding

        init {
            this.biding = binding
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val binding = ItemPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PostViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = mList[position]

        holder.biding.itemDetail.text = post.title + post.body
        holder.biding.itemTitle.text = post.id.toString() + post.userId.toString()
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}