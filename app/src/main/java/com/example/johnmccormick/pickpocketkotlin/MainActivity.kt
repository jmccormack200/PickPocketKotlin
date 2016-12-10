package com.example.johnmccormick.pickpocketkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import butterknife.bindView

class MainActivity : AppCompatActivity() {

    val classicButton: Button by bindView(R.id.classic_mode)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)
        classicButton.setOnClickListener({v-> startActivity(ClassicActivity.makeIntent(this))})
    }
}
