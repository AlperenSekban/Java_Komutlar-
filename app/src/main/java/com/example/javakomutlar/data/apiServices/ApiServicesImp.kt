package com.example.javakomutlar.data.apiServices

import com.example.javakomutlar.data.homeCategoryServices.HomeCategoryServices
import com.example.javakomutlar.data.dataManager.ServiceCallback
import com.example.javakomutlar.data.models.HomeCategoryModel
import com.example.javakomutlar.data.models.SubCategoryModel
import com.example.javakomutlar.data.subCategoryServices.SubCategoryServices
import javax.inject.Inject

class ApiServicesImp:ApiServices {
    var homeCategoryServices:HomeCategoryServices
    var subCategoryServices:SubCategoryServices
    @Inject
    constructor(homeCategoryServices: HomeCategoryServices,subCategoryServices:SubCategoryServices){
        this.homeCategoryServices=homeCategoryServices
        this.subCategoryServices=subCategoryServices
    }

    override fun getHomeCategory(serviceCallback: ServiceCallback<HomeCategoryModel>) {
        homeCategoryServices.getHomeCategory(serviceCallback)
    }

    override fun getSubCategory( url: String,serviceCallback: ServiceCallback<SubCategoryModel>) {
        subCategoryServices.getSubCategory(url, serviceCallback)
    }


}