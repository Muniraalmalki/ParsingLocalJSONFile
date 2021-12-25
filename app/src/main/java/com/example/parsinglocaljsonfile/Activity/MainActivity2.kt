package com.example.parsinglocaljsonfile.Activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.parsinglocaljsonfile.Nasa
import com.example.parsinglocaljsonfile.R
import com.example.parsinglocaljsonfile.Adapter.RecyclerViewAdapter
import org.json.JSONArray
import java.io.IOException


class MainActivity2 : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerViewAdapter: RecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        recyclerView = findViewById(R.id.recyclerView)

        val json = getJSONFromAssets(this, "Data.json")
        val jsonArray = JSONArray(json)
        val nasaList = arrayListOf<Nasa>()

        recyclerViewAdapter = RecyclerViewAdapter(this,nasaList)
        recyclerView.adapter = recyclerViewAdapter
        recyclerView.layoutManager = GridLayoutManager(this,2)

        for (i in 0 until jsonArray.length()) {
            val title = jsonArray.getJSONObject(i).getString("title")
            val url = jsonArray.getJSONObject(i).getString("url")
            val date = jsonArray.getJSONObject(i).getString("date")
            nasaList.add(Nasa(title, url ,date))
        }

    }

    //Method to load the JSON from the Assets file and return the object

    private fun getJSONFromAssets(context: Context,fileName: String): String? {
        val jsonString:String
        try {
            jsonString = context.assets.open(fileName).bufferedReader().use {
                it.readText()
            }
        }catch (ioException:IOException){
            ioException.printStackTrace()
            return null
        }
        return jsonString
    }

}


