package cn.imtianx.jetpacklearning.common.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * <pre>
 *     @desc: base activity
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