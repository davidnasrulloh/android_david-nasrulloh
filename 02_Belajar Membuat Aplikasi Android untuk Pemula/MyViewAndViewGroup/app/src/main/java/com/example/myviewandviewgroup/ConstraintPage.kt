package com.example.myviewandviewgroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ConstraintPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_page)

        supportActionBar?.title = "Google Pixcel : Constraint"
    }
}