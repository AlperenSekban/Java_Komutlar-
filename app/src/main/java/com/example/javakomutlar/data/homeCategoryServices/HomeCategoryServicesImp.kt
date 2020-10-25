package com.example.javakomutlar.data.homeCategoryServices

import com.example.javakomutlar.data.apiServices.RestApi
import com.example.javakomutlar.data.apiServices.RetrofitClient
import com.example.javakomutlar.data.dataManager.ServiceCallback
import com.example.javakomutlar.data.models.HomeCategoryModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class HomeCategoryServicesImp :HomeCategoryServices{

    var apiServices:RestApi

    @Inject
    constructor(retrofitClient: RetrofitClient){
        apiServices = retrofitClient.getClient().create(RestApi::class.java)
    }

    override fun getHomeCategory(serviceCallback: ServiceCallback<HomeCategoryModel>) {
        var call = apiServices.getHomeCategory()

        call.enqueue(object : Callback<HomeCategoryModel>{
            override fun onResponse(
                call: Call<HomeCategoryModel>,
                response: Response<HomeCategoryModel>
            ) {
                serviceCallback.onSuccess(response.body())
            }

            override fun onFailure(call: Call<HomeCategoryModel>, t: Throwable) {
                serviceCallback.onError(500,t.message.toString())
            }

        })
    }


}