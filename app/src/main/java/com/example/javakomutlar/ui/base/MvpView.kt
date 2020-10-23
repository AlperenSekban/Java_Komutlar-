package com.example.javakomutlar.ui.base

import androidx.fragment.app.Fragment

interface MvpView {
    fun getInstance(): Fragment
    fun showLoading()
    fun hideLoading()
    fun showError(string: String)
    fun goNextFragment(fragment: Fragment)
}