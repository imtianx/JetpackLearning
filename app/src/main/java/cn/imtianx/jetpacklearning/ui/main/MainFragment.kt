package cn.imtianx.jetpacklearning.ui.main

import cn.imtianx.jetpacklearning.R
import cn.imtianx.jetpacklearning.common.base.BaseFragment
import cn.imtianx.jetpacklearning.common.extentions.getViewModel

class MainFragment :BaseFragment() {

    val viewModel by lazy {
        getViewModel(MainViewModel::class.java)
    }

    override fun getContentLayoutId(): Int {
        return R.layout.main_fragment
    }

    companion object {
        fun newInstance() = MainFragment()
    }


}
