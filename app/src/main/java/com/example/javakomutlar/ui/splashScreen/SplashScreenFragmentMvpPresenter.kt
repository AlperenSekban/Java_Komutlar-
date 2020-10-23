package com.example.javakomutlar.ui.splashScreen

import com.example.javakomutlar.ui.base.MvpPresenter

interface SplashScreenFragmentMvpPresenter<V:SplashScreenFragmentMvpView>:MvpPresenter<V> {
fun startWaiting()
}