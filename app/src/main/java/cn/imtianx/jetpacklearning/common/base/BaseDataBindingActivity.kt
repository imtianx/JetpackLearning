package cn.imtianx.jetpacklearning.common.base

import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding


/**
 * <pre>
 *     @desc: base DataBinding activity
 * </pre>
 * @author 奚岩
 * @date 2018/5/29 下午3:24
 */
abstract class BaseDataBindingActivity<VDB : ViewDataBinding> : BaseActivity() {

    protected lateinit var binding: VDB

    override fun initWindows() {
        super.initWindows()
        binding = DataBindingUtil.setContentView(this, getContentLayoutId())
    }


}