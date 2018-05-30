//package cn.imtianx.jetpacklearning.common.base
//
//import android.databinding.DataBindingUtil
//import android.databinding.ViewDataBinding
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//
///**
// * <pre>
// *     @desc: base DataBinding fragment
// * </pre>
// * @author 奚岩
// * @date 2018/5/29 9:35 PM
// */
//abstract class BaseDataBindingFragment<T : ViewDataBinding> : BaseFragment() {
//
//    protected lateinit var binding: T
//
//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
//        val root = inflater.inflate(getContentLayoutId(), container, false)
//        binding = DataBindingUtil.bind(root)!!
//        return binding.root
//    }
//
//}