package com.example.javakomutlar.data.dataManager

import com.example.javakomutlar.data.models.HomeCategoryModel
import com.example.javakomutlar.data.models.SubCategoryModel

interface DataManager {
    fun getHomeCategories(serviceCallback: ServiceCallback<HomeCategoryModel>)
    fun getSubCategories(url: String,serviceCallback: ServiceCallback<SubCategoryModel>)
}