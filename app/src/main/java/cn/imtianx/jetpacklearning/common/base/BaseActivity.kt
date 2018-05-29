package cn.imtianx.jetpacklearning.common.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * <pre>
 *     @desc:
 * </pre>
 * @author 奚岩
 * @date 2018/5/29 下午3:24
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initWindows()

        initWidget()

        initData()

    }

    abstract fun getContentLayoutId(): Int

    protected open fun initWindows() {
        setContentView(getContentLayoutId())
    }

    protected open fun initData() {
    }

    protected open fun initWidget() {
    }


}