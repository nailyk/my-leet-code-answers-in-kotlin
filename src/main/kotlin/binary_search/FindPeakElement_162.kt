package org.example.binary_search

class FindPeakElement_162 {

    fun findPeakElement(nums: IntArray): Int {
        var left = 0
        var right = nums.lastIndex

        while (left < right) {
            val mid = (left + right) / 2

            if (nums[mid] > nums[mid + 1]) {
                // Peak is in the left half (including mid)
                right = mid
            } else {
                // Peak is in the right half (excluding mid)
                left = mid + 1
            }
        }

        // left == right is the peak index
        return left
    }
}