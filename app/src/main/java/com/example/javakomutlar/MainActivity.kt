package com.example.javakomutlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.javakomutlar.data.apiServices.RestApi
import com.example.javakomutlar.data.apiServices.RetrofitClient
import com.example.javakomutlar.data.models.HomeCategoryModel
import com.example.javakomutlar.ui.splashScreen.SplashScreenFragment
import com.example.javakomutlar.utility.createFragment
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createFragment(R.id.activity_mainActivity_frameLayout, SplashScreenFragment().getInstance(),this)
    }
}