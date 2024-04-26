package com.myproject.android_unittesting

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@OptIn(ExperimentalCoroutinesApi::class)
class ExampleUnitTest {

    val util = Util()


    val standardTestDispatcher = StandardTestDispatcher()

    @Before
    fun start() {
        //When code runs, it runs on some thread i.e MAIN, IO.
        //Here we have no thread we make a standard dispatcher
        Dispatchers.setMain(standardTestDispatcher)
    }

    @Test
    fun print_simple_suspend_fun() {
        util.launchCoroutineOnThreadPool()
    }

    @After
    fun destroy() {
        Dispatchers.resetMain()
    }

}