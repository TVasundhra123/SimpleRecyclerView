package com.example.exampleclear

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.exampleclear.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CallBack {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mAdapter: ListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listItems: ArrayList<String> = fetchData()

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        mAdapter = ListAdapter(listItems, this)
        binding.recyclerView.adapter = mAdapter


    }

    private fun fetchData(): ArrayList<String> {
          val items = arrayListOf<String>()
          for (i in 0..100) {
               items.add("Item $i" )
          }
        return items
    }

    override fun clickListner(item: String) {
        Toast.makeText(this, "U clicked $item", Toast.LENGTH_LONG).show()
    }
}