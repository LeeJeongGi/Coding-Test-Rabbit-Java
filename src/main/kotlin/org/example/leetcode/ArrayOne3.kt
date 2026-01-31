package org.example.leetcode

class ArrayOne3 {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var maxNumber = 0;
        var tempMaxNumber = 0
        nums.map { num ->
            if (num == 1) {
                tempMaxNumber++
            } else {
                tempMaxNumber = 0
            }

            maxNumber = maxNumber.coerceAtLeast(tempMaxNumber)
        }

        return maxNumber
    }
}