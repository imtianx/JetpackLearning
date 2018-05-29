package cn.imtianx.jetpacklearning.common.extentions

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProviders
import android.support.v4.app.Fragment

/**
 * <pre>
 *     @desc: Fragment extensions
 * </pre>
 * @author 奚岩
 * @date 2018/5/29 9:52 PM
 */
fun <T : ViewModel> Fragment.getViewModel(clazz: Class<T>): T {
    return ViewModelProviders.of(this).get(clazz)
}
