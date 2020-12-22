package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

val countries = arrayOf(Country("in", "India", "New Delhi", R.drawable.`in`),
        Country("fn", "Finland", "Helsinki", R.drawable.fn),
        Country("cn", "China", "Beijing", R.drawable.cn),
        Country("bt", "Bhutan", "Thimphu", R.drawable.`bt`),
        Country("bn", "Bangladesh", "Dhaka", R.drawable.bn),
        Country("bl", "Belgium", "Brussels", R.drawable.bl),
        Country("af", "Afghanistan", "Kabul", R.drawable.afg),
        Country("ind", "Indonesia", "Jakarta", R.drawable.indo),
        Country("ml", "Malaysia", "Kuala Lumpur", R.drawable.ml),
        Country("sl", "Sri Lanka", "Colombo", R.drawable.sl),
        Country("us", "United States", "Washington", R.drawable.us),
        Country("uk", "United Kingdom", "London", R.drawable.uk),
        Country("vt", "Vietnam", "Hanoi", R.drawable.vt),
        Country("uy", "Uruguay", "Montevideo", R.drawable.uy),
        Country("sa", "South Africa", "Cape Town", R.drawable.sa))

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val countryList = findViewById<RecyclerView>(R.id.country_list).apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = CountryAdapter().apply {
                setHasStableIds(true)
            }
            setHasFixedSize(true)
        }
        val showCountries = findViewById<Button>(R.id.show_countries)
        showCountries.setOnClickListener {
            (countryList.adapter as CountryAdapter).countryData = countries
        }
    }
}