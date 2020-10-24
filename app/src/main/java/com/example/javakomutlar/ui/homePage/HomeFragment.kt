package com.example.javakomutlar.ui.homePage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.javakomutlar.MvpApp
import com.example.javakomutlar.R
import com.example.javakomutlar.data.models.HomeCategoryModel
import com.example.javakomutlar.ui.base.BaseFragment
import com.example.javakomutlar.ui.base.ListSelectItem
import com.example.javakomutlar.ui.base.MvpView
import javax.inject.Inject

class HomeFragment : BaseFragment(), HomePageFragmentMvpView, ListSelectItem {

    lateinit var root: View
    lateinit var instance: HomeFragment

    @Inject
    lateinit var presenter: HomePageFragmentMvpPresenter<HomePageFragmentMvpView>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_home, container, false)
        (requireActivity().application as MvpApp).viewComponents?.injectHomePageFragment(this)
        presenter.onAttact(this)
        presenter.initPresenter()
        return root
    }

    override fun loadDataCategorylist(response: HomeCategoryModel?) {
        TODO("Not yet implemented")
    }

    override fun getInstance(): Fragment {
        if (instance == null) {
            instance = HomeFragment()
        }
        return instance as HomeFragment
    }

    override fun onItemClick(position: Int) {
        TODO("Not yet implemented")
    }


}