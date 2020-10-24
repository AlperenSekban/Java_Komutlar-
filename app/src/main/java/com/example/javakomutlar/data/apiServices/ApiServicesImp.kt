package com.example.javakomutlar.data.apiServices

import com.example.javakomutlar.data.HomeCategoryServices.HomeCategoryServices
import com.example.javakomutlar.data.dataManager.ServiceCallback
import com.example.javakomutlar.data.models.HomeCategoryModel
import javax.inject.Inject

class ApiServicesImp:ApiServices {
    var homeCategoryServices:HomeCategoryServices
    @Inject
    constructor(homeCategoryServices: HomeCategoryServices){
        this.homeCategoryServices=homeCategoryServices
    }

    override fun getHomeCategory(serviceCallback: ServiceCallback<HomeCategoryModel>) {
        homeCategoryServices.getHomeCategory(serviceCallback)
    }


}