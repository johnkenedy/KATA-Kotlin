package com.example.katakotlin

fun sum(mixed: List<Any>): Int = mixed.sumOf {
    when (it) {
        is Int -> it
        is String -> it.toInt()
        else -> 0
    }
}
