package com.example.javakomutlar.ui.base

import android.content.Context

interface MvpPresenter<V:MvpView> {
    fun onAttact(mvpView: V)
    fun initPresenter()
    fun setDetailFragment(position: String?)
    fun setSubCategoryFragment(position: String?)
    fun setAboutUsFragment(position: String?)
}