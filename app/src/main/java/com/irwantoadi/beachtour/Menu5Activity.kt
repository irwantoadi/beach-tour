package com.irwantoadi.beachtour

import android.R.layout.simple_list_item_1
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView

class Menu5Activity : AppCompatActivity() {
    lateinit var listView: ListView
    lateinit var searchView: SearchView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu5)

        var arrayList = (listOf(
            "Pantai Kartini",
            "Pantai Tirta Samudra",
            "Pantai Bondo",
            "Pantai Blebak",
            "Pantai Mang Abang"))



        listView = findViewById(R.id.list_view)

        searchView = findViewById(R.id.search)
        searchView.isActivated = true
        searchView.onActionViewExpanded()
        searchView.clearFocus()
        listView.adapter = ArrayAdapter(this, simple_list_item_1, arrayList)
        listView.visibility = View.GONE

        searchView.setOnClickListener {
            listView.adapter = ArrayAdapter(this, simple_list_item_1, arrayList)
            listView.visibility = View.VISIBLE
        }

        searchView.setOnSearchClickListener {
            listView.adapter = ArrayAdapter(this, simple_list_item_1, arrayList)
            listView.visibility = View.VISIBLE
        }

        listView.setOnItemClickListener { parent, view, position, id ->
            listView.visibility = View.GONE
        }

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
//                listView.visibility = View.GONE
//                listView.adapter = null
                listView.visibility = View.GONE
                return false
            }

            override fun onQueryTextChange(newText: String): Boolean {
//                var newArray = arrayList.filter { name -> name.contains(newText) }
//                listView.adapter = ArrayAdapter(this, simple_list_item_1, newArray)
                listView.visibility = View.VISIBLE
                return false
            }

        })
    }
}