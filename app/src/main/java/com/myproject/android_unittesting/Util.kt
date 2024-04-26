package com.myproject.android_unittesting

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Util(val dispatcher: CoroutineDispatcher) {

    var check = false
    fun makeTestWatcherClass() {
        CoroutineScope(dispatcher).launch {
           check = true
        }
    }

}