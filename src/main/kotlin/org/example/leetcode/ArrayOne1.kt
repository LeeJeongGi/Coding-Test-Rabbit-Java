package org.example.leetcode

class ArrayOne1 {
    fun getConcatenation(nums: IntArray): IntArray {
        val result = IntArray(nums.size * 2)
        for (i in nums.indices) {
            result[i] = nums[i]
            result[i + nums.size] = nums[i]
        }
        return result
    }
}