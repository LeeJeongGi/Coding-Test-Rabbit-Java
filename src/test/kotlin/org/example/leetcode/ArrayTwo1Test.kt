package org.example.leetcode

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class ArrayTwo1Test {
    @Test
    fun test() {
        val arrayTwo1 = ArrayTwo1()
        val result = arrayTwo1.findErrorNums(intArrayOf(1,2,2,4))

        assertEquals(2, result[0])
        assertEquals(3, result[1])
    }

    @Test
    fun test1() {
        val arrayTwo1 = ArrayTwo1()
        val result = arrayTwo1.findErrorNums(intArrayOf(2, 2))

        assertEquals(2, result[0])
        assertEquals(1, result[1])
    }

    @Test
    fun test2() {
        val arrayTwo1 = ArrayTwo1()
        val result = arrayTwo1.findErrorNums(intArrayOf(3, 2, 2))

        assertEquals(2, result[0])
        assertEquals(1, result[1])
    }
}