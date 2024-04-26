package com.myproject.android_unittesting

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.After
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    val util = Util()
    @Before
    fun start() {

    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun print_simple_suspend_fun() {
        //we can use runBlocking here but it is not good approach as this function has delay.
        //so we have to wait until delay finishes. Other option is to use `runTest`
        runTest {
            util.simpleSuspendFunc()
        }

    }

    @After
    fun destroy() {

    }

}