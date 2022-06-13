package com.smartphonecodes.sassy

import android.content.res.Resources
import android.graphics.Color
import android.provider.CalendarContract
import android.util.Log
import androidx.annotation.ColorRes
import androidx.annotation.IntegerRes
import androidx.core.content.ContextCompat
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */


@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest{

    @get:Rule()
    val activity = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testTheUi(){
        onView(withId(R.id.lipstick1)).perform(click())
        Log.d("TEST","Color is : ${Color.parseColor("#FF95BA")}")
        onView(withId(R.id.lips)).check(matches( ExpressoTestMatchers().withTint(Color.parseColor("#FF95BA")) ))
    }

}