package com.example.javakomutlar.di

import android.app.Application
import android.content.Context
import com.example.javakomutlar.data.apiServices.ApiServices
import com.example.javakomutlar.data.apiServices.ApiServicesImp
import com.example.javakomutlar.data.apiServices.RetrofitClient
import com.example.javakomutlar.data.dataManager.DataManager
import com.example.javakomutlar.ui.base.BasePresenter
import com.example.javakomutlar.ui.base.MvpView
import com.example.javakomutlar.ui.homePage.HomeFragment
import com.example.javakomutlar.ui.homePage.HomePageFragmentMvpView
import com.example.javakomutlar.ui.homePage.HomePageFragmentPresenter
import com.example.javakomutlar.ui.splashScreen.SplashScreenFragment
import com.example.javakomutlar.ui.splashScreen.SplashScreenFragmentMvpPresenter
import com.example.javakomutlar.ui.splashScreen.SplashScreenFragmentMvpView
import com.example.javakomutlar.ui.splashScreen.SplashScreenFragmentPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

//Recep Arslan
@Module
class PresenterModules(app: Application) {
    private val context: Context

    init {
        this.context = app
    }

    @Provides
    fun provideSplashScreenPresenter(dataManager: DataManager): SplashScreenFragmentMvpPresenter<SplashScreenFragmentMvpView> {

        return SplashScreenFragmentPresenter(dataManager)
    }

    @Singleton
    @Provides
    fun provideBasePresenter(dataManager: DataManager): BasePresenter<MvpView> {
        return BasePresenter(dataManager)
    }
    @Singleton
    @Provides
    fun provideHomePagePresenter(dataManager: DataManager):HomePageFragmentPresenter<HomePageFragmentMvpView>
    {
        return HomePageFragmentPresenter(dataManager)
    }
}