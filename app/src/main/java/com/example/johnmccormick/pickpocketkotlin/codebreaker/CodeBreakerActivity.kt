package com.example.johnmccormick.pickpocketkotlin.codebreaker

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.johnmccormick.pickpocketkotlin.R

class CodeBreakerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code_breaker)
    }

    companion object{
        fun makeIntent(context: Context): Intent {
            return Intent(context, CodeBreakerActivity::class.java)
        }
    }
}