package com.example.javakomutlar.data.HomeCategoryServices

import com.example.javakomutlar.data.dataManager.ServiceCallback
import com.example.javakomutlar.data.models.HomeCategoryModel

interface HomeCategoryServices {

    fun getHomeCategory(serviceCallback: ServiceCallback<HomeCategoryModel>)
}