package com.example.javakomutlar.ui.splashScreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.javakomutlar.MvpApp
import com.example.javakomutlar.R
import com.example.javakomutlar.ui.base.BaseFragment
import javax.inject.Inject

//Recep Arslan
class SplashScreenFragment : BaseFragment(), SplashScreenFragmentMvpView {
    var instance: SplashScreenFragment? = null

    @Inject
    lateinit var presenter: SplashScreenFragmentMvpPresenter<SplashScreenFragmentMvpView>
    lateinit var root: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_splash_screen, container, false)
        (requireActivity().application as MvpApp).viewComponents!!.injectSplashFragment(this)
        presenter.onAttact(this)
        presenter.initPresenter()
        return root
    }

    override fun getInstance(): Fragment {
        if (instance == null) {
            instance = SplashScreenFragment()
        }
        return instance as SplashScreenFragment
    }


}
