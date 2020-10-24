package com.example.javakomutlar.ui.homePage

import com.example.javakomutlar.ui.base.MvpPresenter

interface HomePageFragmentMvpPresenter<V:HomePageFragmentMvpView>:MvpPresenter<V>{
    fun takeData()
}