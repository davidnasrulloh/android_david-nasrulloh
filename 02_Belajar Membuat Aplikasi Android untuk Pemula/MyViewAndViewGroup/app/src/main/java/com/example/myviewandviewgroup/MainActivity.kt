package com.example.myviewandviewgroup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Google Pixel"

        val btnMoveConstraint:Button = findViewById(R.id.btn_move_constraint)
        btnMoveConstraint.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_move_constraint -> {
                val moveIntent = Intent(this@MainActivity, ConstraintPage::class.java)
                startActivity(moveIntent)
            }
        }
    }
}