package com.example.javakomutlar.data.subCategoryServices

import com.example.javakomutlar.data.dataManager.ServiceCallback
import com.example.javakomutlar.data.models.SubCategoryModel

interface SubCategoryServices {

    fun getSubCategory(url: String,serviceCallback: ServiceCallback<SubCategoryModel>)
}