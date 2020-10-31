package com.example.javakomutlar.ui.homePage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.javakomutlar.MvpApp
import com.example.javakomutlar.R
import com.example.javakomutlar.data.models.HomeCategoryModel
import com.example.javakomutlar.ui.adapters.HomeCategoryAdapter
import com.example.javakomutlar.ui.adapters.SubCategoryAdapter
import com.example.javakomutlar.ui.adapters.SendId
import com.example.javakomutlar.ui.base.BaseFragment
import com.example.javakomutlar.ui.subCategoryPage.SubCategoryFragment
import com.example.javakomutlar.utility.createFragment
import com.example.javakomutlar.utility.linkCombining
import com.example.javakomutlar.utility.sendStringData
import kotlinx.android.synthetic.main.fragment_home.*
import java.text.DateFormat
import javax.inject.Inject

class HomeFragment : BaseFragment(), HomePageFragmentMvpView, SendId {

    lateinit var root: View
    lateinit var adapter: HomeCategoryAdapter
    lateinit var liste: HomeCategoryModel

    @Inject
    lateinit var presenter: HomePageFragmentMvpPresenter<HomePageFragmentMvpView>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_home, container, false)

        (requireActivity().application as MvpApp).viewComponents?.injectHomePageFragment(this)

        adapter = HomeCategoryAdapter(requireContext(), this)
        presenter.onAttact(this)
        presenter.initPresenter()

        return root
    }

    override fun loadDataCategorylist(response: HomeCategoryModel?) {
        if (response != null) {
            liste = response
            adapter.setData(liste)
        }
        fragment_home_category_recyclerview.layoutManager = GridLayoutManager(requireContext(), 2)
        fragment_home_category_recyclerview.adapter = adapter
    }
    companion object{
        var instance: HomeFragment?=null
        fun getInstance(): Fragment {
            if (instance == null) {
                instance = HomeFragment()
            }
            return instance as HomeFragment
        }
    }



    override fun onItemClick(position: Int) {
        var type = liste.documents?.get(position)?.fields?.type?.stringValue
        var url= linkCombining(liste.documents?.get(position)?.name!!,liste.documents?.get(position)?.fields?.title?.stringValue!!)
        when {
            type == "1" -> {
                presenter.setDetailFragment(url)
            }
            type == "2" -> {
                presenter.setSubCategoryFragment(
                    url
                )
            }
            type == "3" -> {
                presenter.setAboutUsFragment(url)
            }
        }

    }

    override fun openSubCategoryFragment(key: String, url: String) {
        var subCategoryFragment=SubCategoryFragment.getInstance()
        sendStringData(key,url,subCategoryFragment)
        createFragment(R.id.activity_mainActivity_frameLayout,subCategoryFragment,requireContext())
    }


}