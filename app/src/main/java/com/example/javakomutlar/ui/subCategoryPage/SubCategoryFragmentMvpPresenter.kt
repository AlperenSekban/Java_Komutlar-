package com.example.javakomutlar.ui.subCategoryPage

import com.example.javakomutlar.ui.base.MvpPresenter

interface SubCategoryFragmentMvpPresenter <V:SubCategoryFragmentMvpView>:MvpPresenter<V>{
    fun getSubCategory(url: String)
}