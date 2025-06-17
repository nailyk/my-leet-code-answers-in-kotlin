package org.example.array_strings

class FindtheIndexoftheFirstOccurrenceInAString_28 {
    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) return 0  // Handle edge case for empty needle

        for (i in 0..haystack.length - needle.length) {
            var j = 0
            while (j < needle.length && haystack[i + j] == needle[j]) {
                j++
            }
            if (j == needle.length) {
                return i
            }
        }

        return -1
    }
}