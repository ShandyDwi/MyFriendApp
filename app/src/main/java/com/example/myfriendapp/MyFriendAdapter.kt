package com.example.myfriendapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyFriendAdapter(private val context: Context, private val items: ArrayList<MyFriend>) :
    RecyclerView.Adapter<MyFriendAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder( LayoutInflater.from(context).inflate(R.layout.myfriend_item, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        holder.bindItem(items.get(position))
    }
    override fun getItemCount(): Int = items.size
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private var textFriendName: TextView = itemView.findViewById(R.id.txtFriendName)
        private var textFriendEmail: TextView = itemView.findViewById(R.id.txtFriendEmail)
        private var textFriendTelp: TextView = itemView.findViewById(R.id.txtFriendTelp)

        fun bindItem(item: MyFriend) {
            textFriendName.text = item.nama
            textFriendEmail.text = item.email
            textFriendTelp.text = item.telp

        }


    }


}