package cn.imtianx.jetpacklearning.ui.navigation

import android.content.Context
import android.content.Intent
import cn.imtianx.jetpacklearning.R
import cn.imtianx.jetpacklearning.common.base.BaseDataBindingActivity
import cn.imtianx.jetpacklearning.common.extentions.getViewModel
import cn.imtianx.jetpacklearning.databinding.ActivityNavigationBinding

/**
 * <pre>
 *     @desc: navigation
 * </pre>
 * @author 奚岩
 * @date 2018/6/4 11:15 AM
 */
class NavigationActivity : BaseDataBindingActivity<ActivityNavigationBinding>() {

    private val viewModel: NavigationViewModel by lazy {
        getViewModel(NavigationViewModel::class.java)
    }

    override fun getContentLayoutId(): Int {
        return R.layout.activity_navigation
    }

    override fun initData() {
        super.initData()
    }


    companion object {
        fun launch(context: Context) {
            context.startActivity(Intent(context, NavigationActivity::class.java))
        }
    }

}