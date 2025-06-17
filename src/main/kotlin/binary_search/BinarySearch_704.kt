package org.example.binary_search

class BinarySearch_704 {

    fun search(nums: IntArray, target: Int): Int {
        var low = 0
        var high = nums.size - 1
        while (low <= high) {
            val mid = low + (high - low) / 2 // not doing (low + high) / 2 to avoid potential overflow !
            when {
                nums[mid] == target -> return mid
                nums[mid] < target -> low = mid + 1
                else -> high = mid - 1
            }
        }
        return -1
    }
}