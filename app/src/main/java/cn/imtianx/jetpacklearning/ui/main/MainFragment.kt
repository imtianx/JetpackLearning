package cn.imtianx.jetpacklearning.ui.main

import androidx.navigation.Navigation
import cn.imtianx.jetpacklearning.R
import cn.imtianx.jetpacklearning.common.base.BaseDataBindingFragment
import cn.imtianx.jetpacklearning.databinding.FragmentMainBinding
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : BaseDataBindingFragment<FragmentMainBinding>() {


    override fun getContentLayoutId(): Int {
        return R.layout.fragment_main
    }

    override fun initData() {
        super.initData()

        btn_navigation.setOnClickListener {
            // 方式一：通过 actionId 跳转
            Navigation.findNavController(it)
                    .navigate(R.id.action_mainFragment_to_navigationFragment)
        }
        //方式二
        // btn_next.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_navigationActivity))
    }
}
