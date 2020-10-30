package com.example.javakomutlar.data.detailCategoryModel

import android.telecom.Call
import com.example.javakomutlar.data.dataManager.ServiceCallback
import com.example.javakomutlar.data.models.DetailModel
import com.example.javakomutlar.data.models.SubCategoryModel

interface DetailCategoryServices {
    fun getDetailCategory(url: String,serviceCallback: ServiceCallback<DetailModel>)
}