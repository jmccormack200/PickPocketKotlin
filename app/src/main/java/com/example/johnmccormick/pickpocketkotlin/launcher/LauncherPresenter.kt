package com.example.johnmccormick.pickpocketkotlin.launcher

class LauncherPresenter constructor(val view: LauncherContract.View): LauncherContract.Presenter {

    override fun localButtonClicked() {
        view.startLocalActivity()
    }

    override fun onlineButtonClicked() {
        view.startOnlineActivity()
    }

    override fun classicButtonClicked() {
        view.startClassicActivity()
    }
}
