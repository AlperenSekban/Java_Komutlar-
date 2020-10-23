package com.example.javakomutlar.ui.base

import com.example.javakomutlar.data.apiServices.ApiServices
import com.example.javakomutlar.data.dataManager.DataManager
import javax.inject.Inject

open class BasePresenter<V : MvpView> constructor(dataManager:DataManager) : MvpPresenter<V> {
    lateinit var mvpView: V
    var dataManager: DataManager
        @Inject set

    init {
        this.dataManager =dataManager
    }

    override fun onAttact(mvpView: V) {
        this.mvpView = mvpView
    }

    override fun initPresenter() {
    }

}