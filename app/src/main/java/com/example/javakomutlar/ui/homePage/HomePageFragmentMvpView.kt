package com.example.javakomutlar.ui.homePage

import com.example.javakomutlar.data.models.HomeCategoryModel
import com.example.javakomutlar.ui.base.MvpView

interface HomePageFragmentMvpView:MvpView {
    fun loadDataCategorylist(response: HomeCategoryModel?)
}
