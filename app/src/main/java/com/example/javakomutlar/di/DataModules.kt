package com.example.javakomutlar.di

import com.example.javakomutlar.data.homeCategoryServices.HomeCategoryServices
import com.example.javakomutlar.data.homeCategoryServices.HomeCategoryServicesImp
import com.example.javakomutlar.data.apiServices.ApiServices
import com.example.javakomutlar.data.apiServices.ApiServicesImp
import com.example.javakomutlar.data.apiServices.RetrofitClient
import com.example.javakomutlar.data.dataManager.DataManager
import com.example.javakomutlar.data.dataManager.DataManagerImp
import com.example.javakomutlar.data.subCategoryServices.SubCategoryServices
import com.example.javakomutlar.data.subCategoryServices.SubCategoryServicesImp
import dagger.Module
import dagger.Provides

@Module
class DataModules {
    @Provides
    fun provideRetrofitClient(): RetrofitClient {
        return RetrofitClient()
    }
    @Provides
    fun provideApiServices(homeCategoryServices: HomeCategoryServices,subCategoryServices: SubCategoryServices): ApiServices {
        return ApiServicesImp(homeCategoryServices,subCategoryServices)
    }
    @Provides
    fun ProvideDataManager(apiServices:ApiServices):DataManager{
        return DataManagerImp(apiServices)
    }
    @Provides
    fun ProvideHomeCategoryServices(retrofitClient: RetrofitClient):HomeCategoryServices{
        return HomeCategoryServicesImp(retrofitClient)
    }
    @Provides
    fun ProvideSubCategoryServices(retrofitClient: RetrofitClient):SubCategoryServices{
        return SubCategoryServicesImp(retrofitClient)
    }
}