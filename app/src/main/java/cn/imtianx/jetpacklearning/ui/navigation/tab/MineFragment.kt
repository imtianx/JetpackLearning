package cn.imtianx.jetpacklearning.ui.navigation.tab

import cn.imtianx.jetpacklearning.R
import cn.imtianx.jetpacklearning.common.base.BaseDataBindingFragment
import cn.imtianx.jetpacklearning.databinding.FragmentMineBinding

/**
 * <pre>
 *     @desc:
 * </pre>
 * @author 奚岩
 * @date 2018/6/4 3:32 PM
 */
class MineFragment : BaseDataBindingFragment<FragmentMineBinding>() {

    override fun getContentLayoutId(): Int {
        return R.layout.fragment_mine
    }
}