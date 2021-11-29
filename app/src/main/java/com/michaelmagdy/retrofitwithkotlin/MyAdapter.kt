package com.michaelmagdy.retrofitwithkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_item.view.*

class MyAdapter(val context: Context, val userList: List<MyDataItem>):
               RecyclerView.Adapter<MyAdapter.ViewHolder>() {


    class ViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView) {

        var userId: TextView
        var title: TextView

        init {

            userId = itemView.userId
            title = itemView.title
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.row_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.userId.text = userList[position].userId.toString()
        holder.title.text = userList[position].title
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}