package com.myproject.android_unittesting

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Util {

    @OptIn(DelicateCoroutinesApi::class)
    fun launchCoroutineOnThreadPool() {
        GlobalScope.launch(Dispatchers.Main) {
            println("Hello world")
        }
    }

}