package com.example.javakomutlar.data.apiServices

import com.example.javakomutlar.data.models.HomeCategoryModel
import com.example.javakomutlar.data.models.SubCategoryModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RestApi {
    @GET("/v1/projects/arsek-java/databases/(default)/documents/ArSek%20Akademi%20-%20Java")
    fun getHomeCategory(): Call<HomeCategoryModel>

    @GET("/v1/{url}")
    fun getSubCategory(@Path("url")url:String):Call<SubCategoryModel>

}