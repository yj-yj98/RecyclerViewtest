package com.example.recyclerviewtest.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtest.R
import com.example.recyclerviewtest.data.Location

class LocationViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val nameTextView :TextView=view.findViewById(R.id.nameTextView)
    private val latitdeTextView: TextView= view.findViewById(R.id.latitdeTextView)
    private val longitudeTextView : TextView= view.findViewById(R.id.longitudeTextView)

    fun bind(location: Location){
        nameTextView.text = location.name
        latitdeTextView.text = location.latitude.toString()
        longitudeTextView.text = location.longitude.toString()
    }
}