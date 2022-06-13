package com.smartphonecodes.sassy

import org.junit.Test

import org.junit.Assert.*
import kotlin.random.Random

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun generates_number(){
        val x = 5
        assertTrue("Test is yup Succeess",x in 1..10)
    }
}