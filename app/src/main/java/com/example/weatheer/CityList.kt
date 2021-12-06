package com.example.weatheer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class CityList : AppCompatActivity() {
    lateinit var list:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_list)
        var cityNames = arrayOf(
            "Moscow",
            "Yoshkar-Ola",
            "London",
            "Paris",
            "Tokyo",
            "Rome",
            "New York",
            "Kyiv"


        )
        list = findViewById<ListView>(R.id.city)
        list.adapter = ArrayAdapter(
            this,
            R.layout.cityyy, cityNames
        )

        list.setOnItemClickListener { parent, view, position, id ->
            val cityName = cityNames[position]

// запоминаем выбранное название города в параметрах
            val newIntent = Intent()
            newIntent.putExtra("cityName", cityName)
            setResult(RESULT_OK, newIntent)

// заверщаем текущий activity
            finish();
        }
    }
}