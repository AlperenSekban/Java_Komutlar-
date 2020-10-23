package com.example.javakomutlar.data.dataManager

import com.example.javakomutlar.data.apiServices.ApiServices
import javax.inject.Inject

class DataManagerImp : DataManager {
    lateinit var apiServices: ApiServices

    @Inject
    constructor(apiServices: ApiServices) {
        this.apiServices = apiServices

    }
}