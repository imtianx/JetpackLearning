package cn.imtianx.jetpacklearning.ui.navigation

import androidx.navigation.Navigation
import cn.imtianx.jetpacklearning.R
import cn.imtianx.jetpacklearning.common.base.BaseDataBindingFragment
import cn.imtianx.jetpacklearning.databinding.FragmentNextBinding
import kotlinx.android.synthetic.main.fragment_next.*
import kotlinx.android.synthetic.main.layout_toolbar.*

/**
 * <pre>
 *     @desc:
 * </pre>
 * @author 奚岩
 * @date 2018/9/26 4:26 PM
 */
class NextFragment : BaseDataBindingFragment<FragmentNextBinding>() {
    override fun getContentLayoutId(): Int {
        return R.layout.fragment_next
    }

    override fun initData() {
        super.initData()

        toolbar.apply {
            title = "传递参数"
            setNavigationIcon(R.drawable.ic_keyboard_backspace_white_24dp)
            setNavigationOnClickListener {
                Navigation.findNavController(it).popBackStack()
            }
        }

        arguments?.let {
            tv_args.text = "参数：${NextFragmentArgs.fromBundle(it).nickName}"
        }
    }

    override fun initWidget() {
        super.initWidget()
        btn_next_back.setOnClickListener {
            Navigation.findNavController(it).popBackStack()
        }
    }
}