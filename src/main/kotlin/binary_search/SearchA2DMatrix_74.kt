package org.example.binary_search

class SearchA2DMatrix_74 {

    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        if (matrix.isEmpty() || matrix[0].isEmpty()) return false

        val m = matrix.size
        val n = matrix[0].size
        var left = 0
        var right = m * n - 1

        while (left <= right) {
            val mid = (left + right) / 2
            val row = mid / n
            val col = mid % n
            val midVal = matrix[row][col]

            when {
                midVal == target -> return true
                midVal < target -> left = mid + 1
                else -> right = mid - 1
            }
        }

        return false
    }

}