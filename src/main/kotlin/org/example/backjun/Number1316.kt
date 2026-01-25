package org.example.backjun

fun main() {
    val n = readln().toInt()
    val result = (1..n).count {
        isGroupWord(readln())
    }
    println(result)
}

fun isGroupWord(word: String): Boolean {
    val cache = mutableSetOf<Char>()

    return word.withIndex().all { (index, char) ->
        (index == 0 || word[index - 1] == char || char !in cache).also {
            cache.add(char)
        }
    }
}