package com.example.recyclerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtest.adapter.LocationAdapter
import com.example.recyclerviewtest.data.Location
import com.example.recyclerviewtest.data.createRealJejuLocationData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycle_exam)

        val recyclerView:RecyclerView = findViewById(R.id.recyclerView2)

        recyclerView.layoutManager = LinearLayoutManager(this)


        val locationAdapter = LocationAdapter(sampleLoction)
        recyclerView.adapter = locationAdapter

    }
}

val sampleLoction = createRealJejuLocationData()