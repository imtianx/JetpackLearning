package cn.imtianx.jetpacklearning.ui.navigation.tab

import cn.imtianx.jetpacklearning.R
import cn.imtianx.jetpacklearning.common.base.BaseDataBindingFragment
import cn.imtianx.jetpacklearning.databinding.FragmentHomeBinding

/**
 * <pre>
 *     @desc:
 * </pre>
 * @author 奚岩
 * @date 2018/6/4 3:20 PM
 */
class HomeFragment : BaseDataBindingFragment<FragmentHomeBinding>() {

    override fun getContentLayoutId(): Int {
        return R.layout.fragment_home
    }
}