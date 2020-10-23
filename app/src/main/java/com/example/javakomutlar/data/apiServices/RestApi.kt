package com.example.javakomutlar.data.apiServices

import com.example.javakomutlar.data.models.HomeCategory
import retrofit2.Call
import retrofit2.http.GET

interface RestApi {
    @GET("/v1/projects/arsek-java/databases/(default)/documents/ArSek%20Akademi%20-%20Java")
    fun bring(): Call<HomeCategory>
}