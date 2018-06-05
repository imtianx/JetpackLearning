package cn.imtianx.jetpacklearning.ui.main

import android.content.Context
import androidx.lifecycle.ViewModel
import cn.imtianx.jetpacklearning.ui.navigation.NavigationActivity

class MainViewModel : ViewModel() {


    fun jump2Navigation(context: Context) {
        NavigationActivity.launch(context)
    }

}
