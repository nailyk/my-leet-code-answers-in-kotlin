package org.example.hashmap

class ValidAnagram_242 {

    fun isAnagram(s: String, t: String): Boolean {
        val letterCountMap = mutableMapOf<Char, Int>()
        if (s.length != t.length) return false
        for (i in s.indices) {
            letterCountMap[s[i]] = letterCountMap.getOrDefault(s[i], 0) + 1
            letterCountMap[t[i]] = letterCountMap.getOrDefault(t[i], 0) - 1
        }
        return letterCountMap.values.all { it == 0 }
    }
}