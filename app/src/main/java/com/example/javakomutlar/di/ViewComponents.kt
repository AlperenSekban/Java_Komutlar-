package com.example.javakomutlar.di

import com.example.javakomutlar.ui.splashScreen.SplashScreenFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [PresenterModules::class, DataModules::class])
interface ViewComponents {
    fun injectSplashFragment(splashScreenFragment: SplashScreenFragment)

}