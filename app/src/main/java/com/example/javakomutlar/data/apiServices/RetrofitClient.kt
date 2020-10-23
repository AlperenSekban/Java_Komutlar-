package com.example.javakomutlar.data.apiServices
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class RetrofitClient @Inject constructor() {

    private val BaseUrl = "https://firestore.googleapis.com/"


    fun getClient(): Retrofit {
        val okHttpClient = OkHttpClient.Builder()
            .readTimeout(30, TimeUnit.SECONDS)
            .connectTimeout(30, TimeUnit.SECONDS)
            .build()

        return Retrofit.Builder().baseUrl(BaseUrl).client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}