package com.myproject.android_unittesting

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Util(val dispatcher: CoroutineDispatcher) {

    fun makeTestWatcherClass() {
        GlobalScope.launch(dispatcher) {

        }
    }

}