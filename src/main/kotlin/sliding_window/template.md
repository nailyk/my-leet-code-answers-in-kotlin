**Fixed-Length Sliding Window**

```kotlin
fun fixedLengthSlidingWindow(nums: IntArray, k: Int): Int {
    // choose appropriate data structure
    // val state = HashMap<Int, Int>()

    var start = 0
    var max = 0

    for (end in nums.indices) {
        // extend window
        // add nums[end] to state in O(1) time

        if (end - start + 1 == k) {
            // INVARIANT: size of the window is k here.
            // max = maxOf(max, contents of state)

            // contract window
            // remove nums[start] from state in O(1) time
            start++
        }
    }
    return max
}
```

**Variable-Length Sliding Window**

```kotlin
fun variableLengthSlidingWindow(nums: IntArray): Int {
    // choose appropriate data structure
    // val state = HashMap<Int, Int>()

    var start = 0
    var max_ = 0

    for (end in nums.indices) {
        // extend window
        // add nums[end] to state in O(1) time

        while (/* state is not valid */) {
            // repeatedly contract window until it is valid again
            // remove nums[start] from state in O(1) time
            start++
        }

        // INVARIANT: state of current window is valid here.
        max_ = maxOf(max_, end - start + 1)
    }

    return max_
}

```