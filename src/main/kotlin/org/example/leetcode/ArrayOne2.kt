package org.example.leetcode

class ArrayOne2 {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val ans = IntArray(nums.size)
        for (i in 0 until n) {
            ans[2 * i] = nums[i]
            ans[2 * i + 1] = nums[n + i]
        }
        return ans
    }
}