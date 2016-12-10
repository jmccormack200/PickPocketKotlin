package com.example.johnmccormick.pickpocketkotlin.launcher

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import butterknife.bindView
import com.example.johnmccormick.pickpocketkotlin.R
import com.example.johnmccormick.pickpocketkotlin.classic.ClassicActivity
import com.example.johnmccormick.pickpocketkotlin.codebreaker.CodeBreakerActivity

class LauncherActivity : AppCompatActivity(), LauncherContract.View {

    val classicButton: Button by bindView(R.id.classic_mode)
    val localButton: Button by bindView(R.id.code_breaking_mode)
    val onlineButton: Button by bindView(R.id.online_mode)
    lateinit var presenter: LauncherContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)
        presenter = LauncherPresenter(this)

        classicButton.setOnClickListener({v-> presenter.classicButtonClicked()})
        localButton.setOnClickListener({v -> presenter.localButtonClicked()})
        onlineButton.setOnClickListener({v -> presenter.onlineButtonClicked()})
    }

    override fun startClassicActivity() {
        startActivity(ClassicActivity.makeIntent(this))
    }

    override fun startOnlineActivity() {
        startActivity(CodeBreakerActivity.makeIntent(this));
    }

    override fun startLocalActivity() {
        startActivity(CodeBreakerActivity.makeIntent(this));
    }
}
