package com.example.javakomutlar.ui.subCategoryPage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.javakomutlar.MvpApp
import com.example.javakomutlar.R
import com.example.javakomutlar.data.dataManager.DataManager
import com.example.javakomutlar.ui.adapters.SendId
import com.example.javakomutlar.ui.base.BaseFragment
import com.example.javakomutlar.ui.homePage.HomeFragment
import com.example.javakomutlar.utility.key
import javax.inject.Inject

class SubCategoryFragment : BaseFragment(),SubCategoryFragmentMvpView,SendId {

    lateinit var instance: SubCategoryFragment
    lateinit var root: View
    lateinit var url:String

    @Inject
    lateinit var presenter: SubCategoryFragmentPresenter<SubCategoryFragmentMvpView>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root=inflater.inflate(R.layout.fragment_sub_category, container, false)
        url=arguments?.getString(key).toString()

        (requireActivity().application as MvpApp).viewComponents?.injectSubCategoryPageFragment(this)
        presenter.onAttact(this)
        presenter.initPresenter()
        return root


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

    override fun takeUrl(): String {
        return url
    }

}