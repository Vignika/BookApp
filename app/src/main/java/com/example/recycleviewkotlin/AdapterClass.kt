package com.example.recycleviewkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.currentCoroutineContext

class AdapterClass (private val dataList:ArrayList<DataClass>): RecyclerView.Adapter<AdapterClass.ViewHolderClass>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return ViewHolderClass(itemView)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem=dataList[position]
        holder.rvTitle.text=currentItem.dataTile
    }
    class ViewHolderClass(itemView: View):RecyclerView.ViewHolder(itemView) {

        var rvTitle:TextView=itemView.findViewById(R.id.title)
    }

}