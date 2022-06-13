package com.smartphonecodes.sassy

import android.graphics.BlendMode
import android.util.Log
import android.view.View
import android.widget.ImageView
import org.hamcrest.Description
import org.hamcrest.TypeSafeMatcher

//private lateinit var expectedTint:String

class TintColorMatcher(val expectedTintcolor:Int) : TypeSafeMatcher<View>() {

    override fun describeTo(description: Description?) {
        description?.appendText("with drawable from resource id: ");
        description?.appendValue(expectedTintcolor);
        if (expectedTintcolor != null) {
            description?.appendText("[");
            description?.appendText(expectedTintcolor.toString());
            description?.appendText("]");
        }
    }

    override fun matchesSafely(item: View?): Boolean {
        val hasTint = item?.backgroundTintList
        if(hasTint?.defaultColor == expectedTintcolor){
            return true
        }else{
            Log.d("TINTMATCHER","Tint found was :${hasTint?.defaultColor}")
            return false
        }
    }

}

class TintModeMatcher(val expectedTintcolor:BlendMode) : TypeSafeMatcher<View>() {

    override fun describeTo(description: Description?) {
        TODO("Not yet implemented")
    }

    override fun matchesSafely(item: View?): Boolean {
        val hasTint = item?.backgroundTintBlendMode
        if(hasTint == expectedTintcolor){
            return true
        }else{
            Log.d("TINTMATCHER","Mode found was :$item")
            return false
        }
    }

}