package com.example.javakomutlar
import android.app.Application
import com.example.javakomutlar.di.DaggerViewComponents
import com.example.javakomutlar.di.PresenterModules
import com.example.javakomutlar.di.ViewComponents

class MvpApp :Application(){

    var viewComponents:ViewComponents?=null

    override fun onCreate() {
        super.onCreate()
        viewComponents= DaggerViewComponents
            .builder()
            .presenterModules(PresenterModules(this))
            .build()
    }
}