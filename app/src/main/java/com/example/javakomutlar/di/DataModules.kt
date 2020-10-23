package com.example.javakomutlar.di

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
    fun provideApiServices(): ApiServices {
        return ApiServicesImp()
    }
    @Provides
    fun ProvideDataManager(apiServices:ApiServices):DataManager{
        return DataManagerImp(apiServices)
    }
}