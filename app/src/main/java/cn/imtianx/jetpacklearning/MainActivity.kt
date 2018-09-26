package cn.imtianx.jetpacklearning

import androidx.navigation.Navigation.findNavController
import cn.imtianx.jetpacklearning.common.base.BaseActivity

class MainActivity : BaseActivity() {


    override fun getContentLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(this, R.id.fg_main).navigateUp()
    }

}
