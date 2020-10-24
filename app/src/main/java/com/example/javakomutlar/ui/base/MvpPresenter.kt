package com.example.javakomutlar.ui.base

import android.content.Context

interface MvpPresenter<V:MvpView> {
    fun onAttact(mvpView: V)
    fun initPresenter()
    fun setDetailFragment(position: String?, requireContext: Context)
    fun setSubCategoryFragment(position: String?, requireContext: Context)
    fun setAboutUsFragment(position: String?, requireContext: Context)
}