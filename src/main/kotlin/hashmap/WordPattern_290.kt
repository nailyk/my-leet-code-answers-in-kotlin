package org.example.hashmap

class WordPattern_290 {

    fun wordPattern(pattern: String, s: String): Boolean {
        val mappings = mutableMapOf<Char, String>()

        s.split(" ").let { words ->
            if (pattern.length != words.size) return false
            for (i in pattern.indices) {
                val char = pattern[i]
                val word = words[i]
                if (mappings.containsKey(char)) {
                    if (mappings[char] != word) return false
                } else {
                    if (mappings.containsValue(word)) return false
                    mappings[char] = word
                }
            }
        }
        return true
    }
}