package org.example.leetcode

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class ArrayOne3Test {
    @Test
    fun test() {
        val arrayOne3 = ArrayOne3()
        val result = arrayOne3.findMaxConsecutiveOnes(intArrayOf(1,1,0,1,1,1))

        assertEquals(3, result)
    }
}