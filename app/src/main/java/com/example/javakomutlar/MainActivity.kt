package com.example.javakomutlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.javakomutlar.ui.splashScreen.SplashScreenFragment
import com.example.javakomutlar.utility.createFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createFragment(R.id.activity_mainActivity_frameLayout, SplashScreenFragment().getInstance(),this)
    }
}