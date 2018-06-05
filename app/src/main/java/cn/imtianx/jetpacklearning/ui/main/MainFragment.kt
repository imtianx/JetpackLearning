package cn.imtianx.jetpacklearning.ui.main

import cn.imtianx.jetpacklearning.R
import cn.imtianx.jetpacklearning.common.base.BaseDataBindingFragment
import cn.imtianx.jetpacklearning.common.extentions.getViewModel
import cn.imtianx.jetpacklearning.databinding.MainFragmentBinding

class MainFragment :BaseDataBindingFragment<MainFragmentBinding>() {

    private val viewModel by lazy {
        getViewModel(MainViewModel::class.java)
    }

    override fun getContentLayoutId(): Int {
        return R.layout.main_fragment
    }

    override fun initData() {
        super.initData()
        binding.viewModel = viewModel
    }
    companion object {
        fun newInstance() = MainFragment()
    }


}
