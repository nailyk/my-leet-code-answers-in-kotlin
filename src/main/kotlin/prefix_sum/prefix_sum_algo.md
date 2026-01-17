```kotlin
fun prefixSums(arr: IntArray): IntArray {
    val n = arr.size
    val prefix = IntArray(n + 1)
    for (i in 1..n) {
        prefix[i] = prefix[i - 1] + arr[i - 1]
    }
    return prefix
}
```