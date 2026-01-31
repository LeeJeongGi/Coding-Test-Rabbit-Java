package org.example.leetcode

class ArrayTwo1 {
    fun findErrorNums(nums: IntArray): IntArray {
        val result = IntArray(2)
        val checkNumbers = IntArray(nums.size + 1)

        for (i in nums.indices) {
             val num = nums[i]

            if (checkNumbers[num] != 0) {
                result[0] = num
            }
            checkNumbers[num] = 1
        }

        result[1] = (1..nums.size).first { checkNumbers[it] == 0 }
        return result
    }
}