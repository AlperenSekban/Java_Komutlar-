package com.example.javakomutlar.di

import com.example.javakomutlar.ui.homePage.HomeFragment
import com.example.javakomutlar.ui.splashScreen.SplashScreenFragment
import com.example.javakomutlar.ui.subCategoryPage.SubCategoryFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [PresenterModules::class, DataModules::class])
interface ViewComponents {
    fun injectSplashFragment(splashScreenFragment: SplashScreenFragment)
    fun injectHomePageFragment(homeFragment: HomeFragment)
    fun injectSubCategoryPageFragment(subCategoryFragment:SubCategoryFragment)
}