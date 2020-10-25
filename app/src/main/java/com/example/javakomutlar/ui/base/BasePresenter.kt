package com.example.javakomutlar.ui.base

import android.content.Context
import com.example.javakomutlar.data.dataManager.DataManager
import com.example.javakomutlar.utility.key
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

    override fun setDetailFragment(position: String?, requireContext: Context) {

    }

    override fun setSubCategoryFragment(url: String?, requireContext: Context) {

    }

    override fun setAboutUsFragment(position: String?, requireContext: Context) {

    }

}