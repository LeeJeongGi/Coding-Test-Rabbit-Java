package org.example.leetcode

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class ArrayOne2Test {
    @Test
    fun test() {
        val arrayOne2 = ArrayOne2()
        val ans = arrayOne2.shuffle(
            nums = intArrayOf(2,5,1,3,4,7),
            n = 3,
        )

        assertEquals(2, ans[0])
        assertEquals(3, ans[1])
        assertEquals(5, ans[2])
        assertEquals(4, ans[3])
        assertEquals(1, ans[4])
        assertEquals(7, ans[5])
    }
}