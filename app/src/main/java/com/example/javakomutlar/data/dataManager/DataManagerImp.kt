package com.example.javakomutlar.data.dataManager

import com.example.javakomutlar.data.apiServices.ApiServices
import com.example.javakomutlar.data.models.HomeCategoryModel
import com.example.javakomutlar.data.models.SubCategoryModel
import javax.inject.Inject

class DataManagerImp : DataManager {
    lateinit var apiServices: ApiServices

    @Inject
    constructor(apiServices: ApiServices) {
        this.apiServices = apiServices

    }

    override fun getHomeCategories(serviceCallback: ServiceCallback<HomeCategoryModel>) {
        apiServices.getHomeCategory(serviceCallback)
    }

    override fun getSubCategories(url: String,serviceCallback: ServiceCallback<SubCategoryModel>) {
        apiServices.getSubCategory(url,serviceCallback)
    }
}