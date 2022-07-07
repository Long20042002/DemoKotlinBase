package com.prox.demokolingst

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.prox.demokolingst.databinding.CardLayoutBinding

class AdapterRecycler(
                    private val callback: ItemClickListPhuongTien
                      ): RecyclerView.Adapter<AdapterRecycler.ViewHolder>() {

     var mList= arrayListOf<PhuongTien>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterRecycler.ViewHolder {
        val binding =
            CardLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val phuongTien = mList[position]
        holder.binding.itemImage.setImageResource(R.drawable.ic_launcher_foreground)
        holder.binding.itemTitle.text = phuongTien.ten
        holder.binding.itemDetail.text = phuongTien.mau

        holder.binding.cardView.setOnClickListener{
            callback.itemClickToDetail(phuongTien)
        }

        holder.binding.ibUpdate.setOnClickListener {
            callback.updateItem(phuongTien)
        }

        holder.binding.ibDelete.setOnClickListener {
            callback.deleteItem(phuongTien)
        }
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    inner class ViewHolder(binding: CardLayoutBinding): RecyclerView.ViewHolder(binding.root){
            val binding: CardLayoutBinding

            init {
                this.binding = binding
            }
    }
}