package com.example.javakomutlar.data.subCategoryServices

import com.example.javakomutlar.data.apiServices.RestApi
import com.example.javakomutlar.data.apiServices.RetrofitClient
import com.example.javakomutlar.data.dataManager.ServiceCallback
import com.example.javakomutlar.data.models.SubCategoryModel
import retrofit2.Call
import retrofit2.Response
import javax.inject.Inject

class SubCategoryServicesImp:SubCategoryServices {

    var apiServices:RestApi
    @Inject
    constructor(retrofitClient: RetrofitClient){
        apiServices=retrofitClient.getClient().create(RestApi::class.java)
    }

    override fun getSubCategory(url: String,serviceCallback: ServiceCallback<SubCategoryModel>) {
        var temp="/v1/"+url
        var call =apiServices.getSubCategory(temp)

        call?.enqueue(object : retrofit2.Callback<SubCategoryModel>{
            override fun onResponse(
                call: Call<SubCategoryModel>,
                response: Response<SubCategoryModel>
            ) {
                serviceCallback.onSuccess(response.body())
            }

            override fun onFailure(call: Call<SubCategoryModel>, t: Throwable) {
                serviceCallback.onError(500,t.message.toString())
            }

        })
    }
}