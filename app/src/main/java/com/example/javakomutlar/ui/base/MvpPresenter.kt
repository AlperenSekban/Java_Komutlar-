package com.example.javakomutlar.ui.base

interface MvpPresenter<V:MvpView> {
    fun onAttact(mvpView: V)
    fun initPresenter()
}