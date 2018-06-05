package cn.imtianx.jetpacklearning

import android.os.Bundle
import android.util.Log
import cn.imtianx.jetpacklearning.common.base.BaseActivity
import cn.imtianx.jetpacklearning.ui.main.MainFragment

class MainActivity : BaseActivity() {


    override fun getContentLayoutId(): Int {
        return R.layout.main_activity
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("tx", "onCreate    lifecycle:    ${lifecycle.currentState}")
    }

    override fun onStart() {
        super.onStart()
        Log.e("tx", "onStart    lifecycle:     ${lifecycle.currentState}")
    }

    override fun onResume() {
        super.onResume()
        Log.e("tx", "onResume    lifecycle:     ${lifecycle.currentState}")
    }

    override fun onPause() {
        super.onPause()
        Log.e("tx", "onPause    lifecycle:     ${lifecycle.currentState}")
    }

    override fun onStop() {
        super.onStop()
        Log.e("tx", "onStop    lifecycle:     ${lifecycle.currentState}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("tx", "onDestroy    lifecycle:     ${lifecycle.currentState}")
    }


    override fun initData() {
        super.initData()
        supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commit()

    }

}
