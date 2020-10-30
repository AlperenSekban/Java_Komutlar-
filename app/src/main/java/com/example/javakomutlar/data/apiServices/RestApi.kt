package com.example.javakomutlar.data.apiServices

import com.example.javakomutlar.data.models.HomeCategoryModel
import com.example.javakomutlar.data.models.SubCategoryModel
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Url

interface RestApi {
    @GET("/v1/projects/arsek-java/databases/(default)/documents/ArSek%20Akademi%20-%20Java")
    fun getHomeCategory(): Call<HomeCategoryModel>

    @GET
    fun getSubCategory(@Url url: String?): Call<SubCategoryModel>?
}