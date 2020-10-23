package com.example.javakomutlar.data.dataManager

interface ServiceCallback<T> {

    fun onSuccess(response:T?)
    fun onError(errorCode:Int,errorMessage:String)
}