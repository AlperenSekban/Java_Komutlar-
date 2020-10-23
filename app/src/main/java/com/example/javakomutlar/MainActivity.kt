package com.example.javakomutlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.javakomutlar.data.apiServices.RestApi
import com.example.javakomutlar.data.apiServices.RetrofitClient
import com.example.javakomutlar.data.models.HomeCategory
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var apiservices: RestApi

        var retrofitClient = RetrofitClient()

        apiservices = retrofitClient.getClient().create(RestApi::class.java)

        var call = apiservices.bring()

        call.enqueue(object : retrofit2.Callback<HomeCategory>{
            override fun onResponse(call: Call<HomeCategory>, response: Response<HomeCategory>) {
                Log.i("çekiyorum",response.body().toString())
            }

            override fun onFailure(call: Call<HomeCategory>, t: Throwable) {
                Log.i("çekiyorum","çekemedim :(")
            }
        })


        //createFragment(R.id.activity_mainActivity_frameLayout, SplashScreenFragment().getInstance(),this)
    }
}