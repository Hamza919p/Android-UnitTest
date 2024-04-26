package com.myproject.android_unittesting

import kotlinx.coroutines.delay

class Util {

    suspend fun simpleSuspendFunc() {
        delay(4000)
        println("Hello")
    }

}