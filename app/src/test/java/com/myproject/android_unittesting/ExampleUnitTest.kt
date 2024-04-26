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

    val standardTestDispatcher = StandardTestDispatcher()

    @Before
    fun start() {
        Dispatchers.setMain(standardTestDispatcher)
    }

    @Test
    fun print_simple_suspend_fun() {

        //we are using constructor injection here to pass a general dispatcher.
        //For testing we use testing dispatcher.
        //For real time app we'll pass real dispatcher to below class
        val util = Util(standardTestDispatcher)
        util.passingGlobalDispatcher()
    }

    @After
    fun destroy() {
        Dispatchers.resetMain()
    }

}