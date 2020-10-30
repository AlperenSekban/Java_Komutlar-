package com.example.javakomutlar.ui.subCategoryPage

import android.util.Log
import com.example.javakomutlar.data.dataManager.DataManager
import com.example.javakomutlar.data.dataManager.ServiceCallback
import com.example.javakomutlar.data.models.SubCategoryModel
import com.example.javakomutlar.ui.base.BasePresenter
import com.example.javakomutlar.ui.base.MvpView
import javax.inject.Inject

class SubCategoryFragmentPresenter<V : SubCategoryFragmentMvpView> @Inject constructor(dataManager: DataManager) :
    BasePresenter<V>(dataManager), SubCategoryFragmentMvpPresenter<V> {

    override fun initPresenter() {
        getSubCategory(mvpView.takeUrl())
    }

    override fun getSubCategory(url: String) {
        mvpView.showLoading()
        dataManager.getSubCategories(url,object :ServiceCallback<SubCategoryModel>{
            override fun onSuccess(response: SubCategoryModel?) {
                mvpView.loadDateCategorylist(response)
                mvpView.hideLoading()
            }

            override fun onError(errorCode: Int, errorMessage: String) {
                mvpView.showError(errorMessage)
                mvpView.hideLoading()
            }

        })
    }


}