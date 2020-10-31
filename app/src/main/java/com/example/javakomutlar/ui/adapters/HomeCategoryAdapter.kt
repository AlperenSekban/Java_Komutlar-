package com.example.javakomutlar.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.javakomutlar.R
import com.example.javakomutlar.data.models.HomeCategoryModel

class HomeCategoryAdapter(val context: Context, val sendId: SendId) :
    RecyclerView.Adapter<HomeCategoryAdapter.Define>() {

    lateinit var liste: HomeCategoryModel


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeCategoryAdapter.Define {
        val categoryLayout =
            LayoutInflater.from(context).inflate(R.layout.homelayout, parent, false)
        return Define(categoryLayout)
    }

    override fun onBindViewHolder(holder: HomeCategoryAdapter.Define, position: Int) {
        val category = liste.documents
        holder.categoryTitle.text = category?.get(position)?.fields?.title?.stringValue
    }

    override fun getItemCount(): Int {
        return liste.documents!!.size
    }

    fun setData(liste: HomeCategoryModel) {
        this.liste = liste
        notifyDataSetChanged()
    }

    inner class Define(itemview: View) : RecyclerView.ViewHolder(itemview) {
        var categoryTitle: TextView

        init {
            categoryTitle = itemview.findViewById(R.id.layouthome_textView)
            itemview.setOnClickListener({
                sendId.onItemClick(adapterPosition)
            })
        }

    }
}