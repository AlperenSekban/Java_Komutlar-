package com.example.javakomutlar.ui.subCategoryPage

import com.example.javakomutlar.data.dataManager.DataManager
import com.example.javakomutlar.ui.base.BasePresenter
import javax.inject.Inject

class SubCategoryFragmentPresenter<V : SubCategoryFragmentMvpView> @Inject constructor(dataManager: DataManager) :
    BasePresenter<V>(dataManager), SubCategoryFragmentMvpPresenter<V> {
}