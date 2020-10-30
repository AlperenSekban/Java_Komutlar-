package com.example.javakomutlar.ui.subCategoryPage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.javakomutlar.MvpApp
import com.example.javakomutlar.R
import com.example.javakomutlar.data.models.SubCategoryModel
import com.example.javakomutlar.ui.adapters.SubCategoryAdapter
import com.example.javakomutlar.ui.adapters.SendId
import com.example.javakomutlar.ui.base.BaseFragment
import com.example.javakomutlar.utility.key
import com.example.javakomutlar.utility.linkCombining
import kotlinx.android.synthetic.main.fragment_splash_screen.*
import kotlinx.android.synthetic.main.fragment_sub_category.*
import javax.inject.Inject

class SubCategoryFragment : BaseFragment(), SubCategoryFragmentMvpView, SendId {

    lateinit var instance: SubCategoryFragment
    lateinit var root: View
    lateinit var url: String
    lateinit var liste: SubCategoryModel
    lateinit var adapter: SubCategoryAdapter

    @Inject
    lateinit var presenter: SubCategoryFragmentPresenter<SubCategoryFragmentMvpView>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_sub_category, container, false)
        url = arguments?.getString(key).toString()

        (requireActivity().application as MvpApp).viewComponents?.injectSubCategoryPageFragment(this)

        adapter = SubCategoryAdapter(requireContext(),this)
        presenter.onAttact(this)
        presenter.initPresenter()
        return root


    }

    companion object {
        var instance: SubCategoryFragment? = null
        fun getInstance(): Fragment {
            if (instance == null) {
                instance = SubCategoryFragment()
            }
            return instance as SubCategoryFragment
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

    override fun takeUrl(): String {
        return url
    }

    override fun loadDateCategorylist(response: SubCategoryModel?) {
        if (response != null) {
            liste = response
            adapter.setData(liste)
        }
        fragment_sub_category_recyclerview.layoutManager = LinearLayoutManager(requireContext())
        fragment_sub_category_recyclerview.adapter = adapter
    }

}