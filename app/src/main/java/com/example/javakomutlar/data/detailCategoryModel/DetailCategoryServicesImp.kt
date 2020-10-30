package com.example.javakomutlar.data.detailCategoryModel

import com.example.javakomutlar.data.apiServices.RestApi
import com.example.javakomutlar.data.apiServices.RetrofitClient
import com.example.javakomutlar.data.dataManager.ServiceCallback
import com.example.javakomutlar.data.models.DetailModel
import com.example.javakomutlar.data.models.SubCategoryModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class DetailCategoryServicesImp : DetailCategoryServices {


    var apiServices: RestApi

    @Inject
    constructor(retrofitClient: RetrofitClient) {
        apiServices = retrofitClient.getClient().create(RestApi::class.java)
    }

    override fun getDetailCategory(
        url: String,
        serviceCallback: ServiceCallback<DetailModel>
    ) {

        var temp = "/v1/" + url
        var call = apiServices.getDetailCategory(temp)
        call?.enqueue(object : Callback<DetailModel> {
            override fun onFailure(call: Call<DetailModel>, t: Throwable) {
                serviceCallback.onError(500, t.message.toString())
            }

            override fun onResponse(call: Call<DetailModel>, response: Response<DetailModel>) {
                serviceCallback.onSuccess(response.body())
            }


        })

    }
}