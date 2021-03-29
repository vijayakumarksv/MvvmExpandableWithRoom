package com.developer.gadget.expandablelistsamplewithroom

import com.developer.gadget.expandablelistsamplewithroom.ui.RecyActivity
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val rect:RecyActivity = RecyActivity()
        assertEquals(15,rect.add(10,5))
    }

}
