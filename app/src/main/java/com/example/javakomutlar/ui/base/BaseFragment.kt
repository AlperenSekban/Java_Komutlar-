package com.example.javakomutlar.ui.base

import android.app.ProgressDialog
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.javakomutlar.R
import com.example.javakomutlar.utility.goFragment
import com.example.javakomutlar.utility.hideLoadinginUtilty
import com.example.javakomutlar.utility.showLoadingDialog
import kotlinx.android.synthetic.main.activity_main.view.*

abstract class BaseFragment : Fragment(), MvpView {
    lateinit var progressDialog: ProgressDialog

    override fun goNextFragment(fragment: Fragment) {
        goFragment(R.id.activity_mainActivity_frameLayout, fragment, requireContext())
    }

    override fun showLoading() {
        progressDialog = showLoadingDialog(requireContext())
    }

    override fun hideLoading() {
        hideLoadinginUtilty(progressDialog)
    }

    override fun showError(string: String) {
        Toast.makeText(requireContext(), string, Toast.LENGTH_LONG).show()
    }
}