package com.example.javakomutlar.ui.subCategoryPage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.javakomutlar.R
import com.example.javakomutlar.ui.adapters.SendId
import com.example.javakomutlar.ui.base.BaseFragment
import com.example.javakomutlar.ui.homePage.HomeFragment

class SubCategoryFragment : BaseFragment(),SubCategoryFragmentMvpView,SendId {

    lateinit var instance: SubCategoryFragment

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_sub_category, container, false)
    }

    companion object{
        var instance: SubCategoryFragment?=null
        fun getInstance(): Fragment {
            if (instance == null) {
                instance = SubCategoryFragment()
            }
            return instance as SubCategoryFragment
        }
    }

    override fun onItemClick(position: Int) {
        TODO("Not yet implemented")
    }

}