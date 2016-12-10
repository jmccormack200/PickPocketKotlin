package com.example.johnmccormick.pickpocketkotlin

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class ClassicActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_classic)
    }

    companion object {

        fun makeIntent(context: Context): Intent {
            return Intent(context, ClassicActivity::class.java)
        }
    }
}
