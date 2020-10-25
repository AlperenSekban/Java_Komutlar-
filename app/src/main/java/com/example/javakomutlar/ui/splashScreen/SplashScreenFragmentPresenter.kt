package com.example.javakomutlar.ui.splashScreen

import com.example.javakomutlar.data.dataManager.DataManager
import com.example.javakomutlar.ui.base.BasePresenter
import com.example.javakomutlar.ui.homePage.HomeFragment
import com.example.javakomutlar.utility.splashScreenSleepTime
import javax.inject.Inject

class SplashScreenFragmentPresenter<V : SplashScreenFragmentMvpView>
@Inject constructor(dataManager: DataManager) : BasePresenter<V>(dataManager),
    SplashScreenFragmentMvpPresenter<V> {
    override fun initPresenter() {
        super.initPresenter()
        startWaiting()
    }

    override fun startWaiting() {
        val thread: Thread = object : Thread() {
            override fun run() {
                try {
                    sleep(splashScreenSleepTime)
                    mvpView.goNextFragment(HomeFragment.getInstance())
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }

        }
        thread.start()
    }
}