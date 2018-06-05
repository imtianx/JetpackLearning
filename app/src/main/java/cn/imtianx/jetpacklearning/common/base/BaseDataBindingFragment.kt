package cn.imtianx.jetpacklearning.common.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/**
 * <pre>
 *     @desc: base DataBinding fragment
 * </pre>
 * @author 奚岩
 * @date 2018/5/29 9:35 PM
 */
abstract class BaseDataBindingFragment<VDB : ViewDataBinding> : BaseFragment() {

    protected lateinit var binding: VDB

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val root = inflater.inflate(getContentLayoutId(), container, false)
        binding = DataBindingUtil.bind(root)!!
        return binding.root
    }

}