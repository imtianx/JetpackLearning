package cn.imtianx.jetpacklearning.ui.navigation.tab

import androidx.navigation.Navigation
import cn.imtianx.jetpacklearning.R
import cn.imtianx.jetpacklearning.common.base.BaseDataBindingFragment
import cn.imtianx.jetpacklearning.databinding.FragmentNavigationTabBinding
import kotlinx.android.synthetic.main.layout_toolbar.*

/**
 * <pre>
 *     @desc:
 * </pre>
 * @author 奚岩
 * @date 2018/9/26 11:15 PM
 */
class TabNavigationFragment : BaseDataBindingFragment<FragmentNavigationTabBinding>() {
    override fun getContentLayoutId(): Int {
        return R.layout.fragment_navigation_tab
    }

    override fun initWidget() {
        super.initWidget()
        toolbar.apply {
            title = "navigation-tab"
            setNavigationIcon(R.drawable.ic_keyboard_backspace_white_24dp)
            setNavigationOnClickListener {
                Navigation.findNavController(it).popBackStack()
            }
        }

    }
}