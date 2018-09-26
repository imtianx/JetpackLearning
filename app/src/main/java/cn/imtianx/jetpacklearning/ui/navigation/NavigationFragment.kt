package cn.imtianx.jetpacklearning.ui.navigation

import android.os.Bundle
import androidx.navigation.Navigation
import cn.imtianx.jetpacklearning.R
import cn.imtianx.jetpacklearning.common.base.BaseDataBindingFragment
import cn.imtianx.jetpacklearning.databinding.FragmentNavigationBinding
import kotlinx.android.synthetic.main.fragment_navigation.*
import kotlinx.android.synthetic.main.layout_toolbar.*

/**
 * <pre>
 *     @desc:
 * </pre>
 * @author 奚岩
 * @date 2018/9/26 9:41 PM
 */
class NavigationFragment : BaseDataBindingFragment<FragmentNavigationBinding>() {
    override fun getContentLayoutId(): Int {
        return R.layout.fragment_navigation
    }

    override fun initWidget() {
        super.initWidget()
        toolbar.apply {
            title = "navigation"
            setNavigationIcon(R.drawable.ic_keyboard_backspace_white_24dp)
            setNavigationOnClickListener {
                Navigation.findNavController(it).popBackStack()
            }
        }

        btn_next.setOnClickListener {
            // bundle 传递参数
            val bundle = Bundle()
            bundle.putString("nick_name", "imtiaanx")
            Navigation.findNavController(it)
                    .navigate(R.id.action_navigationFragment_to_nextFragment, bundle)
        }

        btn_nav_tab.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_navigationFragment_to_tabNavigationFragment)

        }


    }
}