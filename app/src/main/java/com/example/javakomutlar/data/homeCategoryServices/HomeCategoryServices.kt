package com.example.javakomutlar.data.homeCategoryServices

import com.example.javakomutlar.data.dataManager.ServiceCallback
import com.example.javakomutlar.data.models.HomeCategoryModel

interface HomeCategoryServices {

    fun getHomeCategory(serviceCallback: ServiceCallback<HomeCategoryModel>)
}