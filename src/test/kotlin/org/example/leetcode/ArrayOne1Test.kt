package org.example.leetcode

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class ArrayOne1Test {
    @Test
    fun test() {
        val arrayOne1 = ArrayOne1()
        val result = arrayOne1.getConcatenation(intArrayOf(1, 2, 3))
        assertEquals(6, result.size)
    }

}