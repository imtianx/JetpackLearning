package cn.imtianx.jetpacklearning.common.extentions

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity

/**
 * <pre>
 *     @desc: activity extensions
 * </pre>
 * @author 奚岩
 * @date 2018/5/29 9:51 PM
 */

fun <T : ViewModel> AppCompatActivity.getViewModel(clazz: Class<T>): T {
    return ViewModelProviders.of(this).get(clazz)
}
