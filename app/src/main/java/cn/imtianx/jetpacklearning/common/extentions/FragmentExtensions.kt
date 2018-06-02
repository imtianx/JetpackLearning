package cn.imtianx.jetpacklearning.common.extentions

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import androidx.fragment.app.Fragment

/**
 * <pre>
 *     @desc: Fragment extensions
 * </pre>
 * @author 奚岩
 * @date 2018/5/29 9:52 PM
 */
fun <T : ViewModel> androidx.fragment.app.Fragment.getViewModel(clazz: Class<T>): T {
    return ViewModelProviders.of(this).get(clazz)
}
