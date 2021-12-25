package com.example.parsinglocaljsonfile.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.parsinglocaljsonfile.R


class MainActivity : AppCompatActivity() {

//    private lateinit var recyclerView: RecyclerView
//    private lateinit var recyclerViewAdapter: RecyclerViewAdapter


    private lateinit var start:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start = findViewById(R.id.startButton)
        start.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }


//        recyclerView = findViewById(R.id.recyclerView)
//
//        val json = getJSONFromAssets(this, "Data.json")
//        val jsonArray = JSONArray(json)
//        val nasaList = arrayListOf<Nasa>()
//
//        recyclerViewAdapter = RecyclerViewAdapter(this,nasaList)
//        recyclerView.adapter = recyclerViewAdapter
//        recyclerView.layoutManager = GridLayoutManager(this,2)
//
//        for (i in 0 until jsonArray.length()) {
//            val title = jsonArray.getJSONObject(i).getString("title")
//            val url = jsonArray.getJSONObject(i).getString("url")
//            val date = jsonArray.getJSONObject(i).getString("date")
//            nasaList.add(Nasa(date,title, url))
//        }

    }

    //Method to load the JSON from the Assets file and return the object

//    private fun getJSONFromAssets(context: Context,fileName: String): String? {
//        val jsonString:String
//        try {
//             jsonString = context.assets.open(fileName).bufferedReader().use {
//                it.readText()
//            }
//        }catch (ioException:IOException){
//            ioException.printStackTrace()
//            return null
//        }
//        return jsonString
//
//    }
}


