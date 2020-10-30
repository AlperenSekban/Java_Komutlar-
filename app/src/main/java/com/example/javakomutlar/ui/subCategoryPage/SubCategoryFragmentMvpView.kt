package com.example.javakomutlar.ui.subCategoryPage

import com.example.javakomutlar.data.models.SubCategoryModel
import com.example.javakomutlar.ui.base.MvpView

interface SubCategoryFragmentMvpView:MvpView {
    fun takeUrl(): String
    fun loadDateCategorylist(response: SubCategoryModel?)
}