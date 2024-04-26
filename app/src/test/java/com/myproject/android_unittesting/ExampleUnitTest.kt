package com.myproject.android_unittesting

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.After
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    //we will access this via rule
    @get:Rule
    val unitTest = UtilTest()
    @Before
    fun start() {

    }

    @Test
    fun print_simple_suspend_fun() {
        val util = Util(unitTest.standardDispatcher)
        util.makeTestWatcherClass()
    }

    @After
    fun destroy() {

    }

}