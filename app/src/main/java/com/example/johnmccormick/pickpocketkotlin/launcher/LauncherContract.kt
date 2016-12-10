package com.example.johnmccormick.pickpocketkotlin.launcher

interface LauncherContract {
    interface View {
        fun startClassicActivity()
        fun startOnlineActivity()
        fun startLocalActivity()
    }

    interface Presenter {
        fun classicButtonClicked()
        fun onlineButtonClicked()
        fun localButtonClicked()
    }
}