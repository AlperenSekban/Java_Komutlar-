package com.example.javakomutlar.ui.homePage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.javakomutlar.MvpApp
import com.example.javakomutlar.R
import com.example.javakomutlar.data.models.HomeCategoryModel
import com.example.javakomutlar.ui.adapters.HomeCategoryAdapter
import com.example.javakomutlar.ui.adapters.SendId
import com.example.javakomutlar.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.*
import javax.inject.Inject

class HomeFragment : BaseFragment(), HomePageFragmentMvpView, SendId {

    lateinit var root: View
    lateinit var instance: HomeFragment
    lateinit var adapter:HomeCategoryAdapter

    @Inject
    lateinit var presenter: HomePageFragmentMvpPresenter<HomePageFragmentMvpView>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_home, container, false)

        (requireActivity().application as MvpApp).viewComponents?.injectHomePageFragment(this)

        adapter= HomeCategoryAdapter(requireContext(),this)
        presenter.onAttact(this)
        presenter.initPresenter()

        return root
    }

    override fun loadDataCategorylist(response: HomeCategoryModel?) {
        if (response != null) {
            adapter.setData(response)
        }
        fragment_home_category_recyclerview.layoutManager=LinearLayoutManager(requireContext())
        fragment_home_category_recyclerview.adapter=adapter
    }

    override fun getInstance(): Fragment {
        if (instance == null) {
            instance = HomeFragment()
        }
        return instance as HomeFragment
    }

    override fun onItemClick(position: Int) {

    }


}