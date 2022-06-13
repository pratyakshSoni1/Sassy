package com.smartphonecodes.sassy

import android.graphics.BlendMode
import android.view.View
import org.hamcrest.Matcher

class ExpressoTestMatchers {

    fun withTint(expectedColorInHex:Int): Matcher<View> {
        return TintColorMatcher(expectedColorInHex)
    }

    fun tintModeMatcher(expectedBlendMode:BlendMode): Matcher<View> {
        return TintModeMatcher(expectedBlendMode)
    }
}
