package com.example.javakomutlar.di

import com.example.javakomutlar.data.HomeCategoryServices.HomeCategoryServices
import com.example.javakomutlar.data.HomeCategoryServices.HomeCategoryServicesImp
import com.example.javakomutlar.data.apiServices.ApiServices
import com.example.javakomutlar.data.apiServices.ApiServicesImp
import com.example.javakomutlar.data.apiServices.RetrofitClient
import com.example.javakomutlar.data.dataManager.DataManager
import com.example.javakomutlar.data.dataManager.DataManagerImp
import dagger.Module
import dagger.Provides

@Module
class DataModules {
    @Provides
    fun provideRetrofitClient(): RetrofitClient {
        return RetrofitClient()
    }
    @Provides
    fun provideApiServices(homeCategoryServices: HomeCategoryServices): ApiServices {
        return ApiServicesImp(homeCategoryServices)
    }
    @Provides
    fun ProvideDataManager(apiServices:ApiServices):DataManager{
        return DataManagerImp(apiServices)
    }
    @Provides
    fun ProvideHomeCategoryServices(retrofitClient: RetrofitClient):HomeCategoryServices{
        return HomeCategoryServicesImp(retrofitClient)
    }
}