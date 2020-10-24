package com.example.javakomutlar.data.dataManager

import com.example.javakomutlar.data.models.HomeCategoryModel

interface DataManager {
    fun getHomeCategories(serviceCallback: ServiceCallback<HomeCategoryModel>)
}