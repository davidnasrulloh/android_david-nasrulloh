package com.example.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class DetailHeroes : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_heroes)

        val tvDetailHeroes: TextView = findViewById (R.id.tv_heroes_detail)

//        val data = intent.getStringExtra(EXTRA_NAME)

        val data = intent.getParcelableExtra<Hero>("DATA")
//         Log.d("Detail Data", data?.name.toString())
        val text = "Detail Data $data"
        tvDetailHeroes.text = text

    }


}