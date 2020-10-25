package com.example.javakomutlar.ui.homePage

import android.content.Context
import com.example.javakomutlar.data.dataManager.DataManager
import com.example.javakomutlar.data.dataManager.ServiceCallback
import com.example.javakomutlar.data.models.HomeCategoryModel
import com.example.javakomutlar.ui.base.BasePresenter
import com.example.javakomutlar.utility.key
import javax.inject.Inject

class HomePageFragmentPresenter<V : HomePageFragmentMvpView> @Inject constructor(dataManager: DataManager) :
    BasePresenter<V>(dataManager), HomePageFragmentMvpPresenter<V> {
    override fun initPresenter() {
        takeData()
    }

    override fun takeData() {
        mvpView.showLoading()
        dataManager.getHomeCategories(object : ServiceCallback<HomeCategoryModel> {
            override fun onSuccess(response: HomeCategoryModel?) {
                mvpView.loadDataCategorylist(response)
                mvpView.hideLoading()
            }

            override fun onError(errorCode: Int, errorMessage: String) {
                mvpView.showError(errorMessage)
            }


        })
    }

    override fun setSubCategoryFragment(url: String?, requireContext: Context) {
        if (url!=null){
            mvpView.openSubCategoryFragment(key,url)
        }

    }

}