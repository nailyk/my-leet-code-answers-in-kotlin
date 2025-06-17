package org.example.dp

class ClimbingStairs_70 {

    fun climbStairs(n: Int): Int {
        if (n <= 2) return n

        var first = 1
        var second = 2

        for (i in 3..n) {
            val third = first + second
            first = second
            second = third
        }

        return second
    }

    tailrec fun climbStairsTail(n: Int, a: Int = 1, b: Int = 2): Int {
        return when (n) {
            1 -> a
            2 -> b
            else -> climbStairsTail(n - 1, b, a + b)
        }
    }
}